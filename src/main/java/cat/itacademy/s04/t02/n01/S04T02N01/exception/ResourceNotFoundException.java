package cat.itacademy.s04.t02.n01.S04T02N01.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
