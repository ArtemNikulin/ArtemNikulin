public class LightOff implements Command {
    private Light light;
    @Override
    public void execute() {
        light.off();
    }
    LightOff(Light light){
        this.light = light;
    }
}
