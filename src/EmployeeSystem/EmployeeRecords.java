package EmployeeSystem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Peiran Li
 */
public class EmployeeRecords {

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    ArrayList<EmployeeData> employeeDataArrayList =
        new ArrayList<EmployeeData>(); // Stores all employee data
    EmployeeData employeeData;
    String userCommand;
    String employeeFirstName;
    String employeeLastName;
    Integer employeeID;
    Integer deptNum;

    do {
      // Prompt user for input
      System.out.println("Enter command ('a' to add new employee, 'p' to " +
          "print all employees, 'q' to quit): ");
      userCommand = scnr.next();

      // Add new employee entry
      if (userCommand.equals("a")) {
        System.out.print("First Name: ");
        employeeFirstName = scnr.next();
        System.out.print("Last Name: ");
        employeeLastName = scnr.next();
        System.out.print("ID: ");
        employeeID = scnr.nextInt();
        System.out.print("Department Number: ");
        deptNum = scnr.nextInt();
        employeeData = new EmployeeData(employeeFirstName, employeeLastName, employeeID, deptNum);
        employeeDataArrayList.add(employeeData);
      }
      // Print all entries
      else if (userCommand.equals("p")) {

        // Sort employees by department number first
        // and name second
        Collections.sort(employeeDataArrayList);

        System.out.println("");
        System.out.println("Employees: ");
        // Access employee records
        for (int i = 0; i < employeeDataArrayList.size(); ++i) {
          System.out.println(employeeDataArrayList.get(i).toString());
        }
        System.out.println("");
      }
    } while (!userCommand.equals("q"));
  }
}
