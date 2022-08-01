package LessonFave2;

public class Developer extends Employee {
	private String position;

	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public Developer(String name, int age, double salary, String position) {
		super(name, age, salary);
		this.position = position;
	}

	@Override
	public String report() {
		return String.format("Name: %s, Age: %d, Pasition: %s, Salary: %.2f.", name, age, position, salary);
	}
}
