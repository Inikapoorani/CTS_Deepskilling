package DataStructuresandAlgorithms.InventoryManagementSystem;
import java.util.*;
public class Product{
    String productName;
    int productId;;
    int quantity;
    double price;
    HashMap<Integer,Product> proMap=new HashMap<Integer,Product>();
    public Product(int productId,String productName,int quantity,double price){
        this.productId=productId;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }
    public void AddPro(int productId,String productName,int quantity,double price){
        proMap.put(productId,new Product(productId,productName,quantity,price));
    }
    public void DeletePro(int productId){
        proMap.remove(productId);
    }
    public void UpdatePro(int productId,String productName,int quantity,double price){
        proMap.put(productId,new Product(productId,productName,quantity,price));
    }
}
class InventoryManagement {
    public static void main(String[] args) {
        Product pro = new Product(1, "Laptop", 10, 45000);
        pro.AddPro(2, "Mobile", 20, 15000);
        pro.UpdatePro(1, "Laptop", 15, 44000);  
        pro.DeletePro(2);
}
}
