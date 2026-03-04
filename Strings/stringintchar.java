import java.util.*;
public class stringintchar {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    //  String str = "abc";
    //  str = str + "xyz";
    //  str += "xyz";
    //  str += 'e';
    //  str += 10;
    //  System.out.println(str);


    // 1 priority aise hoti hai ki + mein abc + 10 phele string mein convert ho rha hai then uske badd + ayega toh phele
    // wal toh string mein convert hogya hai then toh + ke baad bo string mein add hoga 
    //2 mein aisa hoga ki jo bracket mein bo algh se phele hi ho jayega add then phir string se add hoga 
    //3 mein aisa hoga ki jo eh add hota hai left to right chalta hai then 10+20 phele add ho jayega then phir abc add hoga uske baad 
    //    System.out.println("abc"+10+20);
    //    System.out.println("abc"+(10+20)); 
    //    System.out.println(10 + 20 +"abc");


    //  substring (i,j) and substring(i)
        // String str = "abcdef";
        // System.out.println(str.substring(0,3));
        // System.out.println(str.substring(1));

       
        // MCQ
        // IN THIS IT WILL FIRST PRINT THE SUBSTRING FROM 2 TO END THEN 3 TO END 
        // String s = "physics";
        // for(int i =2;i<4;i++){
        //     System.out.print(s.substring(i));
        // }

        // 2nd 
        // String s ="abcd";
        // for(int i=0;i<4;i++){
        //     for(int j=i+1;j<=4;j++){
        //         System.out.println(s.substring(i,j));
        //     }
        // }
 
    }
} 
