import java.util.*;
public class RockPaperScissor{
    private String player;
    
    public String getPlayer() {
        return player;
    }
    
    public void setPlayer(String player){
        this.player = player;
    }

    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    RockPaperScissor rps = new RockPaperScissor();
    String[] RPS = new String[] {"rock", "paper", "scissor"};
    boolean value = false;
     System.out.println("To quit, enter '0'");
    while(!value){
        Random r = new Random();
        int poop = r.nextInt(RPS.length);
        System.out.print("Rock/Paper/Scissor. Player 1, choose one: ");
        rps.setPlayer(in.nextLine());
        if(rps.getPlayer().equals("0")){
            break;
        }
        System.out.println("Computer chooses " + RPS[poop].toUpperCase());
        if (rps.getPlayer().equals(RPS[poop])) {
            System.out.println("Draw");
        } else if (RPS[poop].equals("rock") && rps.getPlayer().equals("scissors")) {
            System.out.println("Computer wins!");
        } else if (RPS[poop].equals("paper") && rps.getPlayer().equals("rock")) {
            System.out.println("Computer wins!");
        } else
            System.out.println("Player wins!");
        }
        System.out.println("Thanks for playing!");
    }
}
