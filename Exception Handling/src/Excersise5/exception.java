package Excersise5;

public class exception {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        }
        // No catch block to handle the exception
        System.out.println("This line will not execute");
    }
}
