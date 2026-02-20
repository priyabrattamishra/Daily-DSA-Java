import java.util.*;
public class floor_ceiling {
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
    public static String Binary_Search (int [] arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        
        int floor = -1;
        int ceiling = -1;
        while (start <= end) {
            mid = start + (end - start ) / 2;
            if (arr [mid] < target) {
               start = mid + 1 ;
               floor = arr[mid];
            } 
            else if (arr [mid] > target){
                end = mid - 1;
                ceiling = arr [mid];
            }
            else { 
            floor = arr [mid];
            ceiling = arr [mid];
                break;
        }}
        
        
            return ("floor: " + floor + " ceiling: " + ceiling);
        
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
  System.out.println("enter the size of the array"); 
  int n = sc.nextInt();
  int [] nums = new int [n]; 
 input(nums); 
 System.out.println("Enter the target");
 int target = sc.nextInt();
 String result = Binary_Search(nums , target);
 System.out.println("Output: " + result);
}
}
