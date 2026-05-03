import java.util.*;
class HalloumiBoxes_1903A{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while(t > 0){
            t--;
            int n = scn.nextInt();
            int k = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = scn.nextInt();
            }
            if(k > 1){
                System.out.println("YES");
            }else{
                boolean flag = false;
                for(int i = 0; i < n - 1; i++){
                    if(arr[i] > arr[i + 1]){
                        flag = true;
                        break;
                    }
                }
                System.out.println(flag ? "NO" : "YES");
            }
        }
    }
}