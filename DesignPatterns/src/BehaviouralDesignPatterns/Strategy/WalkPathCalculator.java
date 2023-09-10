package BehaviouralDesignPatterns.Strategy;

public class WalkPathCalculator implements PathCalculator{
    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Path calculated on Bike from : " + source + " to " + destination );
    }
}
