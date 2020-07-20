package com.controllerface.cmdr_j.classes.commander;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ShipModuleData;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ships.Ship;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CoreInternalSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.HardpointSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.OptionalInternalSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipCharacteristic;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.scene.*;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/24/2018.
 *
 * Storage object used to manage a commander's ship
 *
 * NOTE: Mutable state data object
 *
 */
public class StarShip
{
    //region Basic Ship Data
    private Ship ship;
    private double currentFuel = 0d;
    private final SimpleStringProperty shipID = new SimpleStringProperty("Loading...");
    private final SimpleStringProperty shipGivenName = new SimpleStringProperty("Loading...");
    private final SimpleStringProperty shipDisplayName = new SimpleStringProperty("Loading...");
    private final SimpleStringProperty shipManufacturerName = new SimpleStringProperty("Loading...");
    //endregion

    //region Backing Data Lists
    private final List<ShipStatisticData> baseStatistics = new CopyOnWriteArrayList<>();
    private final List<ShipStatisticData> strengthStatistics = new CopyOnWriteArrayList<>();
    private final List<ShipStatisticData> massStatistics = new CopyOnWriteArrayList<>();
    private final List<ShipStatisticData> resistanceStatistics = new CopyOnWriteArrayList<>();
    private final List<ShipStatisticData> offenseStatistics = new CopyOnWriteArrayList<>();
    private final List<ShipModuleData> coreInternals = new CopyOnWriteArrayList<>();
    private final List<ShipModuleData> optionalInternals = new CopyOnWriteArrayList<>();
    private final List<ShipModuleData> hardpoints = new CopyOnWriteArrayList<>();
    //endregion

    //region UI Observable Lists
    private final ObservableList<ShipStatisticData> observableBaseStatistics = FXCollections.observableArrayList();
    private final ObservableList<ShipStatisticData> observableHullStatistics = FXCollections.observableArrayList();
    private final ObservableList<ShipStatisticData> observableMassStatistics = FXCollections.observableArrayList();
    private final ObservableList<ShipStatisticData> observableShieldStatistics = FXCollections.observableArrayList();
    private final ObservableList<ShipStatisticData> observableOffenseStatistics = FXCollections.observableArrayList();
    private final ObservableList<ShipModuleData> observableCoreInternals = FXCollections.observableArrayList();
    private final ObservableList<ShipModuleData> observableOptionalInternals = FXCollections.observableArrayList();
    private final ObservableList<ShipModuleData> observableHardpoints = FXCollections.observableArrayList();
    //endregion

    //region Resistance Charts
    private LineChart<Number, Number> shieldChart;
    private LineChart<Number, Number> hullChart;

    private final Set<XYChart.Series<Number, Number>> hullHighlightRotation = new LinkedHashSet<>(5);
    private final Set<XYChart.Series<Number, Number>> shieldHighlightRotation = new LinkedHashSet<>(6);

    private Spinner<Double> dpsSpinner;
    private Spinner<Double> sysSpinner;

    private Double shieldRegenRate = 0.0d;
    private Double brokenRegenRate = 0.0d;

    private SimpleStringProperty r1s = new SimpleStringProperty("0.0");
    private SimpleStringProperty r2s = new SimpleStringProperty("0.0");

    private SubScene shipGraphic;

    //endregion

    StarShip()
    {
        // this animation timeline cycles all data series in the resistance graphs moving each one to the back
        // in z-order. This allows for cases where two resistances have the same values, making it so there is a
        // visual indicator when one or more other graph lines for different values are identical.
        Timeline chartCycle = new Timeline(new KeyFrame(Duration.seconds(1), event ->
        {
            rotateGraphVisuals(hullChart, hullHighlightRotation);
            rotateGraphVisuals(shieldChart, shieldHighlightRotation);
        }));
        chartCycle.setCycleCount(Timeline.INDEFINITE);
        chartCycle.play();
    }

    //region UI Control Binding Methods

    public void setShipGraphic(SubScene shipGraphic)
    {
        this.shipGraphic = shipGraphic;
    }

    public void setDpsSpinner(Spinner<Double> ds, Spinner<Double> ss)
    {
        this.dpsSpinner = ds;
        this.dpsSpinner.setRepeatDelay(Duration.hours(1));
        this.dpsSpinner.setInitialDelay(Duration.hours(1));
        this.dpsSpinner.valueProperty().addListener((_x, _y, _z) -> {
            if (_z >= 1.0) updateGraphs();
        });

        this.sysSpinner = ss;
        this.sysSpinner.valueProperty().addListener((_x, _y, _z) -> {
            calculateCurrentStats();
            updateGraphs();
        });
    }

    public void associateShieldRegenLabels(Label r1, Label r2)
    {
        r1.textProperty().bind(r1s);
        r2.textProperty().bind(r2s);
    }

    public void associateShipManufacturer(Label makeLabel)
    {
        makeLabel.textProperty().bind(shipManufacturerName);
    }

    public void associateShipDisplayName(Label displayLabel)
    {
        displayLabel.textProperty().bind(shipDisplayName);
    }

    public void associateShipGivenName(Label givenNameLabel)
    {
        givenNameLabel.textProperty().bind(shipGivenName);
    }

    public void associateShipID(Label shipIDLabel)
    {
        shipIDLabel.textProperty().bind(shipID);
    }

    public void associateTtdGraphs(LineChart<Number, Number> shieldChart, LineChart<Number, Number> hullChart)
    {
        this.shieldChart = shieldChart;
        this.hullChart = hullChart;
    }

    public void associateBaseStatisticsTable(TableView<ShipStatisticData> statTable)
    {
        SortedList<ShipStatisticData> sorted = new SortedList<>(observableBaseStatistics);
        statTable.setItems(sorted);

        observableBaseStatistics.addListener((ListChangeListener<ShipStatisticData>) c -> statTable.refresh());
        sorted.setComparator(Comparator.comparing((data) -> data.shipCharacteristic));
    }

    public void associateHullStatisticsTable(TableView<ShipStatisticData> statTable)
    {
        SortedList<ShipStatisticData> sorted = new SortedList<>(observableHullStatistics);
        statTable.setItems(sorted);

        observableHullStatistics.addListener((ListChangeListener<ShipStatisticData>) c -> statTable.refresh());
        sorted.setComparator(Comparator.comparing((data) -> data.shipCharacteristic));
    }

    public void associateMassStatisticsTable(TableView<ShipStatisticData> statTable)
    {
        SortedList<ShipStatisticData> sorted = new SortedList<>(observableMassStatistics);
        statTable.setItems(sorted);

        observableMassStatistics.addListener((ListChangeListener<ShipStatisticData>) c -> statTable.refresh());
        sorted.setComparator(Comparator.comparing((data) -> data.shipCharacteristic));
    }

    public void associateShieldStatisticsTable(TableView<ShipStatisticData> statTable)
    {
        SortedList<ShipStatisticData> sorted = new SortedList<>(observableShieldStatistics);
        statTable.setItems(sorted);

        observableShieldStatistics.addListener((ListChangeListener<ShipStatisticData>) c -> statTable.refresh());
        sorted.setComparator(Comparator.comparing((data) -> data.shipCharacteristic));
    }

    public void associateOffensiveStatisticsTable(TableView<ShipStatisticData> statTable)
    {
        SortedList<ShipStatisticData> sorted = new SortedList<>(observableOffenseStatistics);
        statTable.setItems(sorted);

        observableOffenseStatistics.addListener((ListChangeListener<ShipStatisticData>) c -> statTable.refresh());
        sorted.setComparator(Comparator.comparing((data) -> data.shipCharacteristic));
    }

    public void associateCoreTable(TableView<ShipModuleData> coreTable)
    {
        SortedList<ShipModuleData> sorted = new SortedList<>(observableCoreInternals);
        coreTable.setItems(sorted);

        observableCoreInternals.addListener((ListChangeListener<ShipModuleData>) c -> coreTable.refresh());
        sorted.setComparator((a, b)->
        {
            CoreInternalSlot slotA = ((CoreInternalSlot) a.getModuleSlot());
            CoreInternalSlot slotB = ((CoreInternalSlot) b.getModuleSlot());
            return slotA.compareTo(slotB);
        });
    }

