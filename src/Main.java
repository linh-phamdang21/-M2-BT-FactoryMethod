public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("circle");
        System.out.println(shape1.displaySide());

        Shape shape2 = shapeFactory.getShape("square");
        System.out.println(shape2.displaySide());

        Shape shape3 = shapeFactory.getShape("rectangle");
        System.out.println(shape3.displaySide());
    }
}
