import java.util.Scanner;

public class incomeTaxCalulator extends calculations {

    public static void main(String[] args) {

        int age = 0;
        int income = 0;
        int income_Tax = 0;

        System.out.println("  ");
        System.out.println("----------Welcome to Income Tax Calculator-------------");
        System.out.println("  ");

        Scanner name = new Scanner(System.in);
        System.out.print("Enter your Name >>> ");
        String userName = name.nextLine();

        Scanner userAge = new Scanner(System.in);
        System.out.print("Enter your Age >>> ");
        age = userAge.nextInt();

        Scanner userIncome = new Scanner(System.in);
        System.out.print("Enter your yearly Income >>>");
        income = userAge.nextInt();

        income_Tax = new calculations().calculation(age, income, income_Tax);

        System.out.println("              ");
        System.out.println("----------------------------------");
        System.out.println("Your calculated income tax is Rs " + income_Tax);
        System.out.println("  ");
        System.out.println("Thank you for visiting us " + userName.toUpperCase());
        System.out.println("-----------------------------------");

        userAge.close();
        name.close();
        userIncome.close();
    }
}
