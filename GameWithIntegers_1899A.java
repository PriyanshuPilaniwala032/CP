import java.util.Scanner;

public class GameWithIntegers_1899A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

            int t = scn.nextInt();

            while(t > 0){
                t--;
                int n = scn.nextInt();
                System.out.println(n % 3 != 0 ? "First" : "Second");
            }
            scn.close();   
    }
}
