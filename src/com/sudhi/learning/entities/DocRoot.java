package com.sudhi.learning.entities;

import java.util.ArrayList;

public class DocRoot {
	String DocID;
	String DocType;
	String SalesOrg;
	String OrderingParty;
	String SourceLoc;
	String DestLoc;
	Quantites qty = new Quantites();
	ArrayList <Items> items;
	ArrayList <Stage> stages;
	public String getDocID() {
		return DocID;
	}
	public void setDocID(String docID) {
		DocID = docID;
	}
	public String getDocType() {
		return DocType;
	}
	public void setDocType(String docType) {
		DocType = docType;
	}
	public String getSalesOrg() {
		return SalesOrg;
	}
	public void setSalesOrg(String salesOrg) {
		SalesOrg = salesOrg;
	}
	public String getOrderingParty() {
		return OrderingParty;
	}
	public void setOrderingParty(String orderingParty) {
		OrderingParty = orderingParty;
	}
	public String getSourceLoc() {
		return SourceLoc;
	}
	public void setSourceLoc(String sourceLoc) {
		SourceLoc = sourceLoc;
	}
	public String getDestLoc() {
		return DestLoc;
	}
	public void setDestLoc(String destLoc) {
		DestLoc = destLoc;
	}
	
}
