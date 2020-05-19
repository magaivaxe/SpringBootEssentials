package com.mpsg.boot.logging.autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mpsg.aop.LoggableAspect;

@Configuration
@ConditionalOnClass(LoggableAspect.class)
@EnableConfigurationProperties(MpsgLoggingProperties.class)
public class MpsgLoggingAutoconfigure {

  @Autowired
  private MpsgLoggingProperties properties;

  @Bean
  public LoggableAspect loggableAspect() {
    return new LoggableAspect(properties.getLoggerName());
  }
}
