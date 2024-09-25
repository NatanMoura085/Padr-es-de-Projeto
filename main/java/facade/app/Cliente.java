package facade.app;

import facade.facade.FacadeCallCenter;
import facade.model.Registrer;

import java.util.Date;

public class Cliente {
    public static void main(String[] args) {
        FacadeCallCenter facade = new FacadeCallCenter();
        //facade.registreCard(45);
        //facade.repportByCard();
        //facade.registryByMoney();
        facade.registroNovo(43564, new Registrer("Rayssa", 555.55, new Date()));
         System.out.println(facade.getMemoryCards());
    }
}
