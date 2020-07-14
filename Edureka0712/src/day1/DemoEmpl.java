package day1;

public class DemoEmpl {

	public static void main(String[] args) {
		// declaring a variable to the Employee class
		Employee newGuy;
		newGuy = new Employee();
		
		newGuy.salary = 1000;
		newGuy.bonus = 200;
		
		newGuy.calculateSalary();
	}
}
