**Lambda expression**

- Lambda is equivalent to a method(function) without a name.
- Lambda's are also referred as Anonymous functions
- They are not tied to any class like a regular method
- They can also be assigned to variable and passed around
- *Uses of lambda expression*
    - Lambda is mainly used to implement Functional interfaces (Single Abstract method interfaces - SAM)

```java
@FunctionalInterface
public interface Comparator<T> {
	int compare(T o1, T o2);
}

@FunctionalInterface
public interface Runnable<T> {
	public abstract void run();
}
```