import java.util.*;

public class Count_Occurrences_in_a_Sorted_Array {
    public static void input (int [] arr){
        Scanner sc = new Scanner (System.in);
    for (int row = 0; row < arr.length ; row++){
        arr [row] = sc.nextInt();
    }
    System.out.println("Original array");
    System.out.println(Arrays.toString(arr));
    }
    public static void swap (int [] arr , int num1 , int num2) { 
        int temp = arr [num1];
        arr [num1] = arr [num2];
        arr [num2] = temp;
    }
    public static int Binary_Search (int [] arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int right_occurence = 0;
        int left_occurence = 0;
        int mid_occurence = 0;
        while ((start <= end)) {
            mid = start + (end - start ) / 2;
            if (arr [mid] < target) {
               start = mid + 1 ;
            } 
            else if (arr [mid] > target){
                end = mid - 1;
            }
            else { mid_occurence = 1;
                for (int row = mid-1; row >= 0 ; row--){
                    if (arr [row] == target) {
                        left_occurence++;
                    }
                    else {
                        break;
                    }
                }
                for (int row = mid+1; row < arr.length; row++) {
                    if (arr [row] == target) {
                        right_occurence++;
                    }
                    else {
                        break;
                    }
                }
            break;
        }}
        return (right_occurence + left_occurence + mid_occurence);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
  System.out.println("enter the size of the array"); 
  int n = sc.nextInt();
  int [] nums = new int [n]; 
 input(nums); 
 System.out.println("Enter the target");
 int target = sc.nextInt();
 int result = Binary_Search(nums , target);
 System.out.println("Output: " + result);

}
}
