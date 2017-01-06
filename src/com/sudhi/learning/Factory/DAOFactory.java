package com.sudhi.learning.Factory;

import com.sudhi.learning.dao.DAOMainClass;
import com.sudhi.learning.dao.DataAccessObject;

/**
 * Created by sudhi_bhat on 1/5/17.
 */
public class DAOFactory {
    static private DataAccessObject dao;
    public static DataAccessObject getDAO(){
        if (dao==null){
            dao = new DAOMainClass();
        }
        return dao;
    }
}
