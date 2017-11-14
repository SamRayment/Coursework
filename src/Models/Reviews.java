package Models;

public class Reviews {
    private int membershipId;
    private int carParkId;
    private String dateOfReview;
    private String explanation;
    private int outOfFive;

    public Reviews(int membershipId, int carParkId, String dateOfReview, String explanation, int outOfFive) {
        this.membershipId = membershipId;
        this.carParkId = carParkId;
        this.dateOfReview = dateOfReview;
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

    public String getDateOfReview() {
        return dateOfReview;
    }

    public void setDateOfReview(String dateOfReview) {
        this.dateOfReview = dateOfReview;
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
                ", dateOfReview='" + dateOfReview + '\'' +
                ", explanation='" + explanation + '\'' +
                ", outOfFive=" + outOfFive +
                '}';
    }
}