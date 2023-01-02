import java.util.Date;

public class DailyShopRevenue {
    private Shop shop;
    private String date;
    private Float cashRevenue;//Выручка наличными
    private Float cashRefund;//Возврат наличными
    private Float cardRevenue;//Выручка по картам
    private Float cardRefund;//Возврат по картам
    private Float transferRevenue;//Выручка по безналу
    private Float transferRefund;//Воврат по безналлу
    private Float totalRevenue;//Общая чистая выручка

    DailyShopRevenue(
            Shop shop,
            String date,
            Float cashRevenue,
            Float cashRefund,
            Float cardRevenue,
            Float cardRefund,
            Float transferRevenue,
            Float transferRefund){
        setShop(shop);
        setDate(date);
        setCashRevenue(cashRevenue);
        setCashRefund(cashRefund);
        setCardRevenue(cardRevenue);
        setCardRefund(cardRefund);
        setTransferRevenue(transferRevenue);
        setTransferRefund(transferRefund);
        setTotalRevenue();
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Float getCashRevenue() {
        return cashRevenue;
    }

    public void setCashRevenue(Float cashRevenue) {
        this.cashRevenue = cashRevenue;
    }

    public Float getCashRefund() {
        return cashRefund;
    }

    public void setCashRefund(Float cashRefund) {
        this.cashRefund = cashRefund;
    }

    public Float getCardRevenue() {
        return cardRevenue;
    }

    public void setCardRevenue(Float cardRevenue) {
        this.cardRevenue = cardRevenue;
    }

    public Float getCardRefund() {
        return cardRefund;
    }

    public void setCardRefund(Float cardRefund) {
        this.cardRefund = cardRefund;
    }

    public Float getTransferRevenue() {
        return transferRevenue;
    }

    public void setTransferRevenue(Float transferRevenue) {
        this.transferRevenue = transferRevenue;
    }

    public Float getTransferRefund() {
        return transferRefund;
    }

    public void setTransferRefund(Float transferRefund) {
        this.transferRefund = transferRefund;
    }

    public Float getTotalRevenue() {
        return this.totalRevenue;
    }

    public void setTotalRevenue() {
        this.totalRevenue = this.getCashRevenue() - this.getCashRefund() + this.getCardRevenue() - this.getCardRefund() + this.getTransferRevenue() - this.getTransferRefund();
    }
}
