package Models;

public class Cost {
    private int carParkId;
    private int upToOneHours;
    private int upToTwoHours;
    private int upToThreeHours;
    private int upToFourHours;
    private int upToFiveHours;
    private int overFiveHours;
    private int lostTicket;

    public Cost(int carParkId, int upToOneHours, int upToTwoHours, int upToThreeHours, int upToFourHours, int upToFiveHours, int overFiveHours, int lostTicket) {
        this.carParkId = carParkId;
        this.upToOneHours = upToOneHours;
        this.upToTwoHours = upToTwoHours;
        this.upToThreeHours = upToThreeHours;
        this.upToFourHours = upToFourHours;
        this.upToFiveHours = upToFiveHours;
        this.overFiveHours = overFiveHours;
        this.lostTicket = lostTicket;
    }

    public int getCarParkId() {
        return carParkId;
    }

    public void setCarParkId(int carParkId) {
        this.carParkId = carParkId;
    }

    public int getUpToOneHours() {
        return upToOneHours;
    }

    public void setUpToOneHours(int upToOneHours) {
        this.upToOneHours = upToOneHours;
    }

    public int getUpToTwoHours() {
        return upToTwoHours;
    }

    public void setUpToTwoHours(int upToTwoHours) {
        this.upToTwoHours = upToTwoHours;
    }

    public int getUpToThreeHours() {
        return upToThreeHours;
    }

    public void setUpToThreeHours(int upToThreeHours) {
        this.upToThreeHours = upToThreeHours;
    }

    public int getUpToFourHours() {
        return upToFourHours;
    }

    public void setUpToFourHours(int upToFourHours) {
        this.upToFourHours = upToFourHours;
    }

    public int getUpToFiveHours() {
        return upToFiveHours;
    }

    public void setUpToFiveHours(int upToFiveHours) {
        this.upToFiveHours = upToFiveHours;
    }

    public int getOverFiveHours() {
        return overFiveHours;
    }

    public void setOverFiveHours(int overFiveHours) {
        this.overFiveHours = overFiveHours;
    }

    public int getLostTicket() {
        return lostTicket;
    }

    public void setLostTicket(int lostTicket) {
        this.lostTicket = lostTicket;
    }
}
