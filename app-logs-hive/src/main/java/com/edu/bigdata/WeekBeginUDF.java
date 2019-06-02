package com.edu.bigdata;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算 week 的起始毫秒数
 */
public class WeekBeginUDF extends UDF {

    // 计算本周的起始时间，(毫秒数)
    public long evaluate() throws ParseException {
        return DateUtil.getWeekBeginTime(new Date()).getTime();
    }

    // 指定周偏移量
    public long evaluate(int offset) throws ParseException {
        return DateUtil.getWeekBeginTime(new Date(), offset).getTime();
    }

    // 计算某周的起始时刻，日期类型(毫秒数)
    public long evaluate(Date d) throws ParseException {
        return DateUtil.getWeekBeginTime(d).getTime();
    }

    // 计算某周的起始时刻，日期类型，带偏移量(毫秒数)
    public long evaluate(Date d, int offset) throws ParseException {
        return DateUtil.getWeekBeginTime(d, offset).getTime();
    }

    // 计算某周的起始时刻，String 类型(毫秒数)
    public long evaluate(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = sdf.parse(dateStr);

        return DateUtil.getWeekBeginTime(d).getTime();
    }

    // 计算某周的起始时刻，String 类型，带偏移量(毫秒数)
    public long evaluate(String dateStr, int offset) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = sdf.parse(dateStr);
        return DateUtil.getWeekBeginTime(d, offset).getTime();
    }

    // 计算某周的起始时刻，String 类型，带格式化要求(毫秒数)
    public long evaluate(String dateStr, String fmt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        Date d = sdf.parse(dateStr);

        return DateUtil.getWeekBeginTime(d).getTime();
    }

    // 计算某周的起始时刻，String 类型，带格式化，带偏移量(毫秒数)
    public long evaluate(String dateStr, String fmt, int offset) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        Date d = sdf.parse(dateStr);

        return DateUtil.getWeekBeginTime(d, offset).getTime();
    }
}