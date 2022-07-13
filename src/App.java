/*
 *  Course 3 - Module 1 hands on activity
 *  @author JovelynRegonay
 *  @Description :  A program that calculate and print the weekly payroll of a company that has three types of employees
 *                  which is hourly, salaried, and salaried with commision.
 *  
 *  Created Date : 05/26//2022			   
 *  @modified by JovelynRegonay
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Employee> employees = new ArrayList<>(); // arraylist that serves as storage of the object employee.
        int numOfEmployees = 0;
        int employeeChoice;

        Scanner sc = new Scanner(System.in);

        try { // catches exeptions

            System.out.print("Number of employees: ");

            numOfEmployees = sc.nextInt(); // gets the value of numOfEmployees from user.

            for (int i = 1; i <= numOfEmployees; i++) { // loops until the number of employees reached.

                Employee e = null; // nulls the employee in every loop

                System.out.println("PROFILE FOR EMPLOYEE #" + i + " :");
                System.out.println("type Hourly (1), Salaried (2), Salaried plus Commission (3)");
                System.out.print("Enter 1, 2, or 3 ==>");

                employeeChoice = sc.nextInt(); // gets the value of employeeChoice from the user.

                if (employeeChoice == 1) {
                    e = new Hourly(); // instantiation of object.

                } else if (employeeChoice == 2) {
                    e = new Salaried(); // instantiation of object.

                } else if (employeeChoice == 3) {
                    e = new SalariedPlusCommission(); // instantiation of object.
                }
                e.load(); // calling method load
                employees.add(e);// added employees to arraylist.
            }
            for (int i = 0; i < employees.size(); i++) { // loops until employees.size reached.
                System.out.println(employees.get(i)); // prints the values inside arraylist.
                System.out.println();
            }

            System.out.println();

        }

        catch (Exception e) {
            System.out.println("Invalid Input!");
        }
        sc.close();
    }

}
