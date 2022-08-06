package EmployeeSystem;

/**
 * @author Peiran Li
 */
public class EmployeeData implements Comparable<EmployeeData> {
  private String firstName;
  private String lastName;
  private Integer employeeID;
  private Integer deptNum;

  /**
   * No-argument constructor
   */
  EmployeeData() {
    this.firstName = "First Name: None";
    this.firstName = "Last Name: None";
    this.employeeID = 0;
    this.deptNum = 0;
  }

  EmployeeData(String firstName, String lastName, Integer employeeID,
               Integer deptNum) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.employeeID = employeeID;
    this.deptNum = deptNum;
  }

  @Override
  public int compareTo(EmployeeData otherEmployee) {
    String fullName;
    String otherFullName;
    int comparisonVal;

    comparisonVal = deptNum.compareTo(otherEmployee.deptNum);

    if (comparisonVal == 0) {
      fullName = lastName + firstName;
      otherFullName = otherEmployee.lastName + otherEmployee.firstName;
      comparisonVal = fullName.compareTo(otherFullName);
    }

    return comparisonVal;
  }
}
