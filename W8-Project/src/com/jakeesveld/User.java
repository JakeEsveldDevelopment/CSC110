package com.jakeesveld;

public class User implements Comparable{
    private String serialNumber, companyName, name, description, leave, phone, address, time;

    public User(String serialNumber, String companyName, String name, String description,
                String leave, String phone, String address, String time) {
        this.serialNumber = serialNumber;
        this.companyName = companyName;
        this.name = name;
        this.description = description;
        this.leave = leave;
        this.phone = phone;
        this.address = address;
        this.time = time;
    }

    public String getBadLine(){
        if(serialNumber.equals("")) return "1";
        if(companyName.equals("")) return "2";
        if(name.equals("")) return "3";
        if(description.equals(""))return "4";
        if(leave.equals("")) return "5";
        if(phone.equals("")) return "6";
        if(address.equals("")) return "7";
        if(time.equals("")) return "8";
        return null;
    }

    public String toString(){
        return String.format("%s|%s|%s|%s|%s|%s|%s|%s",
                this.serialNumber,
                this.companyName,
                this.name,
                this.description,
                this.leave,
                this.phone,
                this.address,
                this.time);
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLeave() {
        return leave;
    }

    public void setLeave(String leave) {
        this.leave = leave;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            return ((User) o).getName().compareTo(this.name);
        }
        return 0;
    }
}

