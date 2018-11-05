
/**
 *
 * @author phaedramohammed
 */
public class Tutorial5 {

   public static void main(String[] args) {
        // TODO code application logic here
        question1();
        
        
    }
    
    public static void question1(){
        for(int requests=1; requests <10; requests++){
            //String s = Agent.getAgent();
            Agent bureau = Agent.getInstance();
            Agent bureau1 = Agent.getInstance();
            if (bureau == bureau1)
            {
                System.out.println("Same");
            }
            System.out.println(bureau.getAgent());  
        }
    }
    
}
