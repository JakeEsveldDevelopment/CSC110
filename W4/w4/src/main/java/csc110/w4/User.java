package csc110.w4;

public class User implements Comparable{
    private String serialNumber, companyName, name, description, leave;

    public User(String serialNumber, String companyName, String name, String description, String leave){
        this.serialNumber = serialNumber;
        this.companyName = companyName;
        this.name = name;
        this.description = description;
        this.leave = leave;
    }

    public User(){
        
    }

    public String toString(){
        return String.format("%s, %s, %s, %s, %s", serialNumber, companyName, name, description, leave);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCompanyName(){
        return this.companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public String getSerialNumber(){
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getLeave(){
        return this.leave;
    }

    public void setLeave(String leave){
        this.leave = leave;
    }
    

    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            return this.name.compareTo(((User)o).getName());
        }else{
            return 0;
        }
    }

}


