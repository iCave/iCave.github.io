import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
 
public class Device 
{
    // instance variables - replace the example below with your own
    private int id;
    private String access_lvl;
    private int time_of_use;
    private int timer;
    private float consumption;
    private String name;
    private String manifacturer;
    private String activity;
    private boolean on_off;
    private boolean damage;
    private ArrayList<Date> dates_of_use=new ArrayList<Date>();
    private String date_of_regist;   
    private static int count=0; //metraei stigmiotipa
    
    //trexousa hmerominia--->tin kanw string meta
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date dt= new Date();
    
    /**
     * Constructor 
     */
    public Device(){}
    public Device(String name,String manifacturer,String access_lvl)
    {
        // initialise instance variables
        id=count++;
        this.access_lvl=access_lvl;
        this.name=name;
        this.manifacturer=manifacturer;
        on_off=false;
        activity="OFF";
        damage=false;
        
        date_of_regist=dateFormat.format(dt);
    }

    /**
     * METHODS
     */
    public float getConsumption()
    { return consumption;}
    public void on_offDevice()
    {
        if (on_off==false)
        {
            on_off=true;
            activity="ON";
        }
        else
        {
            on_off=false;
            activity="OFF";
        }
        
    }
    
    
    public String getDevInfo()
    {
        //String strdate=dateFormat.format(date_of_regist);
        return "Device id: "+Integer.toString(id)+"\nDevice Name: "+name+"\nManifacturer: "+manifacturer+"\nActivity: "+activity+"\nRegistration Date: "+date_of_regist+"\n";                         
    }
    
    
    //public abstract void reset();
    
    
    public void timer()
    {
                
        TimerTask task = new TimerTask() 
        {
            public void run()
            {
                on_offDevice();
            }
        };   
        Timer timer = new Timer("Timer");
        long delay = 600L;
        timer.schedule(task, delay);
        try{
        Thread.sleep(delay * 2);
        }catch(InterruptedException e){}
        System.out.println("done");
    }
    
    public boolean checkDeviceProblem()
    {return damage;}
    
    public String autoRepair()
    {return "1.Turn Off the device. \n2.Plug out power adapter. \n3.Clean Device.\n";}
    
    
}
