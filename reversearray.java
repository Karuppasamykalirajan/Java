import java.util.Arrays;
public class reversearray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,9,2,32};
        int left=0,right=arr.length-1;
    while(left<right){
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] =temp; left++;right--;
    
    }
    System.out.println(Arrays.toString(arr));
}
}
