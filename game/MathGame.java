
public class MathGame extends Game{
    
    public void play(){
        
        int v1 ;
        int v2;
        int sol;
        int answer =0;
        int numTries = 0;
        boolean solved = false;
        java.util.Random r = new java.util.Random();
        for(int i=0; i<3; i++){
             v1 = r.nextInt(100);
             v2 = r.nextInt(100);
             sol = v1 + v2;
            System.out.println("What is the sum of " + v1 + " and " +v2 + "?") ;
            solved = false;
            numTries = 0;
            
            while(numTries <3 && !solved){
               
                java.util.Scanner screen = new java.util.Scanner(System.in);
                answer = screen.nextInt();
                numTries++;
                if(answer == sol){
                    score++;
                    System.out.println("Yes that is correct! Good job!\n");
                    solved = true;
                }
                else{
                    if(numTries == 3)
                        System.out.println("No, that is not correct, let's move on.\n"); 
                    else
                      System.out.println("No, that is not correct, try again."); 
                    
                }
            }
            
        }
    }
}
