package com.deckofcards.docapp.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DrawCard {

	private boolean success;
	private List<Card> cards;
	private int remaining;

}
