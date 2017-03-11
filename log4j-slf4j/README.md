# Log4j with slf4j example

# maven dependency
```
    <!-- Logging -->
    <dependency>
        <groupId>log4j</groupId>
        <artifactId>log4j</artifactId>
        <version>1.2.17</version>
    </dependency>
    <!-- Logging -->
     <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>jcl-over-slf4j</artifactId>
        <version>1.7.22</version>
    </dependency>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>1.7.22</version>
    </dependency>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-log4j12</artifactId>
        <version>1.7.22</version>
    </dependency>
    
```

# make classpath

mvn eclipse:eclipse

# log4j.xml , it must be named log4j.xml
===================
```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE log4j:configuration SYSTEM "log4j.dtd">

<!-- ===================================================================== -->
<!--                                                                       -->
<!--  Log4j Configuration                                                  -->
<!--                                                                       -->
<!-- ===================================================================== -->

<log4j:configuration xmlns:log4j="http://jakarta.apache.org/log4j/" debug="false">

  <appender class="org.apache.log4j.AsyncAppender" name="ASYNC">
    <appender-ref ref="FILE"/>
    <appender-ref ref="CONSOLE"/>
  </appender>

  <appender class="org.apache.log4j.RollingFileAppender" name="FILE">
    <param name="File" value="logs/sample.log"/>
    <param name="MaxBackupIndex" value="10"/>
    <param name="MaxFileSize" value="10mb"/>
    <layout class="org.apache.log4j.PatternLayout">
      <param name="ConversionPattern" value="%d{MM-dd HH:mm:ss,SSS} %-5p [%c{1}] %m%n"/>
    </layout>
  </appender>

  <!-- ============================== -->
  <!-- Append messages to the console -->
  <!-- ============================== -->

  <appender class="org.apache.log4j.ConsoleAppender" name="CONSOLE">
    <param name="Threshold" value="ALL"/>
    <param name="Target" value="System.out"/>

    <layout class="org.apache.log4j.PatternLayout">
      <!-- The default pattern: Date Priority [Category] Message\n -->
      <param name="ConversionPattern" value="%d{ABSOLUTE} %-5p [%c{1}] %m%n"/>
    </layout>
  </appender>

  <!-- ================ -->
  <!-- Limit categories -->
  <!-- ================ -->
    
  <category additivity="true" name="com.rupp">
    <priority value="DEBUG" />
  </category>
 
  
  <!-- ======================= -->
  <!-- Setup the Root category -->
  <!-- ======================= -->

  <root>
    <level value="INFO" />
    <appender-ref ref="ASYNC"/>
  </root>
  
</log4j:configuration>
==========================


How to use it in class :

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
private final static Logger logger = LoggerFactory.getLogger(TestLog4jWithError.class);


logger.debug("====get all categories====");

 if(logger.isDebugEnabled()){
         logger.debug("This is debug : " + parameter);
  }

  if(logger.isInfoEnabled()){
      logger.info("This is info : " + parameter);
   }

  logger.warn("This is warn : " + parameter);
  logger.error("This is error : " + parameter);

``
