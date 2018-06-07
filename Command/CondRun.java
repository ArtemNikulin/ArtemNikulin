public class CondRun implements Command {
    private Condition air;

    @Override
    public void execute() {
        air.run();
    }

    CondRun(Condition air){
        this.air = air;
    }
}
