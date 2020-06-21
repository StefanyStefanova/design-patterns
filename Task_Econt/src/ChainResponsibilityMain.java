public class ChainResponsibilityMain {

    private static Employee getChain(){
        Employee cityEmployee = new CityEmployee();
        Employee inBuglariaEmployee = new InBuglariaEmployee();
        Employee internationalEmployee = new InternationalEmployee();

        cityEmployee.setNextEmployee(inBuglariaEmployee);
        inBuglariaEmployee.setNextEmployee(internationalEmployee);



        return cityEmployee;
    }

    public static void main(String[] args){
        Employee chain = getChain();
        chain.processShipment("Ivan Ivanov, Peshtersko shose",3);
        chain.processShipment("Petq Dimitrova, Sofia",2);
        chain.processShipment("Mariq Petrova, Belgrad",1);

    }
}
