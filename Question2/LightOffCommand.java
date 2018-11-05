
import java.util.*;

/**
 * 
 */
public class LightOffCommand implements Command {

    /**
     * Default constructor
     */
    public LightOffCommand() {
    }

    /**
     * 
     */
    private Light light;


    /**
     * 
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }

    /**
     * 
     */
    public void execute() {
        this.light.switchOff();
    }


}