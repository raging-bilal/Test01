package Test;

public class FibanacciFor {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i=0;i<18;i++){
            int temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }
    }
}
