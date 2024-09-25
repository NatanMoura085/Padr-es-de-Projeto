package facade.facade;

import facade.model.Registrer;
import facade.services.CardService;
import facade.services.RegistreService;
import facade.services.RepportService;
import facade.services.SecurityService;

import java.util.Map;

public class FacadeCallCenter {
    private CardService cardService;
    private RegistreService registreService;
    private RepportService repportService;
    private SecurityService securityService;

    public FacadeCallCenter() {
        cardService = new CardService();
        registreService = new RegistreService();
        repportService = new RepportService(registreService);
        securityService = new SecurityService(cardService);
    }


    public void repportByCard() {
        repportService.relatorioByRegistre();
    }

    public void registreCard(int i) {
        registreService.getByRegistre(i);
    }

    public void registryByMoney() {
        registreService.getValueStore();
    }

    public void registroNovo(Integer numero, Registrer registrer) {
        registreService.newRegistre(numero, registrer);
    }

    public Map<Integer, Registrer> getMemoryCards() {
        return registreService.getMemoryCards();
    }

}
