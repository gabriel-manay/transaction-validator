package com.accenture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.accenture.entity.Card;

@Repository
public interface ICardRepository extends JpaRepository<Card,Long> {
	
	@Query("SELECT c FROM Card c WHERE c.bintar = ?1")
	public Card getCardByBIN(String bin);
}
