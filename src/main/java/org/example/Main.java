package org.example;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> workers=Worker.getInstans2(3);
        for(Employee employee:workers){
            System.out.println(employee);
        }
        Collections.sort(workers);
        for(Employee employee:workers){
            System.out.println(employee);
        }

        List<Employee> free=Freelancer.getInstans3(5);
        for(Employee employee:free){
            System.out.println(employee);
        }
        Collections.sort(free, new NewComparator());
        for (Employee employee: free) {
            System.out.println(employee);
        }

    }

}