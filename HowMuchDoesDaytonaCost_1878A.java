import java.util.Scanner;

public class HowMuchDoesDaytonaCost_1878A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t > 0){
            t--;
            int n = scn.nextInt();
            int k = scn.nextInt();
            boolean flag = false;
            for(int i = 0; i < n; i++){
                int x= scn.nextInt();
                if(x == k){
                    flag = true;
                }
            }
            System.out.println(flag? "YES" : "NO");
            
        }
        scn.close(); 
    }
}
