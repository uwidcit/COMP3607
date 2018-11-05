
import java.util.*;

/**
 * 
 */
public class OnCommand implements Command {

    /**
     * Default constructor
     */
    public OnCommand() {
    }

    /**
     * 
     */
    private OnOffDevice device;


    /**
     * 
     */
    public OnCommand(OnOffDevice device) {
        this.device = device;
    }

    /**
     * 
     */
    public void execute() {
        this.device.switchOn();
    }


}