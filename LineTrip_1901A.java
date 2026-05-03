import java.util.*;
public  class LineTrip_1901A{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while(t > 0){
            t--;
            int n = scn.nextInt();
            int x = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = scn.nextInt();
            }
            int max = arr[0];
            for(int i = 0; i < n - 1; i++){
                max = Math.max(max, arr[i + 1] - arr[i]);
            }
            max = Math.max(max, 2 * (x - arr[n - 1]));
            System.out.println(max);
        }
        scn.close();
    }
}