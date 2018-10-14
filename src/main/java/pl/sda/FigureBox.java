package pl.sda;

public class FigureBox<T extends Figure> {

    private T element;

    public FigureBox(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public String toString() {
        return getElement().toString() + " !!!";
    }
}
