package com.anz.springcore.reftype;

public class AnzA {
	private int counta;
	private anzB ob;

	public int getCounta() {
		return counta;
	}

	public void setCounta(int counta) {
		this.counta = counta;
	}

	public anzB getOb() {
		return ob;
	}

	public void setOb(anzB ob) {
		this.ob = ob;
	}

	public anzA() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "anzA [counta=" + counta + ", ob=" + ob + "]";
	}

}
