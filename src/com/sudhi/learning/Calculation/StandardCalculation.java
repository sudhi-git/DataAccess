package com.sudhi.learning.Calculation;

import com.sudhi.learning.Factory.DAOFactory;
import com.sudhi.learning.dao.DataAccessObject;
import com.sudhi.learning.entities.DocRoot;
import com.sudhi.learning.entities.Items;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by sudhi_bhat on 1/5/17.
 */
public class StandardCalculation {

    public static DataAccessObject performCalc(){
        DataAccessObject daoObj = DAOFactory.getDAO();
        daoObj.fillCommStructure();
        return daoObj;
    }
    public static void main(String[] args){
        DataAccessObject dao = performCalc();
        Iterator <DocRoot> commRootTable = dao.getCommStructure().iterator();
        while (commRootTable.hasNext()){
            DocRoot commStruc = commRootTable.next();
            System.out.print(commStruc.getDocID());
            Iterator<Items> itemTable = commStruc.getItems().iterator();
            while(itemTable.hasNext()){
                Items items = itemTable.next();
                System.out.print(items.getItemId());
            }
        }
    }
}
