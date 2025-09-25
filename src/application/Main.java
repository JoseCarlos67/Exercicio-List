package application;

import application.entitties.Employee;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void fillList(Scanner scanner, List<Employee> employeeList, int quantityEmployees) {
    for (int i = 0; i < quantityEmployees; i++) {
      System.out.println("Employee #" + (i + 1));

      System.out.print("ID: ");
      Integer id = scanner.nextInt();
      scanner.nextLine();

      System.out.print("\nName: ");
      String name = scanner.nextLine();

      System.out.print("\nSalary: ");
      Double salary = scanner.nextDouble();

      Employee employee = new Employee(id, name, salary);
      employeeList.add(employee);
      System.out.println();
    }
  }

  public static void printList(List<Employee> employeeList) {
    for (Employee employee : employeeList)
      System.out.println(employee);
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    // String fakeInputString = "3\n333\nMaria Brown\n4000.00\n536\nAlex Grey\n3000.00\n772\nBob Green\n5000.00\n536\n10.0";
    String fakeInputString = "3\n333\nMaria Brown\n4000.00\n536\nAlex Grey\n3000.00\n772\nBob Green\n5000.00\n736\n10.0";
    ByteArrayInputStream fakeInput = new ByteArrayInputStream(fakeInputString.getBytes());
    System.setIn(fakeInput);

    Scanner scanner = new Scanner(System.in);

    System.out.print("How many employees will be registered? ");
    int quantityEmployees = scanner.nextInt();
    List<Employee> employeesList = new ArrayList<>();
    fillList(scanner, employeesList, quantityEmployees);

    System.out.println("\nList of employees:");
    printList(employeesList);

    System.out.print("\nEnter the employee id that will hava salary increase: ");
    int idEmployee = scanner.nextInt();
    Employee employee = employeesList.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);
    if (employee == null)
      System.out.println("\nThis ID does not exist!");
    else {
      System.out.print("Enter the percentage: ");
      double percentage = scanner.nextDouble();
      employee.salaryIncrease(percentage);
    }

    System.out.println("\nList of employees:");
    printList(employeesList);

    scanner.close();
  }
}