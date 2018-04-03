package exception;

/**
 * 预约业务异常
 */
public class AppointException extends RuntimeException {
	private static final long serialVersionUID = -2895342623112366813L;

	public AppointException(String message) {
		super(message);
	}

	public AppointException(String message, Throwable cause) {
		super(message, cause);
	}

}
