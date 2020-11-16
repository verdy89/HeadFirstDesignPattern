package _1_strategy_duck;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<沈黙>>");
    }
}
