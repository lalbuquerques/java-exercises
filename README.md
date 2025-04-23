# ☕ Java Exercises

This repository contains practical Java exercises developed during my learning journey in Object-Oriented Programming (OOP) and Java best practices.  
The structure is organized by folders, focusing on **encapsulation, inheritance, abstraction, and polymorphism**.

---

## 📂 Project Structure

```bash
src/
├── bookexercise/
│   ├── Book.java     # Class with attributes, constructor, getters/setters, toString/hashCode
│   └── Main.java     # Object creation and printing of Book class instances
├── movieexercise/
│   ├── Movie.java    # Class with method overriding and equals/hashCode usage
│   └── Main.java     # Object creation and equality comparison of Movie class instances
├── livingbeing/
│   ├── LivingBeing.java # Sealed abstract superclass with name and getInfo()
│   ├── Animal.java       # Non-sealed subclass with species, getInfo(), and makeSound()
│   ├── Dog.java          # Subclass of Animal overriding makeSound()
│   ├── Cat.java          # Subclass of Animal overriding makeSound()
│   ├── Human.java        # Final subclass with overloading (introduce), equals() and hashCode()
│   └── Main.java         # Tests instance creation, polymorphism, instanceof, and equality
```

---

## 📘 Exercises

### 📚 Book Exercise

Implements a `Book` class with the attributes: `title`, `author`, `pages`, `year`.

**Focuses on:**
- Object creation
- Use of getters and setters
- Encapsulation
- `toString()` and `hashCode()`

---

### 🎬 Movie Exercise

Implements a `Movie` class with the attributes: `title`, `director`, `duration`, `releaseYear`.

Also includes:
- Implementation of `equals()`
- Good practices with `@Override`

---

### 🌱 LivingBeing Exercise

Implements a complete sealed class hierarchy:

- `LivingBeing` is a `sealed abstract class`
- `Animal` is `non-sealed` and has a generic `makeSound()` method
- `Dog` and `Cat` override `makeSound()`
- `Human` is a `final` class with overloaded methods and overrides `equals()` and `hashCode()`

**Concepts applied:**
- Sealed classes (`sealed`, `non-sealed`, `final`)
- Abstract classes and method overriding
- Polymorphism and method overloading
- Object comparison and hash identity (`equals()` and `hashCode()`)
- Use of `instanceof`

---

## 🛠️ Technologies

- Java 17
- IntelliJ IDEA
- Git & GitHub

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/java-exercises.git
   ```

2. Open the project in **IntelliJ IDEA**

3. Run the `Main` classes inside each exercise folder (`bookexercise`, `movieexercise`, `livingbeing`)

---

## 📌 Focus

This repository was created to practice Java fundamentals learned through the DIO bootcamp and personal study.  
Each folder represents a different exercise, with focus on the main OOP pillars:

- Encapsulation
- Inheritance
- Abstraction
- Polymorphism
---

## 💖 Made with care by [Larissa Albuquerque](https://github.com/lalbuquerques)