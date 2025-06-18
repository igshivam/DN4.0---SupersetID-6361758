public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Trying to initialize the singleton instance...");
        Logger logger = Logger.getInstance();
        System.out.println("Singleton instance initialized: " + logger);
            /*Logger self = new Logger();
            System.out.println("Logger value: "+ self);*/
        Logger Logger1 = Logger.getInstance();
        Logger Logger2 = Logger.getInstance();
        if (logger == Logger1 && logger == Logger2){
            System.out.println("Only one instance of Logger is created.");
        } else {
            System.out.println("Logger instances are different.");
        }
    }
}
