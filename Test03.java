package com.hp.dateCalenlar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 */
public class Test03 {
    private static String birthday;
    public static void main(String[] args) {
        //控制台输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的生日, 输入格式为:yyyy-MM-dd");
         birthday = sc.nextLine();
         //调用周的方法
          week();
    }
    public static void week(){
        //修改它的输出格式
        String pp="yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pp);
        Date birDate = null;
        try {
            //把字符串转成的日期
            birDate = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("您的日期字符串可能不是个日期哦！");
        }
        //创建Date对象
        Date now = new Date();
        //拿现在日期的long值 - 生日日期的long值 =中间经历所有的时间
        long time = now.getTime() - birDate.getTime();
        //获取一共经历了多少天
        long day = time / 1000 / 60 / 60 / 24;
        //获取多少周
        long week=day/7;
        System.out.println("到现在为止经历了:" + week+ "周");
    }
}
