class Vehicle {
	protected String brand = "Toyota";
	public void honk() {
	System.out.println("Tuut,tuut!");
	}
}

class Car extends Vehicle {
	private String modelName = "Bugatti";
	public static void main(String[] args) {
		Car myFastCar = new Car();
		myFastCar.honk();
		System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	}
}
//Parent Class (Base Class)
class Person {

    //Encapsulated variables (private)
    private String name;
    private int age;
    
    //Setters (Write data)
    public void setName (String name) {
    	this.name = name;
    }
    public void setAge(int age) {
    	if (age > 0) {
    		this.age = age;
    	} else {
    		this.age = 0; //Validation
    	}
    }
    
    //Getters(Read data)
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
}
//Child class (Derived Class)
//Inheritance: Student inherits person
class Student extends Person {
	
	private String course;
	
	//Setters and Getters for new variables
	public void setCourse(String course) {
		this.course = course; 
	}
    public String getCourse() {
    	return course;
    }
    
    //Responsive method easy to modify
    public void displayInfo() {
    	System.out.println("----Student Information----");
    	System.out.println("Name:  " + getName());
    	System.out.println("Age:  " + getAge());
    	System.out.println("Course:  " + getCourse());
    	System.out.println("---------------------------");
    }
}

//Main Class
public class MainProgram {
	static void mai(String[] args) {
		
		//Create object of child class(Student)
		Student s = new Student();
		
		//Using setters from person(Inheritance)
		s.setName("Niel");
		s.setAge(16);
		
		s.setCourse("BSIT");
		s.displayInfo();
	}
}
