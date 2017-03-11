# Log4j.properties example

* Output to Console : All logging will be redirected to your console.

```
//log4j.properties

 # Root logger option
log4j.rootCategory=INFO, RFA, File


 # Redirect log messages to console
log4j.appender.RFA=org.apache.log4j.ConsoleAppender
log4j.appender.RFA.Append=true
log4j.appender.RFA.layout=org.apache.log4j.PatternLayout
log4j.appender.RFA.layout.ConversionPattern=%d{MM-dd HH:mm:ss} %-5p [%c{1}] %m%n
 #log4j.appender.RFA.layout.ConversionPattern=%d{HH:mm:ss} %m - %p %l%n

 #Extensive logging on our classes
log4j.additivity.com.rupp=false
log4j.category.com.rupp=DEBUG, RFA, File

```

* Output to File

```
log4j.rootCategory=INFO, file, RFA

 #Application logging file
log4j.appender.file=org.apache.log4j.DailyRollingFileAppender
log4j.appender.file.MaxFileSize=10MB
log4j.appender.file.File=logs/sample.log
log4j.appender.file.DatePattern='.'yyyy-MM-dd
log4j.appender.file.MaxBackupIndex=10
log4j.appender.file.layout=org.apache.log4j.PatternLayout
log4j.appender.file.layout.ConversionPattern=%d{MM-dd HH:mm:ss} %-5p [%c{1}] %m%n

 #Extensive logging on our classes
log4j.additivity.com.rupp=false
log4j.category.com.rupp=DEBUG, RFA, File

```

* Output to Console and File

```
# Root logger option
#log4j.rootCategory=INFO, RFA
log4j.rootCategory=INFO, file, RFA

 # Application logging file
log4j.appender.file=org.apache.log4j.DailyRollingFileAppender
log4j.appender.file.MaxFileSize=10MB
log4j.appender.file.File=logs/sample.log
log4j.appender.file.DatePattern='.'yyyy-MM-dd
log4j.appender.file.MaxBackupIndex=10
log4j.appender.file.layout=org.apache.log4j.PatternLayout
log4j.appender.file.layout.ConversionPattern=%d{MM-dd HH:mm:ss} %-5p [%c{1}] %m%n

 # Redirect log messages to console
log4j.appender.RFA=org.apache.log4j.ConsoleAppender
log4j.appender.RFA.Append=true
log4j.appender.RFA.layout=org.apache.log4j.PatternLayout
log4j.appender.RFA.layout.ConversionPattern=%d{MM-dd HH:mm:ss} %-5p [%c{1}] %m%n
#log4j.appender.RFA.layout.ConversionPattern=%d{HH:mm:ss} %m - %p %l%n

 # Extensive logging on our classes
log4j.additivity.com.rupp=false
log4j.category.com.rupp=DEBUG, RFA, file


```
