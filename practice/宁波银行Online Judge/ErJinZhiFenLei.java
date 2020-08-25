/*
描述
    若将一个正整数化为二进制数，在此二进制数中，我们将数字1的个数多于数字0的个数的这类二进制数称为A类数，否则就称其为B类数。
    例如：
    （13）10=（1101）2
    其中1的个数为3，0的个数为1，则称此数为A类数；
    （10）10=（1010）2
    其中1的个数为2，0的个数也为2，称此数为B类数；
    （24）10=（11000）2
    其中1的个数为2，0的个数为3，则称此数为B类数；
    程序要求：
    求出1～1000之中（包括1与1000），全部A、B两类数的个数。

输入
    无

输出
    在一行中输出两个整数A和B，A表示A类数的个数，B表示B类数的个数，AB之间由一个空格分隔，除此之外不要再输出其他多余的东西。
 */
public class ErJinZhiFenLei {
    public static void main(String[] args) {
        int num_a = 0, num_b = 0;
        for(int i = 1; i <= 1000; i++){
            if(isAClass(i) == true) num_a++;
            else num_b++;
        }
        System.out.println(num_a + " " + num_b);
    }
    public static boolean isAClass(int n){
        int num_0 = 0, num_1 = 0;
        while(n >= 1){
            if(n % 2 == 0) num_0++;
            else num_1++;
            n /= 2;
        }
        if(num_0 >= num_1) return false;
        else return true;
    }
}