    public void associateOptionalTable(TableView<ShipModuleData> optionalTable)
    {
        SortedList<ShipModuleData> sorted = new SortedList<>(observableOptionalInternals);
        optionalTable.setItems(sorted);

        observableOptionalInternals.addListener((ListChangeListener<ShipModuleData>) c -> optionalTable.refresh());
        sorted.setComparator((a, b)->
        {
            OptionalInternalSlot slotA = ((OptionalInternalSlot) a.getModuleSlot());
            OptionalInternalSlot slotB = ((OptionalInternalSlot) b.getModuleSlot());
            return slotA.compareTo(slotB);
        });
    }

    public void associateHardpointTable(TableView<ShipModuleData> hardpointTable)
    {
        SortedList<ShipModuleData> sorted = new SortedList<>(observableHardpoints);
        hardpointTable.setItems(sorted);

        observableHardpoints.addListener((ListChangeListener<ShipModuleData>) c -> hardpointTable.refresh());
        sorted.setComparator((a, b)->
        {
            HardpointSlot slotA = ((HardpointSlot) a.getModuleSlot());
            HardpointSlot slotB = ((HardpointSlot) b.getModuleSlot());
            return slotA.compareTo(slotB);
        });
    }

    //endregion


    private void rotateGraphVisuals(LineChart<Number, Number> chart,
                                    Set<XYChart.Series<Number, Number>> rotation)
    {
        Optional.ofNullable(chart)
                .map(XYChart::getData)
                .orElse(FXCollections.emptyObservableList())
                .stream()
                .filter(graphLine -> !rotation.contains(graphLine))
                .map(nextline ->
                {
                    nextline.getNode().toFront();
                    rotation.add(nextline);
                    return true;
                })
                .findFirst()
                .orElseGet(() ->
                {
                    if (rotation.isEmpty()) return false;
                    XYChart.Series<Number, Number> x = rotation.stream().findFirst()
                            .orElse(null);
                    rotation.clear();
                    x.getNode().toFront();
                    rotation.add(x);
                    return false;
                });
    }

    private static Map<String, String> seriesColorMap = new HashMap<>();

    static
    {
        seriesColorMap.put("Shield Thermal","-fx-stroke: #5555ff;");
        seriesColorMap.put("Shield Kinetic","-fx-stroke: #ff4444;");
        seriesColorMap.put("Shield Explosive","-fx-stroke: #ffaa00;");

        seriesColorMap.put("Armour Thermal","-fx-stroke: #5555ff;");
        seriesColorMap.put("Armour Kinetic","-fx-stroke: #ff4444;");
        seriesColorMap.put("Armour Explosive","-fx-stroke: #ffaa00;");
        seriesColorMap.put("Armour Caustic","-fx-stroke: #33aa33;");
    }

    private static void updateResistanceGraph(double dps,
                                              double stren,
                                              double sys,
                                              LineChart<Number, Number> chart,
                                              List<ShipStatisticData> characteristics,
                                              ShipCharacteristic ... resistances)
    {
        if (resistances == null || resistances.length == 0)
        {
            return;
        }

        double aRes = mapSys(sys);

        Stream.of(resistances)
                .forEach(r -> characteristics.stream()
                        .filter(x->x.shipCharacteristic == r)
                        .map(x->x.floatStat)
                        .findFirst()
                        .ifPresent(resist ->
                        {
                            String name = r.toString()
                                    .replace("Resistance","");
                                    //.replace("Shield","")
                                    //.replace("Armour", "");

                            boolean isShield = r.toString().contains("Shield");
                            XYChart.Series<Number, Number> absoluteTtd = chart.getData().stream()
                                    .filter(s-> name.equals(s.getName()))
                                    .peek(x->x.getData().clear())
                                    .findFirst()
                                    .orElseGet(()->
                                    {
                                        XYChart.Series<Number, Number> t = new XYChart.Series<>();
                                        t.setName(name);
                                        chart.getData().add(t);
                                        t.getNode().setStyle(seriesColorMap.get(name));
                                        return t;
                                    });

                            double dot = r == ShipCharacteristic.Armour_Caustic
                                    ? 0.5
                                    : 0.0;

                            AtomicBoolean gonepast = new AtomicBoolean(false);
                            AtomicInteger nextOne = new AtomicInteger(0);
                            AtomicReference<Double> lastOne = new AtomicReference<>();
                            double rx =  (resist / 100);
                            double rx2 = (aRes / 100);
                            double cr = (1 - ((1 - rx) * (1 - rx2))) * 100;
                            double x3 = UIFunctions.Data.round(cr, 1);
                            double rx3 = (x3 / 100);

                            double rx4 = isShield ? rx3 : rx;

                            Stream.iterate(stren,
                                    x -> x > 0 || !gonepast.get(),
                                    x -> x - ((dps - (dps * rx4)) + dot))
                                    .forEach(n ->
                                    {
                                        if (n <= 0) gonepast.set(true);
                                        lastOne.set(n);
                                        absoluteTtd.getData().add(new XYChart.Data<>(nextOne.getAndIncrement(), n));
                                    });
                        }));
    }

    private static double mapSys(double sys)
    {
        double mapped;
        if (sys == 0.0) mapped = 0.0;
        else if (sys == 0.5) mapped = 7.5;
        else if (sys == 1.0) mapped = 15.0;
        else if (sys == 1.5) mapped = 22.5;
        else if (sys == 2.0) mapped = 30.0;
        else if (sys == 2.5) mapped = 37.5;
        else if (sys == 3.0) mapped = 45.0;
        else if (sys == 3.5) mapped = 52.5;
        else if (sys == 4.0) mapped = 60.0;
        else mapped = 0.0;
        return mapped;
    }

    private static double updateStrengthGraph(double dps,
                                              double sys,
                                              LineChart<Number, Number> chart,
                                              List<ShipStatisticData> characteristics,
                                              ShipCharacteristic stren, String k)
    {
        if (!chart.getStyleClass().contains("ttd_chart"))
        {
            chart.getStyleClass().add("ttd_chart");
        }

        AtomicReference<Double> savedStrength = new AtomicReference<>();

        double aRes = mapSys(sys);

        boolean isShield = stren.toString().contains("Shield");

        characteristics.stream()
                .filter(x->x.shipCharacteristic == stren)
                .map(x->x.floatStat)
                .findFirst()
                .ifPresent(strength ->
                {
                    savedStrength.set(strength);
                    XYChart.Series<Number, Number> absoluteTtd = chart.getData().stream()
                            .filter(s-> k.equals(s.getName()))
                            .peek(x->x.getData().clear())
                            .findFirst()
                            .orElseGet(()->
                            {
                                XYChart.Series<Number, Number> t = new XYChart.Series<>();
                                t.setName(k);
                                chart.getData().add(t);
                                t.getNode().setStyle("-fx-stroke: #cccccc");
                                return t;
                            });

                    AtomicBoolean gonepast = new AtomicBoolean(false);
                    AtomicInteger nextOne = new AtomicInteger(0);
                    AtomicReference<Double> lastOne = new AtomicReference<>();
                    double rx = isShield ? (aRes / 100) : 0;

                    Stream.iterate(strength,
                            c -> c > 0 || !gonepast.get(),
                            x -> x - ((dps - (dps * rx))))
                            .forEach(n ->
                            {
                                if (n <= 0) gonepast.set(true);

                                lastOne.set(n);
                                absoluteTtd.getData().add(new XYChart.Data<>(nextOne.getAndIncrement(), n));
                            });
                });

        if (savedStrength.get() == null)
        {
            return 0;
        }

        return savedStrength.get();
    }

