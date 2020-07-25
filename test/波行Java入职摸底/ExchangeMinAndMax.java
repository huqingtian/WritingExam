import java.util.Scanner;

/*
描述
输入一个正整数n，再输入n个整数，将最小值与第一个数交换，最大值与最后一个数交换，然后输出交换后的n个数。

输入
有多个测试用例。 每个案例包含一个正整数n，接着n个正整数。 n = 0时测试用例输入结束。 该测试用例不做处理。

输出
将每个测试用例输入的n个整数，将最小值与第一个数交换，最大值与最后一个数交换，然后输出交换后的n个数。
 */

public class ExchangeMinAndMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if(num == 0){
                return;
            }
            int[] a = new int[num];
            for(int i = 0; i < a.length; i++){
                a[i] = sc.nextInt();
            }
            int min = a[0], max = a[a.length-1];
            int loc_min = 0, loc_max = a.length - 1;
            for (int i = 0; i < a.length; i++) {
                if(min > a[i]){
                    min = a[i];
                    loc_min = i;
                }
            }
            int k = a[0];
            a[0] = min;
            a[loc_min] = k;
            for (int i = 0; i < a.length; i++) {
                if(max < a[i]){
                    max =a [i];
                    loc_max = i;
                }
            }
            int j = a[a.length - 1];
            a[a.length - 1] = max;
            a[loc_max] = j;
            for(int i = 0; i < a.length; i++)
                System.out.print(a[i] + " ");
        }
    }
}
