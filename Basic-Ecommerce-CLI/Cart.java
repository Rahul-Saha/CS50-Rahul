import java.util.*;
import java.util.ArrayList;
import java.rmi.activation.*;
public class Cart {
    public double amount=0.0;
    Scanner inp=new Scanner(System.in);
    Catalog c=new Catalog();
    ArrayList<Products> cart=new ArrayList<Products>();
    void addToCart(){
        System.out.print("\nEnter your choice : ");
        int choice=inp.nextInt();
        
        if(choice>=0 && choice <6){
            System.out.print("Enter Quantity : ");
            int quantity=inp.nextInt();
            cart.add(new Products(c.catalog.get(choice).itemName,c.catalog.get(choice).itemPrice,quantity));
        }
        else{
            System.out.println("Invalid Choice");
        }
        
    }
    void showCart() {
        System.out.println("\n\t\t\t\t ****** CART ****** \n");
        if(cart.isEmpty()==true){
            System.out.println("\t\t Your Cart Is Empty !\n");
        }
        else{
            
            for(Products p : cart){
                System.out.println(p);
            }

        }  
    }
    void checkout() {
        if(cart.isEmpty()==false){
            for(int i=0;i<cart.size();i++){
                amount += cart.get(i).itemPrice * cart.get(i).quantity;
            }
            showCart();
            System.out.println("\n\t Total Amount : "+amount);
            System.out.println("\n\t\t *** Thank You ***\n\n");
            amount=0.0;
            cart.clear();
        }
        else {
            System.out.println("\n\t\t Your cart is Empty !!!\n\n");
        }
    }
}