    private void updateGraphs()
    {

        // shield
        double sdps = dpsSpinner.getValue();
        if (sdps < 1.0) return;

        double sys = sysSpinner.getValue();

        double shieldStrength = updateStrengthGraph(sdps, sys, shieldChart, strengthStatistics, ShipCharacteristic.Shield_Strength,"ABS S");
        double hullStrength = updateStrengthGraph(sdps, sys, hullChart, strengthStatistics, ShipCharacteristic.Hull_Strength, "ABS H");

        updateResistanceGraph(sdps, shieldStrength, sys, shieldChart, resistanceStatistics,
                ShipCharacteristic.Shield_Thermal,
                ShipCharacteristic.Shield_Kinetic,
                ShipCharacteristic.Shield_Explosive);

        // hull
        updateResistanceGraph(sdps, hullStrength, sys,  hullChart, resistanceStatistics,
                ShipCharacteristic.Armour_Thermal,
                ShipCharacteristic.Armour_Kinetic,
                ShipCharacteristic.Armour_Explosive,
                ShipCharacteristic.Armour_Caustic);


        Optional.ofNullable(shieldRegenRate)
                .ifPresent((c)->
                {
                    String name = "Charge";
                    XYChart.Series<Number, Number> absoluteTtd = shieldChart.getData().stream()
                            .filter(s-> name.equals(s.getName()))
                            .peek(x->x.getData().clear())
                            .findFirst()
                            .orElseGet(()->
                            {
                                XYChart.Series<Number, Number> t = new XYChart.Series<>();
                                t.setName(name);
                                shieldChart.getData().add(t);
                                t.getNode().setStyle("-fx-stroke: #00aaff;");
                                return t;
                            });

                    AtomicReference<Double> regen = new AtomicReference<>(c);
                    //double regen = c;
                    if (regen.get() == 0.0) regen.set(1.0);
                    AtomicInteger nextOne = new AtomicInteger(0);
                    AtomicReference<Double> lastOne = new AtomicReference<>();
                    Stream.iterate(0.0d, cs -> cs < shieldStrength, ls -> ls + regen.get())
                            //.limit(100)
                            .forEach(n ->
                            {
                                lastOne.set(n);
                                absoluteTtd.getData().add(new XYChart.Data<>(nextOne.getAndIncrement(), n));
                            });
                });


        Optional.ofNullable(brokenRegenRate)
                .ifPresent((c)->
                {
                    String name2= "Regen";
                    XYChart.Series<Number, Number> absoluteTtd2 = shieldChart.getData().stream()
                            .filter(s-> name2.equals(s.getName()))
                            .peek(x->x.getData().clear())
                            .findFirst()
                            .orElseGet(()->
                            {
                                XYChart.Series<Number, Number> t = new XYChart.Series<>();
                                t.setName(name2);
                                shieldChart.getData().add(t);
                                t.getNode().setStyle("-fx-stroke: #00ffaa;");
                                return t;
                            });

                    AtomicReference<Double> regen2 = new AtomicReference<>(c);
                    //double regen2 = c;
                    if (regen2.get() == 0.0) regen2.set(1.0);
                    AtomicInteger nextOne2 = new AtomicInteger(0);
                    AtomicReference<Double> lastOne2 = new AtomicReference<>();
                    AtomicReference<XYChart.Data<Number, Number>> buf = new AtomicReference<>();
                    Stream.iterate(0.0d, cs -> cs < (shieldStrength / 2), ls -> ls + regen2.get())
                            //.limit(100)
                            .forEach(n ->
                            {
                                lastOne2.set(n);
                                XYChart.Data<Number, Number> x = new XYChart.Data<>(nextOne2.getAndIncrement(), n);
                                buf.set(x);
                                absoluteTtd2.getData().add(x);
                            });

                    StackPane stackPane = new StackPane();
                    stackPane.getChildren().add(new Label("test!"));
                    buf.get().setNode(stackPane);
                });

        fixChart(shieldChart, shieldStrength);
        fixChart(hullChart, hullStrength);
    }

    private void fixChart(LineChart<Number, Number> chart, double strength)
    {
        chart.getYAxis().setAutoRanging(false);
        ((NumberAxis) chart.getYAxis()).setLowerBound(0.0);
        ((NumberAxis) chart.getYAxis()).setUpperBound(UIFunctions.Data.round(strength,0));
        ((NumberAxis) chart.getYAxis()).setTickUnit((int)(strength / 4));
        double limit = chart.getData().stream()
                .mapToDouble(s ->
                {
                    ObservableList<XYChart.Data<Number, Number>> data = s.getData();
                    return data.get(data.size() - 1).getXValue().doubleValue();
                })
                .reduce(Math::max)
                .orElse(0.0);
        chart.getXAxis().setAutoRanging(false);
        ((NumberAxis) chart.getXAxis()).setLowerBound(0.0);
        ((NumberAxis) chart.getXAxis()).setUpperBound(UIFunctions.Data.round(limit,0) + 5);
        ((NumberAxis) chart.getXAxis()).setTickUnit(60.0);
        ((NumberAxis) chart.getXAxis()).setMinorTickCount(6);
    }

    public void updateResistanceGraphs()
    {
        Platform.runLater(this::updateGraphs);
    }

    private void synchronizeStatistics()
    {
        Platform.runLater(()->
        {
            synchronized (observableBaseStatistics)
            {
                observableBaseStatistics.clear();
                observableBaseStatistics.addAll(baseStatistics);
            }

            synchronized (observableHullStatistics)
            {
                observableHullStatistics.clear();
                observableHullStatistics.addAll(strengthStatistics);
            }

            synchronized (observableMassStatistics)
            {
                observableMassStatistics.clear();
                observableMassStatistics.addAll(massStatistics);
            }

            synchronized (observableShieldStatistics)
            {
                observableShieldStatistics.clear();
                observableShieldStatistics.addAll(resistanceStatistics);
            }

            synchronized (observableOffenseStatistics)
            {
                observableOffenseStatistics.clear();
                observableOffenseStatistics.addAll(offenseStatistics);
            }

            r1s.set(String.valueOf(UIFunctions.Data.round(shieldRegenRate, 1)));
            r2s.set(String.valueOf(UIFunctions.Data.round(brokenRegenRate, 1)));
        });
    }

    private void synchronizeCoreInternals()
    {
        Platform.runLater(()->
        {
            synchronized (observableCoreInternals)
            {
                observableCoreInternals.clear();
                observableCoreInternals.addAll(coreInternals);
            }
        });
    }

    private void synchronizeOptionalInternals()
    {
        Platform.runLater(()->
        {
            synchronized (observableOptionalInternals)
            {
                observableOptionalInternals.clear();
                observableOptionalInternals.addAll(optionalInternals);
            }
        });
    }

    private void synchronizeHardpoints()
    {
        Platform.runLater(()->
        {
            synchronized (observableHardpoints)
            {
                observableHardpoints.clear();
                observableHardpoints.addAll(hardpoints);
            }
        });
    }

    public Ship getShip()
    {
        return ship;
    }

    public void setShip(Ship ship)
    {
        this.ship = ship;

        synchronized (coreInternals)
        {
            coreInternals.clear();
            synchronizeCoreInternals();
        }

        synchronized (optionalInternals)
        {
            optionalInternals.clear();
            synchronizeOptionalInternals();
        }

        synchronized (hardpoints)
        {
            hardpoints.clear();
            synchronizeHardpoints();
        }

        resetBaseStats();
        Platform.runLater(this::renderShipGraphic);
    }

    public void setGivenName(String givenName)
    {
        if (givenName == null) return;
        Platform.runLater(() ->
        {
            synchronized (shipGivenName)
            {
                shipGivenName.set(givenName);
            }
        });
    }

    public void setShipID(String ID)
    {
        if (ID == null) return;
        Platform.runLater(() ->
        {
            synchronized (shipID)
            {
                shipID.set(ID.toUpperCase());
            }
        });
    }

    public void setCurrentFuel(double currentFuel)
    {
        this.currentFuel = currentFuel;
        calculateCurrentStats();
    }

