package pl.sda;

public class FancyFigureBox<T extends Figure> extends FigureBox<T> {

    public FancyFigureBox(T element) {
        super(element);
    }
}
