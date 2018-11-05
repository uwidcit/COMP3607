
import java.util.*;

/**
 * 
 */
public class OffCommand implements Command {

    /**
     * Default constructor
     */
    public OffCommand() {
    }

    /**
     * 
     */
    private OnOffDevice device;


    /**
     * 
     */
    public OffCommand(OnOffDevice device) {
        this.device = device;
    }

    /**
     * 
     */
    public void execute() {
        this.device.switchOff();
    }


}