    private void resetBaseStats()
    {
        if (ship == null) return;

        // make a local copy just to be safe
        final String displayName = ship.getBaseShipStats().getDisplayName();
        final String manufacturer = ship.getBaseShipStats().getManufacturer().toString();

        Platform.runLater(()->
        {
            synchronized (shipDisplayName)
            {
                shipDisplayName.set(displayName);
            }

            synchronized (shipManufacturerName)
            {
                shipManufacturerName.set(manufacturer);
            }
        });

        synchronized (baseStatistics)
        {
            baseStatistics.clear();

            baseStatistics.add(new ShipStatisticData(ShipCharacteristic.Agility, ship.getBaseShipStats().getAgility()));
            baseStatistics.add(new ShipStatisticData(ShipCharacteristic.Speed, ship.getBaseShipStats().getSpeed()));
            baseStatistics.add(new ShipStatisticData(ShipCharacteristic.Boost_Speed, ship.getBaseShipStats().getBoostSpeed()));
            baseStatistics.add(new ShipStatisticData(ShipCharacteristic.Max_Speed, ship.getBaseShipStats().getMaxSpeed()));
            baseStatistics.add(new ShipStatisticData(ShipCharacteristic.Max_Boost_Speed, ship.getBaseShipStats().getMaxBoostSpeed()));


            synchronizeStatistics();
        }
    }

    private synchronized Stream<ShipModuleData> bufferedStream(List<ShipModuleData> modules)
    {
        List<ShipModuleData> buffer = new ArrayList<>();

        if (modules == coreInternals)
        {
            synchronized (coreInternals)
            {
                buffer.addAll(coreInternals);
            }
        }

        if (modules == optionalInternals)
        {
            synchronized (optionalInternals)
            {
                buffer.addAll(optionalInternals);
            }
        }

        if (modules == hardpoints)
        {
            synchronized (hardpoints)
            {
                buffer.addAll(hardpoints);
            }
        }

        return buffer.stream();
    }

    synchronized void installShipModule(ShipModuleData shipModuleData)
    {
        // todo: perform checking for support in the Ship object

        // note the remove() calls in each conditional before the add calls. This may seem strange, but is leveraging
        // the overridden equals() method in the ShipModuleData class to ensure only one module is present in a given
        // internal slot. This makes it ok to call installShipModule() multiple times with new ShipModuleData objects that
        // contain updated stats (for example, if the player upgrades or changes a mod on an existing item).

        if (CoreInternalSlot.typeMatches(shipModuleData.getModuleSlot()))
        {
            synchronized (coreInternals)
            {
                coreInternals.remove(shipModuleData);
                coreInternals.add(shipModuleData);
                synchronizeCoreInternals();
            }
        }

        if (OptionalInternalSlot.typeMatches(shipModuleData.getModuleSlot()))
        {
            synchronized (optionalInternals)
            {
                optionalInternals.remove(shipModuleData);
                optionalInternals.add(shipModuleData);
                synchronizeOptionalInternals();
            }
        }

        if (HardpointSlot.typeMatches(shipModuleData.getModuleSlot()))
        {
            synchronized (hardpoints)
            {
                hardpoints.remove(shipModuleData);
                hardpoints.add(shipModuleData);
                synchronizeHardpoints();
            }
        }

        // todo: determine if this can be delayed until all modules have been added in some cases, to avoid
        //  unnecessary calculations.
        calculateCurrentStats();
    }

    /**
     * Updates ship statistics table to reflect this ships' current characteristics
     */
    private void calculateCurrentStats()
    {
        if (ship == null)
        {
            return;
        }

        synchronized (baseStatistics)
        {
            resetBaseStats();
        }

        synchronized (massStatistics)
        {
            massStatistics.clear();

            double currentMass = calculateCurrentHullMass();
            double maxRange = calculateCurrentJumpRange(currentMass);
            double totalPower = calculateCurrentPowerDraw();

            massStatistics.add(new ShipStatisticData(ship.getBaseShipStats().getShipSize()));
            massStatistics.add(new ShipStatisticData(ShipCharacteristic.Total_Power_Draw, totalPower));
            massStatistics.add(new ShipStatisticData(ShipCharacteristic.Current_Mass, currentMass));
            massStatistics.add(new ShipStatisticData(ShipCharacteristic.Current_Jump_Range, maxRange));
            massStatistics.add(new ShipStatisticData(ShipCharacteristic.Mass_Lock_Factor, ship.getBaseShipStats().getMassLockFactor()));
            massStatistics.add(new ShipStatisticData(ShipCharacteristic.Base_Hull_Mass, ship.getBaseShipStats().getHullMass()));
            massStatistics.add(new ShipStatisticData(ShipCharacteristic.Crew_Seats, ship.getBaseShipStats().getCrewSeats()));
            massStatistics.add(new ShipStatisticData(ShipCharacteristic.SLF_Capable, ship.getBaseShipStats().isSlfCapable()));
            massStatistics.add(new ShipStatisticData(ShipCharacteristic.Hull_Hardness, ship.getBaseShipStats().getHullHardness()));
        }

        synchronized (strengthStatistics)
        {
            strengthStatistics.clear();

            shieldRegenRate = optionalInternals.stream()
                    .map(module -> module.getEffectValue(ItemEffect.RegenRate))
                    .filter(value -> value != 0.0)
                    .findFirst().orElse(0.0);

            brokenRegenRate = optionalInternals.stream()
                    .map(module -> module.getEffectValue(ItemEffect.BrokenRegenRate))
                    .filter(value -> value != 0.0)
                    .findFirst().orElse(0.0);

            ShipStatisticData.StatGroup shieldStrength = calculateCurrentShieldStrength();
            ShipStatisticData.StatGroup hullStrength = calculateCurrentHullStrength();

            strengthStatistics.add(new ShipStatisticData(ShipCharacteristic.Shield_Strength, shieldStrength));
            strengthStatistics.add(new ShipStatisticData(ShipCharacteristic.Hull_Strength, hullStrength));
        }

        synchronized (resistanceStatistics)
        {
            resistanceStatistics.clear();

            ShipStatisticData.StatGroup shieldExplosive = calculateResistance(ShipCharacteristic.Shield_Explosive);
            ShipStatisticData.StatGroup shieldKinetic = calculateResistance(ShipCharacteristic.Shield_Kinetic);
            ShipStatisticData.StatGroup shieldThermal = calculateResistance(ShipCharacteristic.Shield_Thermal);
            ShipStatisticData.StatGroup hullCaustic = calculateResistance(ShipCharacteristic.Armour_Caustic);
            ShipStatisticData.StatGroup hullExplosive = calculateResistance(ShipCharacteristic.Armour_Explosive);
            ShipStatisticData.StatGroup hullKinetic = calculateResistance(ShipCharacteristic.Armour_Kinetic);
            ShipStatisticData.StatGroup hullThermal = calculateResistance(ShipCharacteristic.Armour_Thermal);

            resistanceStatistics.add(new ShipStatisticData(ShipCharacteristic.Shield_Explosive, shieldExplosive));
            resistanceStatistics.add(new ShipStatisticData(ShipCharacteristic.Shield_Kinetic, shieldKinetic));
            resistanceStatistics.add(new ShipStatisticData(ShipCharacteristic.Shield_Thermal, shieldThermal));
            resistanceStatistics.add(new ShipStatisticData(ShipCharacteristic.Armour_Caustic, hullCaustic));
            resistanceStatistics.add(new ShipStatisticData(ShipCharacteristic.Armour_Explosive, hullExplosive));
            resistanceStatistics.add(new ShipStatisticData(ShipCharacteristic.Armour_Kinetic, hullKinetic));
            resistanceStatistics.add(new ShipStatisticData(ShipCharacteristic.Armour_Thermal, hullThermal));
        }

        synchronized (offenseStatistics)
        {
            offenseStatistics.clear();

            ShipStatisticData.StatGroup statGroup = calculateCurrentDPS();

            offenseStatistics.add(new ShipStatisticData(ShipCharacteristic.Maximum_DPS, statGroup));
        }

        synchronizeStatistics();
    }

    private static final Predicate<Double> nonZero = (x) -> Objects.requireNonNull(x) != 0.0d;

