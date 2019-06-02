package com.edu.bigdata;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 格式化时间
 */
public class FormatTimeUDF extends UDF {

    // 根据输入的时间毫秒值（long 类型）和格式化要求，返回 String 类型时间
    public String evaluate(long ms, String fmt) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        Date d = new Date();
        d.setTime(ms);

        return sdf.format(d);
    }

    // 根据输入的时间毫秒值（String 类型）和格式化要求，返回 String 类型时间
    public String evaluate(String ms, String fmt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        Date d = new Date();
        d.setTime(Long.parseLong(ms));

        return sdf.format(d);
    }

    // 根据输入的时间毫秒值（long 类型）、格式化要求，和区分周的任意值，返回 String 类型时间
    public String evaluate(long ms, String fmt, int week) throws ParseException {
        Date d = new Date();
        d.setTime(ms);

        // 周内第一天
        Date firstDay = DateUtil.getWeekBeginTime(d);
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);

        return sdf.format(firstDay);
    }
}