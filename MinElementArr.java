package Test;

import java.util.Scanner;
public class MinElementArr{
    public static void main(String[] args) {        
        System.out.println("Enter the length of the array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        int sum=0;
        // int minVal=arr[0];

        // Input:
        
        System.out.println("Enter the "+n+" elements in the Array: " );

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // Print:
        System.out.println("The output of the array are as follows!");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        // Sum:
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("\nThe sum of the elements of array: "+ sum);
        // Smallest Element
        int minVal=arr[0];
        for(int i=0;i<n;i++){   
            if(arr[i]<minVal){
                minVal=arr[i];
            }
        }
        System.out.println("The smallest element in the Array: "+ minVal);
        sc.close();
    }
}





























// public class MinElementArr {
//     public static void main(String[] args) {
//         int arr[] = { 23, 45, 43, 45667, 432, };
//         int minVal = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < minVal) {
//                 minVal = arr[i]; 
//             }
//         }
//         System.out.println("The smallest value: " + minVal);
//     }
// }
