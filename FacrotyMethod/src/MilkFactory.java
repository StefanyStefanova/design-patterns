public class MilkFactory extends FarmFactory {
    @Override
    public FarmProduct createProduct(String name) {

        FarmProduct product = null;

        if (name.equals("cow_milk")) {
            product = new CowCheese();
            product.setPrice(1.70);
        }

        if (name.equals("goat_milk")) {
            product = new CowCheese();
            product.setPrice(2.70);
        }

        return product;
    }

}
