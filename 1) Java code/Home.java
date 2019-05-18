import java.util.*;  

public class Home
{
    // instance variables - replace the example below with your own
    private int number_of_devices;
    private static int id = 0;
    private char name;
    private int number_of_users;
    private String address;
    private String map_coordinates;
   // private Users usr = new Users();
   //private Emergency=new Emergency();
    
    List<Device> my_devices = new ArrayList<Device>(); 
    
    public Home(char name,int number_of_users,String address,String map_coordinates)
    {
        id = id +1;
        this.name = name ;
        this.number_of_users = number_of_users;
        this.address = address;
        this.map_coordinates = map_coordinates;
    }    
       
	   
	   
	   
    public void DeleteDevice(int id)
    {
        my_devices.remove(id); 
    }
    
    public void Dev_add(Device d)
    {
        my_devices.add(d);
    }
	
	public void getDevList(int id)
    {
        System.out.println(my_devices); 
    }
	
	public void getHomeInfo(int id)
    {
        System.out.println("Home id "+id +"\nHome name: "+name+"\nAddress: "+address+"\n"); 
    }
	
	public void getHomeConditionds(int id)
    {
    }
	
	public void setHomeConditions(int id)
    {
    }
}
