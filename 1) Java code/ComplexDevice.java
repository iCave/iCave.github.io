
/**
 * Write a description of class ComplexDevice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ComplexDevice extends Device
{
    private float temprature;
    private int volume;
     

    /**
     * Constructor for objects of class ComplexDevice
     */
    public ComplexDevice(String name,String manifacturer,String access_lvl,float temprature,int volume)
    {
        super(name,manifacturer,access_lvl);
        this.temprature=temprature;
        this.volume=volume;
        
    }


    
}
