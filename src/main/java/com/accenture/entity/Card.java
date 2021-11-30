package com.accenture.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="maetar")
public class Card {
	
	@Id
	private Long clave;
	
	private BigInteger numtar;
	private String bintar;
	private String codban;
	private String codcasa;
	private String numusu;
	private String cvv;
	private String catego;
	private String tiptar;
	private String expdate;

	public Card() {
	}

	public Card(Long clave, BigInteger numtar, String bintar, String codban, String codcasa, String numusu, String cvv,
				String catego, String tiptar, String expdate) {
		this.clave = clave;
		this.numtar = numtar;
		this.bintar = bintar;
		this.codban = codban;
		this.codcasa = codcasa;
		this.numusu = numusu;
		this.cvv = cvv;
		this.catego = catego;
		this.tiptar = tiptar;
		this.expdate = expdate;
	}

	public Long getClave() {
		return clave;
	}

	public void setClave(Long clave) {
		this.clave = clave;
	}

	public BigInteger getNumtar() {
		return numtar;
	}

	public void setNumtar(BigInteger numtar) {
		this.numtar = numtar;
	}

	public String getBintar() {
		return bintar;
	}

	public void setBintar(String bintar) {
		this.bintar = bintar;
	}

	public String getCodban() {
		return codban;
	}

	public void setCodban(String codban) {
		this.codban = codban;
	}

	public String getCodcasa() {
		return codcasa;
	}

	public void setCodcasa(String codcasa) {
		this.codcasa = codcasa;
	}

	public String getNumusu() {
		return numusu;
	}

	public void setNumusu(String numusu) {
		this.numusu = numusu;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getCatego() {
		return catego;
	}

	public void setCatego(String catego) {
		this.catego = catego;
	}

	public String getTiptar() {
		return tiptar;
	}

	public void setTiptar(String tiptar) {
		this.tiptar = tiptar;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

	@Override
	public String toString() {
		return "Card [clave=" + clave + ", numtar=" + numtar + ", bintar=" + bintar + ", codban=" + codban
				+ ", codcasa=" + codcasa + ", numusu=" + numusu + ", cvv=" + cvv + ", catego=" + catego + ", tiptar="
				+ tiptar + ", expdate=" + expdate + "]";
	}
	
	

}
