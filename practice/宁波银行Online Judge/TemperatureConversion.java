import java.util.Scanner;
/*
Description
	写一个将华氏温度转换成摄氏温度的程序，转换的公式是：
	°F = (9/5)*°C + 32
	其中C表示摄氏温度，F表示华氏温度。
	程序的输入是一个整数，表示华氏温度。输出对应的摄氏温度，也是一个整数。
	提示，为了把计算结果的浮点数转换成整数，需要使用下面的表达式：
	(int)x;
	其中x是要转换的那个浮点数。

Input
	一个整数。

Output
	一个整数。
 */
public class TemperatureConversion {
    public static void main(String[] args) {
        int input, output;
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        output = (input - 32) * 5 / 9;
        System.out.println(output);
    }
}