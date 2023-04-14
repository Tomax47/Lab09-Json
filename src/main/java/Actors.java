import java.util.List;

public class Actors {
    private String name;
    private String address;
    private String birthday;
    private boolean crime;
    private int prisonTime;
    private List<String> friends;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isCrime() {
        return crime;
    }

    public void setCrime(boolean crime) {
        this.crime = crime;
    }

    public int getPrisonTime() {
        return prisonTime;
    }

    public void setPrisonTime(int prisonTime) {
        this.prisonTime = prisonTime;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Actors{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                ", crime=" + crime +
                ", prisonTime=" + prisonTime +
                ", friends=" + friends +
                '}';
    }
}
