package game.deck;

import java.util.ArrayList;
import java.util.Collections;

import game.ThreeKingdoms;
import game.characters.Player;
import game.deck.Basic.*;
import game.deck.Armor.*;
import game.deck.Weapon.*;
import game.deck.DelayTactics.*;
import game.deck.Tactics.*;
import static game.deck.Card.Suit.*;

public class DeckofCards {
  private ArrayList<Card> cards;

  private DeckofCards() {
    this.cards = new ArrayList<>();


    // Spade cards
    cards.add(new Duel(1, SPADE));

    cards.add(new EightTrigrams(2, SPADE));

    cards.add(new BurnBridges(3, SPADE));

    for (int rank : new int[] {4, 11}) {
      cards.add(new Pilfer(rank, SPADE));
    }

    for (int rank : new int[] {5, 7, 8, 10}) {
      cards.add(new Attack(rank, SPADE));
    }

    cards.add(new SwordofBlueSteel(6, SPADE));

    cards.add(new FrostBlade(9, SPADE));

    cards.add(new SerpentSpear(12, SPADE));

    cards.add(new BarbariansAssault(13, SPADE));




    // Heart cards
    cards.add(new HailofArrows(1, HEART));

    for (int rank : new int[] {2, 10, 11}) {
      cards.add(new Attack(rank, HEART));
    }

    for (int rank : new int[] {3, 4, 9}) {
      cards.add(new Peach(rank, HEART));
    }

    cards.add(new Dodge(5, HEART));

    cards.add(new Acedia(6, HEART));

    for (int rank : new int[] {7, 8}) {
      cards.add(new SleightofHand(rank, HEART));
    }

    cards.add(new BurnBridges(12, HEART));

    cards.add(new ImpeccablePlan(13, HEART));




    // Club cards
    cards.add(new Duel(1, CLUB));

    cards.add(new ShieldofRenWang(2, CLUB));

    cards.add(new BurnBridges(3, CLUB));

    for (int rank : new int[] {4, 5, 6, 8, 9, 10, 11}) {
      cards.add(new Attack(rank, CLUB));
    }

    cards.add(new SevenArmies(7, CLUB));

    cards.add(new RationsDepleted(12, CLUB));

    cards.add(new ImpeccablePlan(13, CLUB));




    // Diamond cards
    cards.add(new ZhugeCrossbow(1, DIAMOND));

    for (int rank : new int[] {2, 3, 7, 8, 10, 11}) {
      cards.add(new Dodge(rank, DIAMOND));
    }

    cards.add(new Pilfer(4, DIAMOND));

    cards.add(new RockCleavingAxe(5, DIAMOND));

    for (int rank : new int[] {6, 9, 13}) {
      cards.add(new Attack(rank, DIAMOND));
    }

    cards.add(new Peach(12, DIAMOND));
  }

  private DeckofCards(ArrayList<Card> cards) {
    this.cards = cards;
  }


  /**
   * Constructs a new deck of 52 cards.
   * @return an instance of DeckofCard
   */
  public static DeckofCards makeNewDeck() {
    return new DeckofCards().shuffle();
  }


  /**
   * Gets all the cards in the deck.
   * @return an arraylist of cards
   */
  public ArrayList<Card> getCards() {
    return cards;
  }


  /**
   * Counts the number of remaining cards in the deck.
   * @return an integer <= 52.
   */
  public int count() {
    return cards.size();
  }


  /**
   * Shuffles the remaining cards inside the deck.
   * @return the shuffled deck
   */
  public DeckofCards shuffle() {
    ArrayList<Card> newCards = getCards();
    Collections.shuffle(newCards);
    return new DeckofCards(newCards);
  }


  /**
   * Draws n cards from the deck to the player's hand.
   * Cards drawn are deleted from the deck and added to the player's hand.
   * @param n the number of cards the player draws
   * @param player the player that draws the cards
   * @return a new game instance with appropriate changes
   */
  public ThreeKingdoms draw(int n, Player player) {
    int count = n;
    ArrayList<Card> newCards = getCards();
    ArrayList<Card> newHand = player.getHand();
    while (count > 0) {
      Card card = newCards.remove(0);
      newHand.add(card);
      count--;
    }
    player.updateHand(newHand);
    new DeckofCards(newCards);
    // TODO: IMPLEMENT (思考ThreeKingdoms的constructor, 需不需要一个currentPlayer? 怎样建新的game?)
    throw new UnsupportedOperationException("Unimplemented.");
  }





  // all hand cards, or, lost cards
  // TODO: IMPLEMENT
  public void deal(int cardNum, Player target, ArrayList<Card> discardedCards) {
    for (int num : new int[cardNum]) {
      target.getHand().add(cards.remove(0));
      if (cards.size() == 0) {
        cards = discardedCards;
        this.shuffle();
      }
    }
  }
}
