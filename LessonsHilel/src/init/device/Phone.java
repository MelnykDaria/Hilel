package init.device;

public  class Phone {

    private String phoneNumber;
    private String model;
    private String weight;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println(" our " + name + " is calling");

    }
 public Phone() {
 }

    public Phone(String phoneNumber, String model, String weight) {
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.weight = weight;

        }
    }


