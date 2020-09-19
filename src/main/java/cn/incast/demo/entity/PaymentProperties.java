package cn.incast.demo.entity;



public class PaymentProperties {
    /**
     * 单笔交易的最大限额，单位是分
     */
    private long maxAmountPerDeal;

    /**
     * 每日交易总量的最大限额
     */
    private long maxAmountTotal;


    public long getMaxAmountPerDeal() {
        return maxAmountPerDeal;
    }

    public void setMaxAmountPerDeal(long maxAmountPerDeal) {
        this.maxAmountPerDeal = maxAmountPerDeal;
    }

    public long getMaxAmountTotal() {
        return maxAmountTotal;
    }

    public void setMaxAmountTotal(long maxAmountTotal) {
        this.maxAmountTotal = maxAmountTotal;
    }
}
