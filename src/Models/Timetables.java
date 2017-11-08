package Models;

public class Timetables {
    private int carParkId;
    private String weekdayOpening;
    private String weekdayClosing;
    private String saturdayOpening;
    private String saturdayClosing;
    private String sundayOpening;
    private String sundayClosing;
    private String publicHolidayOpening;
    private String publicHolidayClosing;

    public int getCarParkId() {
        return carParkId;
    }

    public void setCarParkId(int carParkId) {
        this.carParkId = carParkId;
    }

    public String getWeekdayOpening() {
        return weekdayOpening;
    }

    public void setWeekdayOpening(String weekdayOpening) {
        this.weekdayOpening = weekdayOpening;
    }

    public String getWeekdayClosing() {
        return weekdayClosing;
    }

    public void setWeekdayClosing(String weekdayClosing) {
        this.weekdayClosing = weekdayClosing;
    }

    public String getSaturdayOpening() {
        return saturdayOpening;
    }

    public void setSaturdayOpening(String saturdayOpening) {
        this.saturdayOpening = saturdayOpening;
    }

    public String getSaturdayClosing() {
        return saturdayClosing;
    }

    public void setSaturdayClosing(String saturdayClosing) {
        this.saturdayClosing = saturdayClosing;
    }

    public String getSundayOpening() {
        return sundayOpening;
    }

    public void setSundayOpening(String sundayOpening) {
        this.sundayOpening = sundayOpening;
    }

    public String getSundayClosing() {
        return sundayClosing;
    }

    public void setSundayClosing(String sundayClosing) {
        this.sundayClosing = sundayClosing;
    }

    public String getPublicHolidayOpening() {
        return publicHolidayOpening;
    }

    public void setPublicHolidayOpening(String publicHolidayOpening) {
        this.publicHolidayOpening = publicHolidayOpening;
    }

    public String getPublicHolidayClosing() {
        return publicHolidayClosing;
    }

    public void setPublicHolidayClosing(String publicHolidayClosing) {
        this.publicHolidayClosing = publicHolidayClosing;
    }

    public Timetables(int carParkId, String weekdayOpening, String weekdayClosing, String saturdayOpening, String saturdayClosing, String sundayOpening, String sundayClosing, String publicHolidayOpening, String publicHolidayClosing) {
        this.carParkId = carParkId;
        this.weekdayOpening = weekdayOpening;
        this.weekdayClosing = weekdayClosing;
        this.saturdayOpening = saturdayOpening;
        this.saturdayClosing = saturdayClosing;
        this.sundayOpening = sundayOpening;
        this.sundayClosing = sundayClosing;
        this.publicHolidayOpening = publicHolidayOpening;
        this.publicHolidayClosing = publicHolidayClosing;
    }

    @Override
    public String toString() {
        return "Timetables{" +
                "weekdayOpening='" + weekdayOpening + '\'' +
                ", weekdayClosing='" + weekdayClosing + '\'' +
                ", saturdayOpening='" + saturdayOpening + '\'' +
                ", saturdayClosing='" + saturdayClosing + '\'' +
                ", sundayOpening='" + sundayOpening + '\'' +
                ", sundayClosing='" + sundayClosing + '\'' +
                ", publicHolidayOpening='" + publicHolidayOpening + '\'' +
                ", publicHolidayClosing='" + publicHolidayClosing + '\'' +
                '}';
    }
}
