
public class Salary {
		public static void main(String[] args) {
			Employee employee = new Employee(500);
			System.out.println(employee.getName()+" "+employee.ComputeSalary());
			SalesManager salesmanager = new SalesManager(500,400,900);
			System.out.println(salesmanager.getSaleName()+" "+salesmanager.ComputeSalary());
			SalesEmployee salesemployee = new SalesEmployee(1000,400);
			System.out.println(salesemployee.getSaleName()+" "+salesemployee.ComputeSalary());
			Manager manager = new Manager(1000,50);
			System.out.println(manager.getName()+ " "+manager.ComputeSalary());
		}
}
