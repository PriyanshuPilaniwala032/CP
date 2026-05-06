import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Doremys_Paint_3_1890 {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while(t > 0){
            t--;
            int n = scn.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++){
                arr[i] = scn.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            boolean flag = false;
            if(map.size() == 1){
                flag = true;
            }else if(map.size() == 2){
                List<Integer> freq = new ArrayList<>(map.values());
                int f1 = freq.get(0);
                int f2 = freq.get(1);
                if(n % 2 == 0){
                    if(f1 == f2){
                        flag = true;
                    }
                }else{
                    if(f1 == n / 2 || f2 == n / 2){
                        flag = true;
                    }
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
        scn.close(); 
    }
}
