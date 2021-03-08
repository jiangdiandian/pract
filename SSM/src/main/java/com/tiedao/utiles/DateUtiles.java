package com.tiedao.utiles;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtiles {
    //日期转换
    public static String getDate(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        return format;
    }
}
