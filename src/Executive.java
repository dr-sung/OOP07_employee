public class Executive extends Manager {

  public Executive(String n, double s, String d) {
    super(n, s, d);
  }

  /**
   * @param percent salary raise by (percent+2%)
   */
  @Override
  public void raiseSalary(double percent) {
    super.raiseSalary(percent + 1); // one percent more than Manager
  }

  @Override
  public String toString() {
    return "Executive[super=" + super.toString() + "]";
  }
}
