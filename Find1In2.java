import org.omg.Messaging.SyncScopeHelper;

import java.util.*;

public class Find1In2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i < t;i++){
            int count = 0;
            Set set = new TreeSet();
            int n = sc.nextInt();
            for(int j = 0;j < n;j++){
                int temp = count(sc.nextInt());
                if(!set.contains(temp)){
                    count++;
                    set.add(temp);
                }
            }
            System.out.println(count);
        }
    }
    public static int count(int n){
        int count = 0;
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            while(n > 1){
                if(n % 2 ==1) count++;
                n = n / 2;
            }
            if(n==1) count++;
        }
        return count;
    }
}
