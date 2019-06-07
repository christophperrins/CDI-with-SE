Each folder has its own README!

# 1. CDI in SE

This is a 4 part piece in which I go through:

- [Java Persistence API (JPA)](https://github.com/christophperrins/JPA-with-SE)
- [**Content and Dependency Injection (CDI)**](https://github.com/christophperrins/CDI-with-SE)
- [Rest Services in Java EE](https://github.com/christophperrins/REST-with-EE)
- [Combining Rest services, CDI and JPA](https://github.com/christophperrins/EEServer)

# 2. Contents
- [2. Contents](#2-contents)
    - [2.1. What's in this chapter?](#21-whats-in-this-chapter)        
      - [2.1.1. Just Concretions](#211-just-concretions)        
      - [2.1.2. Reduced Coupling with Interfaces](#212-reduced-coupling-with-interfaces)   
      - [2.1.3. Dependency Inversion](#213-dependency-inversion)        
      - [2.1.4. Dependency Injection](#214-dependency-injection)        
      - [2.1.5. Dependency Injection with Tags](#215-dependency-injection-with-tags)

## 2.1. What's in this chapter?

- What is Dependency Inversion?
- What is Dependency Injection?
- How to switch which out which class gets injected

### 2.1.1. Just Concretions
In this example each class creates an instance of the next class in which it calls methods inside it.

### 2.1.2. Reduced Coupling with Interfaces
In this example, by using an interface in which Friend and Enemy both inherit from, it slightly easier to switch out friend and enemy

### 2.1.3. Dependency Inversion
If class A calls class B, A is the "dependant" and B is the "dependency". A relies on B.

Dependencies aren't great because it means that the method can't be as reused (Think open closed principle).

In ths example, World can be reused with any class that implements Relation. 

**This is why it is so useful to code to an interface** - it allows for many different implemenetations. It also means that your code is extensible without modification.

This now means that instead of class A depending on class B, class A depends on a Relation abstraction, which can be interchanged easily with a different  concretion. So whether B gets called or not depends on class A, B is now dependant on A => dependency inversion.

### 2.1.4. Dependency Injection
To switch out the implementation is probably going to need a lot of changing to source code. With dependency injection, we simplify it.

By having a 'Container' that manages beans (classes), the container will decide which bean to inject for the interface!

We can make a bunch of implementations, however if we have more than one, it will get confused - because it won't know which one to inject. So we can tag the Enemy with the @Alternative annotation. In the beans.xml we can say that we want to use the following alternative instead of the normal implementation. 

Try changing the configuration in the beans.xml and see how the result coming back changes.

### 2.1.5. Dependency Injection with Tags
Finally we might want to say - inject the friendly types - if there is more than one implementation which is friendly, we can keep applying tags until it is specifying a single class. These tags are then very easy to change out.

It will do its best to match the tags of the implementation with what we want to inject in. 

If no tag is given, it is the same as saying:

```Java
@Inject
@Default
Interface interface;
```

The default tag gets applied (even if we don't explicit write it in)