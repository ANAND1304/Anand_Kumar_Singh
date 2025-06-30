import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();

        for(int  i =0; i<=n; i++){
            if(i%2!=0){
                System.out.print(2*i-1);
                if(i+2<=n){
                    System.out.print(",");
                }
            }
        }
        sc.close();

    }
}
