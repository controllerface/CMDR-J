package com.controllerface.cmdr_j.server;

import java.util.stream.Stream;

public enum StatusFlags
{
    DOCKED(0x0000_0001),
    LANDED(0x0000_0002),
    LANDING_GEAR_DOWN(0x0000_0004),
    SHIELDS_UP(0x0000_0008),
    SUPERCRUISE(0x0000_0010),
    FLIGHT_ASSIST_OFF(0x0000_0020),
    HARDPOINTS_DEPLOYED(0x0000_0040),
    IN_WING(0x0000_0080),
    LIGHTS_ON(0x0000_0100),
    CARGO_SCOOP_DEPLOYED(0x0000_0200),
    SILENT_RUNNING(0x0000_0400),
    SCOOPING_FUEL(0x0000_0800),
    SRV_HANDBRAKE(0x0000_1000),
    SRV_TURRET_DEPLOYED(0x0000_2000),
    SRV_TURRET_DISABLED(0x0000_4000),
    SRV_DRIVE_ASSIST(0x0000_8000),
    FSD_MASS_LOCKED(0x0001_0000),
    FSD_CHARGING(0x0002_0000),
    FSD_COOL_DOWN(0x0004_0000),
    LOW_FUEL(0x0008_0000),
    OVER_HEATING(0x0010_0000),
    HAS_LAT_LONG(0x0020_0000),
    IS_IN_DANGER(0x0040_0000),
    BEING_INTERDICTED(0x0080_0000),
    IN_MAIN_SHIP(0x0100_0000),
    IN_FIGHTER(0x0200_0000),
    IN_SRV(0x0400_0000),
    HUD_IN_ANALYSIS_MODE(0x0800_0000),
    NIGHT_VISION(0x1000_0000),
    HIGH_ALTITUDE(0x2000_0000),
    FSD_JUMP(0x4000_0000),
    SRV_HIGHBEAM(0x8000_0000),

    ;

    final long bitmask;

    StatusFlags(long bitmask)
    {
        this.bitmask = bitmask;
    }

    public static Stream<StatusFlags> extractFlags(long flags)
    {
        return Stream.of(StatusFlags.values())
            .filter(flag -> (flag.bitmask & flags) == flag.bitmask);
    }
}
