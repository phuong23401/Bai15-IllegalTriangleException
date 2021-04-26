public class IllegalTriangleException extends Exception {
    private final String message;

    public IllegalTriangleException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
