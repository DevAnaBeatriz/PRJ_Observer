package newsletter.app;

import newsletter.publisher.Email;
import newsletter.publisher.Newsletter;
import newsletter.subscriber.AnaSubscriber;
import newsletter.subscriber.LoggerSubscriber;

public class Main {
    public static void main(String[] args) {
        // Criador do newsletter (publisher) - Beatriz
        Newsletter beatrizNewsletter = new Newsletter("Beatriz's Monthly Tech");

        // Assinantes
        AnaSubscriber ana = new AnaSubscriber("ana.beatriz@example.com", "Ana Beatriz");
        LoggerSubscriber logger = new LoggerSubscriber();

        // Inscreve assinantes
        beatrizNewsletter.subscribe(ana);
        beatrizNewsletter.subscribe(logger);

        // Cria um email/newsletter
        Email edition = new Email(
                "Edição de Outubro - 2025",
                "Olá Ana Beatriz!\n\nEsta é a edição de Outubro com novidades sobre Java e Design Patterns.\n\nAbraços,\nBeatriz"
        );

        // Beatriz publica/manda a newsletter
        beatrizNewsletter.publish(edition);

        // Desinscreve o logger e publica outra edição para demonstrar
        beatrizNewsletter.unsubscribe(logger);
        Email edition2 = new Email(
                "Edição Extra - Novidades Rápidas",
                "Olá novamente!\n\nPequena nota rápida sobre um novo workshop.\n\n— Beatriz"
        );
        beatrizNewsletter.publish(edition2);
    }
}
