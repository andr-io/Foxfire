package foxfire.exceptions;

public class RefactorException extends RuntimeException {
    public RefactorException(String message) {
        super("✂️ RefactorInterrupt: " + message);
    }
}
