
public abstract class Game {
    protected int score;
    
    public void initialise(){
        System.out.println("Welcome to the Game ");
    }
    public void startPlay(){
        score = 0;
    }
    public int getScore(){
        return score;
    }
    public void endPlay(){
         System.out.println("Thanks for playing! Your score is: " + getScore()+"\n");
    }
    
    //template method
    public final void playGame(){
        initialise();
        startPlay();
        play();
        endPlay();
    }
    
   
    public abstract void play();
    
    
}
