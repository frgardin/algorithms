package com.algorithms.halim.cap1;

import java.util.HashMap;
import java.util.Scanner;

public class ProvincesAndGold {

    private static final String PROVINCE = "Province";
    private static final String DUCHY = "Duchy";
    private static final String ESTATE = "Estate";
    private static final String GOLD = "Gold";
    private static final String SILVER = "Silver";
    private static final String COPPER = "Copper";
    private static final String OR = " or ";

    static class VictoryCardInfo {
        int cost;
        int victoryPoint;

        VictoryCardInfo(int cost, int victoryPoint) {
            this.cost = cost;
            this.victoryPoint = victoryPoint;
        }
    }

    static class TreasureCards {
        int cost;
        int buyingPower;

        TreasureCards(int cost, int buyingPower) {
            this.cost = cost;
            this.buyingPower = buyingPower;
        }
    }

    public static void main(String[] args) {
        int g, s, c;
        Scanner sc = new Scanner(System.in);
        HashMap<String, VictoryCardInfo> victoryCardInfoMap = new HashMap<>();
        HashMap<String, TreasureCards> treasureCardsMap = new HashMap<>();
        victoryCardInfoMap.put(PROVINCE, new VictoryCardInfo(8, 6));
        victoryCardInfoMap.put(DUCHY, new VictoryCardInfo(5, 3));
        victoryCardInfoMap.put(ESTATE, new VictoryCardInfo(2, 1));
        treasureCardsMap.put(GOLD, new TreasureCards(6, 3));
        treasureCardsMap.put(SILVER, new TreasureCards(3, 2));
        treasureCardsMap.put(COPPER, new TreasureCards(0, 1));

        g = sc.nextInt();
        s = sc.nextInt();
        c = sc.nextInt();

        int totalBuyingPower = g * treasureCardsMap.get(GOLD).buyingPower +
                s * treasureCardsMap.get(SILVER).buyingPower +
                c * treasureCardsMap.get(COPPER).buyingPower;

        StringBuilder sb = new StringBuilder();

        if (totalBuyingPower >= victoryCardInfoMap.get(PROVINCE).cost) sb.append(PROVINCE);
        else if (totalBuyingPower >= victoryCardInfoMap.get(DUCHY).cost) sb.append(DUCHY);
        else if (totalBuyingPower >= victoryCardInfoMap.get(ESTATE).cost) sb.append(ESTATE);

        if (sb.isEmpty()) {
            System.out.println(sb.append(COPPER));
            return;
        }
        sb.append(OR);
        if (totalBuyingPower >= treasureCardsMap.get(GOLD).cost) sb.append(GOLD);
        else if (totalBuyingPower >= treasureCardsMap.get(SILVER).cost) sb.append(SILVER);
        else sb.append(COPPER);

        System.out.println(sb);
    }
}
