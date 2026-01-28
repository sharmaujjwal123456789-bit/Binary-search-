import java.util.*;
public class BS47{

public static int LowerBound(int[] arr,int n ,int target){
        int low =0;
        int high = n-1;
        int ans=n;
        while(low <= high){
            int mid = (low+high )/2;

            if(arr[mid] >= target){
                ans = mid;
                high =mid-1;
            }else{
                low= mid+1;
            }
        }
        return ans;
    }
public static int UpperBound(int[] arr,int n ,int target){
        int low =0;
        int high =n-1;
        int ans=n;

        while(low <= high){
            int mid=(low + high) /2;

            if(arr[mid] > target){
                ans = mid ;
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
    public static int[] Occ(int arr,int n,int target){
       int lb = LowerBound(arr,n,target);

       if(lb == n || aar[lb] != target){
        return new int[]{-1, -1};
       }
       return new int[]{lb, UpperBound(arr,n,target) - 1};
    }
    public static void main(String[] args){
        int []arr= {2,4,6,8,8,8,11,13};
        int n =arr.length;
        int target =8;

        int[] ans=Occ(arr,n,target);

        System.out.println("first = " + ans[0]);
        System.out.println("last = " + ans[1]);
    }
}