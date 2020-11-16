package _1_strategy_duck;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("飛べません");
    }
}
