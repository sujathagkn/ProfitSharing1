package com.test.logic;

import com.test.model.Subsidiary;
import java.util.LinkedList;

public class ProfitShare {

    private static String LOCAL_POSTOFFICENAME = "Local_PostOffice";
    private double POST_OF_AUS_SHARE = 0.025;

    public void distribute(double profit, LinkedList<Subsidiary> subsidaries) {
        double postOfAusProfit = profit*POST_OF_AUS_SHARE;
        System.out.println("Profit to Post of Australia " + postOfAusProfit);
        //Assuming the distribution ratios are defined properly for 100% profit
        distributeProfit(profit - postOfAusProfit, subsidaries);

    }
    public void distributeProfit(double profit, LinkedList<Subsidiary> subsidaries) {
        for(Subsidiary subsidiary : subsidaries) {
            if(!subsidiary.getSubsidiaryName().equals(LOCAL_POSTOFFICENAME)
            && subsidiary.getSubSubsidiaries() != null && subsidiary.getSubSubsidiaries().size() > 0) {
                double share = profit* subsidiary.getSharePercent();
                 distributeProfit(share, subsidiary.getSubSubsidiaries());
            } else {
                if (subsidiary.getSubsidiaryName().equals(LOCAL_POSTOFFICENAME)) {
                    System.out.println("Profit to distributor " + subsidiary.getSubsidiaryName() + "=" + profit * subsidiary.getSharePercent());
                    break;
                } else {
                    System.out.println("Profit to distributor " + subsidiary.getSubsidiaryName() + "=" + profit * subsidiary.getSharePercent());
                }
            }
        }

    }
}
