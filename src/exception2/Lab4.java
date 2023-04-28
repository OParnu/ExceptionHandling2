package exception2;

public class Lab4 {

    public static void main(String[] args) {
        try {
            System.out.println("Statement 1");
            System.out.println(1/0);
            System.out.println("Statement 3");
        } catch (ArithmeticException e) {
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            throw new RuntimeException();
        } 
        finally{
            System.out.println("Statement 4");
        }   
            System.out.println("Statement 5");
    }
}
