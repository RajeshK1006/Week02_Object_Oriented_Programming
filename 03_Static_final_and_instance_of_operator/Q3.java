import java.util.*;

class Q1{

  public static void main(String[] args){
    
    Employee obj1 = new Employee("rajesh",2134,"developer");
    Employee obj2 = new Employee("sanjay",213443,"mobile eveloper");
    
    Employee.displayTotalEmployees();
    obj1.display();
    
    obj2.display();
    
    
    
  }  
}

class Employee {
    private static String companyName = "Tech Corp";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total employees in " + companyName + ": " + totalEmployees);
    }

    public void display() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee Name: " + this.name);
            System.out.println("Employee ID: " + this.id);
            System.out.println("Designation: " + this.designation);
        }
    }
}
