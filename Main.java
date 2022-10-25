package saadet;

public class Main {
	public static void main(String[] args) {
		employee Employee = new employee("Kemal", 2000, 45, 1985);
		System.out.println(Employee.toString());
		Employee.tax();
		Employee.bonus();
		Employee.raiseSalary();
		System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + Employee.getSalary());
		//System.out.println("Toplam Maaş : " + );
	}
	
	

}
