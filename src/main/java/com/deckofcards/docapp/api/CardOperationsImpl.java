package com.deckofcards.docapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.deckofcards.docapp.entity.DrawCard;
import com.deckofcards.docapp.entity.DeckAPIResponse;

@Component
public class CardOperationsImpl implements CardOperations {

	private String deck_id = "";

	@Autowired
	private RestTemplate restTemplate;

	private final String base_url = "https://deckofcardsapi.com/api/deck/";

	@Override
	public DeckAPIResponse createNewDeck() {
		ResponseEntity<DeckAPIResponse> response = null;
		try {
			response = this.restTemplate.getForEntity(base_url + "new/", DeckAPIResponse.class);
			this.deck_id = response.getBody().getDeck_id();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response.getBody();
	}

	@Override
	public DeckAPIResponse createNewDeckWithJokers() {

		DeckAPIResponse res = new DeckAPIResponse(false, null, false, 0);

		DeckAPIResponse resp = restTemplate.postForObject(base_url + "new?jokers_enabled=true", res, DeckAPIResponse.class);
		System.out.println(resp);
		
		return null;// res.getBody();
	}

	@Override
	public DrawCard drawCard(int count) {
		String url = base_url + deck_id + "/draw/?count=" + count;
		return restTemplate.getForObject(url, DrawCard.class);
	}

}
