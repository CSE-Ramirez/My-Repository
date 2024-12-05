//Christian Ramirez

public class TimeException extends Exception{

    public TimeException() 
    {
        super("Invalid time entered. Try Again Please!");
    }

    // Parameterized constructor
    
    public TimeException(String msg) 
    {
        super(msg);
    }
}
