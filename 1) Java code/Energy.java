public class Energy
{
    private int electric_energy_cons;
    private int waters_cons;
    private int month_estimated_cost;
    private float curr_est_cost;
    
        
    public Energy(int electric_energy_cons, int waters_cons, int month_estimated_cost, float curr_est_cost){
        this.electric_energy_cons = electric_energy_cons;
        this.waters_cons = waters_cons;
        this.month_estimated_cost = month_estimated_cost;
        this.curr_est_cost = curr_est_cost;
    }
        
    /*
    public String getBills(){
        return logariasmous;
    }*/
    
    public double estimateDebit(Device object){
        
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
