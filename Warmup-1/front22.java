public class front22 {
    /*
     
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.


front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
     */
    static String front22(String str) {
        int a = 2;
        if (a > str.length()) {
          a = str.length();
        }
        
        String b = str.substring(0, a);
        return b + str + b;
      }
    public static void main(String[] args) {
        System.out.println(front22("Hello"));
    }  
}
