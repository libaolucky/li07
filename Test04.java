package com.hp.dateCalenlar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 */
public class Test04 {
    private static SimpleDateFormat sdf;
    private static String a;
    private static int b;

    public static void main(String[] args) throws ParseException {
        //设置格式
         sdf=new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品的日期");
         a=sc.nextLine();
        System.out.println("请输入商品的保质期");
         b=sc.nextInt();
         Cu();
    }
    public static void Cu() throws ParseException {
        //字符串转换为Date日期
        Date date=sdf.parse(a);
        //创建calendar对象
        Calendar c=Calendar.getInstance();
        //设置时间
        c.setTime(date);
        //计算过期日
        c.add(Calendar.DAY_OF_YEAR,b);
        //计算过期日的前两周
        c.add(Calendar.DAY_OF_YEAR,-14);
        //计算过期日前两周的周三
        c.set(Calendar.DAY_OF_WEEK,4);
        //calendar转换成date  获取过期日前两周的周三的时间
        date=c.getTime();
        //将date按照"yyyy-MM-dd"这样的格式化输出
        a=sdf.format(date);
        System.out.println("促销日为：" + a);
    }
}
