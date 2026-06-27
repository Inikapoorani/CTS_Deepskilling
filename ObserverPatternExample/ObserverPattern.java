package ObserverPatternExample;
import java.util.*;
interface Observer{
    void update(String stockName,double price);
}
interface Stock{
    void register(Observer ob);
    void deregister(Observer ob);
    void notifyOb();
}

class StockMarket implements Stock{
    private ArrayList<Observer> obs=new ArrayList<>();
    private String stockName;
    private double price;
    public void register(Observer ob){
        obs.add(ob);// Implementation for registering observer
    }
    public void deregister(Observer ob){
        obs.remove(ob);// Implementation for deregistering observer
    }
    public void notifyOb(){
        for(int i=0;i<obs.size();i++){
            obs.get(i).update(stockName,price);// Implementation for notifying observers
    }
}
    public void setStockPrice(String stockName,double price){
        this.stockName=stockName;
        this.price=price;
        notifyOb();
    }
}
class MobileApp implements Observer{
    public void update(String stockName,double price){
        System.out.println("Mobile App: Stock "+stockName+" has new price "+price);
    }
}
class WebApp implements Observer{
    public void update(String stockName,double price){
        System.out.println("Web App: Stock "+stockName+" has new price "+price);
    }
}
class ObserverPattern{
    public static void main(String args[]){
        StockMarket sm=new StockMarket();
        MobileApp mob=new MobileApp();
        WebApp web=new WebApp();
        sm.register(mob);
        sm.register(web);
        sm.setStockPrice("CTS",1500.0);
        sm.setStockPrice("Google",2800.0);
    }
    
}
