package p1;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		double annualSalary = 0;
		int monthlySalary = 35000;
		double annualIncome = monthlySalary*12;
		
		double hra = annualIncome * 0.20 ;
		double da = annualIncome * 0.40 ;
		double ta = annualIncome * 0.10 ;
		
		double tax = 0;
		
		
		if(annualIncome < 500000)
		{
			annualSalary = monthlySalary*12+hra+da;
			System.out.println("Annual Salary is :"+annualSalary);
					
		}
		
		if(annualIncome > 500000)
		{
			annualSalary = monthlySalary*12+hra+da+ta;
			System.out.println("Annual Salary is :"+annualSalary);
					
		}
		
		
		
		if(annualSalary < 500000) {
			tax = 0;
			System.out.println("NO TAX");
		}
		
		if(annualSalary > 500000 && annualSalary <1000000) {
			tax = annualSalary* 0.10;;
			System.out.println("TAX amount is :"+tax);
		}
		
		if(annualSalary > 1000000 && annualSalary < 2000000) {
			tax = annualSalary* 0.20;
			System.out.println("TAX amount is"+tax);
		}
		
		if(annualSalary > 2000000) {
			tax = annualSalary* 0.30;
			System.out.println("TAX amount is:"+tax);
		}
		
		
		
		
		
	}

}
