# Newsletter Observer Example (Java)

Exemplo do padrão Observer inspirado no tutorial de Refactoring.Guru.
Contexto: Beatriz envia uma newsletter para Ana Beatriz.

Estrutura do projeto:
- src/newsletter/app/Main.java
- src/newsletter/publisher/Newsletter.java
- src/newsletter/publisher/Email.java
- src/newsletter/subscriber/Subscriber.java
- src/newsletter/subscriber/AnaSubscriber.java
- src/newsletter/subscriber/LoggerSubscriber.java
- README.md

Como compilar e executar (Java 8+):

```bash
cd newsletter_observer_example
javac -d out $(find src -name "*.java")
java -cp out newsletter.app.Main
```

O programa simula Beatriz criando uma newsletter e enviando para Ana Beatriz (e registrando em log).
