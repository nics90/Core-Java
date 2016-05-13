
package firstprog;

public class DataType {
    public static void main(String[] args) {
   //By default decimal point numbers are double in Java not float
   double salary=32000;
   int age = 23;
   char sex = 'M';
   float hike = 11.2f;
   char c='A';
   String s="Hello";
   boolean b=false;
   b=!b;
   System.out.println(b);
   System.out.println((int)c);
        
   //Binary Data Operations     
    int i=0B00_00_00_11;
    float f =i;
        System.out.println(Integer.toBinaryString(i));
        
    int j=0B11_11_11_11;
    int x= j >> 2;
        System.out.println(Integer.toBinaryString(x));
        
    int k=0B11_11_11_11;
    int y= k << 2;   
        System.out.println(Integer.toBinaryString(y));
        
    int m=0B11_11_11_11;
    int z= m >>> 2;    
        System.out.println(Integer.toBinaryString(z));
    }
  
}
