package io.github.elkan1788.jmockit.statical;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A helpful date util class
 *
 * ready for test JMockit
 *
 * @author elkan1788
 */
public class DateUtil {

    private static final SimpleDateFormat DEF_SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    /**
     * Get date string, eg: 2016-07-01 12:25:41.425
     * @param date  format date source
     * @return date string
     */
    public static String getLongDateStr(Date date) {
        if (date == null) {
            return DEF_SDF.format(new Date());
        }

        return DEF_SDF.format(date);
    }

    /**
     * Get date object from string, the format like this: '2016-07-01 12:25:41.425'
     *
     * @param date date string source
     * @return  date object
     */
    public static Date getLongDate(String date) {
        if (date == null || date.isEmpty()) {
            throw new IllegalArgumentException("");
        }

        try {
            return DEF_SDF.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException("Parse date to string failed.",e);
        }
    }
}
