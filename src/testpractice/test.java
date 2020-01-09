package testpractice;

public class test {

	private String student;
	private String parent;
	private String teacher;
	
	private String number;
	
	//
	
	public test(String student, String parent) {
		this(student, parent);
	}
	
	
	public test(String student, String parent, String teacher) {
		this.student = student;
		this.parent = parent;
		this.teacher = teacher;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	
}
