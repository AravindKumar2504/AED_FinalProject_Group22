/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.Orders.OrderDirectory;
import Business.Orders.HotelDirectory;
import Business.Grocery.GroceryDirectory;
import Business.GroceryManager.GroceryManagerDirectory;
import Business.Hotel.Hotel_Directory;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private GroceryDirectory groceryDirectory;
    private CustomerDirectory customerDirectory;
    private GroceryManagerDirectory groceryManagerDirectory; 
    private OrderDirectory orderDirectory;
    private Hotel_Directory hotel_Directory;
    private HotelDirectory hotelDirectory;


    public EcoSystem(HotelDirectory hotelDirectory,GroceryDirectory groceryDirectory, OrderDirectory orderDirectory, Hotel_Directory hotel_Directory, CustomerDirectory customerDirectory, GroceryManagerDirectory groceryManagerDirectory) {
        this.groceryDirectory = groceryDirectory;
        this.customerDirectory = customerDirectory;
        this.groceryManagerDirectory = groceryManagerDirectory;
        this.orderDirectory = orderDirectory;
        this.hotelDirectory = hotelDirectory;
        this.hotel_Directory = hotel_Directory;
    }
    
    
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    

    private EcoSystem(){
        super(null);
    }

    
    public boolean checkIfUserIsUnique(String userName){
       return false;
    }
}
