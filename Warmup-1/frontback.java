/*
 
Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */


public class frontback {
    static String frontBack(String str) {
        if (str.length() <= 1) return str;
         String mid = str.substring(1, str.length()-1);
         return str.charAt(str.length()-1) + mid + str.charAt(0);
      
      }
    public static void main(String[] args) {
        System.out.println(frontBack ("Helloo"));
    }  
}
