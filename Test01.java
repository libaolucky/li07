package com.hp.dateCalenlar;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 *
 */
public class Test01 {
    public static void main(String[] args) {
        //创建Date对象
        Date date = new Date();
        System.out.println("date = " + date);
        
        long aa=date.getTime();  //L代表的是个long值  毫秒数
        aa+=1000 * 60 * 60 *24 *3L;  //三天后的时间
        date.setTime(aa);
        System.out.println("date = " + date);
    }
}
