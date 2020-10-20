package org.python.modules._locale;

/**
 * Date related string values.
 *
 * @since Jython 2.7.2
 */
public interface DateSymbolLocale {

    String[] getShortWeekdays();

    String[] getShortMonths();

    String[] getMonths();

    String[] getAmPmStrings();

    String[] getWeekdays();

}