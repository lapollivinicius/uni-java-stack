# This is my notes about java and java stack

### Errors 

- Sintax
- Run Time
- Semantic

### Variables

Name RULES AND CONVENTION
    
- Starts with a-z A-Z _ &
- Can Contain a-z A-Z _ & 0-9
- Case Sensitive (Ab != aB)
- camelCase

### Primitive Types

```
TYPES
└── BOOLEAN (FALSE AND TRUE)
└── NUMBERS
    └── FLOAT POINT
    |   └── FLOAT (1.2323) (32bits)
    |   └── DOUBLE (1.239...) (32bits)
    |  
    └── INTEGER (1,2,3...)
        └── byte (8bits | -128 - 127)
        └── short (16bits | -32k - 32k)
        └── int (32bits | -2M - 2M)
        └── long (64bits | -9Qt - 9Qt)
        └── char (1bit)
``` 

### Char Scapes

| SEQ     | DESCRIPTION    |
|---------|----------------|
| \t      | tab            |
| \b      | backspace      |
| \n      | new line       |
| \r      | car return     |
| \f      | next page      |
| \'      | single         |
| \"      | double         |
| \\      | inverted slash |
| \ddd    | octal constant |
| \uxxxx  | hex constant   |

### Operators

ARUTHMETIC

- add (+)
- sub (-)
- times (*)
- div (/)
- mod (%)
- inc (++)
- dev (--)

RELATIONAL

- equal (==)
- diff (!=)
- great than (>)
- less than (<)
- great or equal (>=)
- less or equal (<=)

LOGICAL

- AND (&)
- OR (|)
- XOR (^) -> TRUE WHEN VALUES ARE DIFF
- OR circuit (||) -> FINISH COMPARATION IF GOT RESULT
- AND circuit (&&) -> FINISH COMPARATION IF GOT RESULT
- NOT (!)

PRECEDENCE

1. ()
2. ++, --, +, -, !
3. *, /, %
4. +, -
5. (>, <, >=, <= instanceof)
6. ==, !=
7. &, ^, |
8. &&, ||
9. ? :
10. =, +=, -=

### Packages and imports

java is organized by files this way it order packages

A package in java is named with domain + project (a path), exemple:

```
com.name.domain.myproject.folder / files.java 
```

and this create:

```
src
└── com
    └── domain
        └── project
            └── main.java
```


### POO

Acess Mod

| Modificador                           | Mesma classe | Mesmo package | Subclasse | Outro package |
| ------------------------------------- | :----------: | :-----------: | :-------: | :-----------: |
| `private`                             |       ✅      |       ❌       |     ❌     |       ❌       |
| *(sem modificador)* (package-private) |       ✅      |       ✅       |     ❌*    |       ❌       |
| `protected`                           |       ✅      |       ✅       |     ✅     |       ❌       |
| `public`                              |       ✅      |       ✅       |     ✅     |       ✅       |


Caracteristics

- extendeds
- polymorfism
- inherit
- abstract class
- overload
- build func

interfaces

- objects and methods (typing)