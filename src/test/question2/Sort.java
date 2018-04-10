package test.question2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {
	
	public static void main(String[] args) {
		List<Student> student = new ArrayList<Student>();
		student.add(new Student(33, "Tine", 3.68));
		student.add(new Student(85, "Louis", 3.85));
		student.add(new Student(56, "Samil", 3.75));
		student.add(new Student(19, "Samar", 3.75));
		student.add(new Student(22, "Lorry", 3.76));
		student.sort(Comparator.comparing(Student::getGpa).reversed()
				.thenComparing(Student::getName)
				.thenComparing(Student::getId));
		student.forEach(System.out::println);
	}
}

class Student {
	private int id;
    private String name;
    private double gpa;
        
    public Student(int id, String name, double gpa){
    	this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
    public String toString(){
        return this.gpa + " " + this.name + " " + this.id;
    }

}