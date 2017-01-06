package com.sudhi.learning.dao;

import com.sudhi.learning.entities.DocRoot;
import com.sudhi.learning.entities.Items;
import com.sudhi.learning.entities.Quantites;
import com.sudhi.learning.entities.Stage;

import java.util.ArrayList;

public class DAOMainClass implements DataAccessObject {

	@Override
	public void fillCommStructure() {
		ArrayList <Items> itmList = new ArrayList<>();
		ArrayList <Stage> stgList = new ArrayList<>();
		Items itm = new Items();
		Stage stg = new Stage();
		Quantites rootQty = new Quantites();
		Quantites itmQty = new Quantites();
		int totalWeight = 0;
		DocRoot docRoot = new DocRoot();
		docRoot.setDocID("1234");
		docRoot.setDocType("FWO");
		docRoot.setSalesOrg("50001");
		docRoot.setOrderingParty("BP_ORD");
		docRoot.setSourceLoc("BLR");
		docRoot.setDestLoc("DEL");
		for (int i=0; i<10; i++){
			itm.setItemId(i);
			if (i%2 == 0){
				itm.setItemCat("CONT");
				itmQty.setGross_weight(100);
			}else{
				itm.setItemCat("PKG");
				itmQty.setGross_weight(50);
			}
			itmQty.setGweightUOM("KG");
			totalWeight += itmQty.getGross_weight();
			itmList.add(itm);
		}
		//Pre Carriage
		stg.setStageId(10);
		stg.setStageCat("PRE");
		stg.setStageType("P");
		stg.setSourceLoc("BLR");
		stg.setDestLoc("MUM");
		stg.setTotalDistance(1200);
		stg.setDistanceUOM("KM");
		stgList.add(stg);
		//Main Carriage
		stg.setStageId(20);
		stg.setStageCat("MAIN");
		stg.setStageType("M");
		stg.setSourceLoc("MUM");
		stg.setDestLoc("JAI");
		stg.setTotalDistance(1300);
		stg.setDistanceUOM("KM");
		stgList.add(stg);
		//On Carriage
		stg.setStageId(30);
		stg.setStageCat("ON");
		stg.setStageType("O");
		stg.setSourceLoc("JAI");
		stg.setDestLoc("DEL");
		stg.setTotalDistance(800);
		stg.setDistanceUOM("KM");
		stgList.add(stg);
		rootQty.setGross_weight(totalWeight);
		rootQty.setGweightUOM("KG");
		rootQty.setDistanceUOM("KM");
		rootQty.setTotalDistance(3300);
		rootQty.setNetWeight(totalWeight-100);
		rootQty.setNweightUOM("KG");
		docRoot.setQty(rootQty);
		docRoot.setItems(itmList);
		docRoot.setStages(stgList);
		commStructure.add(docRoot);
	}

	@Override
	public ArrayList<DocRoot> getCommStructure() {
		return commStructure;
	}
}
