package com.deckofcards.docapp.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deckofcards.docapp.api.CardOperations;
import com.deckofcards.docapp.entity.DeckAPIResponse;
import com.deckofcards.docapp.entity.DrawCard;

@RestController
@RequestMapping("doc/api/")
public class RESTController {

	@Autowired
	private CardOperations cardOperations;

	@GetMapping("new")
	public DeckAPIResponse newDeck() {
		return cardOperations.createNewDeck();
	}

	@GetMapping("new/{status}")
	public DeckAPIResponse newDeck(@PathVariable boolean status) {
		return cardOperations.createNewDeckWithJokers(status);
	}

	@PostMapping("new/{status}")
	public DeckAPIResponse newDeckPost(@PathVariable boolean status) {
		return cardOperations.createNewDeckWithJokers(status);
	}

	@GetMapping("draw")
	public DrawCard drawCardWithCount() {
		return cardOperations.drawCard(1);
	}

	@GetMapping("draw/{count}")
	public DrawCard drawCardWithCount(@PathVariable int count) {
		return cardOperations.drawCard(count);
	}

}
