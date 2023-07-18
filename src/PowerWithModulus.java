import java.util.Scanner;

public class PowerWithModulus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int power=sc.nextInt();
        int mod=sc.nextInt();
        sc.close();
        int result=1;
        for (int i=0;i<power;i++){
            result=(result*base)%mod;
        }
        System.out.println(result%mod);
    }
}