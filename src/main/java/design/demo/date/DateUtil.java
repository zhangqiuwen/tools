package design.demo.date;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zhangqiuwen
 * @create 2018-06-29 10:51
 **/
public class DateUtil {

    // 时间格式化
    public static final String PATTERNYYYYMMDD = "yyyyMMdd";
    public static final String PATTERN_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    public  static String  convertDate(String pattern)
    {
        Date nowTime=new Date();
        SimpleDateFormat time=new SimpleDateFormat(pattern);
        return time.format(nowTime);
    }

    /**
     * 将长时间格式字符串转换为时间 yyyy-MM-dd
     *
     * @param strDate
     * @return
     */
    public static Date strToDate(String strDate,String pattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    /**
     * 获取今天是今年中的第几天
     *
     * @return
     * @author
     */
    public static int getTodayOfYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DAY_OF_YEAR);
    }


    public static String getLastDayOfMonth(int year,int month){
        Calendar cal = Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR,year);
        //设置月份
        cal.set(Calendar.MONTH, month-1);
        //获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String lastDayOfMonth = sdf.format(cal.getTime());
        return lastDayOfMonth;
    }
    public static String getFirstDayOfMonth(int year,int month){
        Calendar cal = Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR,year);
        //设置月份
        cal.set(Calendar.MONTH, month-1);
        //获取某月最小天数
        int firstDay = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最小天数
        cal.set(Calendar.DAY_OF_MONTH, firstDay);
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String firstDayOfMonth = sdf.format(cal.getTime());
        return firstDayOfMonth;
    }

    public static int getYear(String date){
        SimpleDateFormat  format1 = new SimpleDateFormat("yyyy-MM");
        try {
            Date dd = format1.parse(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dd);
            return calendar.get(Calendar.YEAR);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static   int getMonth(String date){
        SimpleDateFormat  format1 = new SimpleDateFormat("yyyy-MM");
        try {
            Date dd = format1.parse(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dd);
            return calendar.get(Calendar.MONTH)+1;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        String time =  convertDate(PATTERNYYYYMMDD);
        System.out.println(time);
        Date date =  strToDate("2018-06-04",PATTERNYYYYMMDD);
        System.out.println(date);
    }
}