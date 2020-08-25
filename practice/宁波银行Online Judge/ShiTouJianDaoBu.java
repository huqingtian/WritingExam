import java.util.Scanner;
/*
描述
    两个小伙伴玩石头剪刀布的游戏。你是裁判，你知道回合数和每个回合双方的选择，请你告诉他们谁才是胜利者。

输入
    在一行中输入一个正整数T，代表一共T组样例。
    接着，每组样例在一行中输入一个正整数n，代表一共n回合的对局。
    接下来在n行中每一行输入两个字母c1、c2，以空格分隔
    c1 代表玩家1的选择，c2代表玩家2的选择
    共有3种选择可选，石头(R)，剪刀(S)，布(P)
    1<=T<=10 1<=n<=100

输出
    对于每个样例，你需要在一行中输出比赛结果。
    玩家1获胜 输出Player 1
    玩家2获胜 输出 Player 2
    平局 输出 TIE
 */
public class ShiTouJianDaoBu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            int num_a = 0, num_b = 0;
            for (int j = 0; j < n; j++) {
                String str = sc.nextLine();
                char a = str.charAt(0);
                char b = str.charAt(2);
                if(a != b){
                    switch (a){
                        case 'R':
                            if (b == 'S') num_a++;
                            else num_b++;
                            break;
                        case 'S':
                            if(b == 'R') num_b++;
                            else num_a++;
                            break;
                        case 'P':
                            if(b == 'R') num_a++;
                            else num_b++;
                            break;
                        default:
                            break;
                    }
                }
            }
            if(num_a > num_b){
                System.out.println("Player 1");
            }else if(num_a == num_b){
                System.out.println("TIE");
            }else{
                System.out.println("Player 2");
            }
        }
    }
}
