package Models;

public class PaymentMethods {
    private int carParkId;
    private String payByPhone;
    private boolean card;

    public PaymentMethods(int carParkId, String payByPhone, boolean card) {
        this.carParkId = carParkId;
        this.payByPhone = payByPhone;
        this.card = card;
    }

    public int getCarParkId() {
        return carParkId;
    }

    public void setCarParkId(int carParkId) {
        this.carParkId = carParkId;
    }

    public String getPayByPhone() {
        return payByPhone;
    }

    public void setPayByPhone(String payByPhone) {
        this.payByPhone = payByPhone;
    }

    public boolean isCard() {
        return card;
    }

    public void setCard(boolean card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "PaymentMethods{" +
                "payByPhone='" + payByPhone + '\'' +
                '}';
    }
}
