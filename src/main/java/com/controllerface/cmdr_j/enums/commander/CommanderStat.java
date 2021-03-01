package com.controllerface.cmdr_j.enums.commander;

import com.controllerface.cmdr_j.interfaces.commander.Statistic;

import java.text.NumberFormat;
import java.util.function.Function;

/**
 * Created by Controllerface on 4/17/2018.
 */
public enum CommanderStat implements Statistic
{
    Commander("Commander", "Commander", Object::toString),
    Game_Mode("GameMode", "Game Mode", Object::toString),
    Private_Group("Group","Private Group", Object::toString),

    Credits("Credits", "Credits", (o) ->
    {
        if (o instanceof String)
        {
            return ((String) o);
        }
        return NumberFormat.getInstance().format(((int) o));
    }),

    Loan("Loan", "Loan", (o) ->
    {
        if (o instanceof String)
        {
            return ((String) o);
        }
        return NumberFormat.getInstance().format(o);
    }),

    ;

    private final String key;
    private final String text;
    private final Function<Object, String> formatFunction;

    CommanderStat(String key, String text, Function<Object, String> formatFunction)
    {
        this.key = key;
        this.text = text;
        this.formatFunction = formatFunction;
    }

    public String getKey()
    {
        return key;
    }

    public String getText()
    {
        return text;
    }

    @Override
    public String getName()
    {
        return name();
    }

    public String format(Object raw)
    {
        return formatFunction.apply(raw);
    }
}
