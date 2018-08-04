package employee;

// program to calculate the salary details and print the salary information of the employee
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of an employee");
		String Name = sc.nextLine();

		System.out.println("Enter monthly salary of an employee");
		double monthlyBasic = sc.nextDouble();

		// create object of class employee
		employee employee = new employee();
		employee.setName(Name);
		employee.setMonthlyBasic(monthlyBasic);

		// print the salary information of an employee
		System.out.println("employee salary information is");
		System.out.println("Employee name:" + employee.getName());
		System.out.println("Employee id:" + employee.getId());
		System.out.println("Employee MonthlyBsaic:" + employee.getMonthlyBasic());
		System.out.println("Emloyee AnnualBasic:" + employee.getAnnualBasic());
		System.out.println("Emloyee MonthlyGrossSalary:" + employee.getMonthlyGrossSalary());
		System.out.println("Employee ANnualGrossSalary:" + employee.getAnnualGrossSalary());
		System.out.println("Employee monthlyDeduction:" + employee.getMonthlyDeduction());
		System.out.println("Employee MonthlyTakeHome:" + employee.getMonthlyTakeHome());
		System.out.println("Employee AnnualTAkeHome" + employee.getAnnualTakeHome());
	}

}
