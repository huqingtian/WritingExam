import java.util.Scanner;
/*
Description
    对数字求特征值是常用的编码算法，奇偶特征是一种简单的特征值。对于一个整数，从个位开始对每一位数字编号，个位是1号，十位是2号，以此类推。
    这个整数在第n位上的数字记作x，如果x和n的奇偶性相同，则记下一个1，否则记下一个0。按照整数的顺序把对应位的表示奇偶性的0和1都记录下来，就形成了一个二进制数字。
    比如，对于342315，这个二进制数字就是001101。按照二进制位值将1的位的位值加起来就得到了结果13。
    你的程序要读入一个非负整数，整数的范围是[0,100000]，然后按照上述算法计算出表示奇偶性的那个二进制数字，输出它对应的十进制值。
    提示：将整数从右向左分解，数位每次加1，而二进制值每次乘2。

Input
    一个非负整数，整数的范围是[0,1000000]。

Output
    一个整数，表示计算结果。
 */
public class DigitalEigenvalue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int shu;
        int wei=0;
        int sum=0;
        while (num > 0) {
            shu = num % 10;
            wei = wei + 1;
            if((shu + wei) % 2 == 0){
                sum += Math.pow(2, wei - 1);
            }
            num = num / 10;
        }
        System.out.println(sum);
    }
}
