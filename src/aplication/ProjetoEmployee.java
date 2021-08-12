package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProjetoEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name =  sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax =sc.nextDouble();
        System.out.println();
        
        System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
        
        System.out.printf("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        
        System.out.println(employee);
        
        
        
		
		
		
		sc.close();

	}

}
