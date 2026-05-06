import java.util.Scanner;

public class Jagged_Swaps_1896A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while(t > 0){
            t--;
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = scn.nextInt();
            }
            boolean flag = false;
            if(arr[0] == 1){
                flag = true;
            }
            // for(int i = 1; i < n - 1; i++){
            //     if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
            //         break;
            //     }
            // }
            System.out.println(flag ? "YES" : "NO");
        }
        scn.close();  
    }
}
