public class factorial_args {
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
            int n = Integer.parseInt(args[0]);
            System.out.println("Factorial: "+fact(n));
    }
}
