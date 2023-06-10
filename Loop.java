public class Loop {
    public static void main(String args[]) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number is " + i);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}