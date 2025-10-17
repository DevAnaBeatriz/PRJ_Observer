package newsletter.subscriber;

import newsletter.publisher.Email;

/**
 * Observer interface.
 */
public interface Subscriber {
    void update(String newsletterTitle, Email email);
    String getName();
}
