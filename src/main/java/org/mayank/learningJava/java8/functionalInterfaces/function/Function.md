# Function
Goto org.mayank.learningJava.java8.functionalInterfaces.function.FunctionSimple.java class and see how the older incrementByOne() method and newer incrementByOneFunction() method are being implemented.

We can see that incrementByOneFunction() is a Function that takes in Integer as its single aregument and returns an Integer as its single return. And as part of function body, we have a simple cute little lambda function doing its magic.
This incrementByOneFunction() function can be called from the main() method by calling on the apply() method on that function.

### Function Method Chaining
We can also chain multiple Function methods together if we want the output of one Function to be used by another Function.
This can be done by using the andThen() method on the Function, which then returns a Function which can further be used by calling the apply() method on it.

## Bi-Function
Bi-Function is similar to a Function, just that it accepts 2 input elements and returns 1 element.