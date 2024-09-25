package facade.services;

public class SecurityService {
    private CardService cardService;
    private RegistreService registreService;

    public SecurityService(CardService cardService) {
        this.cardService = cardService;
    }


    public void blockCard(int cardNum,int registrNum) {
        cardService.removeByIndexCard(cardNum);
        registreService.removeByIndexRegistre(registrNum);
    }
}
