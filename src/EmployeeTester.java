import java.util.*;

public class EmployeeTester {
  public static void main(String[] args) {
    ArrayList<Employee> all = new ArrayList<Employee>();
    all.add(new Employee("Emp1", 100));
    all.add(new Employee("Emp2", 100));
    all.add(new Employee("Emp3", 100));
    all.add(new Employee("Emp4", 100));
    all.add(new Employee("Emp5", 100));
    all.add(new Employee("Emp6", 100));
    all.add(new Employee("Emp7", 100));
    all.add(new Manager("Mng1", 100, "Dept1"));
    all.add(new Manager("Mng2", 100, "Dept2"));
    all.add(new Executive("Exe1", 100, "Dept1"));
    all.add(new Executive("Exe2", 100, "Dept2"));
    all.add(new Executive("Exe3", 100, "Dept3"));

    for (int i = 0; i < all.size(); i++) {
      Employee e = all.get(i);
      e.raiseSalary(1);  // raise salary 1% for employee, 2% manager, 3% executive
    }

    for (int i = 0; i < all.size(); i++) {
      Employee e = all.get(i);
      System.out.println(e);
    }
 }

}
