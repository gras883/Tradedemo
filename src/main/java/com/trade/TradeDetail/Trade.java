package com.trade.TradeDetail;

import java.time.LocalDate;
import java.util.Date;

public class Trade {
    private String tradeId;
    private Integer version;
    private String couterPartyId;
    private String bookId;
    private LocalDate maturityDate;
    private LocalDate createdDate;
    private String expried;

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCouterPartyId() {
        return couterPartyId;
    }

    public void setCouterPartyId(String couterPartyId) {
        this.couterPartyId = couterPartyId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getExpried() {
        return expried;
    }

    public void setExpried(String expried) {
        this.expried = expried;
    }
}
