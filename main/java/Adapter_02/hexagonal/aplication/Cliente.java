package Adapter_02.hexagonal.aplication;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
    public static void main(String[] args) {
        UseREST useREST = new UseREST();
        Map<String,String> body = new HashMap<>();
        body.put("email","email@gmail.com");
        body.put("nome","email@gmail.com");
        Integer user = useREST.post(body);
        System.out.println(user);
        System.out.println(useREST.getAll());
    }
}
