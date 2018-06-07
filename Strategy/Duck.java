public abstract class Duck{
    protected Quack quacks;
    protected Swim swiming;
    protected Fly flying;

    public void performQuack()
    {
        quacks.quack();
    }

    public void performSwim(){
        swiming.swim();
    }
    public void performFly(){
        flying.fly();
    }

}