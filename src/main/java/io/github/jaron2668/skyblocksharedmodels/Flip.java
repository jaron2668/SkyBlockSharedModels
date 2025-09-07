package io.github.jaron2668.skyblocksharedmodels;

import java.time.Instant;
import java.util.UUID;

public class Flip {
    private UUID auctionUuid;
    private String itemDisplayName;
    private long price;
    private long estimatedProfit;
    private Instant upSince;

    public UUID getAuctionUuid() {
        return auctionUuid;
    }

    public void setAuctionUuid(UUID auctionUuid) {
        this.auctionUuid = auctionUuid;
    }

    public String getItemDisplayName() {
        return itemDisplayName;
    }

    public void setItemDisplayName(String itemDisplayName) {
        this.itemDisplayName = itemDisplayName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getEstimatedProfit() {
        return estimatedProfit;
    }

    public void setEstimatedProfit(long estimatedProfit) {
        this.estimatedProfit = estimatedProfit;
    }

    public Instant getUpSince() {
        return upSince;
    }

    public void setUpSince(Instant upSince) {
        this.upSince = upSince;
    }
}
