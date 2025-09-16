import java.util.*;
class ArrayRotation{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<size;i++){
            arr[i]=s.nextInt();
        }  
        int leftrotation = s.nextInt();
        for(int i=1;i<=leftrotation;i++){
            int temp = arr[0];
            for(int j =0 ;j<size-1;j++){
                arr[j] =arr[j+1];
            }
            arr[size-1]=temp;
        } 
        System.out.println(Arrays.toString(arr));
    
    }
}