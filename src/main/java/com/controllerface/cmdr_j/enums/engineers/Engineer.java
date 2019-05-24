package com.controllerface.cmdr_j.enums.engineers;

import com.controllerface.cmdr_j.classes.StarSystem;
import com.controllerface.cmdr_j.classes.procurements.ProcurementType;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;

/**
 * Created by Stephen on 6/13/2018.
 */
public enum Engineer
{
    DIDI_VATERMANN("Didi Vatermann", new StarSystem("Vatermann LLC :: Leesti", 72.75, 48.75, 68.25),
            new Pair<>(new Pair<>(ModificationType.Shield_Booster, ExperimentalType.Shield_Booster), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator), ItemGrade.GRADE_3)),

    COLONEL_BRIS_DEKKER("Colonel Bris Dekker", new StarSystem("Dekker's Yard :: Sol", 0, 0, 0),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Drive_Interdictor, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Drive, ExperimentalType.Frame_Shift_Drive), ItemGrade.GRADE_3)),

    THE_SARGE("The Sarge", new StarSystem("The Beach :: Beta-3 Tucani", 32.25, -55.1875, 23.875),
            new Pair<>(new Pair<>(ModificationType.Collector_Limpet_Controller, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Fuel_Transfer_Limpet, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Hatch_Breaker_Limpet, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Prospector_Limpet_Controller, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Cannon, ExperimentalType.Cannon), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Rail_Gun, ExperimentalType.Rail_Gun), ItemGrade.GRADE_3)),

    MARCO_QWENT("Marco Qwent", new StarSystem("Qwent Research Base :: Sirius", 6.25, -1.28125, -5.75),
            new Pair<>(new Pair<>(ModificationType.Power_Plant, ExperimentalType.Power_Plant), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Power_Distributor, ExperimentalType.Power_Distributor), ItemGrade.GRADE_3)),

    ZACARIAH_NEMO("Zacariah Nemo", new StarSystem("Nemo Cyber Party Base :: Yoru", 97.875, -86.90625, 64.125),
            new Pair<>(new Pair<>(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator), ItemGrade.GRADE_2)),

    LORI_JAMESON("Lori Jameson", new StarSystem("Jameson Base :: Shinrarta Dezhra", 55.71875, 17.59375, 27.15625),
            new Pair<>(new Pair<>(ModificationType.Sensors, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Detailed_Surface_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Refinery, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Fuel_Scoop, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Auto_Field_Maintenence_Unit, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Life_Support, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Wake_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Kill_Warrant_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Manifest_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank), ItemGrade.GRADE_3)),

    JURI_ISHMAAK("Juri Ishmaak", new StarSystem("Pater's Memorial :: Giryak", 14.6875, 27.65625, 108.65625),
            new Pair<>(new Pair<>(ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Sensors, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Detailed_Surface_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Torpedo_Pylon, ExperimentalType.Torpedo_Pylon), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Wake_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Kill_Warrant_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Manifest_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Missile_Rack, ExperimentalType.Missile_Rack), ItemGrade.GRADE_3)),

    BILL_TURNER("Bill Turner", new StarSystem("Turner Metallics Inc. :: Alioth", -33.65625, 72.46875 , -20.65625),
            new Pair<>(new Pair<>(ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Sensors, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Detailed_Surface_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Life_Support, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Refinery, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Auto_Field_Maintenence_Unit, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Fuel_Scoop, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Wake_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Kill_Warrant_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Manifest_Scanner, null), ItemGrade.GRADE_3)),

    TIANA_FORTUNE("Tiana Fortune", new StarSystem("Fortune's Loss :: Achenar", 67.5, -119.46875, 24.84375),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Wake_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Kill_Warrant_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Manifest_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Collector_Limpet_Controller, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Fuel_Transfer_Limpet, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Hatch_Breaker_Limpet, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Prospector_Limpet_Controller, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Sensors, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Drive_Interdictor, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Detailed_Surface_Scanner, null), ItemGrade.GRADE_3)),

    ELVIRA_MARTUUK("Elvira Martuuk", new StarSystem("Long Sight Base :: Khun", -171.59375, 19.96875, -56.96875),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Drive, ExperimentalType.Frame_Shift_Drive), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Thrusters, ExperimentalType.Thrusters), ItemGrade.GRADE_2),
            new Pair<>(new Pair<>(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank), ItemGrade.GRADE_1)),

    BROO_TARQUIN("Broo Tarquin", new StarSystem("Broo's Legacy :: Muang", 17.03125, -172.78125, -3.46875),
            new Pair<>(new Pair<>(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser), ItemGrade.GRADE_5)),

    FELICITY_FARSEER("Felicity Farseer", new StarSystem("Farseer Inc. :: Deciat", 122.625, -0.8125, -47.28125),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Drive, ExperimentalType.Frame_Shift_Drive), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Thrusters, ExperimentalType.Thrusters), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Sensors, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Detailed_Surface_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Shield_Booster, ExperimentalType.Shield_Booster), ItemGrade.GRADE_1),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Drive_Interdictor, null), ItemGrade.GRADE_1),
            new Pair<>(new Pair<>(ModificationType.Power_Plant, ExperimentalType.Power_Plant), ItemGrade.GRADE_1)),

    LEI_CHEUNG("Lei Cheung", new StarSystem("Trader's Rest :: Laksak", -21.53125, -6.3125, 116.03125),
            new Pair<>(new Pair<>(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Sensors, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Detailed_Surface_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Shield_Booster, ExperimentalType.Shield_Booster), ItemGrade.GRADE_3)),

    THE_DWELLER("The Dweller", new StarSystem("Black Hide :: Wyrd", -11.625, 31.53125, -3.9375),
            new Pair<>(new Pair<>(ModificationType.Power_Distributor, ExperimentalType.Power_Distributor), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser), ItemGrade.GRADE_3)),

    HERA_TANI("Hera Tani", new StarSystem("The Jet's Hole :: Kuwemaki", 134.65625, -226.90625, -7.8125),
            new Pair<>(new Pair<>(ModificationType.Power_Plant, ExperimentalType.Power_Plant), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Detailed_Surface_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Sensors, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Power_Distributor, ExperimentalType.Power_Distributor), ItemGrade.GRADE_3)),

    PROFESSOR_PALIN("Professor Palin", new StarSystem("Palin Research Centre :: Maia", -81.78125, -149.4375, -343.375),
            new Pair<>(new Pair<>(ModificationType.Thrusters, ExperimentalType.Thrusters), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Drive, ExperimentalType.Frame_Shift_Drive), ItemGrade.GRADE_3)),

    RAM_TAH("Ram Tah", new StarSystem("Phoenix Base :: Meene ", 118.78125, -56.4375, -97.1875),
            new Pair<>(new Pair<>(ModificationType.Electronic_Countermeasures, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Point_Defense, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Heat_Sink_Launcher, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Chaff_Launcher, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Collector_Limpet_Controller, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Fuel_Transfer_Limpet, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Prospector_Limpet_Controller, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Hatch_Breaker_Limpet, null), ItemGrade.GRADE_3)),

    SELENE_JEAN("Selene Jean", new StarSystem("Prospector's Rest :: Kuk", -21.28125, 69.09375, -16.3125),
            new Pair<>(new Pair<>(ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Bulkheads, ExperimentalType.Bulkheads), ItemGrade.GRADE_5)),

    LIZ_RYDER("Liz Ryder", new StarSystem("Demolition Unlimited :: Eurybia", 51.40625, -54.40625, -30.5),
            new Pair<>(new Pair<>(ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Torpedo_Pylon, ExperimentalType.Torpedo_Pylon), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Missile_Rack, ExperimentalType.Missile_Rack), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package), ItemGrade.GRADE_1),
            new Pair<>(new Pair<>(ModificationType.Bulkheads, ExperimentalType.Bulkheads), ItemGrade.GRADE_1)),

    TOD_MCQUINN("Tod \"The Blaster\" McQuinn", new StarSystem("Trophy Camp :: Wolf 397", 40, 79.21875, -10.40625),
            new Pair<>(new Pair<>(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Rail_Gun, ExperimentalType.Rail_Gun), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Cannon, ExperimentalType.Cannon), ItemGrade.GRADE_2)),

    //TODO: need to add the Colonia engineers, maybe clean this class up

    ;

    private final String fullName;
    private final StarSystem location;
    private final EnumMap<ModificationType, ItemGrade> modifications = new EnumMap<>(ModificationType.class);
    private final EnumSet<ExperimentalType> experimentals = EnumSet.noneOf(ExperimentalType.class);

    /**
     * Main Constructor
     *
     * SafeVarargs notes:
     *  - The varargs argument {@code tasks} is used purely for extracting the data from the task pairs, and storing
     *  the keys/values in separate maps. The maps are used at runtime as lookup tables for easily associating items
     *  that can be modified and the Engineer who can perform the modification. Without the SafeVarags annotation, this
     *  class causes a compile time warning about possible heap pollution. This is because of the {@code Pair<>} object
     *  which has generic type parameters. This usage pattern is difficult for a java compiler to optimize because of
     *  how the type system is implemented, thus is warns the user about code that exhibits this behavior.
     *
     *  - We Are asserting here that the behavior as specified is acceptable, because the usage of the Pair object as
     *  an intermediary is purely for convenience. The actual Pair objects are very short-lived, statically created
     *  when this enum class is instantiated by the JVM. The Pairs are created as the enum values are constructed, and
     *  the keys/values are immediately extracted and stored in their appropriate places. The pair then falls out of
     *  scope and should be garbage collected. This behavior is private to this class and therefore isn't open to
     *  accidental misuse from outside classes.
     *
     * @param fullName the full name of this engineer
     * @param location StarSystem where this engineer can be found
     * @param tasks tasks(Modifications and Experimental Effects) that this Engineer can perform
     */
    @SafeVarargs
    Engineer(String fullName, StarSystem location, Pair<Pair<ModificationType, ExperimentalType>, ItemGrade> ... tasks)
    {
        this.fullName = fullName;
        this.location = location;

        for (Pair<Pair<ModificationType, ExperimentalType>, ItemGrade> task : tasks)
        {
            ModificationType modificationType = task.getKey().getKey();
            ExperimentalType experimentalType = task.getKey().getValue();
            ItemGrade itemGrade = task.getValue();
            modifications.put(modificationType, itemGrade);
            if (experimentalType != null) experimentals.add(experimentalType);
        }
    }

    public static List<Engineer> findSupportedEngineers(ProcurementType procurementType, ItemGrade grade)
    {
        List<Engineer> engineers = new ArrayList<>();
        if (procurementType instanceof ModificationType)
        {
            for (Engineer engineer : values())
            {
                ItemGrade maxGrade = engineer.modifications.get(procurementType);
                if (maxGrade == null) continue;
                if (maxGrade.getNumericalValue() >= grade.getNumericalValue()) engineers.add(engineer);
            }
        }
        else if (procurementType instanceof ExperimentalType)
        {
            for (Engineer engineer : values())
            {
                if (engineer.experimentals.contains(procurementType)) engineers.add(engineer);
            }
        }
        return engineers;
    }

    public String getFullName()
    {
        return fullName;
    }

    public StarSystem getLocation()
    {
        return location;
    }
}
