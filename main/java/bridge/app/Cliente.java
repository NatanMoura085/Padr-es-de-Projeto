package bridge.app;

import bridge.converte.Converte;
import bridge.converte.XML;
import bridge.employee.Employee;
import bridge.employee.ProjectManage;

public class Cliente {
    public static void main(String[] args) {
        Converte converte = new XML();
        Employee employee = new ProjectManage("Natan","25","email@gmail.com");
        converte.getEmployee(employee);

        System.out.println(employee);
    }
}
