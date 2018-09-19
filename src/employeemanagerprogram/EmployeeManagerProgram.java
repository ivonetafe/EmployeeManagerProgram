/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagerprogram;

/**
 * This is an Employee Manager program under source control.
 * @author 5002104
 */
public class EmployeeManagerProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager emp1 = new Manager("Bob", 123);
        //System.out.println(emp1.printDetails());
        
        Employee emp2 = new Employee("Charlie", 234);
        Employee emp3 = new Employee("Bell", 345);
        emp1.addEmployee(emp2);
        emp1.addEmployee(emp3);
        System.out.println(emp1.printDetails());
    }
    
}
