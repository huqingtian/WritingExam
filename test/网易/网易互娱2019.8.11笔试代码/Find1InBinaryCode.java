import java.util.*;

/**
 * 对输入的数据进行类型统计，根据在二进制下'1'的个数进行分类，输出类型的个数
 *
 *input: 先输入一个T，代表有T个测试用例，再输入N，代表该测试用例中，有多少个数据
 *output：分别输出每个测试用例中的类型的个数
 *
 * example：
 *      input：
 *          2
 *          5
 *          12 5 3 6 9
 *          3
 *          4 9 6
 *      output：
 *          1
 *          2
 */
public class Find1InBinaryCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();                   //测试用例的个数
        for (int i = 0; i < t; i++) {
            int count = 0;                  //类型的个数，初始为0
            Set set = new TreeSet();        //用于存放各个类型(类型用'1'的个数命名)
            int n = sc.nextInt();           //该测试用例中数据的个数
            for (int j = 0; j < n; j++) {
                int temp = count(sc.nextInt());      //读入数据，并计算二进制下'1'的个数
                if (!set.contains(temp)) {            //如果set集合中没有该类型，则count++，并把该类型放入set中
                    count++;
                    set.add(temp);
                }
            }
            System.out.println(count);             //输出类型的个数
        }
    }

    /**
     * 用于统计相应整数在二进制下'1'的个数
     * @param n  目标整数
     * @return   该整数在二进制下'1'的个数
     */
    public static int count(int n) {
        int count = 0;       //'1'的个数，初始为0
        if (n <= 1) {      //如果n小于等于1，直接返回n
            return n;
        } else {           //否则，对n进行二进制转换处理
            while (n > 1) {      //当n大于1时，每次 n % 2 的结果若为 1 ，则 count++；
                if (n % 2 == 1) count++;
                n = n / 2;      //每次循环 n / 2,舍弃余数
            }
            if (n == 1) count++;  //最后 n 若为 1，则count再自增一次
        }
        return count;      //返回count
    }
}
