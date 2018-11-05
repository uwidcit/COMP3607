
import java.util.*;

/**
 * 
 */
public class RemoteControl {

    /**
     * Default constructor
     */
    public RemoteControl() {
    }

    /**
     * 
     */
    private Command command;




    /**
     * @param Command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 
     */
    public void pressButton() {
        command.execute();
    }

}