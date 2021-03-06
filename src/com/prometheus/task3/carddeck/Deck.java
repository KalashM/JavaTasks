package com.prometheus.task3.carddeck;


public class Deck {
    private Card[] cards;
    Rank[] r1 = Rank.values;
    Suit[] s1 = Suit.values;


    public Deck() {
        cards = new Card[36];
        int index=0;
        for (int i=0; i<r1.length; i++) {
            for (int j=0; j<s1.length; j++) {
                cards[index] = new Card(r1[i],s1[j]);
                index++;
            }
        }
    }

    public void printDeck() {
        Card[] cards = this.cards;
        for (int n=0; n<36 ; n++){
            System.out.println(cards[n].getRank().getName() + ' ' + cards[n].getSuit().getName());
        }
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        Card[] cards = this.cards;
        Card card;
        int temp;
        for (int i=0; i<cards.length; i++) {
            temp = (int)(Math.random()*(36-i)+i);
            card = cards[i];
            cards[i]=cards[temp];
            cards[temp] = card;
        }
    }

    /* * Впорядкування колоди за мастями та значеннями
    * Порядок сотрування:
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
    * Наприклад
    * HEARTS Ace
    * HEARTS King
    * HEARTS Queen
    * HEARTS Jack
    * HEARTS 10
    * HEARTS 9
    * HEARTS 8
    * HEARTS 7
    * HEARTS 6
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
        Card[] cards = this.cards;
        int index=0;
        int j=0;
        while (j<s1.length) {
            for (int i=0; i<r1.length; i++) {
                cards[index] = new Card(r1[i],s1[j]);
                index++;
            }
            j++;
        }
    }

    /*//Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
    }*/
}

