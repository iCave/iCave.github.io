public class Lights extends Device
{
    private int brightness;
    private boolean color;
    private int rgb;
    

    
    public Lights(String name,String manifacturer,String access_lvl,int brightness,int rgb,boolean color)
    {
        super(name,manifacturer,access_lvl);
        this.brightness=brightness;
        this.rgb=rgb;
        this.color=color;
    }

    
    public void setBrightness(int brightness)
    {
        this.brightness=brightness;
    }
    public void setColor(int rgb)
    {
        this.rgb=rgb;
    }
}
