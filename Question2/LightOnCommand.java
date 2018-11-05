
import java.util.*;

/**
 * 
 */
public class LightOnCommand implements Command {

    /**
     * Default constructor
     */
    public LightOnCommand() {
    }

    /**
     * 
     */
    private Light light;


    /**
     * @param Light
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * 
     */
    public void execute() {
        this.light.switchOn();
    }

}