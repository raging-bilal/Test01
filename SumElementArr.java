package Test;

public class SumElementArr {
    public static void main(String[] args) {
        int arr[]={2,4,3,5,1};
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of the elements of Array: "+sum);
    }
    
}
