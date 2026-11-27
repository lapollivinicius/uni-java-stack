## serialization

When we want move objects to external destination, we can use the serialization to convert 
this object in a binary file byte array, this file can be used to transport objects to others applications
that are out of our project.

We can apply deserialization to convert this binary into an object to our application. This convert 
process is IO processes. We can use `ObjectOutputStream` to put in a file our binary object or 
`ObjectInputStream` to get an object from binary file.

#### serialization - OUTPUT - Write a object in a file .bin
```java
ObjectOutputStream oos = new ObjectOutputStream(OutputStream(file));
oos.writeObject(myObject);
```

#### deserialization - INPUT - Read a object from a file .bin
```java
ObjectInputStream ois = new ObjectInputStream(InputStream(file));
MyClass myObject = (MyClass) ois.readObject();
```
OBS: Deserialization not use the constructor to construct the object

### serialVersionUID

Created automatically by java using the class structure, it's used to identify a class.
When we deserialize a object, this object class can be changed throwing exceptions.

So, java allow we create (override) this UID to use in our objects and class types, to avoid 
throwing exceptions.

```java
@Serial
private static final Long serialVersionUID = xxxxxxxL;
```