/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Orders;



import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HotelDirectory {
    private ArrayList<HotelOrder> orderLists;
    private String status;
    private int id;
    private static int count = 1;
    private Boolean isAccept;
    private String comment;    
    private String feedbackComment;

    public String getFeedbackComment() {
        return feedbackComment;
    }

    public void setFeedbackComment(String feedbackComment) {
        this.feedbackComment = feedbackComment;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    private UserAccount customerDetails;


    public UserAccount getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(UserAccount customerDetails) {
        this.customerDetails = customerDetails;
    }



    public Boolean getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(Boolean isAccept) {
        this.isAccept = isAccept;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public HotelDirectory() {
        id = count;
        count++;
        orderLists = new ArrayList();
        status = "Placed";
        comment = "";        
        feedbackComment = "";
        isAccept = false;
    }

    public ArrayList<HotelOrder> getOrderList() {
        return orderLists;
    }

    public void deleteOrder(String name) {
        for (int i = 0; i < orderLists.size(); i++) {
            if (orderLists.get(i).getItem().equals(name)) {
                orderLists.remove(i);
                return;
            }
        }
    }

    public void deleteOrderAll() {
        for (int i = 0; i < orderLists.size(); i++) {
            orderLists.remove(i);
        }
    }

    public HotelOrder createOrder(String item, String price, String quantity, UserAccount user) {
        HotelOrder order = new HotelOrder();
        order.setItem(item);
        order.setPrice(price);
        order.setQuantity(quantity);
        customerDetails = user;
        orderLists.add(order);
        System.out.print("Order");
        return order;
    }
}
