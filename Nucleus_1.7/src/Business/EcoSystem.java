/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;



import Business.Grocery.GroceryDirectory;
import java.util.ArrayList;
import javax.management.relation.Role;

/**
 *
 * @author admin
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private GroceryDirectory groceryDirectory;


    public EcoSystem(GroceryDirectory groceryDirectory) {
        this.groceryDirectory = groceryDirectory;
        
    }
    
    
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        return roleList;
    }
    private EcoSystem(){
        super(null);
    }

    
    public boolean checkIfUserIsUnique(String userName){
       return false;
    }
}
