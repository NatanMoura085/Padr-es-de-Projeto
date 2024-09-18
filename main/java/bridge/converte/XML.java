package bridge.converte;

import bridge.employee.Employee;

public class XML implements Converte{
    @Override
    public String getEmployee(Employee employee) {
        System.out.println("XML AQUI");
        employee.getAge().concat(" ");
        return employee.toString();
    }
}
