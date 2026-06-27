package DecoratorPatternExample;
interface Notifier{
    void send();
}
class EmailNotifier implements Notifier{
    public void send(){
        System.out.println("sending email notification");
    }
}
abstract class NotifierDecorator implements Notifier{
    protected Notifier notify;
    public NotifierDecorator(Notifier notify){
        this.notify=notify;
    }
    public void send(){
        notify.send();
    }
}
class SMSNotifier extends NotifierDecorator{
    public SMSNotifier(Notifier notify){
        super(notify);
    }
    public void send(){
        super.send();
        System.out.println("sending SMS notification");
    }
}
class SlackNotifier extends NotifierDecorator{
    public SlackNotifier(Notifier notify){
        super(notify);
    }
    public void send(){
        super.send();
        System.out.println("sending Slack notification");
    }
}
public class DecoratorTest {
    public static void main(String args[]){
    Notifier notify=new SlackNotifier(new SMSNotifier(new EmailNotifier()));
    notify.send();
    
}
}
