package facade.services;

import facade.model.Card;

import java.util.HashMap;
import java.util.Map;

public class CardService {
    private Map<Long, Long> memoryCards;

    public CardService() {
        memoryCards = new HashMap<>();
        memoryCards.put(4324324L, 3243242L);
    }

    public Card getByCard(Card card) {
        memoryCards.get(card.getCardNumber());
        return card;
    }

    public Long newCard(Long userNumber, Long cardNumber) {

        return memoryCards.put(userNumber, cardNumber);
    }


    public void removeByIndexCard(int i) {
        memoryCards.remove(i);
    }

    @Override
    public String toString() {
        return "CardService{" +
                "memoryCards=" + memoryCards +
                '}';
    }
}
