package Models;


public class Review {
    private int reviewId;
    private int carParkId;
    private String explanation;
    private int outOfFive;

    public Review(int reviewId, int carParkId, String explanation, int outOfFive) {
        this.reviewId = reviewId;
        this.carParkId = carParkId;
        this.explanation = explanation;
        this.outOfFive = outOfFive;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
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
        return  explanation;
    }
}