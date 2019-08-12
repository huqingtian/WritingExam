import java.util.Scanner;

/**
 * 输入一个加密过后的二进制字符串，通过解密输出原来的二进制字符串
 * 加密方式为，一个长度为N的字符串进行K级加密（如下图所示），加密过程为进行异或运算
 * 假设，原字符串为1001，进行3级加密
 * 则，加密过程为  1001
 *                1001
 *                 1001
 *        解密后：111111
 *
 * input：先输入原先字符串长度N，再输入进行K级加密
 *    然后在下一行输入加密后的字符串
 * output：输出原来的字符串
 *
 * example：
 *     input:
 *      7 4
 *      1110100110
 *     output：
 *      1001010
 */
public class Decipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                //原先字符串的长度
        int k = sc.nextInt();                //加密的级数
        String a = sc.nextLine();            //去除第一行的回车
        String num = sc.nextLine();           //加密后的字符串
        if(k == 1){
            System.out.println(num);           //如果K=1，直接输出字符串
        }else{                                  //否则，开始进行解密
            boolean[] arr = new boolean[n];          //定义数组，用于存放解密后的数组
            if(num.charAt(0) == '1')  arr[0] = true;    //数组第一位与加密后的第一位相同
            else  arr[0] = false;
            boolean temp = arr[0];        //用于记录之前异或运算的结果
            for (int i = 1; i < n; i++) {
                if(i < k){                    //若果i < k,说明运算个数递增的阶段
                    if (num.charAt(i) == '0') {         //这时，若该位置加密后为'0'，说明未加密前和之前异或运算的结果相同
                        arr[i] = temp;
                        temp = count(num.charAt(i) == '1',temp);           //更新temp的状态
                    } else {
                        arr[i] = !temp;        //若该位置上为'1'，则说明和temp状态相反
                    }
                }else{            //当i > k时，此时未加密前的值应该等于 加密后的值与该位置前面k-1个数依次异或运算的结果
                    temp = count(arr[i-k+1],arr[i-k+2]);
                    for(int j = k - 3; j > 0; j--){
                        temp = count(temp,arr[i-j]);
                    }
                    arr[i] = count(num.charAt(i) == '1',temp);
                }
            }
            for (int i = 0; i < n; i++){              //输出结果
                if(arr[i]) System.out.print("1");
                else System.out.print("0");
            }
        }
    }
    public static boolean count(boolean a,boolean b){     //模拟异或运算
        if(a == b) return false;
        else return true;
    }
}
