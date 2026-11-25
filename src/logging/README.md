## logging

- It is used to monitoring the application
- Logging needs be flexible, customized, have a destination

### Logging Frameworks

#### SLF4J

SLF4J is an intermediate interface that provides adapters to handle some loggings frameworks. 
It is integrated with some others frameworks such LogBack, java.util.loggin, reload4j and others.

###### Dependencies and installation with logback

it will need:

- slf4j-api (jar)
- logback-core
- logback-classic

#### LogBack

LogBack is a framework to abstract the application logging. Their arc works like this:

```
APP -> LOGGER (LEVELS) -> APPENDER (DESTINATION) -> ENCODERS -> LAYOUT
```