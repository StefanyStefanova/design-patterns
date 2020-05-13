public class FactoryMethodMain {

    public static void main(String[] args) {

        CheeseFactory cheeseFactory = new CheeseFactory();
        FarmProduct cowCheese = cheeseFactory.produceProduct("cow_cheese");

        MilkFactory milkFactory = new MilkFactory();
        FarmProduct goatMilk = milkFactory.produceProduct("goat_milk");
    }
}
