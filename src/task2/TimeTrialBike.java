package task2;

public class TimeTrialBike extends RoadBike {
    private final int FRAME_MAT_CARBON = 1500;
    private final int FRAME_MAT_ALUMINUM = 500;
    
    @Override
    public int getFrameCost(){
        int cost;
        
        if(this.getFrameMaterial().equalsIgnoreCase("Carbon")){
            cost = FRAME_MAT_CARBON;
        }
        else{
            cost = FRAME_MAT_ALUMINUM;
        }
        
        return cost;
    }
}
