/*
 Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class StringE {
    static boolean stringE(String str) {
        int count = 0;
     
       for (int i=0; i<str.length(); i++) {
         if (str.charAt(i) == 'e') count++;
     
       }
     
       return (count >= 1 && count <= 3);
     }
    public static void main(String[] args) {
       System.out.println(stringE("rohit")); 
    } 
}
