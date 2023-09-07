package org.example;

import java.util.ArrayList;
import java.util.List;

public class Worker extends Employee{

    private Worker(String surname,String name,double salary)
    {
        super(surname,name,salary);
    }
    public static Employee getInstans(){
        return new Worker(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                random.nextInt(30000,100000));
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
    public static List<Employee> getInstans2(int count){
        List<Employee> workers=new ArrayList<>();
        for (int i=0;i<count;i++)
            workers.add(getInstans());
        return workers;
    }

    @Override
    public String toString() {
        return "Worker " + name + "  " + surname + "  " +
                " фиксированная заработная плата составляет  =" + salary +
                '\n';
    }
}
