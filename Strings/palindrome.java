// import java.util.*;
// public class palindrome {
//     public static boolean isPalindrome(String s){
//         int i=0;
//         int j= s.length()-1;
//         while(i<j){
//             if(s.charAt(i) != s.charAt(j)) return false;
//             i++;
//             j--;
//         }
//         return true;
//     }
    // public static void main(String[] args){
        // String str = "abcbd";

        // // that's the approach through the string builder 
        // StringBuilder gtr = new StringBuilder(str);
        // gtr.reverse();
        // String s = gtr +"";
        // if(str.equals(s)){
        //     System.out.println("pallindrome");
        // }else{
        //     System.out.println("Not pallindrome");
        // }


        // now with the help of the simple string 
        // int i =0;
        // int j = str.length() -1;
        // boolean flag = true;
        // while(i<j){
        //     if(str.charAt(i) != str.charAt(j)){
        //         flag = false;
        //         break;
        //     }
        //     i++;
        //     j--;
        // }
        // if(flag == true) System.out.println("pallindrome");
        // else System.out.println("Not pallindrome");


        // Now i have to find the number of subsrting of a string that are pallindromic 
        //    String str = "abcba";
        //    int count =0;
        //    for(int i=0;i<= str.length();i++){
        //     for(int j=i+1;j<= str.length();j++){
        //         if(isPalindrome(str.substring(i,j))== true){
        //             System.out.print(str.substring(i,j) +" ");
        //             count++;
        //         }
        //     }
        //    }
        //    System.out.println("The number of pallindromic subsring are"+count);
//     }
// }
