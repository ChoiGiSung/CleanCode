package chapter7;

public class CustomException extends RuntimeException {

    public CustomException(Throwable cause) {
        super(cause);
    }
}
