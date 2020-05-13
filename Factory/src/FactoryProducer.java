public class FactoryProducer  {

    public static AbstractFactory getFactory(String factory){
        if(factory.equals("shape")){
            return new ShapeFactory();
        }
        if(factory.equals("color")) {
            return new ColorFactory();
        }

        System.out.println("Unknown factory type");
        return null;

    }

}
