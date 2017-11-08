package Models;

public class Location {
    private int carParkId;
    private String town;
    private String problems;
    private boolean cctv;
    private boolean electricParking;
    private boolean disbaledParking;
    private boolean childParking;

    public Location(int carParkId, String town, String problems, boolean cctv, boolean electricParking, boolean disbaledParking, boolean childParking) {
        this.carParkId = carParkId;
        this.town = town;
        this.problems = problems;
        this.cctv = cctv;
        this.electricParking = electricParking;
        this.disbaledParking = disbaledParking;
        this.childParking = childParking;
        }

        public int getCarParkId() {
            return carParkId;
        }

        public void setCarParkId(int carParkId) {
            this.carParkId = carParkId;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getProblems() {
            return problems;
        }

        public void setProblems(String problems) {
            this.problems = problems;
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

        public boolean isDisbaledParking() {
            return disbaledParking;
        }

        public void setDisbaledParking(boolean disbaledParking) {
            this.disbaledParking = disbaledParking;
        }

        public boolean isChildParking() {
            return childParking;
        }

        public void setChildParking(boolean childParking) {
            this.childParking = childParking;
        }

    @Override
    public String toString() {
        return "Location{" +
                "problems='" + problems + '\'' +
                '}';
    }
}
