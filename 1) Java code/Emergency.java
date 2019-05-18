
public class Emergency
{
    // instance variables 
    private String address;
	private String contact;
	private static int emergency_id=0;

    
    public Emergency(String addr,String cont)
    {
        address=addr;
		contact=cont;
		emergency_id++;
    }

    
	
    public boolean isFire()
    {
        
    }
	
	public boolean isInjury()
    {
        
    }
	
	public boolean isTheft()
    {
        
    }
	
	public void callFireDpt()
    {
        
    }
	
	public void callHospital()
    {
        
    }
	
	public void callPolice()
    {
        
    }
}
