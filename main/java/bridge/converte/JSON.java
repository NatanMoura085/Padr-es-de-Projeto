package bridge.converte;

import bridge.employee.Employee;

public class JSON implements Converte{
    @Override
    public String getEmployee(Employee employee) {
        System.out.println("JSON aqui");
        return employee.toString();
    }
}
