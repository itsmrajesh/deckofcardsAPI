package com.deckofcards.docapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.deckofcards.docapp.entity.DrawCard;
import com.deckofcards.docapp.entity.DeckAPIResponse;
import com.deckofcards.docapp.service.CardOperationsService;

@SpringBootTest
class DeckOfCardsApplicationTests {

	@Autowired
	private CardOperationsService cardOperationsService;

	@Test
	void DOCNewAPITest() {

		DeckAPIResponse response = cardOperationsService.createNewDeck();

		assertNotNull(response);
		assertEquals(52, response.getRemaining());
		assertEquals(true, response.isSuccess());

	}

	@Test
	void DOCDrawAPITest() {
		int count = 2;
		DrawCard resp = cardOperationsService.drawCard(count);
		int remaining = resp.getRemaining();
		assertNotNull(resp);
		assertEquals(52 - count, remaining);
		assertEquals(count, resp.getCards().size());

	}

}
