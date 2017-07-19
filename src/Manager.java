public class Manager extends Employee {

  public Manager(String n, double s, String d) {
    super(n, s);
    department = d;
  }

  @Override
  public String toString() {
    return "Manager[super=" + super.toString() + ",department=" + department + "]";
  }

  /**
   * @param percent salary raise by (percent+1%)
   */
  @Override
  public void raiseSalary(double percent) {
    super.raiseSalary(percent + 1); // one percent more than Employee
  }

  private String department;
}
