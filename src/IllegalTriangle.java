public class IllegalTriangle {
    private final int a, b, c;

    public IllegalTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Cạnh không được nhỏ hơn 0!");
        } else if (a + b <= c || a + c <= b || c + b <= a) {
            throw new IllegalTriangleException("Tổng 2 cạnh phải lớn hơn cạnh còn lại!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "IllegalTriangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
