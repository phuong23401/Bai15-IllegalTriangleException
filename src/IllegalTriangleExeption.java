public class IllegalTriangleExeption extends Exception {
    private int perimeter;
    private int area;

    public IllegalTriangleExeption(String message, int perimeter, int area) {
        super(message);
        this.perimeter = perimeter;
        this.area = area;
    }
}
