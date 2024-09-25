package facade.services;

import facade.model.Registrer;

import java.util.Map;

public class RepportService {
    private RegistreService registreService;

    public RepportService(RegistreService registreService) {
        this.registreService = registreService;
    }


    public void relatorioByRegistre() {
        Map<Integer, Registrer> memoryCards = registreService.getMemoryCards();

        System.out.println(memoryCards.values().stream().map(v -> v.getStoreName()).toList());
        System.out.println(memoryCards.values().stream().map(v -> v.getValor()).toList());
    }
}

