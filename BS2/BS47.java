// first and last occurence in the array
// import java.util.*;
// public class BS47 {
//     public static int[] Occ(int []nums,int n,int target){
//       int first =-1;
//       int last =-1;
//       for(int i=0;i<n;i++){
//         if(nums[i] == target){
//             if(first == -1 )
//                 first = i;
//                 last = i;
//         }
//       }
//       return new int[]{first,last};
//     }
//     public static void main(String[] args){
//         int []nums={2,4,6,8,8,8,11,13};
//         int n = nums.length;
//         int target = 8;

//         int []ans=Occ(nums,n,target);
//         System.out.println(ans[0]);
//         System.out.println(ans[1]);
//     }
    
// }



//  through the lower and upper bound formula  T.C =O(log2n) *2

// import java.util.*;
// public class BS47{

// public static int LowerBound(int[] arr,int n ,int target){
//         int low =0;
//         int high = n-1;
//         int ans=n;
//         while(low <= high){
//             int mid = (low+high )/2;

//             if(arr[mid] >= target){
//                 ans = mid;
//                 high =mid-1;
//             }else{
//                 low= mid+1;
//             }
//         }
//         return ans;
//     }
// public static int UpperBound(int[] arr,int n ,int target){
//         int low =0;
//         int high =n-1;
//         int ans=n;

//         while(low <= high){
//             int mid=(low + high) /2;

//             if(arr[mid] > target){
//                 ans = mid ;
//                 high = mid -1;
//             }else{
//                 low = mid +1;
//             }
//         }
//         return ans;
//     }
//     public static int[] Occ(int []arr,int n,int target){
//        int lb = LowerBound(arr,n,target);

//        if(lb == n || arr[lb] != target){
//         return new int[]{-1, -1};
//        }
//        return new int[]{lb, UpperBound(arr,n,target) - 1};
//     }
//     public static void main(String[] args){
//         int []arr= {2,4,6,8,8,8,11,13};
//         int n =arr.length;
//         int target =8;

//         int[] ans=Occ(arr,n,target);

//         System.out.println("first = " + ans[0]);
//         System.out.println("last = " + ans[1]);
//     }
// }


//  through just simple binary search 
//  Fo (first occurence ) ,Ls(last occurence)
// import java.util.*;
// public class BS47{
//     public static int Fo(int []nums,int n,int target){
//         int low=0;
//         int high =n-1;
//         int first =-1;
//         while(low <= high){
//             int mid = (low + high) / 2;
//             if(nums[mid] == target){
//                 first = mid;
//                 high = mid-1;
//             }else if(nums[mid] <target){
//                 low = mid+1;
//             }else{
//                 high = mid -1;
//             }
//         }
//         return first;
//     }

//     public static int Lo(int []nums,int n, int target){
//         int low =0;
//         int high= n-1;
//         int last =-1;
//         while(low <= high){
//             int mid = (last + high) /2;
//             if(nums[mid] == target){
//                 last = mid;
//                 low =mid+1;
//             }else if(nums[mid] < target){
//                 low = mid+1;
//             }else{
//                 high =mid -1;
//             }
//         }
//        return  last;
//     }

//     public static int[] Occ(int[] nums,int n , int target){
//         int first = Fo(nums,n,target);
//         if(first == -1) return new int[]{-1,-1};
//         int last = Lo(nums,n,target);
//         return new int[]{first,last};
//     }
//     public static void main(String[] args){
//         int []nums={2,8,8,8,8,8,11,13};

//         int n= nums.length;
//         int target =8;
//         int []result =Occ(nums,n,target);

//         System.out.println(result[0]);
//         System.out.println(result[1]);

//         //  i can use any of them to print the result 
//         // System.out.println(Arrays.toString(result));

//         // for(int x : result){
//         //  System.out.println(x);
//         //  }
//     }
// }

// you can use the same uppper first occurence and last occurence in this approach also
//   count the max occurence of x


// import java.util.*;
// public class BS47{
//     public static int Fo(int []nums,int n,int target){
//         int low=0;
//         int high =n-1;
//         int first =-1;
//         while(low <= high){
//             int mid = (low + high) / 2;
//             if(nums[mid] == target){
//                 first = mid;
//                 high = mid-1;
//             }else if(nums[mid] <target){
//                 low = mid+1;
//             }else{
//                 high = mid -1;
//             }
//         }
//         return first;
//     }

//     public static int Lo(int []nums,int n, int target){
//         int low =0;
//         int high= n-1;
//         int last =-1;
//         while(low <= high){
//             int mid = (low + high) /2;
//             if(nums[mid] == target){
//                 last = mid;
//                 low =mid+1;
//             }else if(nums[mid] < target){
//                 low = mid+1;
//             }else{
//                 high =mid -1;
//             }
//         }
//        return  last;
//     }

//     public static int[] Occ(int[] nums,int n , int target){
//         int first = Fo(nums,n,target);
//         if(first == -1) return new int[]{-1,-1};
//         int last = Lo(nums,n,target);
//         return new int[]{first,last};
//     }

//     public static void count(int []nums,int n ,int target){
//         int []ans= Occ(nums,n,target);

//         int first = ans[0];
//         int last = ans[1];

//         if(first == -1){
//             System.out.println("Not found");
//         }
//         System.out.print( last - first +1); 
//     }
//     public static void main(String[] args){
//         int []nums={2,8,8,8,8,8,11,13};

//         int n= nums.length;
//         int target =8;
//         int []result =Occ(nums,n,target);

//         System.out.println(result[0]);
//         System.out.println(result[1]);

//         count(nums,n,target);

//         //  i can use any of them to print the result 
//         // System.out.println(Arrays.toString(result));

//         // for(int x : result){
//         //  System.out.println(x);
//         //  }
//     }
// }
