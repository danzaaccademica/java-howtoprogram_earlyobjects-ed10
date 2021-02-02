package jhtpeo.ed10.chapter03.exe313;

import javax.swing.LayoutStyle;

public class Employee
{

  private double salary;
  private String
      firstName,
      lastName;

  public Employee() {
    firstName = "Unnamed";
    lastName = "Person";
    salary = 0.0;
  } // [END_METHOD : Employee]


  public double getSalary() {
    return salary;
  } // [END_METHOD : getSalary]

  public String getFirstName() {
    return firstName;
  } // [END_METHOD : getFirstName]

  public String getLastName() {
    return lastName;
  } // [END_METHOD : getLastName]

  public void setFirstName(String newFirstName) {
    firstName = newFirstName;
  } // [END_METHOD : setFirstName]

  public void setLastName(String newLastName) {
    lastName = newLastName;
  } // [END_METHOD : setLastName]

  public void setSalary(double newSalary) {
    if (newSalary > 0) {
      salary = newSalary;
    }
  } // [END_METHOD : setSalary]

} // [END_CLASS : Employee]
