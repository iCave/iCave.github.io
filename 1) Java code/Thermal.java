
/**
 * Write a description of class Thermal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Thermal extends Sensors
{
    // instance variables - replace the example below with your own
    private int temperature;
    private int humidity;

    
    public Thermal(String name,String manifacturer,String access_lvl,int sensitivity)
    {
        super(name,manifacturer,access_lvl,sensitivity);
    }

}
