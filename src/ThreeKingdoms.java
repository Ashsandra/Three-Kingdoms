import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ThreeKingdoms {
  private Player currentPlayer;
  private ArrayList<Card> lostCards;
  private DeckofCards deck;

  private Player player1 = new Player(new Character(3, "Player 1"));
  private Player player2 = new Player(new Character(3, "Player 2"));


  ThreeKingdoms() {
    currentPlayer = player1;
    lostCards = new ArrayList<Card>();
    deck = new DeckofCards();

  }

  // used to read text from the user
  private static Scanner cin = new Scanner(System.in, UTF_8.name());

  public static String getAnswer() {
    return cin.nextLine();
  }

  public void changePlayer() {
    if (currentPlayer == player1) {
      currentPlayer = player2;
    } else {
      currentPlayer = player1;
    }
  }

  public void draw(int numofCards) {
    deck.deal(numofCards, currentPlayer, lostCards);
    System.out.println("Hello " + currentPlayer.getName() + ", you currently have these cards: " + currentPlayer.getHand());
  }

  /**
   * The main program for the Three Kingdoms game.
   */
  public static void main(String[] args) {
    // start game
    ThreeKingdoms game = new ThreeKingdoms();
    System.out.println("Welcome to the Three Kingdoms game!");

    // input names
    System.out.println("Please enter the name of the first player: ");
    game.player1.setName(getAnswer());
    System.out.println("Thank you! Now please enter the name of the second player: ");
    game.player2.setName(getAnswer());
    System.out.println("Alrighty! We shall start the game!");

    // deal 4 cards to each player
    game.draw(4);
    game.changePlayer();
    game.draw(4);
    game.changePlayer();


    while (true) {
      // play a card
      System.out.println(game.currentPlayer.getName() + ", you currently have these cards: " + game.currentPlayer.getHand());
      System.out.println("Please enter the index of the card you wish to play.");
      System.out.println("1 - the leftmost card");
      System.out.println("3 - the rightmost card");
      String response = getAnswer();
      Card.Type card = game.currentPlayer.play(response);

      // kill
      if (card == Card.Type.KILL) {
        game.changePlayer();
        System.out.println();
      } else if (card == Card.Type.DODGE) {
        // dodge

      } else {
        // peach

      }

    }

  }
}