    private ShipStatisticData.StatGroup getArmorResistanceTotal(ItemEffect resistanceEffect)
    {
        List<Double> resistances = new ArrayList<>();

        List<Double> baseResistances = new ArrayList<>();
        List<Double> boostResistances = new ArrayList<>();

        coreInternals.stream()
                .filter(module -> module.getModule().modificationType() == ModificationType.Bulkheads)
                .map(module -> module.getEffectValue(resistanceEffect))
                .filter(nonZero)
                .mapToDouble(Double::doubleValue)
                .map(next -> 100d - next)
                .map(next -> next / 100d)
                .map(n-> UIFunctions.Data.round(n, 5))
                .forEach(baseResistances::add);

        optionalInternals.stream()
                .filter(module ->
                {
                    boolean isType = module.getModule().modificationType() == ModificationType.Hull_Reinforcement_Package;
                    boolean isGuardian = module.getEffectValue(ItemEffect.guardian) == 1.0;
                    return isType || isGuardian;
                })
                .map(module -> module.getEffectValue(resistanceEffect))
                .filter(nonZero)
                .map(next -> 100d - next)
                .map(next -> next / 100d)
                .map(n -> UIFunctions.Data.round(n, 5))
                .forEach(boostResistances::add);

        resistances.addAll(baseResistances);
        resistances.addAll(boostResistances);

        double baseResistance = baseResistances.stream()
                .mapToDouble(Double::doubleValue)
                .reduce(1, (a, b) -> a * b);

        double boostResistance = boostResistances.stream()
                .mapToDouble(Double::doubleValue)
                .reduce(1, (a, b) -> a * b);

        double combinedResistance = resistances.stream()
                .mapToDouble(Double::doubleValue)
                .reduce(1, (a, b) -> a * b);

        boolean shouldDiminish = combinedResistance < .7;

        double scaledBoosterResistance = shouldDiminish
                ? 0.7 - (0.7 - combinedResistance) / 2
                : combinedResistance;

        double actual = (1.0 - (scaledBoosterResistance)) * 100d;
        double raw = (1.0 - (combinedResistance)) * 100d;

        ShipStatisticData.StatGroup statGroup = new ShipStatisticData.StatGroup();
        statGroup.floatStat = UIFunctions.Data.round(actual,1);
        statGroup.rawFloat = UIFunctions.Data.round(raw, 1);
        statGroup.diminishCap = UIFunctions.Data.round((combinedResistance - .7) * 100, 2);

        statGroup.boostMultiplier = UIFunctions.Data.round(boostResistance, 2);
        statGroup.baseMultiplier = UIFunctions.Data.round(baseResistance, 2);

        statGroup.boostValue = UIFunctions.Data.round((1.0 - (boostResistance)) * 100d, 2);
        statGroup.baseValue = UIFunctions.Data.round((1.0 - (baseResistance)) * 100d, 2);

        return statGroup;
    }

    private ShipStatisticData.StatGroup getShieldResistanceTotal(ItemEffect resistanceEffect)
    {
        List<Double> resistances = new ArrayList<>();
        double shieldResistence =
                optionalInternals.stream()
                .filter(module -> module.getModule().modificationType() == ModificationType.Shield_Generator)
                .map(module -> module.getEffectValue(resistanceEffect))
                .filter(nonZero)
                .map(next -> 100d - next)
                .map(next -> next / 100d)
                .map(n->UIFunctions.Data.round(n, 5))
                .findFirst()
                .orElse(1d);

        hardpoints.stream()
                .filter(hardpoint -> hardpoint.getModule() != null)
                .filter(hardpoint -> hardpoint.getModule().modificationType() != null)
                .filter(hardpoint -> hardpoint.getModule().modificationType() == ModificationType.Shield_Booster)
                .map(hardpoint -> hardpoint.getEffectValue(resistanceEffect))
                .filter(nonZero)
                .map(next -> 100d - next)
                .map(next -> next / 100d)
                .map(n->UIFunctions.Data.round(n, 5))
                .forEach(resistances::add);

        double boosterResistance = resistances.stream()
                .mapToDouble(Double::doubleValue)
                .reduce(1, (a, b) -> a * b);

        boolean shouldDiminish = boosterResistance < .7;

        double scaledBoosterResistance = shouldDiminish
                ? 0.7 - (0.7 - boosterResistance) / 2
                : boosterResistance;

        double actual = (1.0 - (scaledBoosterResistance * shieldResistence)) * 100d;
        double raw = (1.0 - (boosterResistance * shieldResistence)) * 100d;

        ShipStatisticData.StatGroup statGroup = new ShipStatisticData.StatGroup();
        statGroup.floatStat = UIFunctions.Data.round(actual,1);
        statGroup.rawFloat = UIFunctions.Data.round(raw, 1);
        statGroup.diminishCap = UIFunctions.Data.round((boosterResistance - .7) * 100, 2);

        statGroup.boostValue = UIFunctions.Data.round((1.0 - (boosterResistance)) * 100d, 2);
        statGroup.boostMultiplier = UIFunctions.Data.round(boosterResistance, 2);
        statGroup.baseValue = UIFunctions.Data.round((1.0 - (shieldResistence)) * 100d, 2);
        statGroup.baseMultiplier = UIFunctions.Data.round(shieldResistence, 2);

        return statGroup;
    }

    private ShipStatisticData.StatGroup calculateResistance(ShipCharacteristic resistanceType)
    {
        ShipStatisticData.StatGroup calculatedResistance;
        switch (resistanceType)
        {
            case Armour_Caustic:
                calculatedResistance = getArmorResistanceTotal(ItemEffect.CausticResistance);
                break;

            case Armour_Explosive:
                calculatedResistance = getArmorResistanceTotal(ItemEffect.ExplosiveResistance);
                break;

            case Armour_Kinetic:
                calculatedResistance = getArmorResistanceTotal(ItemEffect.KineticResistance);
                break;

            case Armour_Thermal:
                calculatedResistance = getArmorResistanceTotal(ItemEffect.ThermicResistance);
                break;

            case Shield_Explosive:
                calculatedResistance = getShieldResistanceTotal(ItemEffect.ExplosiveResistance);
                break;

            case Shield_Kinetic:
                calculatedResistance = getShieldResistanceTotal(ItemEffect.KineticResistance);
                break;

            case Shield_Thermal:
                calculatedResistance = getShieldResistanceTotal(ItemEffect.ThermicResistance);
                break;

            default: calculatedResistance = new ShipStatisticData.StatGroup();
        }
        return calculatedResistance;
    }

    /**
     * Calculates this ships' current hull strength. This check takes into account bulkhead armour and hull
     * reinforcement packages, and calculates a hull strength in a manner that should be consistent with what
     * the game produces in the cockpit UI panels.
     *
     * @return a calculated hull strength for this ship
     */
    private ShipStatisticData.StatGroup calculateCurrentHullStrength()
    {
        if (ship == null) return new ShipStatisticData.StatGroup();
        /*
        There are two statistics that affect hull strength, "hull boost" and "hull reinforcement".

        At the moment, hull boost can only be affected by bulkhead armour modules, and as a core module there can only
        be one of them present on any ship. This makes calculating hull boost fairly straightforward, requiring only a
        simple conversion of the boost multiplier to a percentage, and then multiplying that value by the base hull to
        determine the actual adjustment to the hull strength it should apply.

        For hull reinforcement, the process is also very easy. Currently there is only one module type that can add
        reinforcement, which is the Hull Reinforcement Package. Also, unlike hull boost, reinforcement is not a
        multiplier but a straight adjustment to the ship's hull strength. The process then, is simply to sum the total
        reinforcement values on all Hull Reinforcement Packages that are installed and add it to the hull strength
         */

        // start with the base armor rating
        double hullStrength = ship.getBaseShipStats().getArmorRating();

        // loop through all the modules that can have hull reinforcement. For now, this
        // means only optional internals, but if this changes in the future, loop through
        // all relevant modules
        double hullReinforcement = optionalInternals.stream()
                .map(module -> module.getEffectValue(ItemEffect.DefenceModifierHealthAddition))
                .mapToDouble(Double::doubleValue)
                .sum();

        // right now, only armour modules can add hull boost, so we can loop through just the core
        // internals and filter in armour modules. In practice, this will only ever find one module
        double hullBoost = coreInternals.stream()
                .filter(m -> m.getModuleSlot() == CoreInternalSlot.Armour)
                .map(a -> a.getEffectValue(ItemEffect.DefenceModifierHealthMultiplier))
                .map(v -> v / 100d)
                .map(m -> hullStrength * m)
                .findFirst().orElse(0d);

        // calculate the final hull strength by adding the base bull, plus the boost and reinforcement adjustments
        double totalHullStrength = hullStrength + hullBoost + hullReinforcement;

        ShipStatisticData.StatGroup statGroup = new ShipStatisticData.StatGroup();
        statGroup.floatStat = UIFunctions.Data.round(totalHullStrength, 1);
        statGroup.baseValue = hullStrength;
        statGroup.rawFloat = UIFunctions.Data.round(hullBoost, 2);
        statGroup.boostValue = hullReinforcement;
        statGroup.diminishCap = 0d;

        statGroup.baseMultiplier= 0.0;
        statGroup.boostMultiplier= 0.0;
        // round the result to 1 decimal place to match the in-game UI
        return statGroup;
    }

