package com.controllerface.cmdr_j.ui;

import com.controllerface.cmdr_j.classes.data.PoiData;
import com.controllerface.cmdr_j.classes.data.Waypoint;
import javafx.scene.SubScene;
import javafx.scene.control.*;

import java.util.Objects;

/**
 * A container class used to hold UI elements that a Commander object can interact with in order to keep
 * the UI updated as commander info changes.
 */
public class CommanderUIControls
{
    public final Label commanderName;
    public final Label creditBalance;
    public final Label latitudeLabel;
    public final Label longitudeLabel;
    public final Button createPoiButton;
    public final Button currentSystemButton;
    public final Button addWaypointButton;
    public final CheckBox showZeroQuantities;
    public final TextField createPoiName;
    public final TextField addWaypointName;
    public final TextArea createPoiNotes;
    public final ComboBox<String> poiSystemSelector;
    public final ListView<PoiData> systemPoiList;
    public final ListView<Waypoint> waypointList;
    public final TableView<InventoryDisplay> cargoTable;
    public final TableView<InventoryDisplay> rawTable;
    public final TableView<InventoryDisplay> manufacturedTable;
    public final TableView<InventoryDisplay> dataTable;
    public final TableView<PoiData> galaxyPoiTable;
    public final SubScene galaxyGraphic;

