package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Enter employee's name:");
        String name = in.next();

        System.out.print("Enter number of hours worked in a week:");
        double hours = in.nextInt();

        System.out.print("Enter hourly pay rate:");
        double payRate = in.nextDouble();

        System.out.print("Enter federal tax withholding rate:");
        double federalTaxRate = in.nextDouble();

        System.out.println("Enter state tax withholding rate:");
        double stateTaxRate = in.nextDouble();

        double totalPay = hours * payRate;
        double federalTax = totalPay * federalTaxRate;
        double stateTax = totalPay * stateTaxRate;
        double totalTax = federalTax + stateTax;
        double netPay = totalPay - totalTax;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + totalPay);
        System.out.println("Deductions: ");

        System.out.println("  Federal Withholding: $" + federalTax);
        System.out.println("  State Withholding: $" + stateTax);
        System.out.println("  Total Deductions: $" + totalTax);
        System.out.println("Net Pay: $" + netPay);
        in.close();

	}

}
