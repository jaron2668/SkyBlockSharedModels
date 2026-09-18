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

public class ToolItem extends Item{
    private int upgradeLevel;
    private String reforge;
    private int hotPotatoCount;
    private int rarityUpgrades;

    public int getUpgradeLevel() {
        return upgradeLevel;
    }

    public void setUpgradeLevel(int upgradeLevel) {
        this.upgradeLevel = upgradeLevel;
    }

    public String getReforge() {
        return reforge;
    }

    public void setReforge(String reforge) {
        this.reforge = reforge;
    }

    public int getHotPotatoCount() {
        return hotPotatoCount;
    }

    public void setHotPotatoCount(int hotPotatoCount) {
        this.hotPotatoCount = hotPotatoCount;
    }

    public int getRarityUpgrades() {
        return rarityUpgrades;
    }

    public void setRarityUpgrades(int rarityUpgrades) {
        this.rarityUpgrades = rarityUpgrades;
    }
}
