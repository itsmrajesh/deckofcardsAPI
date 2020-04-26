package com.deckofcards.docapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Card {

	private String image;
	private String value;
	private String suit;
	private String code;

}
