package Test;

public class FibonacciRec {
    static int count=2;
    public static void Fib(int a, int b){
        while(count<20){
            int temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
            count++;
            Fib(a,b);
        }
    }
    public static void main(String[] args) {
        System.out.print(0+" ");
        System.out.print(1+" ");
        Fib(0,1);
    }
}
