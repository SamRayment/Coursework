package Models;


public class Review {
    private int membershipId;
    private int carParkId;

    private String explanation;
    private int outOfFive;

    public Review(int membershipId, int carParkId, String explanation, int outOfFive) {
        this.membershipId = membershipId;
        this.carParkId = carParkId;
        this.explanation = explanation;
        this.outOfFive = outOfFive;
    }

    public Review(String explanation, int outOfFive){
        this.explanation = explanation;
        this.outOfFive = outOfFive;
    }
    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public int getCarParkId() {
        return carParkId;
    }

    public void setCarParkId(int carParkId) {
        this.carParkId = carParkId;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public int getOutOfFive() {
        return outOfFive;
    }

    public void setOutOfFive(int outOfFive) {
        this.outOfFive = outOfFive;
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "membershipId=" + membershipId +
                ", carParkId=" + carParkId +
                ", explanation='" + explanation + '\'' +
                ", outOfFive=" + outOfFive +
                '}';
    }
}