package org.lld.FactoryDesignPattern;

public class Client {
    public static void main(String [] args){
        /**
         * Here we test how factory design pattern works
         * basically when client has to create objects on his own by calling the constructor
         * of the class, we can prevent this through factory design pattern
         * client can pass only a parameter and the factory class will return the object of the
         * desired type
         *
         * Lets say we have an interface Employee and 2 types of employees BE dev and FE dev
         * now client can get both these objects through
         * Employee employee1 = new BackendDeveloper();
         * Employee employee2 = new FrontendDeveloper();
         * to prevent the client from using new keyword and adding some abstraction we introduce
         * a new layer in between called factory(EmployeeFactory) class
         *
         */

        Employee employee1 = EmployeeFactory.getEmployee("Backend Developer");
        Employee employee2 = EmployeeFactory.getEmployee("Frontend Developer");

        System.out.println(employee1.getSalary());
        System.out.println(employee2.getSalary());
    }
}
