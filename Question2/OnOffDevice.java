
import java.util.*;

/**
 * 
 */
public abstract class OnOffDevice {

    protected String name;
    protected boolean on;

    public boolean switchOn() {
        if (this.on == false)
        {
            System.out.println(this.name  + " on");
            this.on = true;
        }
        else
        {
            System.out.println("MWHAHAHAHAHAHA The " + this.name + " is on! :D");
        }
        return this.on;
    }

    /**
     * @return
     */
    public boolean switchOff() {
        if(this.on == true)
        {
            System.out.println(this.name  + " off");
            this.on = false;
        }
        else
        {
            System.out.println("MWHAHAHAHAHAHA The " + this.name + " is off! :D");
        }
        
        return this.on;
    }

}