    /**
     * Calculates this ships' shield strength. This check takes into account the installed shield generator and
     * equipped shield boosters, and calculates a shield strength in a manner that should be consistent with what
     * the game produces in the cockpit UI panels.
     *
     * @return a calculated shield strength for this ship
     */
    private ShipStatisticData.StatGroup calculateCurrentShieldStrength()
    {
        /*
        Before the total shield strength can be calculated, we must first determine the minimum and maximum mass
        and strength characteristics of the shield generator. When a modification is a applied to the optimal mass
        or optimal strength values of a shield generator, it also affects the associated minimum and maximum values
        of that characteristic. Unfortunately, the LoadoutHandler event only contains modified values for the optimal
        mass and/or strength stats. Fortunately calculating them is fairly easy, simply be determining the % change
        from the stock value and applying it to the minimum/maximum values as well.

        Note that for mass, the increase is not applied to the maximum value, so an increase in optimal mass will
        cause an increase in minimum mass, but NOT in maximum mass. For strength values, this is not the case, and
        the percentage change is applied to both the minimum and maximum values.
         */

        // first check for an actual shield generator. The game ensures there will only ever be one generator
        // equipped, so there should only be one or none.
        ShipModuleData shieldGenerator = optionalInternals.stream()
                .filter(m->m.getModule().modificationType() == ModificationType.Shield_Generator)
                .findAny().orElse(null);

        // no generator means no shields, so just return zero
        if (shieldGenerator == null) return new ShipStatisticData.StatGroup();

        // get the ships base hull mass, this affects shield strength. Strength calculations only take into
        // account the base mass, additional modules do not affect strength in-game
        double hullMass = ship.getBaseShipStats().getHullMass();
        double maximumMass = shieldGenerator.getEffectValue(ItemEffect.ShieldGenMaximumMass);

        // if the ship's mass exceeds maximum mass, the shield doesn't work
        if (hullMass > maximumMass) return new ShipStatisticData.StatGroup();

        // get the stock optimal mass so we can check for modifications
        double stockOptimalMass = shieldGenerator.getModule().itemEffects().effectStream()
                .filter(itemEffect -> itemEffect.getEffect() == ItemEffect.ShieldGenOptimalMass)
                .map(ItemEffectData::getDoubleValue)
                .findFirst().orElse(0d);

        // get the actual optimal and minimum mass values. if unmodified, optimal mass will match the stock value
        double optimalMass = shieldGenerator.getEffectValue(ItemEffect.ShieldGenOptimalMass);
        double minimumMass = shieldGenerator.getEffectValue(ItemEffect.ShieldGenMinimumMass);

        // if optimal mass was modified, we need to update minimum mass. Note that maximum mass is NOT adjusted,
        // no known mods currently affect maximum mass of shield generators
        if (optimalMass != stockOptimalMass)
        {
            // figure out how much the modification adjustment was
            double diff = optimalMass - stockOptimalMass;

            // figure out what the percentage adjustment to the stock value was
            double percentageAdjustment = diff / stockOptimalMass;

            // apply the same percentage change to calculate the minimum mass adjustment
            double minMassAdjustment = minimumMass * percentageAdjustment;

            // adjust the minimum mass
            minimumMass += minMassAdjustment;
        }

        // get the stock optimal strength so we can check for modifications
        double stockOptimalStrength = shieldGenerator.getModule().itemEffects().effectStream()
                .filter(e->e.getEffect()==ItemEffect.ShieldGenStrength)
                .map(ItemEffectData::getDoubleValue)
                .findFirst().orElse(0d);

        // get the actual optimal, minimum, and maximum values. As with mass, optimal will
        // equal stock if there is no modification applied. However, unlike mass, the modification
        // change must be applied to the maximum as well as the minimum
        double optimalStrength = shieldGenerator.getEffectValue(ItemEffect.ShieldGenStrength);
        double minimumStrength = shieldGenerator.getEffectValue(ItemEffect.ShieldGenMinStrength);
        double maximumStrength = shieldGenerator.getEffectValue(ItemEffect.ShieldGenMaxStrength);

        // if optimal strength was modified, we need to calculate adjusted minimum and maximum strength values
        if (optimalStrength != stockOptimalStrength)
        {
            // figure out how much the modification adjustment was
            double diff = optimalStrength - stockOptimalStrength;

            // figure out what the percentage adjustment to the stock value was
            double percentageAdjustment = diff / stockOptimalStrength;

            // apply the same percentage change to calculate the minimum and maximum strength adjustments
            double minStrengthAdjustment = minimumStrength * percentageAdjustment;
            double maxStrengthAdjustment = maximumStrength * percentageAdjustment;

            // adjust the minimum and maximum strengths
            minimumStrength += minStrengthAdjustment;
            maximumStrength += maxStrengthAdjustment;
        }

        /*
        Now we can start actually calculating the final shield value. Shields are adjusted by two separate multipliers
        to get the final value.

        The first multiplier is calculated based on the difference between the base hull mass
        of the ship and the optimal mass value of the equipped shield generator. If the hull mass is lower than optimal,
        the shield will be stronger and above optimal it will be weaker. Both the upper and lower ends of the scale are
        clamped at the minimum and maximum mass values, so a hull mass lower than the minimum will receive a strength
        increase equal to what it would get if were exactly the minimum mass.

        The second multiplier is more straightforward, calculated by taking the sum of shield boost values of all
        equipped shield boosters and adding 1. Effectively, this means the multiplier becomes 1 if no shield boosters
        are fitted, causing no change to the calculated shield strength
         */

        // start with the base shield value
        double baseShield = ship.getBaseShipStats().getShield();

        // calculate strength differences for the min/max range and the optimal/minimum strengths
        double strengthRangeDifference = maximumStrength - minimumStrength;
        double optimalStrengthDifference = optimalStrength - minimumStrength;

        // calculate the mass differences for the min/max range, maximum/ hull mass, and max/optimal mass
        double massRangeDifference = maximumMass - minimumMass;
        double maxHullDifference = maximumMass - hullMass;
        double maxOptimalDifference = maximumMass - optimalMass;

        // calculate hull mass and optimal mass ratios
        double hullMassRatio = maxHullDifference / massRangeDifference;
        double optimalMassRatio = maxOptimalDifference / massRangeDifference;

        // calculate the optimal/range strength ratio
        double strengthRatio = optimalStrengthDifference / strengthRangeDifference;

        // calculate mass factors for the hull and optimal masses, maxing out at 1
        double hullMassFactor = Math.min(1, hullMassRatio);
        double optimalMassFactor = Math.min(1, optimalMassRatio);

        // calculate a strength exponent to apply to the hull mass factor
        double strengthExponent = Math.log(strengthRatio) / Math.log(optimalMassFactor);

        // calculate the final shield power modifier
        double strengthPower = Math.pow(hullMassFactor, strengthExponent);

        // calculate the total shield multiplier and divide by 100, since it is applied as a percentage increase
        double shieldMultiplier = (minimumStrength + strengthPower * strengthRangeDifference) / 100d;

        // calculate the sum of 1 + all shield booster values, and divide by 100 for use as a percentage increase
        double accumulatedBoost = 1 + bufferedStream(hardpoints)
                .filter(Objects::nonNull)
                .filter(hardpoint -> hardpoint.getModule() != null)
                .filter(hardpoint -> hardpoint.getModule().modificationType() != null)
                .filter(hardpoint -> hardpoint.getModule().modificationType() == ModificationType.Shield_Booster)
                .map(hardpoint -> hardpoint.getEffectValue(ItemEffect.DefenceModifierShieldMultiplier))
                .mapToDouble(Double::doubleValue)
                .sum() / 100d;

        // calculate all shield reinforcement (guardian shield modules)
        double accumulatedShieldReinforcment = optionalInternals.stream()
                .map(m -> m.getEffectValue(ItemEffect.DefenceModifierShieldAddition))
                .filter(i -> i != 0.0)
                .mapToDouble(i -> i).sum();

        // apply all the multipliers to the ship's base shield value to calculate the total shield strength
        double calculatedShield = (baseShield * shieldMultiplier * accumulatedBoost) + accumulatedShieldReinforcment;

        ShipStatisticData.StatGroup statGroup = new ShipStatisticData.StatGroup();
        statGroup.floatStat = UIFunctions.Data.round(calculatedShield, 1);
        statGroup.baseValue = baseShield;
        statGroup.rawFloat = UIFunctions.Data.round(baseShield * shieldMultiplier * accumulatedBoost, 1);
        statGroup.boostValue = accumulatedShieldReinforcment;
        statGroup.diminishCap = optimalMass - hullMass;

        statGroup.baseMultiplier= 0.0;
        statGroup.boostMultiplier= 0.0;

        // round the result to 1 decimal place to match the in-game UI
        return statGroup;
    }

