public class Employee {

  public Employee(String n, double s) {
    name = n;
    salary = s;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return "Employee[name=" + name + ",salary=" + salary + "]";
  }

  // salary raised by percent
  public void raiseSalary(double percent) {
    salary = salary + salary * percent / 100.0;
  }
  
  private String name;
  private double salary;
}
