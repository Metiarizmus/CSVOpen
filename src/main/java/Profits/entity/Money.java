package Profits.entity;

public class Money {
    private Double profit;
    private Double loss;

    public Money(Double profit, Double loss) {
        this.profit = profit;
        this.loss = loss;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Double getLoss() {
        return loss;
    }

    public void setLoss(Double loss) {
        this.loss = loss;
    }

    @Override
    public String toString() {
        return "Money{" +
                "profit=" + profit +
                ", loss=" + loss +
                '}';
    }
}
