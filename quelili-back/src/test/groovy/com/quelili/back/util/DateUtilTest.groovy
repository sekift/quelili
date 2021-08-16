package com.quelili.back.util

import spock.lang.*
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations

import java.sql.Timestamp
import static org.mockito.Mockito.*

class DateUtilTest extends Specification {
    @Mock
    Timestamp JAVA_MIN_TIMESTAMP
    @InjectMocks
    DateUtil dateUtil

    def setup() {
        MockitoAnnotations.initMocks(this)
    }

    @Unroll
    def "test add Date，#datepart|#number，#result"() {
        given:
        Date now = new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime();

        when:
        DateUtil.addDate("ee", 1, now)

        then: "捕获异常并设置需要验证的异常值"
        def exception = thrown(IllegalArgumentException)
        exception.getMessage() == "DateUtil.addDate()方法非法参数值：ee"

        expect: "when + then 组合"
        DateUtil.addDate(datepart, number, now) == result

        where: "表格方式测试不同的分支逻辑"
        datepart|number || result
        "yy"|1|| new GregorianCalendar(2022, Calendar.AUGUST, 13, 17, 15).getTime()
        "MM"|1|| new GregorianCalendar(2021, Calendar.SEPTEMBER, 13, 17, 15).getTime()
        "dd"|1|| new GregorianCalendar(2021, Calendar.AUGUST, 14, 17, 15).getTime()
        "hh"|1|| new GregorianCalendar(2021, Calendar.AUGUST, 13, 18, 15).getTime()
        "mm"|1|| new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 16).getTime()
    }

    def "test compare Time"() {
        when:
        boolean result = DateUtil.compareTime("2022-08-16 00:00:00")

        then:
        result == false
    }

    def "test compare Time 2;#time1,#time2,#result"() {
        expect: "when + then 组合"
        DateUtil.compareTime(time1, time2) == result

        where: "表格方式测试不同的分支逻辑"
        time1 | time2 || result
        "2021-08-16 00:00:00" | "2021-08-17 00:00:00" || true
        "2021-08-18 00:00:00" | "2021-08-17 00:00:00" || false
    }

    def "test compare Time 3"() {
        when:
        boolean result = DateUtil.compareTime("time1", "time2", "dateFormat")

        then:
        result == true
    }

    def "test convert"() {
        when:
        String result = DateUtil.convert(new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime())

        then:
        result == "replaceMeWithExpectedResult"
    }

    def "test convert 2"() {
        when:
        String result = DateUtil.convert(new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime(), "format")

        then:
        result == "replaceMeWithExpectedResult"
    }

    def "test convert 3"() {
        when:
        Date result = DateUtil.convert("2021-08-13 17:15:00")

        then:
        result == new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime()
    }

    def "test convert 4"() {
        when:
        Date result = DateUtil.convert("date", "format")

        then:
        result == new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime()
    }

    def "test convert Date To Str"() {
        when:
        String result = DateUtil.convertDateToStr(new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime(), "dateFormat")

        then:
        result == "2021-08-13 17:15:00"
    }

    def "test convert Str To Date"() {
        when:
        Date result = DateUtil.convertStrToDate("dateStr", "dateFormat")

        then:
        result == new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime()
    }

    def "test convert Str To Date 2"() {
        when:
        Date result = DateUtil.convertStrToDate("dateStr", "dateFormat", null)

        then:
        result == new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime()
    }

    def "test convert Str To Timestamp"() {
        when:
        Timestamp result = DateUtil.convertStrToTimestamp("dateStr")

        then:
        result == null
    }

    def "test convert Str To Timestamp 2"() {
        when:
        Timestamp result = DateUtil.convertStrToTimestamp("dateStr", true)

        then:
        result == null
    }

    def "test convert Str To Timestamp Zero"() {
        when:
        Timestamp result = DateUtil.convertStrToTimestampZero("dateStr")

        then:
        result == null
    }

    def "test convert To Period"() {
        when:
        String result = DateUtil.convertToPeriod(0l)

        then:
        result == "replaceMeWithExpectedResult"
    }

    def "test date Diff"() {
        when:
        double result = DateUtil.dateDiff("datepart", new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime(), new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime())

        then:
        result == 0d
    }

    def "test get Curr Date Str"() {
        when:
        String result = DateUtil.getCurrDateStr()

        then:
        result == "replaceMeWithExpectedResult"
    }

    def "test get Curr Date Str 2"() {
        when:
        String result = DateUtil.getCurrDateStr("dateFormat")

        then:
        result == "replaceMeWithExpectedResult"
    }

    def "test get Curr Timestamp"() {
        when:
        Timestamp result = DateUtil.getCurrTimestamp()

        then:
        result == null
    }

    def "test get First Month Day"() {
        when:
        Date result = DateUtil.getFirstMonthDay(new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime())

        then:
        result == new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime()
    }

    def "test get Last Month Day"() {
        when:
        Date result = DateUtil.getLastMonthDay(new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime())

        then:
        result == new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime()
    }

    def "test get Standard Datetime Str"() {
        when:
        String result = DateUtil.getStandardDatetimeStr("timestampStr")

        then:
        result == "replaceMeWithExpectedResult"
    }

    def "test get Time Millis"() {
        when:
        long result = DateUtil.getTimeMillis("dateStr")

        then:
        result == 0l
    }

    def "test to Begin Date"() {
        when:
        String result = DateUtil.toBeginDate("fieldValue")

        then:
        result == "replaceMeWithExpectedResult"
    }

    def "test to End Date"() {
        when:
        String result = DateUtil.toEndDate("fieldValue")

        then:
        result == "replaceMeWithExpectedResult"
    }

    def "test get Month First Date"() {
        when:
        String result = DateUtil.getMonthFirstDate(new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime())

        then:
        result == "replaceMeWithExpectedResult"
    }

    def "test get Date By Day First"() {
        when:
        String result = DateUtil.getDateByDayFirst(new GregorianCalendar(2021, Calendar.AUGUST, 13, 17, 15).getTime())

        then:
        result == "replaceMeWithExpectedResult"
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme