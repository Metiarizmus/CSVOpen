package profits.entity;

public class Money<E> {
    private Double profit;
    private Double loss;

    public Money(Double profit, Double loss) {
        this.profit = profit;
        this.loss = loss;
    }

    public Money() {

    }

    public Double getProfit() {
        return profit;
    }

    public Double getLoss() {
        return loss;
    }


    @Override
    public String toString() {
        return "Money{" +
                "profit=" + profit +
                ", loss=" + loss +
                '}';
    }
}
