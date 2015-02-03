package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import static java.util.Collections.list;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.YearMonth;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Novikov Dmitry
 */
public class Test {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormat.forPattern("yyyy-MM-dd");
    private static final DateTimeFormatter DATE_FORMAT1 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private static final DateTimeFormatter DATE_FORMATYYYY = DateTimeFormat.forPattern("yyyy");
    private static final DateTimeFormatter DATE_FORMAT2 = DateTimeFormat.forPattern("yyMM");

    public static void main(String[] args) throws ParseException, IOException {
        boolean flag;
        String string = "2014-07-16 09:15:54.891";
        System.out.println("String = " + string);
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(string);
        System.out.println("date = " + date);

        DateTime old = DateTime.parse(string, DATE_FORMAT1);
        System.out.println("old.year() = " + old);
        //DateTime dateTime2 = DateTime.parse(ca,DATE_FORMAT1);
        System.out.println("!!!old =" + old);
        //System.out.println("DATE_FORMATYYYY.print(datetime) " + DATE_FORMATYYYY.print(dateTime));
        //System.out.println("Calendar.getInstance(); " + Calendar.getInstance().get(Calendar.YEAR));
        //System.out.println("!!!dateTime = " + DATE_FORMAT.print(dateTime));

        //Calendar cal = Calendar.getInstance();
        //Date date2 = Calendar.get
        //Date date2 = new Date();
//        cal.setTime(date);
//        System.out.println("cal = " + cal);
//        Period p = new Period(startDate, endDate);
//        Date calendar = Calendar.getInstance().getTime();
        // Calendar calendar = new GregorianCalendar();
//        int years = calendar.get(Calendar.YEAR);
//         int month = (calendar.get(Calendar.MONTH))+1;
//         int day = calendar.get(Calendar.DATE);
        //System.out.println("Calendar = " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(calendar.getTime()));
//            Date startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(bsszStartDateInString);
//            System.out.println("dateDate = " + startDate);
        DateTime da = DateTime.now();
        System.out.println("da.year() = " + da.getMillis());
        System.out.println("differnt = " + (da.getMillis() - old.getMillis()));
        System.out.println("!!!da =" + da);

        Period differnt = new Period(old, da);
        System.out.println("По модулю = " + Math.abs(differnt.getHours()));
        if (differnt.getYears() == 0
                && differnt.getMonths() == 0
                && differnt.getDays() == 0
                && differnt.getHours() == 0
                && differnt.getMinutes() < 60) {
            System.out.println("ОК!");
            System.out.println("Разница в годах=" + differnt.getYears()
                    + "; разница в месяцах=" + differnt.getMonths()
                    + "; разница в днях=" + differnt.getDays()
                    + "; разница в часах=" + differnt.getHours()
                    + "; разница в минутах=" + differnt.getMinutes());
            flag = true;
        } else {
            System.out.println("Not OK!");
            System.out.println("Разница в годах=" + differnt.getYears()
                    + "; разница в месяцах=" + differnt.getMonths()
                    + "; разница в днях=" + differnt.getDays()
                    + "; разница в часах=" + differnt.getHours()
                    + "; разница в минутах=" + differnt.getMinutes());
            flag = false;
        }
        String hello = "2014";
        System.out.println(hello.substring(2, 4));

        Calendar calendar = Calendar.getInstance();
        String dateNow = "" + calendar.get(Calendar.YEAR);
        System.out.println("dateNow = " + dateNow.substring(2));
        System.out.println("dateNow = " + dateNow.substring(2, 4));
        System.out.println("dateNow! = " + dateNow);

        Integer pDocYear = 2012;
        Integer pDocId = 6712945;
        System.out.println("LDAP_Login =" + pDocYear.toString().substring(2) + pDocId.toString().trim());

        String dateBegin = "01.04.2014";
        dateBegin = dateBegin.substring(6, 10) + "-" + dateBegin.substring(3, 5) + "-" + dateBegin.substring(0, 2);
        System.out.println("dateBegin=" + dateBegin);

        DateTime vidDate = DateTime.now();
        String dateVid = DateTime.now().toString();
        String dateDeleted = dateVid.substring(0, 10) + " " + dateVid.substring(11, 22);
        System.out.println("vidDate=" + vidDate);
        System.out.println("dateVid=" + dateVid.substring(0, 10) + " " + dateVid.substring(11, 22));
        DateTime newVidDate = DateTime.parse(dateDeleted, DATE_FORMAT1);
        System.out.println("newVidDate=" + newVidDate);
        // Последний день месяца
        String flzpYymm = "1408";
        DateTime date2 = DateTime.parse(flzpYymm, DATE_FORMAT2);
        System.out.println("!!!!!!!!!!!!!date2=" + date2);
        DateTime dateMinus1Month = date2.minusMonths(1);
        System.out.println("!!!!!!!!!!!!!dateMinus1Month=" + dateMinus1Month);
        System.out.println("!!!!!!!!!!!!!dateMinus1Month in yymm=" + DATE_FORMAT2.print(dateMinus1Month));

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.YEAR, date2.getYear());
        System.out.println("date2.getYear()=" + date2.getYear());
        calendar2.set(Calendar.MONTH, date2.getMonthOfYear());
        System.out.println("date2.getMonthOfYear()=" + date2.getMonthOfYear());

