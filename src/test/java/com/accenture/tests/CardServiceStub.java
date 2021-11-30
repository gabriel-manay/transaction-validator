package com.accenture.tests;

import com.accenture.entity.Card;
import com.accenture.service.ICardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


@Service
public class CardServiceStub implements ICardService {

    private Logger logger = LoggerFactory.getLogger(AccountNumberValidatorStub.class);
    @Override

    public Card getCardByBIN(String bin) {

        List<Card> cards = new ArrayList<>();
        //Long clave, BigInteger numtar, String bintar, String codban, String codcasa, String numusu, String cvv,
        //				String catego, String tiptar, String expdate)
        BigInteger numtar = new BigInteger("0000000000000");
        BigInteger numtar2 = new BigInteger("11111111111111");
        cards.add(new Card(Long.parseLong("123"),numtar,"000000", "123456", "789", "45697", "289", "963", "12", "0426" ));
        cards.add(new Card(Long.parseLong("485"),numtar2,"111111", "78", "852", "123454968", "882", "01", "78", "1221" ));
        return cards.get(1);
    }
    public Card getCardByBIN2(String bin) {
        return null;
    }
}
