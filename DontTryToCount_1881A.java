import java.util.*;
public class DontTryToCount_1881A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t > 0){
            t--;
            int n = scn.nextInt();
            int m = scn.nextInt();
            String x = scn.next();
            String s = scn.next();
            
            int count = 0;
            while(x.length() < s.length()){
                x += x;
                count++;
            }
            if(x.contains(s)){
                System.out.println(count);
            }else{
                x += x;
                count++;
                if(x.contains(s)){
                    System.out.println(count);
                }else{
                    System.out.println("-1");
                }
            }
        }
        scn.close(); 
    }
    
}
