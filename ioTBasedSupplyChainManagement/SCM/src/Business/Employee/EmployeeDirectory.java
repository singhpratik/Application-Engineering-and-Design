/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class EmployeeDirectory {
       private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name,String email,String add){
        
        Employee employee = new Employee();
        employee.setName(name);
        employee.setEmailAddress(email);
        employee.setAddress(add);
        employeeList.add(employee);
        return employee;
    }
}
