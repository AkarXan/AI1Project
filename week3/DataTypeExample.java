package week3;


/**
 * Write a description of class DataTypeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeExample
{
    public static void main(String[] args)
    {
        
     System.out.println(Integer.MAX_VALUE);
     System.out.println(Integer.MIN_VALUE);
     System.out.println(Integer.BYTES);
     System.out.println(Integer.SIZE);
     
     
     
     System.out.println(Float.MAX_VALUE);
     System.out.println(Float.MIN_VALUE);
     System.out.println(Float.BYTES);
     System.out.println(Float.SIZE);
     
     
     byte b = 13;
     byte c = 14;
     byte d =(byte) ( b + c );
     
     
     float f = 2.33f;
     long l = 233l;
     
     
     int a = 10;
     float g = 2.333f;
     float k = 2.44f;
     
     int x = (int) ( a + g + k );
     
     System.out.println(x);
     
     int y = 10;
     int u = 4;
     
     float result = ((float)y/u);
     System.out.println(result);
     
     
     System.out.print("My name is : ");
     System.out.print("Aakarshan.");
     
     System.out.println("My \t name is \nAakarshan");
     System.out.println("My \t name is \n "+" saroj\"");
     
     
        
    }
}