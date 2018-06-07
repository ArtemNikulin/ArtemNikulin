public class CondStop implements Command {
    private Condition air;

    @Override
    public void execute() {
        air.stop();
    }

    CondStop(Condition air){
        this.air = air;
    }
}
