import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CountN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short num = sc.nextShort();
        String a = sc.nextLine();
        List list = new ArrayList();
        for(short i = 0;i < num;i++){
            String string = sc.nextLine();
            list.add(count(string));
        }
        for (Object n : list) {
            System.out.println(n.toString());
        }
    }
    public static int count(String string){
        int max = 0;
        int nmax = 0;
        int l1 = 0;
        int l2 = 0;
        int temp = 0;
        int count = 0;
        int lmax = string.length()-1;
        while(true){
            if(string.charAt(temp)=='N'){
                nmax++;
            }else{
                if(count < 2){
                    if(count == 0)  l1 = temp;
                    else  l2 =temp;
                    nmax++;
                    count++;

                }else{
                    if(nmax > max)  max = nmax;
                    count = 2;
                    nmax = temp - l1;
                    l1 = l2;
                    l2 = temp;
                }
            }
            temp++;
            if(temp <= lmax)continue;
            else{
                if(nmax > max)  max = nmax;
                break;
            }
        }
        return max;
    }
}
