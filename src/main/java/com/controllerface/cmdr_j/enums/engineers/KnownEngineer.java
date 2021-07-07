package com.controllerface.cmdr_j.enums.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.classes.engineers.*;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.interfaces.commander.Engineer;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.*;

public enum KnownEngineer implements Engineer
{
    BILL_TURNER(new BillTurner()),                  // The Bubble
    BROO_TARQUIN(new BrooTarquin()),                // The Bubble
    CHLOE_SEDESI(new ChloeSedesi()),                // Witch Head Sector
    COLONEL_BRIS_DEKKER(new ColonelBrisDekker()),   // The Bubble
    DIDI_VATERMANN(new DidiVatermann()),            // The Bubble
    DOMINO_GREEN(new DominoGreen()),                // The Bubble (Odyssey)
    ELVIRA_MARTUUK(new ElviraMartuuk()),            // The Bubble
    ETIENNE_DORN(new EtienneDorn()),                // Colonia
    FELICITY_FARSEER(new FelicityFarseer()),        // The Bubble
    HERA_TANI(new HeraTani()),                      // The Bubble
    HERO_FERRARI(new HeroFerrari()),                // The Bubble (Odyssey)
    JUDE_NAVARRO(new JudeNevarro()),                // The Bubble (Odyssey)
    JURI_ISHMAAK(new JuriIshmaak()),                // The Bubble
    KIT_FOWLER(new KitFowler()),                    // The Bubble (Odyssey)
    LEI_CHEUNG(new LeiCheung()),                    // The Bubble
    LIZ_RYDER(new LizRyder()),                      // The Bubble
    LORI_JAMESON(new LoriJameson()),                // The Bubble
    MARCO_QWENT(new MarcoQwent()),                  // The Bubble
    MARSHA_HICKS(new MarshaHicks()),                // Colonia
    MEL_BRANDON(new MelBrandon()),                  // Colonia
    ODEN_GEIGER(new OdenGeiger()),                  // The Bubble (Odyssey)
    PETRA_OLMANOVA(new PetraOlmanova()),            // Colonia
    PROFESSOR_PALIN(new ProfessorPalin()),          // The Bubble
    RAM_TAH(new RamTah()),                          // The Bubble
    SELENE_JEAN(new SeleneJean()),                  // The Bubble
    TERRA_VELASQUEZ(new TerraVelasquez()),          // The Bubble (Odyssey)
    THE_DWELLER(new TheDweller()),                  // The Bubble
    THE_SARGE(new TheSarge()),                      // The Bubble
    TIANA_FORTUNE(new TianaFortune()),              // The Bubble
    TOD_MCQUINN(new TodMcQuinn()),                  // The Bubble
    UMA_LASZLO(new UmaLaszlo()),                    // The Bubble (Odyssey)
    WELLINGTON_BECK(new WellingtonBeck()),          // The Bubble (Odyssey)
    ZACARIAH_NEMO(new ZacariahNemo()),              // The Bubble

    ;

    private final Engineer delegate;

    KnownEngineer(Engineer delegate)
    {
        this.delegate = delegate;
    }

    public static KnownEngineer findEngineerById(int id)
    {
        return Arrays.stream(values())
            .filter(engineer -> engineer.delegate.getId() == id)
            .findFirst()
            .orElse(null);
    }

    public static List<KnownEngineer> findSupportedEngineers(TaskType taskType, ItemGrade grade)
    {
        List<KnownEngineer> knownEngineers = new ArrayList<>();
        if (taskType instanceof ModificationType)
        {
            for (KnownEngineer knownEngineer : values())
            {
                ItemGrade maxGrade = knownEngineer.delegate.getModifications().get(taskType);
                if (maxGrade == null) continue;
                if (maxGrade.getNumericalValue() >= grade.getNumericalValue()) knownEngineers.add(knownEngineer);
            }
        }
        else if (taskType instanceof ExperimentalType)
        {
            for (KnownEngineer knownEngineer : values())
            {
                if (knownEngineer.delegate.getExperimentals().contains(taskType)) knownEngineers.add(knownEngineer);
            }
        }
        return knownEngineers;
    }

    public static List<KnownEngineer> findSupportedEngineers(TaskRecipe taskRecipe)
    {
        List<KnownEngineer> knownEngineers = new ArrayList<>();
        for (KnownEngineer knownEngineer : values())
        {
            if (knownEngineer.delegate.getGroundGearModifications().contains(taskRecipe)) knownEngineers.add(knownEngineer);
        }
        return knownEngineers;
    }

    @Override
    public String getFacility()
    {
        return delegate.getFacility();
    }

    @Override
    public String getFullName()
    {
        return delegate.getFullName();
    }

    @Override
    public StarSystem getLocation()
    {
        return delegate.getLocation();
    }

    @Override
    public int getId()
    {
        return delegate.getId();
    }

    @Override
    public EnumMap<ModificationType, ItemGrade> getModifications()
    {
        return delegate.getModifications();
    }

    @Override
    public EnumSet<ExperimentalType> getExperimentals()
    {
        return delegate.getExperimentals();
    }

    @Override
    public EnumSet<ModificationRecipe> getGroundGearModifications()
    {
        return delegate.getGroundGearModifications();
    }
}
