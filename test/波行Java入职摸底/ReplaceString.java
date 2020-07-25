import java.util.Scanner;
/*
描述
输入一串字符串，生成一个新的字符串，将原字符串中的大写字母用下面列出的对应大写字母替换，其余字符不变，输出新字符串。
原字母 对应字母
A-------------->Z
B-------------->Y
C-------------->X
D-------------->W
......
X-------------->C
Y-------------->B
Z-------------->A

输入
有多个测试用例。 每个测试案例包含一行字符串。当输入字符串为0时，测试结束。

输出
每个测试案例，输出按规则转换后的新字符串。
 */
public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            char ch;
            String str1, str2 = "";
            str1 = sc.nextLine();
            if("0".equals(str1)) break;
            for (int i = 0; i < str1.length(); i++) {
                ch = str1.charAt(i);
                if (65 <= ch && ch <= 90) {
                    ch = (char) (155 - ch);
                }
                str2 += ch;
            }
            System.out.println(str2);
        }
    }
}
