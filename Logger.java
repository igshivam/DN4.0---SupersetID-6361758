public class Logger {
    private static Logger instance;
    private Logger(){
        // Private constructor to prevent instantiation from outside
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

}
