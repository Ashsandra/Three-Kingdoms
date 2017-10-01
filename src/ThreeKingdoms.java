import javax.sound.midi.SysexMessage;
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
    System.out.println("Hello " +
        currentPlayer.getName() +
        ", you currently have these cards: " +
        currentPlayer.getHand());
  }

  private void instructions() {
    System.out.println(currentPlayer.getName() + ", you currently have these cards: " + currentPlayer.getHand());
    System.out.println("Please enter the index of the card you wish to play.");
    System.out.println("1 - the leftmost card");
    System.out.println("3 - the rightmost card");
  }

  public Card.Type playACard() {
    System.out.println(currentPlayer.getName() + ", it's your round! Would you like to play a card? (Y/N)");
    if (getAnswer() == "Y") {
      instructions();
      String index = getAnswer();
      if (!(currentPlayer.check(index) == Card.Type.DODGE)) {
        return currentPlayer.play(getAnswer());
      } else {
        System.out.println("Don't play a DODGE when you don't need to!");
        System.out.println("Would you like to choose another card? (Y/N)");
        String again = getAnswer();
        if (again == "Y") {
          playACard();
        }
        return null;
      }
    } else {
      return null;
    }
  }

  public boolean playACard(String type) {
    instructions();
    String answer = getAnswer();
    String expected = currentPlayer.getHand().get(Integer.parseInt(answer) - 1).getType().toString();
    if (expected == type) {
      currentPlayer.play(getAnswer());
      return true;
    } else {
      System.out.println("Please play a" + expected);
      System.out.println("Would you like to choose another card? (Y/N)");
      String again = getAnswer();
      if (again == "Y") {
        playACard(type);
      }
      return false;
    }
  }

  public boolean death() {
    System.out.println(currentPlayer.getName() + "属于濒死状态");
    changePlayer();
    System.out.println(currentPlayer.getName() + "你是否使用一个桃?");
    System.out.println("(1)--确定");
    System.out.println("(2)--取消");
    int selection = Integer.parseInt(getAnswer());
    if (selection == 1 && currentPlayer.hasCard(Card.Type.PEACH)) {
      changePlayer();
      currentPlayer.heal();
      System.out.println(currentPlayer.getName() + ", you are alive!");
      return false;
    } else {
      changePlayer();
      System.out.println(currentPlayer.getName() + ", you are dead!");
      changePlayer();
      return true;
    }
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
      Card.Type card = game.playACard();

      // kill
      if (card == Card.Type.KILL) {
        game.changePlayer();
        System.out.println("The other player used a KILL towards you! Play a DODGE!");
        if (!game.playACard("DODGE")) {
          game.currentPlayer.harm();
          if (game.currentPlayer.getHp() == 0) {
            if (game.death()) {
              break;
            }
          }
        } else {
          // peach
          game.currentPlayer.heal();
        }
        game.changePlayer();
      }
    }

    // game over, ask if play again
    System.out.println("Game Over!" + game.currentPlayer + ", congratulations, you won!");
  }
}