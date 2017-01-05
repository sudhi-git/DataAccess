package com.sudhi.learning.dao;

import com.sudhi.learning.entities.DocRoot;

public class DAOMainClass implements DataAccessObject {

	@Override
	public void fillCommStructure() {
		DocRoot docRoot = new DocRoot();
		docRoot.setDocID("1234");
		docRoot.setDocType("FWO");
		docRoot.setSalesOrg("50001");
		docRoot.setOrderingParty("BP_ORD");
		docRoot.setSourceLoc("BLR");
		docRoot.setDestLoc("DEL");
		
	}

}
