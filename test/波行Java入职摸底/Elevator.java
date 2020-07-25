import java.util.Scanner;
/*
描述
有一部电梯。 请求列表由N个正整数组成。 每个数字按顺序表示他要去的楼层。 将电梯上移一层需要6秒钟，下移一层则需要4秒钟。 电梯停在某个楼层上下客停留5秒钟。
对于给定的请求列表，请你计算完成列表上的请求所花费的总时间。 电梯在开始时位于0楼，并且最后不必返回初始位置。

输入
有多个测试用例。 每个案例包含一个正整数N，接着N个正整数。 输入中的所有数字均小于100。N = 0时测试用例输入结束。 该测试用例不做处理。

输出
将每个测试用例的总时间在一行中输出。
 */
public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(n == 0) break;
            int time = 0;
            int last = 0;
            for(int i = 0; i < n; i++){
                int temp = sc.nextInt();
                if(temp >= last){
                    time += (temp - last) * 6 + 5;
                }else{
                    time += (last - temp) * 4 + 5;
                }
                last = temp;
            }
            System.out.println(time);
        }
    }
}