    private ShipStatisticData.StatGroup calculateCurrentDPS()
    {
        // total combined
        double s = hardpoints.stream()
                .filter(h->h.getEffectValue(ItemEffect.Size) > 0.0d)
                .map(h->h.getEffectValue(ItemEffect.DamagePerSecond))
                .mapToDouble(x-> x)
                .sum();

        AtomicReference<Double> ad = new AtomicReference<>(0.0d);
        AtomicReference<Double> td = new AtomicReference<>(0.0d);
        AtomicReference<Double> kd = new AtomicReference<>(0.0d);
        AtomicReference<Double> ed = new AtomicReference<>(0.0d);

        hardpoints.stream()
                .filter(h->h.getEffectValue(ItemEffect.Size) > 0.0d)
                .filter(h->h.getModule().itemEffects().effectByName(ItemEffect.DamageType).isPresent())
                .forEach(h->
                {
                    ItemEffects effects = h.getModule().itemEffects();
                    String t = effects.effectByName(ItemEffect.DamageType).get().getStringValue();
                    double dps = h.getEffectValue(ItemEffect.DamagePerSecond);

                    switch (t)
                    {
                        case "Absolute":
                            ad.set(dps * .6);
                            td.set(dps * .2);
                            kd.set(dps * .2);
                            break;

                        case "Thermal":
                            td.set(dps);
                            break;

                        case "Kinetic":
                            kd.set(dps);
                            break;

                        case "Explosive":
                            ed.set(dps);
                            break;

                        case "Thermo-Kinetic":
                            td.set(dps * .666);
                            kd.set(dps * .333);
                            break;

                            // todo: experimentals that modify dmg tye, see cannon
                        default:
                            break;
                    }
                });

        ShipStatisticData.StatGroup statGroup = new ShipStatisticData.StatGroup();

        statGroup.floatStat = s;

        statGroup.rawFloat = ad.get();
        statGroup.diminishCap = ed.get();
        statGroup.baseValue = td.get();
        statGroup.boostValue = kd.get();

        statGroup.baseMultiplier = 0.0;
        statGroup.boostMultiplier = 0.0;

        return statGroup;
    }

    public double getCurrentPowerDraw()
    {
        return massStatistics.stream().filter(e->e.shipCharacteristic == ShipCharacteristic.Total_Power_Draw)
                .findFirst().map(c -> c.floatStat)
                .orElse(0.0);
    }

    public double getCurrentHullMass()
    {
        return massStatistics.stream().filter(e->e.shipCharacteristic == ShipCharacteristic.Current_Mass)
                .findFirst().map(c -> c.floatStat)
                .orElse(0.0);
    }

    private double calculateCurrentPowerDraw()
    {
        if (ship == null) return 0.0d;

        List<ShipModuleData> buffer;

        synchronized (coreInternals)
        {
            buffer = new ArrayList<>(coreInternals);
        }

        synchronized (optionalInternals)
        {
            buffer.addAll(optionalInternals);
        }

        synchronized (hardpoints)
        {
            buffer.addAll(hardpoints);
        }

        double powerTotal = buffer.stream()
                .map(module -> module.getEffectValue(ItemEffect.PowerDraw))
                .mapToDouble(Double::doubleValue)
                .sum();

        double cargoHatch = 0.6;

        return UIFunctions.Data.round(powerTotal + cargoHatch, 2);
    }

    private double calculateCurrentHullMass()
    {
        if (ship == null) return 0.0d;

        List<ShipModuleData> buffer;

        synchronized (coreInternals)
        {
            buffer = new ArrayList<>(coreInternals);
        }

        synchronized (optionalInternals)
        {
            buffer.addAll(optionalInternals);
        }

        synchronized (hardpoints)
        {
            buffer.addAll(hardpoints);
        }

        double moduleMass = buffer.stream()
                .map(module -> module.getEffectValue(ItemEffect.Mass))
                .mapToDouble(Double::doubleValue)
                .sum();

        double hullMass = ship.getBaseShipStats().getHullMass();

        double totalHullMass = currentFuel +
                hullMass + moduleMass;

        // round the result to 1 decimal place to match the in-game UI
        return UIFunctions.Data.round(totalHullMass, 1);
    }

    private double calculateCurrentJumpRange(double currentMass)
    {
        // D = (O / M) * (1000F / R)^(1 / C)
        // D = (op / m) * (1000fpg / r)^(1 / c)

        // op/m*(1000(fpg/r))^(1/c)

        /*
        D is your Max Jump Range

        O is the Optimised Mass of your FSD
        F is the Max Fuel per Jump
        M is the Current Mass of your ship
        R is a constant, the Rating Constant of your FSD (see below for how to get this)

        C is the Class Constant (again, I'll list it below)

        Rating Constants
        A = 12
        B = 10
        C = 8
        D = 10
        E = 11

        Class Constants

        Class 2 = 2.00
        Class 3 = 2.15
        Class 4 = 2.30
        Class 5 = 2.45
        Class 6 = 2.60
        Class 7 = 2.75
        Class 8 = 2.90
        * */

        double op = coreInternals.stream()
                .map(m->m.getEffectValue(ItemEffect.FSDOptimalMass))
                .filter(v->v!=0.0d).findFirst()
                .orElse(0.0);

        double fpg = coreInternals.stream()
                .map(m->m.getEffectValue(ItemEffect.MaxFuelPerJump))
                .filter(v->v!=0.0d).findFirst()
                .orElse(0.0);

        double r = coreInternals.stream()
                .filter(mo->mo.getModule().modificationType() == ModificationType.Frame_Shift_Drive)
                .map(mo->mo.getModule().itemEffects().effectByName(ItemEffect.Class))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst()
                .map(s->
                {
                    switch (s.getStringValue())
                    {
                        case "A":
                            return 12.0;

                        case "B":
                            return 10.0;

                        case "C":
                            return 8.0;

                        case "D":
                            return 10.0;

                        case "E":
                            return 11.0;

                        default:
                            return 0.0;
                    }
                })
                .orElse(0.0);

        double c = coreInternals.stream()
                .filter(mo->mo.getModule().modificationType() == ModificationType.Frame_Shift_Drive)
                .map(mo->mo.getEffectValue(ItemEffect.Size))
                .findFirst()
                .map(s->
                {
                    switch (s.intValue())
                    {
                        case 2:
                            return 2.0;

                        case 3:
                            return 2.15;

                        case 4:
                            return 2.30;

                        case 5:
                            return 2.45;

                        case 6:
                            return 2.60;

                        case 7:
                            return 2.75;

                        case 8:
                            return 2.90;

                        default:
                            return 0.0;
                    }
                })
                .orElse(0.0);

        // op / m * (1000(fpg/r)) ^ (1/c)
        double x = op / currentMass;
        double y = 1000 * (fpg / r);
        double z = 1 / c;
        double res = x * Math.pow(y, z);

        double boost = optionalInternals.stream().map(mod->mod.getEffectValue(ItemEffect.FSDJumpRangeBoost))
                .mapToDouble(d-> d)
                .sum();

        if (Double.isNaN(res))
        {
            return 0.0;
        }

        return UIFunctions.Data.round(res + boost, 2);
    }

