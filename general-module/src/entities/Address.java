package entities;

public class Address {
    private String flatNum;
    private String lineNum;
    private String Taluka;
    private String District;
    private String State;


    public Address() {
    }

    public String getFlatNum() {
        return flatNum;
    }

    public void setFlatNum(String flatNum) {
        this.flatNum = flatNum;
    }

    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public String getTaluka() {
        return Taluka;
    }

    public void setTaluka(String taluka) {
        Taluka = taluka;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatNum='" + flatNum + '\'' +
                ", lineNum='" + lineNum + '\'' +
                ", Taluka='" + Taluka + '\'' +
                ", District='" + District + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
