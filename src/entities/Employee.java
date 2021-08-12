package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public void increaseSalary( double percentage) {
		this.grossSalary = this.grossSalary / 100 * percentage + netSalary();	
		
	}
	public String toString() {
		return "Updated data: " + name 
				+ ", $ " 
				+ String.format("%.2f", this.grossSalary);
	}
	

}
