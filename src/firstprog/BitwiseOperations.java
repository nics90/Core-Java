
package firstprog;


public class BitwiseOperations {
    public static void main(String[] args) {
     int b1=0B00_11_11_00,b2=0B11_11_11_11;
        System.out.println(Integer.toBinaryString(b1&b2));
        System.out.println(Integer.toBinaryString(b1|b2));
        System.out.println(Integer.toBinaryString(b1^b2));
        System.out.println("");
        System.out.println(Integer.toBinaryString(~b2));
        System.out.println(Integer.toBinaryString(b2>>2));
    }
    
}
