package pl.sda;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        FigureBox<Circle> circleBox = new FigureBox<>(circle);

        System.out.println(circleBox.getElement());


        //FigureBox<Rectangle> rectangleBox = new FigureBox<>(new Square());  //compilation error


        FancyFigureBox<?> fancyBox = new FancyFigureBox<>(new Rectangle());
        //fancyBox.setElement(new Circle());                //compilation error, ? insted of Circle

        testWildCard(fancyBox);
        testUpperBound(fancyBox);

        //testFigureBox(fancyBox);                          //compilation error, beacause Figure not ? extends

        FancyFigureBox<Rectangle> fancyBox2 = new FancyFigureBox<>(new Rectangle());
        testLowerBound(fancyBox2);                         //lower bound

        FancyFigureBox<Square> fancyBox3 = new FancyFigureBox<>(new Square());
        //testLowerBound(fancyBox3);                         //compilation error, lower bound
    }

    //testWildCard example
    private static void testWildCard(FancyFigureBox<?> box) {
        Object object = box.getElement();
        System.out.println(object);
    }

    //upper bound, limit only to ? types extending Figure
    private static void testUpperBound(FancyFigureBox<? extends Figure> box) {
        Figure figure = box.getElement();
        System.out.println(figure);
    }

    private static void testFigureBox(FancyFigureBox<Figure> box) {
        Figure figure = box.getElement();
        System.out.println(figure);
    }

    private static void testLowerBound(FancyFigureBox<? super Rectangle> box) {
        Figure figure = box.getElement();
        System.out.println(figure);
    }
}
