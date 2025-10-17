package newsletter.subscriber;

import newsletter.publisher.Email;

/**
 * Subscriber que apenas registra no console (poderia gravar em arquivo).
 */
public class LoggerSubscriber implements Subscriber {
    @Override
    public void update(String newsletterTitle, Email email) {
        System.out.println("[Logger] " + newsletterTitle + " -> " + email.getSubject() + " (log registrado)");
    }

    @Override
    public String getName() {
        return "Logger"; 
    }
}
