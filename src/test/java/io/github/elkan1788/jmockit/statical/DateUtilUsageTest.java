package io.github.elkan1788.jmockit.statical;

import mockit.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.*;

/**
 * Test DateUtilUsage class
 *
 * @author elkan1788
 */
public class DateUtilUsageTest {

    @BeforeClass
    public void init() {

        new MockUp<DateUtil>(){

            @Mock
            public String getLongDateStr(Date date) {
                return "2016-07-07";
            }

            @Mock
            public Date getLongDate(String date) {
                return new Date();
            }

        };
    }

    @Test
    public void testGetDateLongStr() throws Exception {



        DateUtilUsage usage = new DateUtilUsage();
        String dateStr = usage.getDateLongStr();
        assertEquals(dateStr, "2016-07-07");

    }

    @Test
    public void testGetFullDateObj() throws Exception {

        DateUtilUsage usage = new DateUtilUsage("2016-07-07", new Date());
        Date dateObj = usage.getFullDateObj();
        assertNotSame(dateObj.getTime(), new Date().getTime());

    }
}