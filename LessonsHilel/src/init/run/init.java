package init.run;


import init.device.Phone;

public class init {
    public static void main(String[] args)
    {
        Phone pixel  = new Phone();
        Phone iphone = new Phone("+380994213423" , "iPhone12" , "100.0");
        Phone samsung = new Phone("+3809312345678" , "A25" , "200.0");

        pixel.setPhoneNumber("+3809321");
        iphone.setPhoneNumber("+3809321231");
        samsung.setPhoneNumber("+3809345234");

        System.out.println(pixel.getPhoneNumber());
        System.out.println(iphone.getPhoneNumber());
        System.out.println(samsung.getPhoneNumber());

        pixel.receiveCall("Alex");
        iphone.receiveCall("Sungwo");
        samsung.receiveCall("Kristen");

        System.out.println("......................");

        System.out.println("Samsung details");
        System.out.println(samsung.getPhoneNumber());
        System.out.println(samsung.getModel());
        System.out.println(samsung.getWeight());

        System.out.println("iphone details");
        System.out.println(iphone.getPhoneNumber());
        System.out.println(iphone.getModel());
        System.out.println(iphone.getWeight());

        System.out.println("pixel details");
        System.out.println(pixel.getPhoneNumber());
        System.out.println(pixel.getModel());
        System.out.println(pixel.getWeight());
    }


}
