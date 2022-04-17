package lab_3b;

public class MessagingApp {

	/**
	 * The MessagingApp class can currently only send email messages using
	 * an EmailService object that can send emails to a receiver email ID
	 */
	private EmailService email = new EmailService();
		
	/**
     * Send email with message to receiver.
	 *
     * @param message message contained in the email (non-null)
     * @param receiver email address (non-null)
	 */	
	public void processMessages(String msg, String rec) {
			email.sendEmail(msg, rec);
	}
}


