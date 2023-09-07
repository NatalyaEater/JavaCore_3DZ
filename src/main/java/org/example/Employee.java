package org.example;

import java.util.Comparator;
import java.util.Random;

public abstract class Employee implements Comparable<Employee>  {
    protected static Random random=new Random();
    protected static String[] names=new String[]{"Содик","Карол", "Амантур","Халип","Филиб","Вася","Петя", "Антон",};
    protected static String[] surnames=new String[]{"Петров","Совков", "Конь","Лизин","Умаров","Васнецов","Ульин", "Амаров",};

    private static int counter=1000;
    private int id;

    protected String name;
    protected String surname;
    protected double salary;



    {
        id=++counter;
    }
    protected Employee(){

    }
    protected Employee(String surname,String name,double salary){
        if (salary<30000){
            throw new RuntimeException("Уровень зп должен быть не менее 30000");
        }
        this.surname = surname;
        this.name=name;
        this.salary=salary;
    }

    protected Employee(String surname,String name){
        this.surname = surname;
        this.name=name;
    }


    /*расчет среднемесячной зп*/
    public abstract double calculateSalary();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        if (salary<30000){
            throw new RuntimeException("Уровень зп должен быть не менее 30000");
            }
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name  +"  " +
                ", surname='" + surname  +"  " +
                ", salary=" + salary +
                '}';
    }
    @Override
    public int compareTo(Employee o) {
        return Double.compare(calculateSalary(), o.calculateSalary());
    }

}
