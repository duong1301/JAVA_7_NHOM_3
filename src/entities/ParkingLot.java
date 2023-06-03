/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author LA
 */
public class ParkingLot {
    String id;
    String name;
    Map<String, Employee> employees = new HashMap<String, Employee>();
    
    public void addEmployee(Employee e){
        employees.put(e.id, e);
    }
    
    public void displayEmployees(){
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            Object key = entry.getKey();
            Employee val = entry.getValue();
            System.out.println(""+key + "|" + val.toString());
            
        }
    }
}
