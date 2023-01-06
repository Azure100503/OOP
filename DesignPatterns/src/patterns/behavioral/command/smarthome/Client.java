package patterns.behavioral.command.smarthome;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        SmartHomeApp lightSwitch = new SmartHomeApp(lightOn, lightOff);

        lightSwitch.flipDown();
        lightSwitch.flipUp();


    }
}
