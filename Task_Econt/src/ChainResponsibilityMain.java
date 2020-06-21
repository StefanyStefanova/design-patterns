public class ChainResponsibilityMain {

    private static Employee getChain(){
        Observer ob = new Man("Pesho");
        Employee cityEmployee = new CityEmployee();
        Employee inBuglariaEmployee = new InBuglariaEmployee();
        Employee internationalEmployee = new InternationalEmployee();

        cityEmployee.setNextEmployee(inBuglariaEmployee);
        inBuglariaEmployee.setNextEmployee(internationalEmployee);

        cityEmployee.subscribe(ob);
        inBuglariaEmployee.subscribe(ob);
        internationalEmployee.subscribe(ob);


        return cityEmployee;
    }

    public static void main(String[] args){
        Employee chain = getChain();
        chain.processShipment("Ivan Ivanov, Peshtersko shose",3);
        chain.processShipment("Petq Dimitrova, Sofia",2);
        chain.processShipment("Mariq Petrova, Belgrad",1);

    }
}
