package Excercise6;

public class MultipleException {
    public static void main(String[] args) {
        try {
            int[] n = {10, 20, 30};
            System.out.println(n[5]);
            int res = 10/0;

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index ArrayIndexOutOfBoundsException out of bound exception");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception: Division by zero!");
        }catch (Exception e){
            System.out.println("An  unexpected error occurred: "+ e.getMessage());
        }finally {
            System.out.println("-+-+-+-+-+-+-+-");
            System.out.println("Program continues after try-catch blocks.");
        }
    }
}
