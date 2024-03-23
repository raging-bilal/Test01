package Test;
public class MaxElementArr {
    public static void main(String[] args) {
        int arr[]={23,56,42,543};
        int maxVal=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
                
            }
        }
        System.out.println("The largest element in the Array: "+maxVal);
    }  
}
