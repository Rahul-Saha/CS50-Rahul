public class Products {
    String itemName;
    double itemPrice;
    int quantity;
    Products(String itemName,double itemPrice,int quantity){
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.quantity=quantity;
    }
    public String toString() {
        return "Item : "+itemName+"\t\tPrice : "+itemPrice+"\t\t Quantity : "+quantity;
    }
}