package employee;

// class employee
public class employee {
	// instance members
	private final int id = 155361;
	private String name;
	private double monthlyBasic;
	double AnnualBasic;
	double MonthlyGrossSalary;
	double AnnualGrossSalary;
	double MonthlyDeduction;
	double MonthlyTakeHome;
	double AnnualTakeHome;
	static double pf;

	// getters and setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}

	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}

	public double getAnnualBasic() {
		AnnualBasic = monthlyBasic * 12;
		return AnnualBasic;
	}

	public static double getPf() {
		return pf;
	}

	public static void setPf(double pf) {
		employee.pf = pf;
	}

	// calculate monthly salary and return it
	public double getMonthlyGrossSalary() {
		double hra = .5 * monthlyBasic;
		double medical = 1250;
		double conveyance = 800;
		MonthlyGrossSalary = monthlyBasic + hra + medical + conveyance;
		return MonthlyGrossSalary;
	}

	// calculate annual gross salary and return it
	public double getAnnualGrossSalary() {
		AnnualGrossSalary = MonthlyGrossSalary * 12;
		return AnnualGrossSalary;
	}

	// calculate monthly deduction
	public double getMonthlyDeduction() {
		double pf, esic, profTax;
		if ((.1 * monthlyBasic) < 6500) {
			pf = (.1 * monthlyBasic);
		} else {
			pf = 6500;
		}
		if (monthlyBasic <= 5000) {
			esic = (4.75 * monthlyBasic);
		} else {
			esic = 0;
		}
		if (monthlyBasic <= 10000) {
			profTax = 50;
		} else {
			profTax = 100;
		}
		MonthlyDeduction = pf + esic + profTax;
		return MonthlyDeduction;
	}

	// calculate monthly take home
	public double getMonthlyTakeHome() {
		MonthlyTakeHome = MonthlyGrossSalary - MonthlyDeduction;
		return MonthlyTakeHome;
	}

	// calculate annual take home
	public double getAnnualTakeHome() {
		AnnualTakeHome = MonthlyTakeHome * 12;
		return AnnualTakeHome;
	}

}
