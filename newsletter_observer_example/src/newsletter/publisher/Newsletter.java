package newsletter.publisher;

import newsletter.subscriber.Subscriber;
import java.util.ArrayList;
import java.util.List;

/**
 * Subject (Publisher) no padrão Observer.
 * Mantém lista de assinantes e notifica quando uma nova Email/newsletter é publicada.
 */
public class Newsletter {
    private final String title;
    private final List<Subscriber> subscribers = new ArrayList<>();

    public Newsletter(String title) {
        this.title = title;
    }

    public void subscribe(Subscriber s) {
        subscribers.add(s);
        System.out.println("[Newsletter] " + s.getName() + " subscreveu à '" + title + "'.");
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
        System.out.println("[Newsletter] " + s.getName() + " foi desinscrito de '" + title + "'.");
    }

    public void publish(Email email) {
        System.out.println("\n[Newsletter] Publicando: " + email.getSubject() + " — notificando " + subscribers.size() + " assinante(s).\n");
        for (Subscriber s : new ArrayList<>(subscribers)) {
            s.update(this.title, email);
        }
    }
}
