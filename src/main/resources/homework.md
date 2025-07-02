
* **SOLID Principles**
* **Creational Design Patterns** (Singleton, Factory, Prototype, Builder)
* **Behavioral Design Pattern** (Strategy)
* **Dependency Injection (DI)**

Each task is standalone and ends with a **combined mini-project** to simulate a real-world use case.
This can be done in Java 8+.

---

##  Homework Tasks

---

###  Task 1: **Single Responsibility Principle (SRP)**

**Problem:**
Create a `Report` class that:

* Generates a report
* Saves it to a file
* Sends it via email

**Refactor** the class so that each responsibility is handled by its own class.

**Deliverables:**

* `ReportGenerator`
* `FileSaver`
* `EmailSender`

---

### Task 2: **Open-Closed Principle (OCP)**

**Problem:**
Create a `DiscountCalculator` class that calculates discount for:

* Regular customer (5%)
* Premium customer (10%)

 Without modifying the calculator, **extend** it to support a **SuperPremium customer (20%)**.

**Use:** Abstract class or interface for strategy.

---

### Task 3: **Liskov Substitution Principle (LSP)**

**Problem:**
Create a base class `Bird` with method `fly()` and a subclass `Penguin`.

 Ensure `Penguin` doesn’t break LSP (because penguins can’t fly).

**Hint:** Extract `Flyable` behavior instead of putting it in the base class.

---

###  Task 4: **Interface Segregation Principle (ISP)**

**Problem:**
Create an interface `Animal` with methods: `walk()`, `fly()`, `swim()`.

 Break this interface into multiple **specific interfaces** and implement only relevant ones for classes like `Dog`, `Eagle`, `Shark`.

---

###  Task 5: **Dependency Inversion Principle (DIP)**

**Problem:**
A `PaymentProcessor` class directly uses a `CreditCardService`.

 Refactor it to depend on an **interface**, and allow injecting different payment types (UPI, NetBanking, etc.)

---

##  CREATIONAL DESIGN PATTERNS

---

###  Task 6: **Singleton**

**Problem:**
Create a `Logger` class that:

* Logs to a file or console
* Should only have **one instance**

 Make it thread-safe and use lazy initialization.

---

### Task 7: **Factory Pattern**

**Problem:**
Create a `ShapeFactory` that returns objects like `Circle`, `Rectangle`, and `Triangle`.

 Based on a user’s input, return the appropriate object without exposing the creation logic.

---

### Task 8: **Builder Pattern**

**Problem:**
Build a `User` object with optional fields:

* firstName (required)
* lastName (optional)
* phone
* email
* address

 Use **Builder pattern** to create readable chained object construction.

---

### Task 9: **Prototype Pattern**

**Problem:**
Clone an `EmployeeRecord` object with:

* id, name, department, salary

 Make sure the original and clone are two different objects.

---

##  BEHAVIORAL DESIGN PATTERN

---

### Task 10: **Strategy Pattern**

**Problem:**
Create a `CompressionContext` that can compress files using:

* Zip
* Rar
* 7z

 At runtime, select the strategy based on user preference.

---

##  Dependency Injection (Manual)

---

### Task 11: **Dependency Injection**

**Problem:**
Create a `NotificationService` that sends messages via:

* Email
* SMS

 Inject the channel using **constructor injection**.

---

## Final Task: Combine All Concepts

**Project:** 🛒 **Mini E-Commerce System**

### Use:

| Concept       | Usage                                                                       |
| ------------- | --------------------------------------------------------------------------- |
| **SRP**       | Split product listing, payment, and reporting responsibilities              |
| **OCP**       | Add new product types or payment methods                                    |
| **LSP**       | Replace services like `EmailService` with subclasses without breaking logic |
| **ISP**       | Separate interfaces like `Payable`, `Shippable`                             |
| **DIP**       | Inject dependencies like `Logger`, `PaymentGateway`                         |
| **Singleton** | App-wide Logger or ConfigManager                                            |
| **Factory**   | Create payment gateways (`PayPal`, `Stripe`, etc.)                          |
| **Builder**   | Order object creation                                                       |
| **Prototype** | Duplicate orders or product templates                                       |
| **Strategy**  | Pricing strategies (flat, dynamic, promotional)                             |
| **DI**        | Inject all services manually or via Spring later                            |

---

## Bonus Tips
* Write **unit tests**
* Use **interfaces** and **collections**
* Handle **exceptions**
* Log using the `Singleton Logger`

---