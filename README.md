# Exemplos do Padrão Observer em Java

Este repositório contém **dois projetos em Java** que implementam o **padrão de projeto Observer**, com base no conteúdo do [Refactoring.Guru](https://refactoring.guru/pt-br/design-patterns/observer/java/example).

O padrão **Observer** define uma relação **"um-para-muitos"** entre objetos, permitindo que quando um objeto (o *sujeito* ou *publisher*) muda de estado, todos os seus *observadores* sejam notificados automaticamente.

---

## Estrutura do Repositório

```
.
├── PRJ_Observer/                     # Exemplo inspirado no Refactoring.Guru
│   ├── src/
│   │   ├── editor/                   # Classe principal Editor (gera eventos)
│   │   ├── listeners/                # Observadores (Log e Email)
│   │   └── publisher/                # Classe EventManager (gerencia subscrições)
│   └── README.md
│
└── newsletter_observer_example/      # Exemplo de gerenciador de newsletters
    ├── src/
    │   ├── newsletter/
    │   │   ├── app/                 # Classe principal Main.java
    │   │   ├── publisher/           # Newsletter (Publisher) e Email
    │   │   └── subscriber/          # Subscribers (Ana, Logger)
    └── README.md
```

---

## Projeto 1: PRJ_Observer

### Descrição

Simula o funcionamento de um **editor de texto** com eventos de **abrir** e **salvar arquivo**, seguindo o padrão **Observer**.  
O editor notifica automaticamente os observadores (`LogOpenListener` e `EmailNotificationListener`) quando esses eventos ocorrem.

### Estrutura principal

| Componente | Função |
|-------------|--------|
| `Editor` | Classe principal que dispara eventos ("open", "save") |
| `EventManager` | Gerencia os assinantes e envia notificações |
| `EventListener` | Interface base dos observadores |
| `LogOpenListener` | Registra no log quando um arquivo é aberto |
| `EmailNotificationListener` | Simula envio de e-mail quando um arquivo é salvo |

### Como executar

Na pasta `PRJ_Observer`, compile e execute:

```bash
javac -d out $(find src -name "*.java")
java -cp out com.mycompany.prj_observer.PRJ_Observer
```

**No Windows (PowerShell):**
```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName
java -cp out com.mycompany.prj_observer.PRJ_Observer
```

---

## Projeto 2: Newsletter Observer Example

### Descrição

Beatriz gerencia uma newsletter mensal e envia mensagens para seus assinantes.  
Quando uma nova edição é publicada, **todos os assinantes (observers)** são notificados automaticamente.  
Entre eles, **Ana Beatriz** recebe um e-mail e um **Logger** registra os envios no console.

### Estrutura principal

| Componente | Função |
|-------------|--------|
| `Newsletter` | Publisher principal (Beatriz) |
| `Email` | Representa o conteúdo da newsletter |
| `Subscriber` | Interface base dos assinantes |
| `AnaSubscriber` | Recebe o e-mail (representa Ana Beatriz) |
| `LoggerSubscriber` | Apenas registra logs das publicações |
| `Main` | Classe que orquestra as publicações e assinaturas |

### Como executar

Na pasta `newsletter_observer_example`:

```bash
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName
java -cp out newsletter.app.Main
```

### Saída esperada

```
[Newsletter] Ana Beatriz subscreveu à 'Beatriz's Monthly Tech'.
[Newsletter] Logger subscreveu à 'Beatriz's Monthly Tech'.

[Newsletter] Publicando: Edição de Outubro - 2025 — notificando 2 assinante(s).

[Email enviado para: ana.beatriz@example.com]
Assunto: Edição de Outubro - 2025
Corpo:
Olá Ana Beatriz!

Esta é a edição de Outubro com novidades sobre Java e Design Patterns.

Abraços,
Beatriz
----
[Logger] Beatriz's Monthly Tech -> Edição de Outubro - 2025 (log registrado)
```

---

## Conceito resumido do padrão Observer

> O padrão **Observer** permite que múltiplos objetos "observem" um evento ou mudança de estado em outro objeto.  
> Quando algo muda, o publisher notifica automaticamente todos os observers registrados, sem precisar conhecê-los diretamente.

### Benefícios
- Desacoplamento entre emissores e ouvintes.  
- Fácil adição ou remoção de observadores.  
- Reutilização e extensão facilitadas.

---

## Autor(a)

Desenvolvido como exercício de estudo de **Design Patterns (Observer)** e boas práticas em Java.  
Inspirado no exemplo oficial do site [Refactoring.Guru](https://refactoring.guru/pt-br/design-patterns/observer/java/example).
