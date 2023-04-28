
package exception2;

public class Lab3 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try{
            System.out.println("Statement 1");
            System.out.println(list[10]);
            System.out.println("Statement 3");
        }
        catch (ArithmeticException ex){
            System.out.println("Exception");
        }
        finally{
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");
    }
}
