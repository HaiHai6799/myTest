/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Hai
 */
public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private int salary;
    public Employee(){
        
    }

    public Employee(int id, String lastName, String firstName, int salary) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getSalary() {
        return salary;
    }
    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnuaSalary(){
        return this.salary*12;
    }
    public int raiseSalary(int percent){
        return this.salary*(1+percent);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", salary=" + salary + '}';
    }
    
    
}
