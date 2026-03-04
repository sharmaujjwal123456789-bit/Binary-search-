import java.util.*;
public class builder {
    public static void main(String[] args){
        // String str = "hello"; // not work with the simple string beacuse itis imuutable

        // it will add at the end of the string without using any external memory
        // StringBuilder str = new StringBuilder("hello");
        // str.append("World");
        // System.out.println(str);
        //   str.append(true);
        //   System.out.println(str);
        //   str.append(10);
        //   System.out.println(str);


        //  charAt function(indx,ch)  and append(ch)
        // StringBuilder str = new StringBuilder("hello");
        // System.out.println(str);   //hello
        // str.setCharAt(0,'m');        //mello
        // System.out.println(str);      //mello


        // insert(idx,ch) and deleteCharAt(ch)
        // StringBuilder str = new StringBuilder("hello");
        //  str.insert(2,'y');
        //  System.out.println(str);
        //  str.deleteCharAt(0);
        //  System.out.println(str);
 
        // revere() and delete(i,j)
        // StringBuilder s =new StringBuilder("Physics");
        // System.out.println(s);
        // s.reverse();
        // System.out.println(s);  
        // s.delete(2,4);   // 2 to 3 will get delete 
        // System.out.println(s);

    }
}
