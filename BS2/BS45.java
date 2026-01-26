//  iterative approach 
// import java.util.*;
// public class BS45{
//     public static void Bs(int []nums,int target,int n){
//        int low =0;
//        int high =n-1;
//        while(low <= high){
//         int mid = (low+ high) /2;
//         if(nums[mid] == target){
//             System.out.println(mid);
//             return;
//         }else if(target > nums[mid]){
//             low = mid + 1;
//         }else{
//             high = mid -1;
//         }
//     //    System.out.println(mid);
//        }
//        System.out.println("Element not found");
//     }

//     public static void main(String[] args){
//         int []nums={2,3,4,5,6,7,9};
//         int target = 4;
//         int n = nums.length;

//         Bs(nums,target,n);
//     }
// }


// recursive approach

// public class BS45{
//     public static int Bs(int []nums,int low,int high,int target){
//         if(low > high) return -1;
//         int mid =(low + high ) /2;
//         if(nums[mid] == target){
//         return mid;
//         }else if(target > nums[mid]){
//             return Bs(nums,mid+1,high,target);
//         }else{
//             return Bs(nums,low,mid-1,target);
//         }  
//     }
//     public static void main(String[] args){
//         int []nums={2,3,4,6,7,87,90,100};
//         int target = 90;
//         int n = nums.length;
//         System.out.println(Bs(nums,0,n-1,target)); 
//     }
// } 