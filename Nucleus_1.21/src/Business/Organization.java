/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.CustomerDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Orders.OrderDirectory;
import Business.Orders.HotelDirectory;
import Business.Grocery.GroceryDirectory;
import Business.GroceryManager.GroceryManagerDirectory;
import Business.Hotel.Hotel_Directory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import Business.createNetwork;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;    
    private GroceryDirectory groceryDirectory;    
    private CustomerDirectory customerDirectory;
    private UserAccountDirectory userAccountDirectory;
    private createNetwork createNetwork;
    private int organizationID;
    private static int counter=0;
    private GroceryManagerDirectory groceryManagerDirectory;
    private HotelDirectory hotelDirectory;
    private Hotel_Directory hotel_Directory;
    private OrderDirectory orderDirectory;
    
    public enum Type{
        CovidCare("CovidCare Organization"),
        HotelAdmin("HotelAdmin"),
        GroceryAdmin("GroceryAdmin"),
        MaidAdmin("MaidAdmin"),
        HospitalAdmin("HospitalAdmin"),
        Customer("Customer"),
        Legal("LegalAdmin"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        createNetwork = new createNetwork();
        groceryDirectory = new GroceryDirectory();
        hotelDirectory = new HotelDirectory();
        hotel_Directory = new Hotel_Directory();
        customerDirectory = new CustomerDirectory();
        groceryManagerDirectory = new GroceryManagerDirectory();
        orderDirectory = new OrderDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        System.out.println("organization..");
    }



    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public HotelDirectory getHotelDirectory() {
        return hotelDirectory;
    }


    
    public GroceryDirectory getGroceryDirectory() {
        return groceryDirectory;
    }
    
    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
    

    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public createNetwork getcreateNetwork() {
        return createNetwork;
    }
    
    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public GroceryManagerDirectory getGroceryManagerDirectory() {
        return groceryManagerDirectory;
    }
    
    public Hotel_Directory getHotel_Directory() {
        return hotel_Directory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
