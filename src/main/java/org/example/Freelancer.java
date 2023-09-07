package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Freelancer extends Employee {

    private Freelancer(String surname,String name,double salary)
    {
        super(surname,name,salary);

    }
    private Freelancer(String surname,String name)
    {
        super(surname,name);

    }

    public static Freelancer getInstans(){

        return new Freelancer(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)]);
    }

    public static List<Employee> getInstans3(int count){
        List<Employee> freelancers=new ArrayList<>();
        for (int i=0;i<count;i++)
            freelancers.add(getInstans());
        return freelancers;
    }
    @Override
    public  double calculateSalary() {

        return   super.salary=20.8 * 8 * random.nextInt(500,800);
    }

    @Override
    public String toString() {
        return "Freelancer  " + name +"  " + surname  +"  " +
                " среднемесячная заработная плата составляет  =" + calculateSalary() +
                '\n';
    }


}
