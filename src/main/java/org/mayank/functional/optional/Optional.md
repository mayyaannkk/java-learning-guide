# Optionals
Optionals were made to overcome the NullPointerException that may arise due to lack of data.
Sometimes we may or may not get data from the database or some filter method, and we need to perform certain checks
to validate if the data is present or not. To simplify this check for data Optional were formed.

Optional make these data checks easy and remove the NullPointerException being thrown from your code.

It provides certain method to do tasks, such as 
1. get() to get the value of the optional
2. isPresent()
3. isPresentOrElse()
4. orElse()
5. orElseThrow()
6. ...

Optional + its methods makes our life easy and lets us play with NullPointerException. 