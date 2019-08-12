import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 输入一个全是大写字母的字符串，最多可以把两个非'N'字符变成'N'，求其中全是'N'组成的字符串的最大长度
 *
 * input: 先输入一个N，代表有几个字符串，然后再输入N行字符串
 * output：分别输出每个字符串中'N'串的最大长度
 *
 * example：
 *      input：
 *          3
 *          NNGN
 *          NGNNGN
 *          NGGNNGNNNG
*       output：
 *          4
 *          6
 *          7
 */
public class CountN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short num = sc.nextShort();                //用于记录有几个字符串
        String a = sc.nextLine();                 //用于去除回车
        List list = new ArrayList();                //用于储存N串最大长度，以便统一输出
        for(short i = 0; i < num; i++){
            String string = sc.nextLine();            //读取字符串
            list.add(count(string));                //把计算好的结果存入list
        }
        for (Object n : list) {                  //遍历list，输出结果
            System.out.println(n.toString());
        }
    }

    /**
     * function：根据字符串返回N串最大长度
     *
     * @param string  输入的字符串
     * @return  N串的最大长度
     *
     * algorithm：从左往右遍历字符串（当目前指针下标大于最大下标时退出循环），每次循环 nmax++，当遇到第一个非'N'字符时，用position1记录，循环继续。
     *      遇到第二个非'N'字符时，用position2记录，循环继续。当遇到第三个非'N'字符时，把处理的字符串段落右移，更新相应数据，循环继续。
     *      @字符串右移：把当前字符串段落切换为从position1下一位开始的字符串段落
     */
    public static int count(String string){
        int max = 0;                            //N串总最大长度
        int nmax = 0;                           //N串目前的最大长度
        int position1 = 0;                      //第一个非'N'字符的下标
        int position2 = 0;                      //第二个非'N'字符的下标
        int index = 0;                           //目前指针的下标
        int count = 0;                          //非'N'字符的个数
        int indexMax = string.length() - 1;           //字符串的最大下标
        while(true){
            if(string.charAt(index) == 'N'){        //当目前指针位置是'N'时，nmax++，循环继续
                nmax++;
            }else{
                if(count < 2){                         //遇到非'N'字符时，若count<2，说明还可以把非'N'字符变成'N'，用position1或者position2记录位置
                    if(count == 0)  position1 = index;
                    else  position2 = index;
                    nmax++;                          //nmax和count自增，循环继续
                    count++;
                }else{                             //当遇到非'N'字符，且count>=2时，说明已经不能把非'N'字符变成'N'，更新当前数据，进入下一个字符串段落的循环
                    if(nmax > max)  max = nmax;          //若本段字符串的N串长度大于max，则用本段的长度更新max
                    count = 2;                           //字符串段落右移，更新count的数据
                    nmax = index - position1;           //字符串右移后，目前字符串的长度为index - position1
                    position1 = position2;              //把position1切换到position2位置
                    position2 = index;                   //把position2切换到目前指针下标位置
                }
            }
            index++;                                   //指针右移一位
            if(index <= indexMax)  continue;                     //若当前下标小于下标最大值，循环继续
            else{                                                 //否则，更新完max数据后，跳出循环
                if(nmax > max)  max = nmax;
                break;
            }
        }
        return max;                             //返回字符串中最大的N串长度
    }
}
