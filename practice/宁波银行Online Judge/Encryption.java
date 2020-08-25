import java.util.Scanner;
/*
描述
    输入1个四位数，将其加密后输出。
    方法是将该数每一位上的数字加9，然后除以10取余，作为该位上的新数字，
    最后将第1位和第3位上的数字互换，第2位和第4位上的数字互换，组成加密后的新数。

输入
    加密前的原四位数

输出
    加密后的四位数
 */
public class Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String old_n = String.valueOf(n);
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++){
            int temp = Integer.parseInt(old_n.substring(i, i + 1));
            temp = (temp + 9) % 10;
            arr[i] = temp;
        }
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;
        old_n = "" + arr[0] + arr[1] + arr[2] + arr[3];
        System.out.println(old_n);
    }
}
