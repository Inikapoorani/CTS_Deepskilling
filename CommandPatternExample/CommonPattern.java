package CommandPatternExample;
interface Command{
    void execute();
}
class Light{
    public void turnOn(){
        System.out.println("Light is turned on");
    }
    public void turnOff(){
        System.out.println("Light is turned off");
    }
}
class LightOnCommand implements Command{
    private Light light;
    public LightOnCommand(Light light){
        this.light=light;
    }
    public void execute(){
        light.turnOn();
    }
}
class LightOffCommand implements Command{
    private Light light;
    public LightOffCommand(Light light){
        this.light=light;
    }
    public void execute(){
        light.turnOff();
    }
}
class RemoteControl{
    private Command command;
    public void setCommand(Command command){
        this.command=command;
    }
    public void pressButton(){
        command.execute();
    }
}
public class CommonPattern {
    public static void main(String args[]){
        Light light=new Light();
        Command lightOn=new LightOnCommand(light);
        Command lightOff=new LightOffCommand(light);
        RemoteControl rc=new RemoteControl();
        rc.setCommand(lightOn);
        rc.pressButton();
        rc.setCommand(lightOff);
        rc.pressButton();
    }
    
}
