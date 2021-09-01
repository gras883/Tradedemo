package com.trade.Service;

import com.trade.TradeDetail.DouTrade;
import com.trade.TradeDetail.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TradeRequest {

    @Autowired
    public DouTrade douTrade;

    @PostMapping("/trade")
    public ArrayList<Trade> addTrade(@RequestBody Trade trade){
        ArrayList<Trade> trades = douTrade.addTrade(trade);
        return trades;
    }
}
