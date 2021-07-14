package com.hp.dateCalenlar;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 */
public class Test02 {
    public static void main(String[] args) {
        //创建一个Date对象
        Date date=new Date();
        
        //修改日期的显示
        String pp="yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf=new SimpleDateFormat(pp);
        //保存格式化
       String da=sdf.format(date);
        System.out.println("当前时间为：" + da);
        
    }
}
