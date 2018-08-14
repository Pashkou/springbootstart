package siarhei.pashkou.exception;

public class BookNotFoundException extends RuntimeException {
	 
    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public BookNotFoundException() {
    }
 
}