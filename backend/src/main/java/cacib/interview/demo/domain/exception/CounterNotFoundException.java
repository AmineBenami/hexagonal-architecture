package cacib.interview.demo.domain.exception;


/**
 * CounterNotFoundException
 */
public class CounterNotFoundException extends RuntimeException{

    public CounterNotFoundException() {
        super();
    }

    public CounterNotFoundException(String message) {
        super(message);
    }

    public CounterNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}