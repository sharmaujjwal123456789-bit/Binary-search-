// package BS2;
//  better approach for lowerbound
// public class BS46 {
//     public static int  lb(int []arr,int n,int target){
//         int low =0;
//         int high = n -1;
//         int ans = n;
//         while(low <= high){
//             int mid = (low + high) / 2;
//             if(arr[mid]  >= target){
//                 ans = mid;
//                 //look for small index
//                 high = mid -1;
//             }else{
//                 low = mid + 1;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args){
//         int []nums={1,2,3,3,7,8,9,9,9,11};
//         int n= nums.length;
//         int target = 9;
//         System.out.println(lb(nums,n,target));
//     }
// }


//  appproach or the upperbound
// import java.util.*;
// public class BS46{
//     public static int Ub(int []arr,int n ,int target){
//         int low =0;
//         int high = n-1;
//         int ans = n;
//         while(low <= high){
//             int mid = (low + high)/2;
//             if(arr[mid] > target){
//                 ans = mid;
//                 high = mid -1;
//             }else{  
//                 low=mid+1;
//             }
//         } 
//         return ans;
//     }

//     public static void main(String[] args){
//         int []arr={2,3,6,7,8,8,11,11,11,12};
//         int n =arr.length;
//         int target = 7;

//         System.out.println(Ub(arr,n,target));
//     }
// }

//  floor and ceil problem 
// import java.util.*;
// public class BS46{
//     public static int ceil(int[] arr,int n ,int target){
//         int low = 0;
//         int high = n-1;
//         int ans= -1;
//         while(low <= high){
//             int mid = (low+ high )/2;
//             if(arr[mid] < target){
//                 ans = mid;
//                 low =mid+1;
//             }else{
//                 high = mid-1;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args){
//         int []arr= {2,3,4,6,9,23,27};
//         int n =arr.length;
//         int target = 10;

//         System.out.println(ceil(arr,n,target));
//     }
// }