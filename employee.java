package saadet;

public class employee {
	
	private String name;
	private int salary;
	private int workHours;
	private int hireYear;
	
	public employee(String name, int salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public void tax() {
		if(salary >= 1000) {
			int vergi = (salary * 3)/100;
			System.out.println("Vergi : " + vergi);
		}
	}

	public void bonus() {
		if(workHours > 40) {
			int fazlaMesaiSaati = workHours - 40;
			int bonus =  fazlaMesaiSaati * 30;
			System.out.println("Bonus : " + bonus);
		}
	}
	
	public void raiseSalary() {
		int calisilanYil = 2021 - hireYear;
		if(calisilanYil < 10) {
			int maasArtisi = (salary * 5)/100;
			System.out.println("Maaş Artışı : " + maasArtisi);
		} else if(calisilanYil > 9 && calisilanYil < 20) {
			int maasArtisi = (salary * 10)/100;
			System.out.println("Maaş Artışı : " + maasArtisi);
		} else if(calisilanYil > 19) {
			int maasArtisi = (salary * 15)/100;
			System.out.println("Maaş Artışı : " + maasArtisi);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
	
	@Override
	public String toString() {
		return "Adı : " + name + "\nMaaşı : " + salary + "\nÇalışma Saati : " + workHours + "\nBaşlangıç Yılı : " + hireYear;
	}
	
}
