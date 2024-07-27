package j10_배열;
//배열에 Arrays1 하는데 사용
public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}//alt shift s 
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
