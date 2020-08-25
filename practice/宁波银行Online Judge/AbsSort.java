import java.util.*;
/*
描述
    输入n(n<=100)个整数，按照绝对值从大到小排序后输出。题目保证对于每一个测试实例，所有的数的绝对值都不相等。

输入
    输入数据有多组，每组占一行，每行的第一个数字为n,接着是n个整数，n=0表示输入数据的结束，不做处理。

输出
    对于每个测试实例，输出排序后的结果，两个数之间用一个空格隔开。每个测试实例占一行。
 */
public class AbsSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n == 0) return;
            LinkedList<Integer> list = new LinkedList<>();
            for(int i = 0; i < n; i++){
                int number = sc.nextInt();
                boolean tag = true;
                for(int j = 0; j < list.size(); j++){
                    if(Math.abs(number) > Math.abs(list.get(j))){
                        list.add(j, number);
                        tag = false;
                        break;
                    }
                }
                if(tag) list.addLast(number);
            }
            for(int i = 0; i < list.size() - 1; i++){
                System.out.print(list.get(i) + " ");
            }
            System.out.println(list.getLast());
        }
    }
}
