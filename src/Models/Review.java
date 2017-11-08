package Models;

public class Review {
    private int carParkId;
    private int membershipId;
    private int username;
    private String reviewAddedDate;
    private String description;

    public Review(int carParkId, int membershipId, int username, String reviewAddedDate, String description) {
        this.carParkId = carParkId;
        this.membershipId = membershipId;
        this.username = username;
        this.reviewAddedDate = reviewAddedDate;
        this.description = description;
    }

    public int getCarParkId() {
        return carParkId;
    }

    public void setCarParkId(int carParkId) {
        this.carParkId = carParkId;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public String getReviewAddedDate() {
        return reviewAddedDate;
    }

    public void setReviewAddedDate(String reviewAddedDate) {
        this.reviewAddedDate = reviewAddedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewAddedDate='" + reviewAddedDate + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
