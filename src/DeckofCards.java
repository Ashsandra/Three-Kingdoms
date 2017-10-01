import java.util.ArrayList;
import java.util.Collections;

public class DeckofCards {
  private ArrayList<Card> cards;

  // TO-DO: perhaps use linked list instead.

  DeckofCards() {
    this.cards = new ArrayList<Card>();

    // Spade Kill
    for (int rank : new int[] {7, 8, 8, 9, 9, 10, 10}) {
      cards.add(new Card(Card.Suit.SPADE, rank, Card.Type.KILL));
    }
    // Club Kill
    for (int rank : new int[] {2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11}) {
      cards.add(new Card(Card.Suit.CLUB, rank, Card.Type.KILL));
    }
    // Heart Kill
    for (int rank : new int[] {10, 11, 11}) {
      cards.add(new Card(Card.Suit.HEART, rank, Card.Type.KILL));
    }
    // Diamond Kill
    for (int rank : new int[] {6, 7, 8, 9, 10, 13}) {
      cards.add(new Card(Card.Suit.DIAMOND, rank, Card.Type.KILL));
    }

    // Heart Dodge
    for (int rank : new int[] {2, 2, 13}) {
      cards.add(new Card(Card.Suit.HEART, rank, Card.Type.DODGE));
    }
    // Diamond Dodge
    for (int rank : new int[] {2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11}) {
      cards.add(new Card(Card.Suit.DIAMOND, rank, Card.Type.KILL));
    }

    // Heart Peach
    for (int rank : new int[] {3, 4, 6, 7, 8, 9, 12}) {
      cards.add(new Card(Card.Suit.HEART, rank, Card.Type.PEACH));
    }
    // Diamond Peach
    cards.add(new Card(Card.Suit.HEART, 12, Card.Type.KILL));
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  // all hand cards, or, lost cards
  // TO BE IMPROVED
  public void deal(int cardNum, Player target, ArrayList<Card> allHandCards) {
    for (int num : new int[cardNum]) {
      target.getHand().add(cards.remove(0));
      if (cards.size() == 0) {
        cards = new DeckofCards().cards;
        cards.removeAll(allHandCards);
        this.shuffle();
      }
    }



  }


  }
