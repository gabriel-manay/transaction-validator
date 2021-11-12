package com.accenture.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.entity.Card;
import com.accenture.repository.ICardRepository;

@Service
@Transactional
public class CardService implements ICardService {
	
	@Autowired
	ICardRepository cardRepository;

	@Override
	public Card getCardByBIN(Integer bin) {
		return cardRepository.getCardByBIN(bin);
	}

}
