public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {

        if(color.equals("blue")) {
            return new Blue();
        }
        if(color.equals("red")) {
            return new Red();
        }

        System.out.println("Unknown color type");
        return null;
    }

    @Override
    Shape getShape(String Shape) {
        return null;
    }
}
