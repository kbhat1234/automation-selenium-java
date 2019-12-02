package inheritance;

class Employee {
	double salary=40000;
}

public class Programmer extends Employee{
	int bonus=1000;
	public static void main(String args[]) {
		Programmer p = new Programmer();
		System.out.println(p.salary+ " "+p.bonus);
		Employee e = new Employee();
		System.out.println(e.salary);
		
	}
}