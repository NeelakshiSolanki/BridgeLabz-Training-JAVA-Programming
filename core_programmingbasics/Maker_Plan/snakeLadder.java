import java.util.*;

public class snakeLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int player1 = 0, player2 = 0;
        int turn = 1;

        Map<Integer, Integer> snakes = new HashMap<>();
        snakes.put(99, 54);
        snakes.put(70, 55);
        snakes.put(52, 42);
        snakes.put(25, 2);

        Map<Integer, Integer> ladders = new HashMap<>();
        ladders.put(6, 25);
        ladders.put(11, 40);
        ladders.put(60, 85);
        ladders.put(46, 90);

        while (player1 < 100 && player2 < 100) {
            System.out.println("\nPlayer " + turn + " turn. Press Enter to roll dice...");
            sc.nextLine();

            int dice = rand.nextInt(6) + 1;
            System.out.println("Dice rolled: " + dice);

            if (turn == 1) {
                player1 += dice;

                if (player1 > 100) player1 -= dice;

              
                if (ladders.containsKey(player1)) {
                    System.out.println("Ladder! Climb up");
                    player1 = ladders.get(player1);
                }

               
                if (snakes.containsKey(player1)) {
                    System.out.println("Snake! Go down");
                    player1 = snakes.get(player1);
                }

                System.out.println("Player 1 position: " + player1);
                turn = 2;

            } else {
                player2 += dice;

                if (player2 > 100) player2 -= dice;

                if (ladders.containsKey(player2)) {
                    System.out.println("Ladder! Climb up");
                    player2 = ladders.get(player2);
                }

                if (snakes.containsKey(player2)) {
                    System.out.println("Snake! Go down");
                    player2 = snakes.get(player2);
                }

                System.out.println("Player 2 position: " + player2);
                turn = 1;
            }
        }

        if (player1 == 100)
            System.out.println(" Player 1 wins!");
        else
            System.out.println(" Player 2 wins!");

    
    }
}