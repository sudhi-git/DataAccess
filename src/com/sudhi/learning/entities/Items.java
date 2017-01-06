package com.sudhi.learning.entities;

public class Items {
	int itemId;
	String itemCat;
	Quantites qty;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemCat() {
		return itemCat;
	}
	public void setItemCat(String itemCat) {
		this.itemCat = itemCat;
	}

	public Quantites getQty() {
		return qty;
	}

	public void setQty(Quantites qty) {
		this.qty = qty;
	}
}
