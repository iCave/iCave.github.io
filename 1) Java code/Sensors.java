public class Sensors extends Device
{
    // instance variables - replace the example below with your own
    private static int sensor_no;
    private int sensitivity;

    /**
     * Constructor for objects of class Sensors
     */
    public Sensors(String name,String manifacturer,String access_lvl,int sensitivity)
    {
        super(name,manifacturer,access_lvl);
        sensor_no++;
        this.sensitivity=sensitivity;
    }

    
    public void setSensitivity(int sensitivity)
    {
        this.sensitivity=sensitivity;
    }
}
