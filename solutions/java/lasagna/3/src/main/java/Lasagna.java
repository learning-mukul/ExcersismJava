public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method

    private int expectedTime = 40;
    private int remainingMinutes;
    private int preparationMinutes;
    private int totalTime;
    public int expectedMinutesInOven(){
        return this.expectedTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int x){
        return expectedMinutesInOven()-x;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int x){
        return x*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int x, int y){
        return y+preparationTimeInMinutes(x);
        
    }
}
