public class Lasagna {
  

    private int expectedTime = 40;
    private int remainingMinutes;
    private int preparationMinutes;
    private int totalTime;
    public int expectedMinutesInOven(){
        return this.expectedTime;
    }
   
    public int remainingMinutesInOven(int x){
        return expectedMinutesInOven()-x;
    }

  

    public int preparationTimeInMinutes(int x){
        return x*2;
    }

  
    public int totalTimeInMinutes(int x, int y){
        return y+preparationTimeInMinutes(x);
        
    }
}
