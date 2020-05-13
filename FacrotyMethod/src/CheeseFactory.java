public class CheeseFactory extends FarmFactory {
    @Override
    public FarmProduct createProduct(String name) {
        FarmProduct product =null;

        if(name.equals("cow_cheese")){
            product = new CowCheese();
            product.setPrice(3.70);
        }

        if(name.equals("goat_cheese")){
            product = new CowCheese();
            product.setPrice(5.70);
        }

        return product;
    }
}
