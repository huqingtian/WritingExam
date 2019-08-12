import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *     有一个游泳池，有一根进水管和一根排水管，进水管每分钟进水m1,排水管每分钟排水m2，进水管每t1分钟进行关闭开启切换，排水管每t2分钟进行关闭开启切换，初始都为打开状态。
 *  水池最大容积为m，初始为空，池塘中的水大于m则不会继续上涨，排干则不会继续下降，持续时间为t。
 *
 *  input：先输入一个N，代表有N个测试用例，然后依次输入m、t、m1、t1、m2、t2
 *  output：输出最后的水量
 *
 *  example：
 *      input：
 *      1
 *      20 16 3 4 2 3
 *      output:
 *      6
 */
public class PoolDrainage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short num = sc.nextShort();         //测试用例个数
        List list = new ArrayList();        //用于记录最后的水量
        for(short i = 0;i < num;i++){
            int temp = 0;                  //目前水量
            int m = sc.nextInt();          //最大容积
            int t = sc.nextInt();          //执行时间
            int m1 = sc.nextInt();         //进水管每分钟进水量
            int t1 = sc.nextInt();         //进水管切换时间
            int t11 = t1;                  //进水管当前状态剩余时间
            int m2 = sc.nextInt();         //排水管每分钟进水量
            int t2 = sc.nextInt();         //排水管切换时间
            int t22 = t2;                  //排水管当前状态剩余时间
            boolean b1 = true;             //进水管是否打开
            boolean b2 = true;             //排水管是否打开
            while(t>=1){
                if(b1&&b2){                //进水管和排水管同时打开
                    temp += m1 - m2;
                }else if(b1==true&&b2==false){      //进水管打开，排水管关闭
                    temp += m1;
                }else if(b1==false&&b2==true){      //进水管关闭，排水管打开
                    temp -= m2;
                }
                if(temp < 0)  temp = 0;         //目前水量最小为0
                if(temp > m)  temp = m;         //目前水量最大为池子容积
                t--;                            //每轮循环代表消耗一分钟
                t11--;
                t22--;
                if(t11 == 0){                    //当前进水管状态剩余时间为0时，切换状态，并且更新状态剩余时间
                    b1 = !b1;
                    t11 = t1;
                }
                if(t22 == 0){                    //当前排水管状态剩余时间为0时，切换状态，并且更新状态剩余时间
                    b2 = !b2;
                    t22 = t2;
                }
            }
            list.add(temp);                      //将最后的水量添加到list中，之后统一输出
        }
        for (Object n : list) {
            System.out.println(n.toString());
        }
    }
}
