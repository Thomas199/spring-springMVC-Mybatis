package exception;

/**
 * ��治���쳣
 */
public class NoNumberException extends RuntimeException {
	private static final long serialVersionUID = -1204309558866456940L;

	public NoNumberException(String message) {
		super(message);
	}

	public NoNumberException(String message, Throwable cause) {
		super(message, cause);
	}

}
