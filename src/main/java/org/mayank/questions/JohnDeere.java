package org.mayank.questions;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class JohnDeere {

    public static void main(String[] args) {


     /*
     Write a Java program that processes a list of Employee objects. Each Employee has an id, name, and salary. Perform the following tasks:
        1. Use java 8 feature to find an employee by id and print their name if present, otherwise throw an exception.
        2. Use Stream to filter employees with a salary greater than 50,000, map their names to a list, and collect the names into a List<String>.
        3. Use a lambda expression to sort the employees by their salary in descending order.
     */


    //        try {
//            Employee findEmployee = findById(5, employeeList);
//            if(findEmployee != null) {
//                System.out.println(findEmployee);
//            } else {
//                throw new Exception("The given id does not exist");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    List<Employee> employeeList = new ArrayList<>();
    Employee employee1 = new Employee(1, "Employee " + 1, 24, "IT", 500);
    Employee employee2 = new Employee(2, "Employee " + 2, 25, "IT", 600);
    Employee employee3 = new Employee(3, "Employee " + 3, 26, "HR", 700);
    Employee employee4 = new Employee(4, "Employee " + 4, 27, "HR", 800);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

         /*
        You have a list of Employee objects, each with attributes name, age, department, and salary. Write a Java Streams API code to:

1.Group these employees by their department. Output: [IT={Emplouee1, employee2}

2.Find the employee with the highest salary in each department.

         */

        Map<String, List<Employee>> groupByDepartment = new HashMap<>();
        for(Employee employee : employeeList) {
            if(groupByDepartment.containsKey(employee.getDepartment())) {
                List<Employee> listOfEmployees = groupByDepartment.get(employee.getDepartment());
                listOfEmployees.add(employee);
                groupByDepartment.put(employee.getDepartment(), listOfEmployees);
            } else {
                List<Employee> listOfEmployees = new ArrayList<>();
                listOfEmployees.add(employee);
                groupByDepartment.put(employee.getDepartment(), listOfEmployees);
            }
        }

        System.out.println(groupByDepartment);

        Map<String, Employee> deptGroupByMaxSal = new HashMap<>();
        for(List<Employee> employeeByDept : groupByDepartment.values()) {

            double maxSalary = 0;
            Employee employeeWithMaxSal = null;
            for(Employee emp : employeeByDept) {
                if(maxSalary < emp.getSalary()) {
                    maxSalary = emp.getSalary();
                    employeeWithMaxSal = emp;
                }
            }
            deptGroupByMaxSal.put(employeeWithMaxSal.getDepartment(), employeeWithMaxSal);
        }

        System.out.println(deptGroupByMaxSal);

    }

    public static Employee findById(int id, List<Employee> employeeList) {
        for(Employee employee : employeeList) {
            if(employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

}


class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(int id, String name, int age, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
customer
name | city | country
Abhi | Mumbai | India
Sonu | Mumbai | India
Sachin | Pune | India
Sehwag | New York | US

Mumbai | 2
Pune | 1

select city, count(*) as count from customer where country = 'India' groupby city orderby count desc;
 */