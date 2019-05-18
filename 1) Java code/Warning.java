public class Warning
{
    // instance variables
    private String message;
	private boolean mute;

    
    public Warning(String msg,boolean mt)
    {
        message=msg;
		mute=mt;
    }

    
    public void printWarning()
    {
        System.out.println(message);
    }
	
	public void showWarningsList()
    {
        
    }
	
	public void DeleteWarning()
    {
        
    }
	
}
