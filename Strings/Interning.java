import java.util.*;
public class Interning {
   public static void main(String[] args){

    // when both f them are storing in the same memory addres  any change in any one of them there is no change in second one the 
    // first one will start pointing to the new value you have given
    // String s= "hello";
    // String x= "hello";
    //  x= "Mello";
    // System.out.println(x);

   // Immutability of Strings

    //  String s = "hello";
    //  s = s.substring(0,2) + 'y' + s.substring(3);
    //  System.out.println(s);

   // basically it is not immutable it is just creating the many substring and then adding them 

    String str = "I am an online Educator";
    String ans = "";
    StringBuilder sb = new StringBuilder("");
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch != ' '){
            sb.append(ch);
        }else{
            sb.reverse();
            ans += sb ;
             ans += " ";
            sb = new StringBuilder("");
        }
    }  
    sb.reverse();
    ans += sb;
    System.out.println(ans);

//     String str = "aaaabbbccdddeee";
//     String ans = "" +str.charAt(0);
//     int count = 1 ;
//     for(int i=1; i<str.length();i++){
//         char curr = str.charAt(i);
//         char prev = str.charAt(i-1);
//         if(curr == prev){
//             count++;
//         }else{
//             if(count >1) ans += count;
//             count =1; 
//             ans += curr;
//         }
//     }
//     if(count > 1) ans += count;
//     System.out.println(ans);
   } 
}
