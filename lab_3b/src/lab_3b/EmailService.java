package lab_3b;

public class EmailService {

	/**
	   * Send email with message to receiver.
	   *
	   * @param message message contained in the email (non-null)
	   * @param receiver email address (non-null)
	   */
	public void sendEmail(String message, String receiver){
		System.out.println("Email sent to "+receiver+ " with Message: "+message);
	}
}