    private TriangleMesh getTestCubeModel()
    {
        float hw = 100 / 2f;
        float hh = 100 / 2f;
        float hd = 100 / 2f;

        float[] points = {
                -hw, -hh, -hd, // point 0

                hw, -hh, -hd, // point 1

                hw,  hh, -hd, // point 2

                -hw,  hh, -hd, // point 3

                -hw, -hh,  hd, // point 4

                hw, -hh,  hd, // point 5

                hw,  hh,  hd, // point 6

                -hw,  hh,  hd}; // point 7

        float[] texCoords = {0, 1}; // dummy (0), not using textures

        int[] faces = {
                0, 0, 2, 0, 1, 0, // face 0: p0, p2, p1, 0 for texture co-ords

                2, 0, 0, 0, 3, 0,

                1, 0, 6, 0, 5, 0,

                6, 0, 1, 0, 2, 0,

                5, 0, 7, 0, 4, 0,

                7, 0, 5, 0, 6, 0,

                4, 0, 3, 0, 0, 0,

                3, 0, 4, 0, 7, 0,

                3, 0, 6, 0, 2, 0,

                6, 0, 3, 0, 7, 0,

                4, 0, 1, 0, 5, 0,

                1, 0, 4, 0, 0, 0,
        };

        TriangleMesh mesh = new TriangleMesh();
        mesh.getPoints().addAll(points);
        mesh.getTexCoords().addAll(texCoords);
        mesh.getFaces().addAll(faces);

        return mesh;
    }

    private final float scaleMultiplier = 1.0f;

    private TriangleMesh getModel()
    {
        TriangleMesh mesh = new TriangleMesh(VertexFormat.POINT_NORMAL_TEXCOORD);
        mesh.getTexCoords().addAll(1, 0);

        //AtomicInteger nextPoint = new AtomicInteger();
        //AtomicInteger nextNormal = new AtomicInteger();

        try
        {
            try(InputStream testModel = StarShip.class.getResourceAsStream("/models/test_model2.stl"))
            {
                Scanner scanner = new Scanner(testModel);
                String stlStart = scanner.next();
                if (!stlStart.equals("solid"))
                {
                    System.out.println("Bad STL format");
                    return mesh;
                }

                while (scanner.hasNext())
                {
                    String nextToken = scanner.next();
                    if (nextToken.equals("facet"))
                    {
                        scanner.next("normal");
                        float n0 = scanner.nextFloat();
                        float n1 = scanner.nextFloat();
                        float n2 = scanner.nextFloat();

                        mesh.getNormals().addAll(n0, n1, n2);

                        scanner.next("outer");
                        scanner.next("loop");

                        scanner.next("vertex");
                        float p0x = scanner.nextFloat() * scaleMultiplier;
                        float p0y = scanner.nextFloat() * scaleMultiplier;
                        float p0z = scanner.nextFloat() * scaleMultiplier;

                        scanner.next("vertex");
                        float p1x = scanner.nextFloat() * scaleMultiplier;
                        float p1y = scanner.nextFloat() * scaleMultiplier;
                        float p1z = scanner.nextFloat() * scaleMultiplier;

                        scanner.next("vertex");
                        float p2x = scanner.nextFloat() * scaleMultiplier;
                        float p2y = scanner.nextFloat() * scaleMultiplier;
                        float p2z = scanner.nextFloat() * scaleMultiplier;

                        mesh.getPoints().addAll(p0x, p0y, p0z, p1x, p1y, p1z, p2x, p2y, p2z);

//                        System.out.println("normal: " + n0 + "," + n1 + "," + n2);
//                        System.out.println("vertex 0: " + p0x + "," + p0y + "," + p0z);
//                        System.out.println("vertex 1: " + p1x + "," + p1y + "," + p1z);
//                        System.out.println("vertex 2: " + p2x + "," + p2y + "," + p2z);

                        scanner.next("endloop");
                        scanner.next("endfacet");

                        int p0Index = mesh.getPoints().size() / 3 - 3;
                        int p1Index = mesh.getPoints().size() / 3 - 2;
                        int p2Index = mesh.getPoints().size() / 3 - 1;
                        int normalIndex = mesh.getNormals().size() / 3 - 1;

                        mesh.getFaces().addAll(
                                p0Index, normalIndex, 0,
                                p1Index, normalIndex, 0,
                                p2Index, normalIndex, 0);
                    }
                    else
                    {
                        System.out.println("token was: " + nextToken);
                    }
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return mesh;
        }

        return mesh;
    }


    private void renderShipGraphic()
    {
        TriangleMesh mesh = getModel();

        //getModel();

        // Create a Camera to view the 3D Shapes
        PerspectiveCamera camera = new PerspectiveCamera(false);
        camera.setTranslateX(-150);
        camera.setTranslateY(-125);
        camera.setTranslateZ(-300);

        // Add a Rotation Animation to the Camera
        //RotateTransition rotation = new RotateTransition(Duration.seconds(2), camera);
//        rotation.setCycleCount(Animation.INDEFINITE);
//        rotation.setFromAngle(-10);
//        rotation.setToAngle(10);
//        rotation.setAutoReverse(true);
//        rotation.setAxis(Rotate.X_AXIS);
//        rotation.play();

//        AmbientLight alight = new AmbientLight(Color.RED);
//        alight.setTranslateZ(-15000);

        PointLight light = new PointLight(Color.BLUE);
        //light.setTranslateX(-150);
        //light.setTranslateY(-125);
        light.setTranslateZ(-100);

        MeshView meshView = new MeshView();
        meshView.setMesh(mesh);
        //meshView.setDrawMode(DrawMode.LINE);

        Group root = new Group(meshView, light);

        Rotate xRotate = new Rotate(0, Rotate.X_AXIS);
        Rotate yRotate = new Rotate(0, Rotate.Y_AXIS);

        DoubleProperty angleX = new SimpleDoubleProperty(0);
        DoubleProperty angleY = new SimpleDoubleProperty(0);
        meshView.getTransforms().addAll(xRotate, yRotate);

        /*Bind Double property angleX/angleY with corresponding transformation.
        When we update angleX / angleY, the transform will also be auto updated.*/
        xRotate.angleProperty().bind(angleX);
        yRotate.angleProperty().bind(angleY);

        //Tracks drag starting point for x and y
        AtomicReference<Double> anchorX = new AtomicReference<>(0d);
        AtomicReference<Double> anchorY = new AtomicReference<>(0d);

        //Keep track of current angle for x and y
        AtomicReference<Double> anchorAngleX = new AtomicReference<>(0d);
        AtomicReference<Double> anchorAngleY = new AtomicReference<>(0d);

        shipGraphic.setRoot(root);
        shipGraphic.setWidth(300);
        shipGraphic.setHeight(250);
        shipGraphic.setCamera(camera);

        shipGraphic.setOnMousePressed(event ->
        {
            anchorX.set(event.getSceneX());
            anchorY.set(event.getSceneY());
            anchorAngleX.set(angleX.get());
            anchorAngleY.set(angleY.get());
        });

        shipGraphic.setOnMouseDragged(event ->
        {
            angleX.set(anchorAngleX.get() - (anchorY.get() - event.getSceneY()));
            angleY.set(anchorAngleY.get() + anchorX.get() - event.getSceneX());
        });
    }
}
