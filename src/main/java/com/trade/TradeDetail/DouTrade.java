package com.trade.TradeDetail;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
public class DouTrade {
    private ArrayList<Trade> tradeList = new ArrayList<>();

    public ArrayList<Trade> addTrade(Trade trade){
        // Check if trade is present
        for(int i=0; i<tradeList.size(); i++){
            Trade t = tradeList.get(i);
            if(t.getTradeId().equals(trade.getTradeId())) {
                // First if trade version is less than then current version
                if (t.getVersion() > trade.getVersion()) {
                    //return "Current trade version is not less than present trade version";
                    return tradeList;

                }
                if (trade.getMaturityDate().isBefore(LocalDate.now())) {
                    // Check of trade is expired or not
                    //return "Current trade is already expired.";
                    return tradeList;

                }
                if (t.getMaturityDate().isBefore(LocalDate.now())) {
                    t.setExpried("Y");
                    //return "Present trade is expired";
                    return tradeList;
                }

                tradeList.set(i, trade);
                //return " Update is sucessful";
                return tradeList;

            }
        }
        if (trade.getMaturityDate().isBefore(LocalDate.now())) {
            // Check of trade is expired or not
            //return "Current trade is already expired.";
            return tradeList;
        }
        tradeList.add(trade);
        //return "New trade added";
        return tradeList;
    }
}
