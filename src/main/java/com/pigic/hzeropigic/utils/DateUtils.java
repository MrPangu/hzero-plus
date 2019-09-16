package com.pigic.hzeropigic.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateUtils
 * @Description TODO
 * @Author 38148
 * @Date 2019/5/24 14:12
 * @Email dianzhang.zhou@hand-china.com
 **/
public class DateUtils {
    /**
     * 日期转换成字符串 自定义格式
     *
     * @param date
     * @param dateFormat
     * @return
     */
    public static String DateToFormatStr(Date date, String dateFormat) {

        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        String str = format.format(date);
        return str;
    }

    /**
     * 字符串转换成日期
     *
     * @param str
     * @return date
     */
    public static Date StringToDate(String str,String dateFormat) {

        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}