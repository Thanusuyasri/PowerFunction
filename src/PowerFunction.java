import java.util.Scanner;

public class PowerFunction {
    public static int powerfun(int a,int n,int m)
    {
        if(n==0)
        {
            return 1;
        }
        int p=powerfun(a,n/2,m);
        if(n%2==0)
        {
            return  (p*p)%m;
        }
        else {
            return (p*p*a)%m;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(powerfun(a,b,c));
    }
}
