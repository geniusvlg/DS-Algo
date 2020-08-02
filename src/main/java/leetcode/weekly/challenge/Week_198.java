package leetcode.weekly.challenge;

public class Week_198 {

    public int numWaterBottles(int numBottles, int numExchange) {
        int emptyBottles = numBottles;
        int extra = 0;

        while(emptyBottles >= numExchange) {
            emptyBottles -= numExchange;
            extra++;
            emptyBottles++;
        }

        return numBottles + extra;
    }

}
