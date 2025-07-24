package org.example.service.payment;

public class Threading {
    public static void main(String[] args) {
        AzerQaz azerQaz = new AzerQaz();
        AzerIsiq azerIsiq = new AzerIsiq();
        Azersu azersu = new Azersu();
        azerQaz.payment();
        azerIsiq.payment();
        azersu.payment();
        AzerQaz azerQaz2 = new AzerQaz();
        azerQaz2.payment();

    }
}
