package com.hp.dateCalenlar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
         Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身份证号：");
          String s = scanner.next();

           //411303200101231828    6-14
          if(s.length() == 18){
              System.out.println("格式正确！");
              String yy=s.substring(6,10);
              String mm=s.substring(10,12);
              String dd=s.substring(12,14);

              //出生日期 字符串日期  将年月日用“-”拼接在一起
              String s1= yy+"-"+mm+"-"+dd;
              //System.out.println(s1);

              //20岁生日 字符串日期
              //先把yy转换为int类型
              Integer year=Integer.parseInt(yy);
              int yy2=year + 20;
              String s2=yy2 +"-"+mm+"-"+dd;
              //System.out.println(s2);

            //把日期字符串转换成日期
              SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
              Date bir=sdf.parse(s1);  //出生日期
              Date Twenty=sdf.parse(s2);  //20岁生日的日期

              //把日期格式化
              String bir2=sdf.format(bir);
              System.out.println("出生日期:" + bir2);
              String Twenty2=sdf.format(Twenty);
              System.out.println("20岁生日是："+Twenty2);

              Date date=new Date();
              //创建calendar对象
              Calendar c=Calendar.getInstance();
              c.setTime(Twenty);
              //获取20岁生日那周是星期的第几天  设置当周星期三的时间
              c.set(Calendar.DAY_OF_WEEK,4);
              //当周星期三的时间格式化一下
             String wednesday=sdf.format(c.getTime());
              System.out.println("当周的周三为：" + wednesday);
              
          }else{
              System.out.println("格式不正确！请重新输入！");
          }
    }
}
