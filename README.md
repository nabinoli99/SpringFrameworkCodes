# 🌱 Spring Framework/SpringBoot Practice Programs

**Welcome to my Spring Framework and SpringBoot practice repository!**

This repo contains simple Spring framework programs and mini‐projects I built to learn and reinforce core concepts of the Spring ecosystem.

Java and Spring are used to build modular, maintainable applications using **Dependency Injection**, **Bean configuration**, and **Object Lifecycle Management**.

---

## 📌 About This Repository

This repository includes practice examples focused on core Spring development — no web UI or Spring Boot yet; just classic Spring basics.

These examples help me understand:

- Inversion of Control (IoC)
- Dependency Injection (DI)
- Bean configuration (XML + annotations)
- Bean scopes
- ApplicationContext
- Annotation-driven Spring setup

Each program is organized as a separate class demonstrating a concept.

---

## 📂 Project Contents

```
SpringFrameworkCodes/
│
├── SpringProgram1.java           – Basic Spring IoC example
├── SpringProgram2.java           – DI with XML config
├── SpringProgram3.java           – Bean scopes
├── SpringAnnotations.java        – Spring annotations demo
├── Spring StudentProject.java    – Student example with DI
├── Spring Program4.java          – Additional practice code
└── applicationContext.xml        – Spring bean definitions

```

> Note: Filenames are representative — exact names match those in your GitHub repo. (GitHub)
> 

---

## 🚀 How to Run

1. **Clone the repository**
    
    ```bash
    git clone https://github.com/nabinoli99/SpringFrameworkCodes.git
    
    ```
    
2. **Import into your IDE** (Eclipse, IntelliJ IDEA, etc.)
3. **Add Spring dependencies**
    
    Make sure your classpath includes the required Spring JARs (or set up via Maven/Gradle).
    
4. **Run a main class**
    
    Most programs contain a `main(...)` that loads the Spring context. For example:
    
    ```java
    ApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    
    ```
    

---

## 🧠 What You’ll Learn

These practice programs demonstrate:

✔ How Spring manages objects (**beans**)

✔ Constructor and setter-based **dependency injection**

✔ Use of **annotations** (`@Component`, `@Autowired`, etc.)

✔ Reading bean definitions from **XML configuration**

This foundation prepares you for **Spring MVC** and **Spring Boot** applications later.

---

## 📈 Next Goals

I plan to expand this repository with:

- Projects using **Spring Boot**
- REST APIs
- Database integration with **Spring Data JPA**
- Unit tests using **Spring Test**
- Annotation-based config (no XML)

---

## 🤝 Contributing

This repo is for learning and sharing. If you have feedback or improvements, feel free to suggest via GitHub issues or pull requests!

---

## 📫 Contact

**Nabin Oli**

GitHub: https://github.com/nabinoli99
Email: enimnabin@gmai.com
