/*
 
Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */
public class startHi {
    static boolean startHi(String str) {
        if(str.length()<2) return false;
        
        String a = str.substring(0,2);
        
        if(a.equals("hi")){
          return true;
        }
        else{
          return false;
        }
      }
    public static void main(String[] args) {
        System.out.println(startHi("Hello"));
    }  
}
