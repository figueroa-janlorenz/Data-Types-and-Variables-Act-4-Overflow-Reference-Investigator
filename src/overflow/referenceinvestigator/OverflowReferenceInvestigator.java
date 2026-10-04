
package overflow.referenceinvestigator;

public class OverflowReferenceInvestigator {
    public static void main(String[] args) {
        
        byte number = 127;
        number++;
        
        System.out.println("Primitive Overflow");
        System.out.println("Byte after increment: " + number);
        
        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = "Java";
        
        System.out.println("\nString Comparison");
        
        System.out.println("str1 == str2 :" +(str1 == str2));
        //false cause str1 and str2 refer to different objects in memory
        
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        
        System.out.println("str1 == str3: " +(str1 == str3));
        //false cause str1 refers to a seperate object from the String literal
        
        System.out.println("str1.equals(str3):" + str1.equals(str3));
        
        System.out.println("str2 == str3:" + (str2 == str3));
        //false cause str2 refers to a seperate object from the String literal
        
        System.out.println("str2.equals(str3):" + str2.equals(str3));
        
        int[] array1 = {10,20,30};
        int[] array2 = array1;
        
        array2[0] = 100;

        
        System.out.println("Shared Array Reference");
        System.out.println("Array1 first element: " + array1[0]);
        System.out.println("Array2 first element: " + array2[0]);
        System.out.println("");
        
        
        
    }
    
}
