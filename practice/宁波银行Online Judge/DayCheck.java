import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
Description
给定一个日期，输出这个日期是该年的第几天。

Input
	数据格式为YYYY/MM/DD组成，具体参见sample input ,另外，可以向你确保所有的输入数据是合法的。

Output
	输出一行，表示该日期是该年的第几天。
*/
public class DayCheck {
    public static void main(String[]args) throws ParseException {
        Scanner in=new Scanner(System.in);
        String stringDate = in.nextLine();
        int num = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0,31);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy/MM/dd");
        Date date = ft.parse(stringDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            list.add(1,29);
        }else{
            list.add(1,28);
        }
        list.add(2,31);
        list.add(3,30);
        list.add(4,31);
        list.add(5,30);
        list.add(6,31);
        list.add(7,31);
        list.add(8,30);
        list.add(9,31);
        list.add(10,30);
        list.add(11,31);
        for(int i = 0; i < month - 1; i++){
            num += list.get(i);
        }
        num += calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(num);
        in.close();
    }
}
