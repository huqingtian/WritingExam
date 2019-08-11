import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WaterPool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short num = sc.nextShort();
        List list = new ArrayList();
        for(short i = 0;i < num;i++){
            int temp = 0;
            int m = sc.nextInt();
            int t = sc.nextInt();
            int m1 = sc.nextInt();
            int t1 = sc.nextInt();
            int t11 = t1;
            int m2 = sc.nextInt();
            int t2 = sc.nextInt();
            int t22 = t2;
            boolean b1 = true;
            boolean b2 = true;
            while(t>=1){
                if(b1&&b2){
                    temp += m1 - m2;
                }else if(b1==true&&b2==false){
                    temp += m1;
                }else if(b1==false&&b2==true){
                    temp -= m2;
                }
                if(temp < 0)  temp = 0;
                if(temp > m)  temp = m;
                t--;
                t11--;
                t22--;
                if(t11 == 0){
                    b1 = !b1;
                    t11 = t1;
                }
                if(t22 == 0){
                    b2 = !b2;
                    t22 = t2;
                }
            }
            list.add(temp);
        }
        for (Object n : list) {
            System.out.println(n.toString());
        }
    }
}
