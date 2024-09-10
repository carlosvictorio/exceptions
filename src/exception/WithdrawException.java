package exception;

public class WithdrawException extends Exception{

	/**
	 * private static final long serialVersionUID = 1L;
	 */
	

	public WithdrawException() {
		super("The amount exceeds withdraw limit!");
	}
	
	public WithdrawException(String msg) {
		super(msg);
	}
	
}
