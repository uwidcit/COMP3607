
public class GuessingGame extends Game{
    private String[] qs;
    
    public GuessingGame(){
        qs = new String[3];
        qs[0] = "Dog";
        qs[1] = "Dog";
        qs[2] = "Dog";
        
    }
    
    public void play(){
        String answer = "";
        for(int i=0; i<3; i++){
            System.out.println("What animal am I thinking of?");
            java.util.Scanner screen = new java.util.Scanner(System.in);
            answer = screen.nextLine().trim();
            if(answer.equals(qs[i])){
                score++;
                System.out.println("yes");
            }
            else
                System.out.println("no");         
        }
    }
}
