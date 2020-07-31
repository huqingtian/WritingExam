import java.util.LinkedList;
import java.util.Scanner;
/*
描述
逆序数可以用来描述一个序列混乱程度的量，例如，"DAABEC"的逆序数为5，其中D大于它右边的4个数，E大于它右边的1个数，4+1=5；又如，"ZWQM"的逆序数为3+2+1+0=6。
现在有许多长度一样的字符串，每个字符串里面只会出现四种字母（A，T，G，C）。请编写程序，将这些字符串按照它们的逆序数进行排序。

输入
输入由多组测试数据组成。每组测试数据的第一行为两个数n和m，0<n<=50，0<m<=100。n表示每个序列的长度（同一组测试数据中各序列的长度都为n），m表示此组测试数据中的序列个数。接下来有m行，每行为一个长度为n的DNA字母序列。

输出
对于每组测试数据，输出排序后的序列列表。在排序时，逆序数小的序列排在前面。如果两个序列的逆序数相等，那么它们在列表中出现的顺序和它们在输入中的顺序相同。
在每组测试数据后输出一行“********************”（二十个星号）。
 */
public class DNA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int m, n;
            m = sc.nextInt();
            n = sc.nextInt();
            char[][] arr = new char[n][m];
            int[] mis = new int[n];
            LinkedList<Integer> list = new LinkedList<>();
            LinkedList<Integer> list2 = new LinkedList<>();
            for(int i = 0; i < n; i++){
                String str = sc.next();
                for(int j = 0; j < m; j++){
                    arr[i][j] = str.charAt(j);
                }
            }
            for(int i = 0; i < n; i++){
                int num = 0;
                for(int j = 0; j < m; j++){
                    int temp = arr[i][j];
                    for(int l = 1; l < m; l++){
                        if(arr[i][l] < temp) num++;
                    }
                }
                mis[i] = num;
            }
            for(int i = 0; i < n; i++){
                if(list.isEmpty()){
                    list2.add(i);
                    list.add(mis[i]);
                }else{
                    boolean flag = true;
                    for (int a : list) {
                        if(mis[i] < a){
                            list2.add(list.indexOf(a), i);
                            list.add(list.indexOf(a), mis[i]);
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        list2.add(i);
                        list.add(mis[i]);
                    }
                }
            }
            for (int l: list2) {
                for(int i = 0; i < m; i++){
                    System.out.print(arr[l][i]);
                }
                System.out.println();
            }
            System.out.println("********************");
        }
    }
}
