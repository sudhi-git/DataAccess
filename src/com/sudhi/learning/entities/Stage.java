package com.sudhi.learning.entities;

public class Stage {
	int stageId;
	String stageType;
	String stageCat;
	String sourceLoc;
	String destLoc;
	int totalDistance;
	String distanceUOM;
	Quantites qty = new Quantites();
	public int getStageId() {
		return stageId;
	}
	public void setStageId(int stageId) {
		this.stageId = stageId;
	}
	public String getStageType() {
		return stageType;
	}
	public void setStageType(String stageType) {
		this.stageType = stageType;
	}
	public String getStageCat() {
		return stageCat;
	}
	public void setStageCat(String stageCat) {
		this.stageCat = stageCat;
	}
	public String getSourceLoc() {
		return sourceLoc;
	}
	public void setSourceLoc(String sourceLoc) {
		this.sourceLoc = sourceLoc;
	}
	public String getDestLoc() {
		return destLoc;
	}
	public void setDestLoc(String destLoc) {
		this.destLoc = destLoc;
	}
	public int getTotalDistance() {
		return totalDistance;
	}
	public void setTotalDistance(int totalDistance) {
		this.totalDistance = totalDistance;
	}
	public String getDistanceUOM() {
		return distanceUOM;
	}
	public void setDistanceUOM(String distanceUOM) {
		this.distanceUOM = distanceUOM;
	}

}
