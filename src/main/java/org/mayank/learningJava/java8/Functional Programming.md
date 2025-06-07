As of now, what we are mainly acustomed to coding in was imparative style of coding. But with the addition of functional programming style in Java, developers are taking a more declarative approch to coding.

Imparative approach includes writing down everything we want the code to do, how to do, managing the loop and its counter. So we see we were in control of everything. Even though it is a good thing to be in control of things, it can also go out of hand when things start to pile up.
For example, we need to define how the for loop works, until what counter it goes, how it increment and what task is needed to be done as part of the loop. Moreover we are passing our collection or object to a loop.

In declarative programming style the same thing can be achieved by an internal iterator that is applied to the object itself, using the .forEach() method. And now we don't care how it iterates, we just provide it with the work we want it to do and it does it and we don't care how. This is declarative style.

In Java declarative gets its power from the concept of: 
- lambda
- streams
- functional programming

Underneath all of this, sits Single Abstract Method Interfaces.
___
## Java Functional Programming Concepts
Functional Interface = Single Abstract Method (SAM) Interface = @FunctionalInterface

- Function -> 1 input, 1 output
- BiFunction -> 2 input, 1 output

- Consumer -> 1 input, 0 output
- BiConsumer -> 2 input, 0 output

- Predicate -> 1 input, 1 boolean output
- Supplier -> 0 input, 1 output

These Functional Interfaces can also be used as we use callback in JS.

Rules of pure functional programming:
- No state
- Pure functions
- No side effects
- Higher Order Functions
___
## MOC

1. Imperative
2. Declarative

3. Function - BiFunction
4. Consumer - BiConsumer
5. Predicate
6. Supplier

Using these Functional Interfaces
7. Streams
8. Optional
9. Callbacks


___
## Functional Interfaces
[ Lambdas and Streams Master Class Part 1 José Paumard, Stuart Marks voxxed ](https://www.youtube.com/)

**Theory**

A functional interface is:
- An interface
- With one abstract method
- Methods from Object do not count
- May be annotated with @FunctionalInterface
- Ex: Runnable

So a functional interface is just a normal class with a single abstract method, which can be implemented normally
or by a lambda function. Since we know we just have 1 method that can be implemented so we don't write the verbose
code definig the class name, wrapping the method in the class and writing the function body, the compiler will
do all this for us (until there is no confusion, as of now).

**Practical**
