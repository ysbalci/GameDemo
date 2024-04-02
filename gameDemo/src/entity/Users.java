package entity;

public class Users {
    private long id;
    private String userName;
    private String firstName;
    private String lastName;
    private int birthOfYear;
    private String nationalIdentity;

    public Users(){

    }

    public Users(long id, String userName, String firstName, String lastName, int birthOfYear, String nationalIdentity) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfYear = birthOfYear;
        this.nationalIdentity = nationalIdentity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthOfYear() {
        return birthOfYear;
    }

    public void setBirthOfYear(int birthOfYear) {
        this.birthOfYear = birthOfYear;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }
}