    private CommanderUIControls(Builder builder)
    {
        this.commanderName = builder.commanderName;
        this.creditBalance = builder.creditBalance;
        this.latitudeLabel = builder.latitudeLabel;
        this.longitudeLabel = builder.longitudeLabel;
        this.createPoiButton = builder.createPoiButton;
        this.currentSystemButton = builder.currentSystemButton;
        this.addWaypointButton = builder.addWaypointButton;
        this.showZeroQuantities = builder.showZeroQuantities;
        this.createPoiName = builder.createPoiName;
        this.addWaypointName = builder.addWaypointName;
        this.createPoiNotes = builder.createPoiNotes;
        this.poiSystemSelector = builder.poiSystemSelector;
        this.systemPoiList = builder.systemPoiList;
        this.waypointList = builder.waypointList;
        this.cargoTable = builder.cargoTable;
        this.rawTable = builder.rawTable;
        this.manufacturedTable = builder.manufacturedTable;
        this.dataTable = builder.dataTable;
        this.galaxyPoiTable = builder.galaxyPoiTable;
        this.galaxyGraphic = builder.galaxyGraphic;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder
    {
        private static final String UI_NULL_MESSAGE = "UI control cannot be null: ";

        Label commanderName;
        Label creditBalance;
        Label latitudeLabel;
        Label longitudeLabel;
        Button createPoiButton;
        Button currentSystemButton;
        Button addWaypointButton;
        CheckBox showZeroQuantities;
        TextField createPoiName;
        TextField addWaypointName;
        TextArea createPoiNotes;
        ComboBox<String> poiSystemSelector;
        ListView<PoiData> systemPoiList;
        ListView<Waypoint> waypointList;
        TableView<PoiData> galaxyPoiTable;
        TableView<InventoryDisplay> cargoTable;
        TableView<InventoryDisplay> rawTable;
        TableView<InventoryDisplay> manufacturedTable;
        TableView<InventoryDisplay> dataTable;
        SubScene galaxyGraphic;

        public Builder setCommanderName(Label commanderName)
        {
            this.commanderName = commanderName;
            return this;
        }

        public Builder setCreditBalance(Label creditBalance)
        {
            this.creditBalance = creditBalance;
            return this;
        }

        public Builder setLatitudeLabel(Label latitudeLabel)
        {
            this.latitudeLabel = latitudeLabel;
            return this;
        }

        public Builder setLongitudeLabel(Label longitudeLabel)
        {
            this.longitudeLabel = longitudeLabel;
            return this;
        }

        public Builder setCreatePoiButton(Button createPoiButton)
        {
            this.createPoiButton = createPoiButton;
            return this;
        }

        public Builder setCurrentSystemButton(Button currentSystemButton)
        {
            this.currentSystemButton = currentSystemButton;
            return this;
        }

        public Builder setAddWaypointButton(Button addWaypointButton)
        {
            this.addWaypointButton = addWaypointButton;
            return this;
        }

        public Builder setShowZeroQuantities(CheckBox showZeroQuantities)
        {
            this.showZeroQuantities = showZeroQuantities;
            return this;
        }

        public Builder setCreatePoiName(TextField createPoiName)
        {
            this.createPoiName = createPoiName;
            return this;
        }

        public Builder setAddWaypointName(TextField addWaypointName)
        {
            this.addWaypointName = addWaypointName;
            return this;
        }

        public Builder setCreatePoiNotes(TextArea createPoiNotes)
        {
            this.createPoiNotes = createPoiNotes;
            return this;
        }

        public Builder setPoiSystemSelector(ComboBox<String> poiSystemSelector)
        {
            this.poiSystemSelector = poiSystemSelector;
            return this;
        }

        public Builder setSystemPoiList(ListView<PoiData> systemPoiList)
        {
            this.systemPoiList = systemPoiList;
            return this;
        }

        public Builder setWaypointList(ListView<Waypoint> waypointList)
        {
            this.waypointList = waypointList;
            return this;
        }

        public Builder setGalaxyPoiTable(TableView<PoiData> galaxyPoiTable)
        {
            this.galaxyPoiTable = galaxyPoiTable;
            return this;
        }

        public Builder setCargoTable(TableView<InventoryDisplay> cargoTable)
        {
            this.cargoTable = cargoTable;
            return this;
        }

        public Builder setRawTable(TableView<InventoryDisplay> rawTable)
        {
            this.rawTable = rawTable;
            return this;
        }

        public Builder setManufacturedTable(TableView<InventoryDisplay> manufacturedTable)
        {
            this.manufacturedTable = manufacturedTable;
            return this;
        }

        public Builder setDataTable(TableView<InventoryDisplay> dataTable)
        {
            this.dataTable = dataTable;
            return this;
        }

        public Builder setGalaxyGraphic(SubScene galaxyGraphic)
        {
            this.galaxyGraphic = galaxyGraphic;
            return this;
        }

        public CommanderUIControls build()
        {
            // all fields are required, throws exception if any are null
            Objects.requireNonNull(commanderName, UI_NULL_MESSAGE + "commanderName");
            Objects.requireNonNull(creditBalance, UI_NULL_MESSAGE + "creditBalance");
            Objects.requireNonNull(latitudeLabel, UI_NULL_MESSAGE + "latitudeLabel");
            Objects.requireNonNull(longitudeLabel, UI_NULL_MESSAGE + "longitudeLabel");
            Objects.requireNonNull(createPoiButton, UI_NULL_MESSAGE + "createPoiButton");
            Objects.requireNonNull(currentSystemButton, UI_NULL_MESSAGE + "currentSystemButton");
            Objects.requireNonNull(addWaypointButton, UI_NULL_MESSAGE + "addWaypointButton");
            Objects.requireNonNull(showZeroQuantities, UI_NULL_MESSAGE + "showZeroQuantities");
            Objects.requireNonNull(createPoiName, UI_NULL_MESSAGE + "createPoiName");
            Objects.requireNonNull(addWaypointName, UI_NULL_MESSAGE + "waypointNameInput");
            Objects.requireNonNull(createPoiNotes, UI_NULL_MESSAGE + "createPoiNotes");
            Objects.requireNonNull(poiSystemSelector, UI_NULL_MESSAGE + "poiSystemSelector");
            Objects.requireNonNull(systemPoiList, UI_NULL_MESSAGE + "systemPoiList");
            Objects.requireNonNull(waypointList, UI_NULL_MESSAGE + "waypointList");
            Objects.requireNonNull(galaxyPoiTable, UI_NULL_MESSAGE + "galaxyPoiTable");
            Objects.requireNonNull(cargoTable, UI_NULL_MESSAGE + "cargoTable");
            Objects.requireNonNull(rawTable, UI_NULL_MESSAGE + "rawTable");
            Objects.requireNonNull(manufacturedTable, UI_NULL_MESSAGE + "manufacturedTable");
            Objects.requireNonNull(dataTable, UI_NULL_MESSAGE + "dataTable");
            Objects.requireNonNull(galaxyGraphic, UI_NULL_MESSAGE + "galaxyGraphic");

            return new CommanderUIControls(this);
        }
    }
}
