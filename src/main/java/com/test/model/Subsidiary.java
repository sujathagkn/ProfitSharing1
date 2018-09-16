package com.test.model;

import java.util.LinkedList;

public class Subsidiary {

    private long subsidiaryId;
    private String subsidiaryName;
    private double sharePercent;
    private LinkedList<Subsidiary> subSubsidiaries;

    public long getSubsidiaryId() {
        return subsidiaryId;
    }

    public void setSubsidiaryId(long subsidiaryId) {
        this.subsidiaryId = subsidiaryId;
    }

    public String getSubsidiaryName() {
        return subsidiaryName;
    }

    public void setSubsidiaryName(String subsidiaryName) {
        this.subsidiaryName = subsidiaryName;
    }

    public double getSharePercent() {
        return sharePercent;
    }

    public void setSharePercent(double sharePercent) {
        this.sharePercent = sharePercent;
    }

    public LinkedList<Subsidiary> getSubSubsidiaries() {
        return subSubsidiaries;
    }

    public void setSubSubsidiaries(LinkedList<Subsidiary> subSubsidiaries) {
        this.subSubsidiaries = subSubsidiaries;
    }
}
