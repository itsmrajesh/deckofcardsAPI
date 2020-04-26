package com.deckofcards.docapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deckofcards.docapp.entity.DrawCard;
import com.deckofcards.docapp.entity.DeckAPIResponse;
import com.deckofcards.docapp.service.CardOperationsService;

@SpringBootApplication
public class DeckOfCardsApplication implements CommandLineRunner {

	@Autowired
	private CardOperationsService cardOperationsService;

	public static void main(String[] args) {
		SpringApplication.run(DeckOfCardsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * DeckAPIResponse obj = cardOperationsService.createNewDeck();
		 * System.out.println(obj); obj =
		 * cardOperationsService.createNewDeckWithJokers(); System.out.println(obj);
		 * DrawCard resp = cardOperationsService.drawCard(1); System.out.println(resp);
		 */
	}

}