        DateTime prom = date2.plusMonths(1).minusDays(1);

        System.out.println("prom=" + prom);
        String oplya = prom.toString();

        String date56 = "" + calendar2.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("date56=" + date56);
        //System.out.println("Последний день месяца=" + DateTime.DaysInMonth(2014, 7) );

//            private static final DateTimeFormatter DATE_FORMAT2 = DateTimeFormat.forPattern("yyMM");
//            private static final DateTimeFormatter DATE_FORMAT1 = DateTimeFormat.forPattern("dd-MM-yyyy");
//
//            DateTime nowDateTime = DateTime.parse("01-12-2013",DATE_FORMAT1);
//            DATE_FORMAT2.print(nowDateTime)
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "2");
        list.add(map);
        list.add(map);
        System.out.println(list);

        Integer a = new Integer(1);
        System.out.println("a=" + a);
        Integer b = new Integer(a);
        System.out.println("a=" + a + ";b=" + b);
        b = 3;
        System.out.println("a=" + a + ";b=" + b);

        String surname = "Novikov";
        String name = "Dmitry";
        String patronymic = "Igorevich";
        System.out.println("FIO " + surname + " " + name.substring(0, 1) + ". " + patronymic.substring(0, 1) + ".");

//            try {
//                throw new Exception("Hi");
//            } catch(Exception e) {
//                System.out.println(e.getMessage());
//            }
        String bsrnPeriod = "13121312";
        String period = "c " + bsrnPeriod.substring(2, 4) + "/20" + bsrnPeriod.substring(0, 2) + " по " + bsrnPeriod.substring(6, 8) + "/20" + bsrnPeriod.substring(4, 6);
        System.out.println("period=" + period);

        StringBuilder sb = new StringBuilder();
        sb.append("c ")
                .append(bsrnPeriod.substring(2, 4))
                .append("/20")
                .append(bsrnPeriod.substring(0, 2))
                .append(" по ")
                .append(bsrnPeriod.substring(6, 8))
                .append("/20")
                .append(bsrnPeriod.substring(4, 6));
        System.out.println("sb="+sb);
        
        int[] x = new int[25];
        System.out.println("x[24]=" + x[24]);
       // System.out.println("x[25]=" + x[25]);
        System.out.println("x[0]=" + x[0]);
        System.out.println("x.length=" + x.length);
        
        YearMonth yearMonth = YearMonth.now();
        System.out.println("yearMonth=" + yearMonth);
        System.out.println("yearMonth max day in month=" + yearMonth.toLocalDate(1).dayOfMonth().withMaximumValue());
        System.out.println("yearMonth min day in month=" + yearMonth.toLocalDate(1).dayOfMonth().withMinimumValue());
        
//        String dir="/home/alexandr";
//            FileWriter fw = new FileWriter(dir+"/1.txt");
//            fw.write("123");
//            fw.close();
//            
//            FileReader reader = new FileReader(dir+"/1.txt");
//            BufferedReader in = new BufferedReader(reader); 
//            String str; 
//            while ((str = in.readLine()) != null) { 
//              System.out.println(str); 
//            } 
//            in.close(); 
            
            int i = 0;
            System.out.println(i--);
            
            Calendar calNow = Calendar.getInstance();
            System.out.println("calNow="+calNow);
    }

}
