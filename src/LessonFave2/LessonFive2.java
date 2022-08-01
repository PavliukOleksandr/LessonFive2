package LessonFave2;

public class LessonFive2 {
	public static void main(String[] args) {
		Employee employee = new Employee("John", 28, 3500.57);
		System.out.println(employee.report());
		Developer developer = new Developer("Taras", 32 , 32735.35  , "Average Java developer");
		System.out.println(developer.report());
	}
}
