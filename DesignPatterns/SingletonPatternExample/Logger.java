class Logger{
    private static Logger instance;
    private Logger(){
System.out.println("Logger class initialized");
    }
    public static Logger getInstance(){
        if(instance==null){
            instance=new Logger();
        }
        return instance;
    }

    }
class SingletonTest{
    public static void main(String args[]){
        Logger obj1=Logger.getInstance();
        Logger obj2=Logger.getInstance();
        if(obj1==obj2){
            System.out.println("One instances exists");
        }
        else{
            System.out.println("Two instances exists");
        }

    }
}
