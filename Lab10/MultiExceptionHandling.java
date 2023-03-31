public class MultiExceptionHandling{
    public static void main(String[] args){
        String s = "Example String";
        int a[] = {0, 1, 2, 3, 4, 5};
        try{
            // Setting s to null and try to get its length. This will throw a NullPointerException
            s = null;
            int sLength = s.length(); 
            System.out.println("String length: " +sLength);
            // Trying to print out 6th index/seventh element of array "a" containing maximum of six elements. This will throw ArrayIndexOutOfBoundsException
            int b = 6;
            System.out.println(a[b]);
        } 
        //npe and aie are variable names to represent the exceptions that may be caught catch blocks
        catch(NullPointerException npe){
            System.out.println("Error: String s is set to null");
            System.out.println(npe.toString());
        }
        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: Trying to access an element in array at an index that is out of bounds");
            System.out.println(aie.toString());
        }
    } 
}
