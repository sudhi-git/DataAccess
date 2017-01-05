package com.sudhi.learning.entities;

public class Items {
	int itemId;
	String itemCat;
	Quantites qty = new Quantites();
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
	
}
