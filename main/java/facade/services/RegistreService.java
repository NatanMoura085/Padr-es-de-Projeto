package facade.services;

import facade.model.Registrer;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistreService {
    private Map<Integer, Registrer> memoryCards;


    public RegistreService() {
        memoryCards = new HashMap<>();
        memoryCards.put(54353, new Registrer("Natan", 54.00, new Date()));
        memoryCards.put(454, new Registrer("Ronaldo", 56.00, new Date()));
        memoryCards.put(5435, new Registrer("Natan2", 54.00, new Date()));
        memoryCards.put(45, new Registrer("Ronaldo2", 56.00, new Date()));
    }

    public void getByRegistre(int i) {
        System.out.println(memoryCards.get(i));

    }

    public void newRegistre(Integer numero, Registrer registrer) {
        this.memoryCards.put(numero, registrer);
        System.out.println("Foi criado com sucesso o registro de compra");
    }


    public void removeByIndexRegistre(int i) {
        memoryCards.remove(i);
    }


    public void getValueStore() {
        Double value = memoryCards.values().stream().reduce(0D, (valor, valor2) -> Double.sum(valor, valor2.getValor()), Double::sum);
        System.out.println(value);
    }

    public Map<Integer, Registrer> getMemoryCards() {
        return memoryCards;
    }

    @Override
    public String toString() {
        return "RegistreService{" +
                "memoryCards=" + memoryCards +
                '}';
    }
}


