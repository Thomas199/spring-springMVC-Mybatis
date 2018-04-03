package exception;

/**
 * ÷ÿ∏¥‘§‘º“Ï≥£
 */
public class RepeatAppointException extends RuntimeException {
	private static final long serialVersionUID = -3085295127095991157L;

	public RepeatAppointException(String message) {
		super(message);
	}

	public RepeatAppointException(String message, Throwable cause) {
		super(message, cause);
	}

}
