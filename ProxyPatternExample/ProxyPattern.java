package ProxyPatternExample;
interface Image{
    void display();
}
class RealImage implements Image{
    public RealImage(String filename){
        loadFromServer(filename);
        
    }
    public void loadFromServer(String filename){
        System.out.println("loading image from server "+filename);
    }
    public void display(){
        System.out.println("displaying image");
    }
}
class ProxyImage implements Image{
    RealImage realimg;
    String filename;
    public ProxyImage(String filename){
        this.filename=filename;
    }
    public void display(){
        if(realimg==null){
            realimg=new RealImage(filename);
            realimg.display();
        }
    }
}
public class ProxyPattern{
    public static void main(String args[]){
        Image img=new ProxyImage("image1.jpg");
        img.display();
        System.out.println(" ");
        img.display();
    }
    
}
