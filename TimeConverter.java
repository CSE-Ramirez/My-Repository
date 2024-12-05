//Christian Ramirez 

public class TimeConverter 
{
    // Instance variables
    private int hours;
    private int minutes;
    private int seconds;
    private boolean notPM; 

    // Default constructor
    public TimeConverter() 
    {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.notPM = true; 
    }

    // Parameterized constructor
    
    public TimeConverter(int xHours, int xMinutes, int xSeconds) throws TimeException 
    {
        this.setHours(xHours);
        this.setMinutes(xMinutes);
        this.setSeconds(xSeconds);
        this.notPM = true;
    }

    // Accessors 
    
    public int getHours() 
    {
        return hours;
    }

    public int getMinutes()
    {
        return minutes;
    }

    public int getSeconds()
    {
        return seconds;
    }

    public boolean getIsNotPM() 
    {
        return notPM;
    }

    // Mutators 
    
    public void setHours(int xHours) throws TimeException 
    {
        if (xHours < 0 || xHours > 23) 
        {
            throw new TimeException("Invalid hour value. Hours must be between 0 and 23.");
        }
        this.hours = xHours;
    }

    public void setMinutes(int xMinutes) throws TimeException
    {
        if (xMinutes < 0 || xMinutes > 59) 
        {
            throw new TimeException("Invalid minute value. Minutes must be between 0 and 59.");
        }
        this.minutes = xMinutes;
    }

    public void setSeconds(int xSeconds) throws TimeException {
        if (xSeconds < 0 || xSeconds > 59) {
            throw new TimeException("Invalid second value. Seconds must be between 0 and 59.");
        }
        this.seconds = xSeconds;
    }

    //changing time to normal time
    
    public void updateTime(int xHours, int xMinutes, int xSeconds) throws TimeException
    {
        setHours(xHours);
        setMinutes(xMinutes);
        setSeconds(xSeconds);

        //converting time
        
        // Converting time
        if (this.hours == 0) 
        {
            this.hours = 12;
            notPM = true;
        } else if (this.hours > 12) 
        {
            this.hours = this.hours - 12;
            notPM = false;
        } else if (this.hours == 12)
        {
            notPM = false;
        } else 
        {
            notPM = true;
        }
    }

    
    public void updateTime(String UpdatedTime) throws TimeException 
    {
        try 
        {
            String[] Time = UpdatedTime.split(":");
            int hours = Integer.parseInt(Time[0]);
            int minutes = Integer.parseInt(Time[1]);
            int seconds = Integer.parseInt(Time[2]);

            updateTime(hours, minutes, seconds);
        }
        catch (TimeException t) 
        {
            throw new TimeException("Invalid time entered! Try Again!");
        }
    }

    //Show the time in 12 hour time
    
    
    public void displayTime()
    {
    	String AMPM;
    	if (notPM)
    	{
    		AMPM = "AM";
    	}
    	else
    	{
    		AMPM = "PM"; 		
    	}
    	
        System.out.println((hours +":"+ minutes + ":" + seconds + AMPM));
    }

}

