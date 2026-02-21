import java.util.*;


public class First_and_last_occurrence {
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
        boolean found_start = false;
        boolean found_end = false;
        int start_pos = -1;
        int end_pos = -1;
        int mid = 0;
        int occurence = 0; // if target element occurs only once , start pos and end pos will be same
        while ((start <= end)) {
            mid = start + (end - start ) / 2;
            if (arr [mid] < target) {
               start = mid + 1 ;
            } 
            else if (arr [mid] > target){
                end = mid - 1;
            }
            else { 
            for (int row = start ; row <= end ; row++) {
                if (target == arr [row] && !found_start) {
                    start_pos = row;
                    found_start = true;
                    occurence++;
                }
                else if (target == arr [row] && found_start) {
                    end_pos = row;
                    found_end = true;
                    occurence++;
                }
                else if (target != arr [row]) {
                    break;
                }
            }
            

        }
    if (found_start && found_end) {
                break;
            }}
        if (occurence != 1) {
        return ("Start pos: " + start_pos + " and end pos: " + end_pos);}
        else {
            return ("Start pos: " + start_pos + " and end pos: " + start_pos);
        }}

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
 // i know T.C. is O(n) instead of O(log N) , but i won the battle, ill study about optimizing it later anyways..
}
}
