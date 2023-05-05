import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        int a,i,fact=1;
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter your favourite number which you love that");
        a = ab.nextInt();
        for (i=1;i<=a;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of your favourite number" +" " +a+" " +  "is"+" "  + fact);

    }
}
