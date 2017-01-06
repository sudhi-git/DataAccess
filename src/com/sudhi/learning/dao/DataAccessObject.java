package com.sudhi.learning.dao;

import java.util.ArrayList;

import com.sudhi.learning.entities.DocRoot;

public interface DataAccessObject {
	ArrayList <DocRoot> commStructure = new ArrayList<DocRoot>();
	public void fillCommStructure();
	public ArrayList<DocRoot> getCommStructure();

}
