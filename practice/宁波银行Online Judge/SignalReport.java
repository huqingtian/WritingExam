import java.util.Scanner;
/*
Description
    无线电台的RS制信号报告是由三两个部分组成的：
    R(Readability) 信号可辨度即清晰度.
    S(Strength)    信号强度即大小.
    其中R位于报告第一位，共分5级，用1—5数字表示.
    1---Unreadable
    2---Barely readable, occasional words distinguishable
    3---Readable with considerable difficulty
    4---Readable with practically no difficulty
    5---Perfectly readable
    报告第二位是S，共分九个级别，用1—9中的一位数字表示
    1---Faint signals, barely perceptible
    2---Very weak signals
    3---Weak signals
    4---Fair signals
    5---Fairly good signals
    6---Good signals
    7---Moderately strong signals
    8---Strong signals
    9---Extremely strong signals
    现在，你的程序要读入一个信号报告的数字，然后输出对应的含义。如读到59，则输出：
    Extremely strong signals, perfectly readable.

Input
    一个整数，信号报告。整数的十位部分表示可辨度，个位部分表示强度。输入的整数范围是[11,59]内有效的数字，这个范围外的数字不可能出现在测试数据中。

Output
    一句话，表示这个信号报告的意义。按照题目中的文字，先输出表示强度的文字，跟上逗号和空格，然后是表示可辨度的文字，跟上句号。
    注意可辨度的句子的第一个字母是小写的。注意这里的标点符号都是英文的。
 */

public class SignalReport {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        int a = input / 10;
        int b = input % 10;
        switch(b)
        {
            case 1:System.out.print("Faint signals, barely perceptiblex");
                break;
            case 2:System.out.print("Very weak signals");
                break;
            case 3:System.out.print("Weak signals");
                break;
            case 4:System.out.print("Fair signals");
                break;
            case 5:System.out.print("Fairly good signals");
                break;
            case 6:System.out.print("Good signals");
                break;
            case 7:System.out.print("Moderately strong signals");
                break;
            case 8:System.out.print("Strong signals");
                break;
            case 9:System.out.print("Extremely strong signals");
                break;
            default:System.out.print("Error");
                break;
        }
        System.out.print(", ");
        switch(a)
        {
            case 1:System.out.print("unreadable.");
                break;
            case 2:System.out.print("barely readable, occasional words distinguishable.");
                break;
            case 3:System.out.print("readable with considerable difficulty.");
                break;
            case 4:System.out.print("readable with practically no difficulty.");
                break;
            case 5:System.out.print("perfectly readable.");
                break;
            default:System.out.print("Error.");
                break;
        }
    }
}
