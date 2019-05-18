
public class Smoke extends Sensors
{
    // instance variables - replace the example below with your own
    private boolean smoke;
    
    public Smoke(String name,String manifacturer,String access_lvl,int sensitivity)
    {
        super(name,manifacturer,access_lvl,sensitivity);
        smoke=false;
    }

}
