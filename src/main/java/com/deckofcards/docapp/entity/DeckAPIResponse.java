package com.deckofcards.docapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DeckAPIResponse {

	private boolean success;
	private String deck_id;
	private boolean shuffled;
	private int remaining;

}
