import java.util.Scanner;
public class factorial {
    public static int fact(int n){
        int f=1;
        if(n < 0) return 0;
        else if(n == 0 || n ==1){
            return 1;
        }
        else{
            for(int i=2; i<=n; i++){
                f = f*i;
            }
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial: "+fact(n));
        sc.close();
    }
}
