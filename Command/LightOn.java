public class LightOn implements Command {
    private Light light;
    @Override
    public void execute() {
        light.on();
    }

    LightOn(Light light){
        this.light = light;
    }
}
