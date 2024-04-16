import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float retirementAge; //stored as a float, because you can take it out at any time (not just on your birthday, and removing 6 months before 60th birthday will incur penalty)
        float accountBalance;
        float taxRate; //yearly tax rate
        float appreciationRate; //expected yearly amount for account to grow




        //instantiating objects
        Scanner in = new Scanner(System.in);
        retirementAccount account = new retirementAccount();

        System.out.print("How old are you?: ");
        retirementAge = in.nextInt();
        System.out.print("What is the balance of your retirement account?: $");
        accountBalance = in.nextFloat();




    }
}
