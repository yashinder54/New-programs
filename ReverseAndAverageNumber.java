import java.util.Scanner;
class ReverseAndAverageNumber{

    // function to find Reverse Number
    public void reverseNumber(int number){
        int reverse = 0;
        while(number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        System.out.println("Reverse of is "  + reverse);
    }

    // function to find average of reverse number
    public double findAverage(int number) {
        int sum = 0;
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            count++;
            number /= 10;
        }
        double average = (double) sum / count;
        
        return average;
    }
    
    public static void main(String args[]){
        ReverseAndAverageNumber rna = new ReverseAndAverageNumber();
       // ReverseNumberAndAverage fa = new ReverseNumberAndAverage();        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to reverse : ");
        int number;
        number = scanner.nextInt();
        
        rna.reverseNumber(number);
        double average = rna.findAverage(number);

        System.out.println("Average of Reversed Number: " + average);

    }
}