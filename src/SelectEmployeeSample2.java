import java.util.List;
import dao.EmployeeDao;
import model.Employee;

public class SelectEmployeeSample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		EmployeeDao empDao = new EmployeeDao();
		
		List<Employee> empList = empDao.findAll();
		
		for(Employee emp : empList) {
			System.out.println("ID:" + emp.getId());
			System.out.println("Name:" + emp.getName());
			System.out.println("Age:" + emp.getAge() + "\n");
		}
		
		
	}

}
