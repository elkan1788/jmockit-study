package io.github.elkan1788.jmockit.statical;

import java.util.Date;

/**
 * A simple usage for DateUtil class
 *
 * @author elkan1788
 */
public class DateUtilUsage {

    private String dateStr;
    private Date dateObj;

    public DateUtilUsage() {
    }

    public DateUtilUsage(String dateStr, Date dateObj) {
        this.dateStr = dateStr;
        this.dateObj = dateObj;
    }

    public String getDateLongStr() {
        return DateUtil.getLongDateStr(this.dateObj);
    }

    public Date getFullDateObj() {
        return DateUtil.getLongDate(this.dateStr);
    }
}
