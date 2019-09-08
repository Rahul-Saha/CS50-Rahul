import java.util.*;
public class ECommerce {
    public static void main(String[] args) {
        Catalog cat=new Catalog();
        Cart cart=new Cart();
        Scanner inp=new Scanner(System.in);
        int x;
        int choice=0;
        do{
            System.out.println("\n\n\t\t\t$$$ MY BAZAAR $$$");    
            System.out.println("\n\n 1.View Products\n 2.Cart\n 3.Checkout\n 4.Exit\n");
            System.out.print("\nEnter your choice : ");
            choice=inp.nextInt();
            switch(choice) {
                case 1: System.out.println("\n\t\t\t*** Our Products *** \n");
                        cat.showCatalog();
                        cart.addToCart();
                        break;
                case 2: cart.showCart();
                        break;
                case 3: cart.checkout();
                        break;
                case 4: System.out.println("\n\t\t\t Thank You For Shopping !");
                        System.exit(0);
                default: System.out.println("\nInvalid Choice !!!");
                         break;
            }
            System.out.println("\nPress 1 to continue / Press 0 to exit : ");
			x=inp.nextInt();
        }while(x==1);
    }
}