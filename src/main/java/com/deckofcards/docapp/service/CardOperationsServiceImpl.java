package com.deckofcards.docapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.deckofcards.docapp.api.CardOperations;
import com.deckofcards.docapp.entity.DrawCard;
import com.deckofcards.docapp.entity.DeckAPIResponse;

@Component
public class CardOperationsServiceImpl implements CardOperationsService {

	@Autowired
	private CardOperations cardOperations;

	@Override
	public DeckAPIResponse createNewDeck() {
		return cardOperations.createNewDeck();
	}

	@Override
	public DeckAPIResponse createNewDeckWithJokers() {
		return cardOperations.createNewDeckWithJokers();
	}

	@Override
	public DrawCard drawCard(int count) {
		count = count > 0 ? count : 1;
		return cardOperations.drawCard(count);
	}

}
