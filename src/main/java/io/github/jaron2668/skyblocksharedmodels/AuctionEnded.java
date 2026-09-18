/*
 * Copyright (c) 2026 jaron2668
 *
 * This file is part of https://github.com/jaron2668/SkyblockSharedModels
 * and subject to the terms of the GNU General Public License, version 3.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 *
 * SPDX-License-Identifier: GPL-3.0-only
 *
 */
package io.github.jaron2668.skyblocksharedmodels;

import java.time.Instant;
import java.util.UUID;

public class AuctionEnded {
    private UUID uuid;
    private Item item;
    private String itemId;
    private Instant timeEnded;
    private long price;
    private boolean wasBin;
    private boolean wasBought;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Instant getTimeEnded() {
        return timeEnded;
    }

    public void setTimeEnded(Instant timeEnded) {
        this.timeEnded = timeEnded;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public boolean wasBin() {
        return wasBin;
    }

    public void setWasBin(boolean wasBin) {
        this.wasBin = wasBin;
    }

    public boolean wasBought() {
        return wasBought;
    }

    public void setWasBought(boolean wasBought) {
        this.wasBought = wasBought;
    }
}
