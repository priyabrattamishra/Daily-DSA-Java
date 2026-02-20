import java.util.*;
public class Search_insert_position {
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
        boolean target_found = false;
        int solution = 0;
        while (start <= end) {
            mid = start + (end - start ) / 2;
            if (arr [mid] < target) {
               start = mid + 1 ;
            } 
            else if (arr [mid] > target){
                end = mid - 1;
            }
            else { 
            solution = mid;
                target_found = true;;
                break;
        }}
        
        if (target_found) {
            return solution;
        }
        else {
        return start;}}

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
