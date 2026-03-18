// import java.util.*;
// public class input {
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     StringBuilder str = new StringBuilder(sc.nextLine());
//     System.out.println(str);

    // for(int i=0;i<str.length();i++){

    //   boolean flag = true;
    //   char ch = str.charAt(i);
    //   if(ch == ' ') continue;
    //   int asci = (int)ch;
    //   if(asci >=97) flag = false;   // it means that the letter is small
    //   if(flag == true){    
    //     asci += 32;             // means that convert the capital letter to the small 
    //     char dh =(char)asci;
    //     str.setCharAt(i,dh);
    //   }else{
    //     asci -= 32;
    //     char dh =(char)asci;
    //     str.setCharAt(i,dh);
    //   }
    // }
    // System.out.println(str);

    

    // that's the code for the numbers in the string

  //   for(int i=0;i<str.length();i++){
  //      boolean flag = true;
  //      char ch = str.charAt(i);
  //      if(ch == ' ') continue;
  //      int asci = (int)ch;
  //      if(asci >= 48 && asci <= 57){
  //       str.deleteCharAt(i);
  //       i--;
  //      }
  //   }
  // System.out.println(str);

  // what if we have to do the same things in the simple string 
//
    // String str = "PHYSICS";

  // StringBuilder sb = new StringBuilder(str);  the first thing that we can do is to convert the string into string builder form 

  // for(int i=0;i<str.length();i++){
  //     boolean flag = true;
  //     char ch = str.charAt(i);
  //     if(ch == ' ') continue; 
  //     int asci = (int)ch;
  //     if(asci >=97) flag = false;   // it means that the letter is small
  //     if(flag == true){    
  //       asci += 32;             // means that convert the capital letter to the small 
  //       char dh =(char)asci;
  //       // str.setCharAt(i,dh);  // there is no funtion in string like setCharAt
  //       str = str.substring(0,i) + dh + str.substring(i+1);
  //     }else{
  //       asci -= 32;
  //       char dh =(char)asci;
  //       // str.setCharAt(i,dh);
  //       str = str.substring(0,i) + dh + str.substring(i+1);
  //     }
  //   } 
  //   System.out.println(str);
  // }
  // }  

