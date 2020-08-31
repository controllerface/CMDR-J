package com.controllerface.cmdr_j.ui;

import com.controllerface.cmdr_j.classes.commander.InventoryDisplay;
import com.controllerface.cmdr_j.classes.data.PoiData;
import javafx.scene.SubScene;
import javafx.scene.control.*;

import java.util.Objects;

/**
 * A container class used to hold UI elements that a Commander object can interact with in order to keep
 * the UI updated as commander info changes.
 */
public class CommanderUIControls
{
    public final Label commander_name;
    public final Label credit_balance;
    public final TableView<InventoryDisplay> cargo_table;
    public final CheckBox show_zero_quantities;
    public final TableView<InventoryDisplay> raw_table;
    public final TableView<InventoryDisplay> manufactured_table;
    public final TableView<InventoryDisplay> data_table;
    public final Button create_poi_button;
    public final Button current_system_button;
    public final TextField create_poi_name;
    public final TextArea create_poi_notes;
    public final ListView<PoiData> system_poi_list;
    public final TableView<PoiData> galaxy_poi_table;
    public final ComboBox<String> poi_system_selector;
    public final SubScene galaxyGraphic;

    private CommanderUIControls(Builder builder)
    {
        this.commander_name = builder.commanderName;
        this.credit_balance = builder.creditBalance;
        this.cargo_table = builder.cargoTable;
        this.show_zero_quantities = builder.showZeroQuantities;
        this.raw_table = builder.rawTable;
        this.manufactured_table = builder.manufacturedTable;
        this.data_table = builder.dataTable;
        this.create_poi_button = builder.createPoiButton;
        this.current_system_button = builder.currentSystemButton;
        this.create_poi_name = builder.createPoiName;
        this.create_poi_notes = builder.createPoiNotes;
        this.system_poi_list = builder.systemPoiList;
        this.galaxy_poi_table = builder.galaxyPoiTable;
        this.poi_system_selector = builder.poiSystemSelector;
        this.galaxyGraphic = builder.galaxyGraphic;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder
    {
        Label commanderName;
        Label creditBalance;
        CheckBox showZeroQuantities;
        TableView<InventoryDisplay> cargoTable;
        TableView<InventoryDisplay> rawTable;
        TableView<InventoryDisplay> manufacturedTable;
        TableView<InventoryDisplay> dataTable;
        Button createPoiButton;
        Button currentSystemButton;
        TextField createPoiName;
        TextArea createPoiNotes;
        ListView<PoiData> systemPoiList;
        TableView<PoiData> galaxyPoiTable;
        ComboBox<String> poiSystemSelector;
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

        public Builder setShowZeroQuantities(CheckBox showZeroQuantities)
        {
            this.showZeroQuantities = showZeroQuantities;
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

        public Builder setCreatePoiName(TextField createPoiName)
        {
            this.createPoiName = createPoiName;
            return this;
        }

        public Builder setCreatePoiNotes(TextArea createPoiNotes)
        {
            this.createPoiNotes = createPoiNotes;
            return this;
        }

        public Builder setSystemPoiList(ListView<PoiData> systemPoiList)
        {
            this.systemPoiList = systemPoiList;
            return this;
        }

        public Builder setGalaxyPoiTable(TableView<PoiData> galaxyPoiTable)
        {
            this.galaxyPoiTable = galaxyPoiTable;
            return this;
        }

        public Builder setPoiSystemSelector(ComboBox<String> poiSystemSelector)
        {
            this.poiSystemSelector = poiSystemSelector;
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
            Objects.requireNonNull(commanderName);
            Objects.requireNonNull(creditBalance);
            Objects.requireNonNull(showZeroQuantities);
            Objects.requireNonNull(cargoTable);
            Objects.requireNonNull(rawTable);
            Objects.requireNonNull(manufacturedTable);
            Objects.requireNonNull(dataTable);
            Objects.requireNonNull(createPoiButton);
            Objects.requireNonNull(currentSystemButton);
            Objects.requireNonNull(createPoiName);
            Objects.requireNonNull(createPoiNotes);
            Objects.requireNonNull(systemPoiList);
            Objects.requireNonNull(galaxyPoiTable);
            Objects.requireNonNull(poiSystemSelector);
            Objects.requireNonNull(galaxyGraphic);
            return new CommanderUIControls(this);
        }
    }
}
