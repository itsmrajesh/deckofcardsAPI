package com.deckofcards.docapp.api;

import com.deckofcards.docapp.entity.DrawCard;
import com.deckofcards.docapp.entity.DeckAPIResponse;

public interface CardOperations {
	DeckAPIResponse createNewDeck();

	DeckAPIResponse createNewDeckWithJokers(boolean status);

	DrawCard drawCard(int count);

}
