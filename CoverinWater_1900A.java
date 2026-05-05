    import java.util.Scanner;

    public class CoverinWater_1900A {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            int t = scn.nextInt();

            while(t > 0){
                t--;
                int n = scn.nextInt();
                boolean flag = false;
                String s = scn.next();
                int count = 0;
                int ans = 0;
                for(int i = 0; i < n; i++){
                    char ch = s.charAt(i);
                    if(ch == '.'){
                        count++;
                        ans++;
                        if(count >= 3){
                            flag = true;
                        }
                    }else{
                        count = 0;
                    }
                }
                System.out.println(flag ? 2 : ans);
            }
            scn.close();   
        }
    }
