import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("          Kilometer to Miles Converter");
        System.out.println("Enter a Kilometer: ");
        int kilo= scanner.nextInt();
        double cal = (kilo/1.609344);

        System.out.print("The Miles is : "); System.out.print(cal);
    }
}
