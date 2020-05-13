public class ShapeFactory  extends AbstractFactory{
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape.equals("rectangle")) {
            return new Rectangle();
        }
        if(shape.equals("circle")) {
            return new Circle();
        }

        System.out.println("Unknown shape type");
        return null;
    }
}
