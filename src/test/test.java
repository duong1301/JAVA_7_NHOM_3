/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import entities.*;

/**
 *
 * @author LA
 */
public class test {
    public static void main(String[] args) {
        ParkingLot pl = new ParkingLot();
        pl.addEmployee(new Employee("001","Nguyen Van A","0987654321"));
        pl.addEmployee(new Employee("002","Nguyen Van B","0987654322"));
        pl.addEmployee(new Employee("003","Nguyen Van C","0987654323"));
        pl.addEmployee(new Employee("004","Nguyen Van D","0987654324"));
        
        pl.displayEmployees();
    }
    
}
