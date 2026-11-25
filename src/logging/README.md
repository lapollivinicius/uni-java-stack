# logging

- It is used to monitoring the application
- Logging needs be flexible, customized, have a destination

## frameworks

### SLF4J

SLF4J is an intermediate interface (facede) that provides adapters to handle some loggings frameworks. 
It is integrated with some others frameworks such LogBack, java.util.loggin, reload4j and others.

##### dependencies and installation with logback

We'll need some dependencies that can be installed by maven or imported with .jar in our project

they are these:

- slf4j-api (jar) - Facede to abstract and create adapters to logging framework, it has an api that we interact
- logback-core - Default classes and methods to logging
- logback-classic - To adapt classPath to logback and SLF4J

### logback

LogBack is a framework to abstract the application logging. It has classes those will execute the "logging".
It has an architecture similar  

```
APP -> LOGGER (LEVELS) -> APPENDER (DESTINATION) -> ENCODERS -> LAYOUT
```

- **Logger**: it has different levels to loggers outputs ```TRACE < DEBUG < INFO <  WARN < ERROR | (OFF)```
- **Appender**: They define a destination to log (Console, Files, Remote Sockets, Json, DBs)
- **Encoder** and Layout: They format and define a pattern to log messages

Loggers can inherit "levels" from others loggers and we can define using the same rule using in java, for exemple:

```
ROOT
 └ parentLogger1 (have levels defined as root)
   | |
   | └ childLogger1 (inherits levels and configs from parent)
   | └ childLogger2
   |    └ grandchildLogger1
   |
   └ parentLogger2
     |
     └ childLogger1
     └ childLogger2
```

We can represent the inheritance using dots like class in java, in the example: 
```grandchildLogger1``` can be represented using: ```parentLogger1.childLogger2.grandchildLogger1```

We have a configuration called additivity that define if parent appender will be implemented in children

#### basic configuration

Logback configuration is made by a xml file ```logback.xml``` at root of project (resources).
We can define in this config appenders, loggers and config the root that will be a reference to child loggers.

````xml
<?xml version="1.0" encoding="UTF-8" ?>
<configuration>
    <appender name="name-appender" class="handle.appender.class">
        <target>System.out</target>
        <encoder class="encoder.class">
            <Pattern>
                %d{HH:mm:ss} %highlight(%-5level) %logger{32} - %msg%n
            </Pattern>
        </encoder>
    </appender>
    <logger name="name-logger" level="level-logger" additivity="false">
        <appender-ref ref="name-appender"/>
    </logger>
    <root>
        <appender-ref ref="name-appender" />
    </root>
</configuration>

````

#### appenders

**ConsoleAppender**: Class that will handle logger with console (System.*)
```xml
<appender name="name-appender" class="handle.console.appender.class">
    <target>System.out</target>
    <encoder class="encoder.class">
        <Pattern>
            %d{HH:mm:ss} %highlight(%-5level) %logger{32} - %msg%n
        </Pattern>
    </encoder>
</appender>
```
**FileAppender**: Class that will store some logs messages in a file. Needs impl `<file>`
```xml
<appender name="name-appender" class="handle.file.appender.class">
    <append>false</append>
    <immediateFlush>true</immediateFlush>
    <file>filePath</file>
    <encoder class="encoder.class">
        <Pattern>
            %d{HH:mm:ss} %highlight(%-5level) %logger{32} - %msg%n
        </Pattern>
    </encoder>
</appender>
```
Resources
- `append`: Everytime you run logger, it will append logs below old logs, if you dont want this behavior, use `<append>false</append>`.
- `immediateFlush`: It define if append will create a cache and after put to file or put immediately

**RollingFileAppender**: Similar to FileAppender, but it has a file management to create a log history 
```xml
<appender name="name-appender" class="handle.rolling.file.appender.class">
    <file>filePath</file>
    <rollingPolicy class="rolling.class">
        <fileNamePattern>logFile.%d{yyyy-MM-dd}.log</fileNamePattern>
        <maxHistory>30</maxHistory>
        <totalSizeCap>1GB</totalSizeCap>
    </rollingPolicy>
    <encoder class="encoder.class">
        <Pattern>
            %d{HH:mm:ss} %highlight(%-5level) %logger{32} - %msg%n
        </Pattern>
    </encoder>
</appender>
```
Resources
- `rollingPolice`: Define a behavior to fileAppender, we can have logs file based in time, size and others
- `fileNamePattern`: Set a pattern to log file name using templates
- `maxHistory`: Define a maximum length file
- `totalSizeCap`: Set a file size


