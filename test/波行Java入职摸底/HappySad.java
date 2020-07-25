import java.util.Scanner;
/*
描述
工作日使人快乐！休息日让人沮丧！当告诉你今天是周几，你需要表现出对应的心情。周一至周五是happy，周六至周七是sad。

输入
有多组样例.
对于每组样例，在一行中输入一个n，代表今天是周几.
当n=0时输入结束.

输出
对于每一个n，在一行中输出一个字符串 "happy!" or "sad!".
 */
public class HappySad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int x = sc.nextInt();
            if(x == 0) {
                return;
            }
            if(x >= 1 && x <= 5) {
                System.out.println("happy!");
            }
            if(x == 6 || x == 7) {
                System.out.println("sad!");
            }
            if(x > 7) break;
        }
    }
}
