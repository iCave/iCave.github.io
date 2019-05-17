public class Energy
{
    private int electric_energy_cons;
    private int waters_cons;
    private int month_estimated_cost;
    private float curr_est_cost;
    
    //i add variables
    
    private String endofperiod_water; //date of expire
    private String endofperiod_energy;
    
    private double myvar;
    
    public Energy(int electric_energy_cons, int waters_cons, int month_estimated_cost, float curr_est_cost){
        this.electric_energy_cons = electric_energy_cons;
        this.waters_cons = waters_cons;
        this.month_estimated_cost = month_estimated_cost;
        this.curr_est_cost = curr_est_cost;
    }
    
    public void set_electric_energy_cons(int electric_energy_cons){
        this.electric_energy_cons = electric_energy_cons;
    }
    
    public int get_electric_energy_cons(){
        return electric_energy_cons;
    }
    
    public void set_waters_cons(int waters_cons){
        this.waters_cons = waters_cons;
    }
    
    public int get_waters_cons(){
        return waters_cons;
    }
    
    public void set_month_estimated_cost(int month_estimated_cost){
        this.month_estimated_cost = month_estimated_cost;
    }
    
    public int get_month_estimated_cost(){
        return month_estimated_cost;
    }
    
    public void set_curr_est_cost(float curr_est_cost){
        this.curr_est_cost = curr_est_cost;
    }
    
    public float get_curr_est_cost(){
        return curr_est_cost;
    }
    /*
    public String getBills(){
        return logariasmous;
    }*/
    
    public double estimateDebit(Device object){
        // i must calculate the consuption of all the devices (or per device(not clear yet)) 
        if (object.getConsumption()<=1600){ //antikeimeno apo klasi device gia na parw to consumption
             myvar = (object.getConsumption() * 0.17588) * 0.24;  
        }else if (object.getConsumption()>=1601 && object.getConsumption()<2000){
             myvar = (object.getConsumption() * 0.18518) * 0.24;
        }else if (object.getConsumption()>=2001){
             myvar = (object.getConsumption() * 0.21985) * 0.24;
        }
        return myvar;
    }
    /*
    public String energyInfo(){
        return polh_katalanwsh_suskeywn;
    }*/
    
    public void ConsuptionInfo(Device object){
        
        
    }
}
