package Models;

public class Membership {
    private int membershipId;
    private String username;
    private String password;

    public Membership(int membershipId, String username, String password) {
        this.membershipId = membershipId;
        this.username = username;
        this.password = password;
    }

    public Membership(int membershipId){
        this.membershipId = membershipId;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Memberships{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}