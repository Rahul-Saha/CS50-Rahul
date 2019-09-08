import java.util.List;
import java.util.ArrayList;
public class Catalog {
    List<Products> catalog=new ArrayList<>();
    public Catalog() {
        catalog.add(0, new Products("Jeans",1499,10));
        catalog.add(1, new Products("Shirt",999,10));
        catalog.add(2, new Products("Shoe",799,10));
        catalog.add(3, new Products("Belt",399,10));
        catalog.add(4, new Products("Sunglass",499,10));
        catalog.add(5, new Products("Wallet",399,10));
    }
    void showCatalog() {
        for(int i=0;i<catalog.size();i++){
            System.out.println(i+". "+catalog.get(i));
        }
    }
}