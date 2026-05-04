package Maker_Plan;
import java.util.*;
class snakeLadder {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         Random rand = new Random();
         int player1 = 0 ; int player2 = 0;
         int turn = 1 ;
             
         Map<Integer,Integer>  snakes = new HashMap<>();
           snakes.put(35,6);
           snakes.put(50,15);
           snakes.put(65,24);
           snakes.put(79,37);
           snakes.put(99,5);

        Map<Integer,Integer> ladder = new HashMap<>();
        ladder.put(5,35);
        ladder.put(11,27);
        ladder.put(39,63);
        ladder.put(57,98);
        ladder.put(75,88);
           
        
        while(player1 < 100 && player2 < 100){
            System.out.println("Player1 roll your turn" + turn  );
            sc.nextLine();
            int dice = rand.nextInt(6)+1;
            System.out.println("Dice rolled" + dice);
            if(turn == 1){
                player1 += dice;

                if(player1>100) player1 -= dice;

                if(ladder.containsKey(player1)){
                  System.out.println("Ladder ! Climb Up");
                  player1 = ladder.get(player1);
                }
                if(snakes.containsKey(player2)){
                    System.out.println("Snakes! GO Down");
                    player1 = snakes.get(player1);
                }
                
                
            }

        }
        
    }
}