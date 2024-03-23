package Test;

public class FibonacciTerm {
    public static int Fib(int n){
        
        if(n<=1){
            return n;
        }
        else{
            return Fib(n-1)+Fib(n-2);
            
        }
    }
    public static void main(String[] args) {
        System.out.print(Fib(19)+" ");
    }
    
}
