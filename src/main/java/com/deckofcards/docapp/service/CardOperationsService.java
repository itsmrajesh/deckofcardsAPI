package com.deckofcards.docapp.service;

import com.deckofcards.docapp.entity.DrawCard;
import com.deckofcards.docapp.entity.DeckAPIResponse;

public interface CardOperationsService {
	DeckAPIResponse createNewDeck();

	DeckAPIResponse createNewDeckWithJokers();

	DrawCard drawCard(int count);

}
