package Models;

public class CarParks {
    private int carParkId;
    private String carParkName;
    private int noOfSpaces;
    private boolean cctv;
    private boolean electricParking;
    private boolean disabledParking;
    private boolean childParking;
    private int costPerHour;
    private int lostTicket;
    private boolean cardPayment;
    private String phonePayment;

    public CarParks(int carParkId, String carParkName, int noOfSpaces, boolean cctv, boolean electricParking, boolean disabledParking, boolean childParking, int costPerHour, int lostTicket, boolean cardPayment, String phonePayment) {
        this.carParkId = carParkId;
        this.carParkName = carParkName;
        this.noOfSpaces = noOfSpaces;
        this.cctv = cctv;
        this.electricParking = electricParking;
        this.disabledParking = disabledParking;
        this.childParking = childParking;
        this.costPerHour = costPerHour;
        this.lostTicket = lostTicket;
        this.cardPayment = cardPayment;
        this.phonePayment = phonePayment;
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

    public boolean isCctv() {
        return cctv;
    }

    public void setCctv(boolean cctv) {
        this.cctv = cctv;
    }

    public boolean isElectricParking() {
        return electricParking;
    }

    public void setElectricParking(boolean electricParking) {
        this.electricParking = electricParking;
    }

    public boolean isDisabledParking() {
        return disabledParking;
    }

    public void setDisabledParking(boolean disabledParking) {
        this.disabledParking = disabledParking;
    }

    public boolean isChildParking() {
        return childParking;
    }

    public void setChildParking(boolean childParking) {
        this.childParking = childParking;
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

    @Override
    public String toString() {
        return "CarParks{" +
                "carParkName='" + carParkName + '\'' +
                ", phonePayment='" + phonePayment + '\'' +
                '}';
    }
}