package Models;

public class CarPark {
    private int carParkId;
    private String carParkName;
    private int noOfSpaces;
    private int costPerHour;
    private int lostTicket;
    private boolean cardPayment;
    private String phonePayment;
    private int averageOutOfFive;
    private String problems;

    public CarPark(int carParkId, String carParkName, int noOfSpaces, int costPerHour, int lostTicket, boolean cardPayment, String phonePayment, int averageOutOfFive, String problems) {
        this.carParkId = carParkId;
        this.carParkName = carParkName;
        this.noOfSpaces = noOfSpaces;
        this.costPerHour = costPerHour;
        this.lostTicket = lostTicket;
        this.cardPayment = cardPayment;
        this.phonePayment = phonePayment;
        this.averageOutOfFive = averageOutOfFive;
        this.problems = problems;
    }

    public int getCarParkId() {
        return carParkId;
    }

    public void setCarParkId(int carParkId) {
        this.carParkId = carParkId;
    }

    public String getCarParkName() {
        return carParkName;
    }

    public void setCarParkName(String carParkName) {
        this.carParkName = carParkName;
    }

    public int getNoOfSpaces() {
        return noOfSpaces;
    }

    public void setNoOfSpaces(int noOfSpaces) {
        this.noOfSpaces = noOfSpaces;
    }

    public int getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(int costPerHour) {
        this.costPerHour = costPerHour;
    }

    public int getLostTicket() {
        return lostTicket;
    }

    public void setLostTicket(int lostTicket) {
        this.lostTicket = lostTicket;
    }

    public boolean isCardPayment() {
        return cardPayment;
    }

    public void setCardPayment(boolean cardPayment) {
        this.cardPayment = cardPayment;
    }

    public String getPhonePayment() {
        return phonePayment;
    }

    public void setPhonePayment(String phonePayment) {
        this.phonePayment = phonePayment;
    }

    public int getAverageOutOfFive() {
        return averageOutOfFive;
    }

    public void setAverageOutOfFive(int averageOutOfFive) {
        this.averageOutOfFive = averageOutOfFive;
    }

    public String getProblems() {
        return problems;
    }

    public void setProblems(String problems) {
        this.problems = problems;
    }

    @Override
    public String toString() {
        return carParkName;
    }
}