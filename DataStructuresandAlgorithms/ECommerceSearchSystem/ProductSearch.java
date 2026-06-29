package DataStructuresandAlgorithms.ECommerceSearchSystem;

public class ProductSearch{
    String productName;
    int productId;
    String category;
    public ProductSearch(String productName, int productId, String category) {
        this.productName = productName;
        this.productId = productId;
        this.category = category;
    }
    public void linearSearch(int pid, ProductSearch[] p) {
        boolean found = false;
        for (int i = 0; i < p.length; i++) {
            if (p[i].productId == pid) {
                p[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found");
        }
    }
    public void BinarySearch(int pid, ProductSearch[] p) {
        int start=0;
        int end=p.length - 1;
        boolean found=false;
        while (start <= end) {
            int mid=(start+end)/2;
            if (p[mid].productId==pid) {
                p[mid].display();
                found=true;
                break;
            } 
            else if (p[mid].productId > pid) {
                end=mid-1;
            } 
            else {
                start = mid+1;
            }
        }
        if (!found) {
            System.out.println("Product not found");
        }
    }
    public void display() {
        System.out.println("Product Name: " + productName +", Product ID: " + productId +", Category: " + category);
    }
}
class Product {
    public static void main(String[] args) {
        ProductSearch p1=new ProductSearch("Shirt",101,"Clothing");
        ProductSearch p2=new ProductSearch("Book",102,"Books");
        ProductSearch p3=new ProductSearch("Laptop", 103, "Electronics");
        ProductSearch p4=new ProductSearch("Shoes", 104, "Footwear");
        ProductSearch p5=new ProductSearch("Headphones", 105, "Electronics");
        ProductSearch[] p={p1, p2, p3, p4, p5};
        System.out.println("Linear Search:");
        p1.linearSearch(105, p);
        System.out.println("\nBinary Search:");
        p1.BinarySearch(101, p);
    }
}