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
	private Integer codban;
	private Integer codcasa;
	private Integer numusu;
	private Integer cvv;
	private Integer catego;
	private String tiptar;
	private Date expdate;
	
	public Card() {
		
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

	public Integer getCodban() {
		return codban;
	}

	public void setCodban(Integer codban) {
		this.codban = codban;
	}

	public Integer getCodcasa() {
		return codcasa;
	}

	public void setCodcasa(Integer codcasa) {
		this.codcasa = codcasa;
	}

	public Integer getNumusu() {
		return numusu;
	}

	public void setNumusu(Integer numusu) {
		this.numusu = numusu;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	public Integer getCatego() {
		return catego;
	}

	public void setCatego(Integer catego) {
		this.catego = catego;
	}

	public String getTiptar() {
		return tiptar;
	}

	public void setTiptar(String tiptar) {
		this.tiptar = tiptar;
	}

	public Date getExpdate() {
		return expdate;
	}

	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}

	@Override
	public String toString() {
		return "Card [clave=" + clave + ", numtar=" + numtar + ", bintar=" + bintar + ", codban=" + codban
				+ ", codcasa=" + codcasa + ", numusu=" + numusu + ", cvv=" + cvv + ", catego=" + catego + ", tiptar="
				+ tiptar + ", expdate=" + expdate + "]";
	}
	
	

}
