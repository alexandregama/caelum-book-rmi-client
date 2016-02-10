package br.com.caelum.book;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 6087653839377446114L;

	private String code;

	private int quantity;

	public Book(String code, int quantity) {
		this.code = code;
		this.quantity = quantity;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void decreaseQuantity() {
		this.quantity--;
	}

}
