package shop;

public class Manager {
    private String nameManager;
    private String surnameManager;
    private int id;
    private int pincode;

    public Manager(String nameManager, String surnameManager, int id, int pincode) {
        this.nameManager = nameManager;
        this.surnameManager = surnameManager;
        this.id = id;
        this.pincode = pincode;
    }

    public String getNameManager() {
        return nameManager;
    }

    public void setNameManager(String nameManager) {
        this.nameManager = nameManager;
    }

    public String getSurnameManager() {
        return surnameManager;
    }

    public void setSurnameManager(String surnameManager) {
        this.surnameManager = surnameManager;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
