package sub;

import java.util.*;
import java.util.stream.Collectors;

public class Hello {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, 36, "Badal", 80000));
        empList.add(new Employee(2, 25, "Akash", 70000));
        empList.add(new Employee(3, 26, "Satish", 65000));
        empList.add(new Employee(4, 30, "Manas", 60000));
        empList.add(new Employee(5, 31, "Raja", 50000));
        empList.add(new Employee(6, 32, "Mala", 55000));
        empList.add(new Employee(7, 23, "Paresh", 45000));
        empList.add(new Employee(8, 22, "Samar", 90000));

        // Increase salary by 5000 for employees older than 25
//         empList.stream()
//                .filter(e -> e.getAge() > 25)
//        .forEach(e -> e.setSalary(e.getSalary() + 5000));

        // Filter and print only those employees whose salaries were increased

//        List<Employee>increasedSalariedEmployees = empList.stream()
//                .filter(e -> e.getAge() > 25)
//                .collect(Collectors.toList());
        System.out.println(empList);



//        List<Employee> incrementedEmployees = empList.stream().filter(n -> n.getAge() > 25)
//                .peek(n -> n.setSalary((int) ( n.getSalary() * 1.10))).collect(Collectors.toList());
//
//        System.out.println(incrementedEmployees);
        List<Employee> increasedSalariedEmployees = incrementedEmployees(empList);
        increasedSalariedEmployees.forEach(System.out::println);
    }
    public static List<Employee> incrementedEmployees(List<Employee> employees){
        return employees.stream().filter(n->n.getAge()>25)
                .map(n-> {
                    n.setSalary((int) (n.getSalary() *1.10));
        return n;
                }).collect(Collectors.toList());
   }
}
