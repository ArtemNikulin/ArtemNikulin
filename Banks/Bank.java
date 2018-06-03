public abstract class Bank {
    protected String name;
    protected float depositPerc;
    protected float withdraw;
    protected float deposit;

    protected float Add(float add, float percent){
        float result;
        result = (float) (Math.pow((float)(1+(percent/100)),5) * add);
        return result;
    }
    protected float Take(float take, float percent){
        float result;
        result = (float) (Math.pow((float)(1-(percent/100)),5) * take);
        return result;
    }
    abstract void deposit(float add);
    abstract void withdraw(float add);
    abstract String account(); 
}