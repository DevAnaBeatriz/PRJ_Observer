package newsletter.subscriber;

import newsletter.publisher.Email;

/**
 * Subscriber concreto que representa Ana Beatriz.
 * Aqui simulamos o envio de email apenas imprimindo no console.
 */
public class AnaSubscriber implements Subscriber {
    private final String email;
    private final String name;

    public AnaSubscriber(String email, String name) {
        this.email = email;
        this.name = name;
    }

    @Override
    public void update(String newsletterTitle, Email emailObj) {
        System.out.println("[Email enviado para: " + email + "]");
        System.out.println("Assunto: " + emailObj.getSubject());
        System.out.println("Corpo:\n" + emailObj.getBody());
        System.out.println("----\n");
    }

    @Override
    public String getName() {
        return name;
    }
}
