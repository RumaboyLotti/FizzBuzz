public class FizzBuzz {
    public static void main(String[] args) {
        int numb = 100;
        for (int i = 1; i <= numb; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("\n Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println("\nBuzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("\nFizzBuzz " + i);
            } else {
                System.out.println(" \n Not a multiple " + i);
            }
        }
    }}