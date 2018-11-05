
/**
 *
 * @author phaedramohammed
 */
public class Main1 {

    public static void main(String[] args) {
         OnOffDevice device = new Projector();
         Command comm1 = new OnCommand(device);
         Command comm2 = new OffCommand(device);
         RemoteControl control = new RemoteControl();

         control.setCommand(comm1);
         control.pressButton();
         control.pressButton();
         control.setCommand(comm2);
         control.pressButton();
         control.pressButton();
         
         
     }
     
     
     
 }
 