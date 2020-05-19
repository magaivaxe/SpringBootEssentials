package com.mpsg.boot.logging.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("mpsg.logging")
public class MpsgLoggingProperties {

  private String loggerName = "MpsgAuditLogger";

  public String getLoggerName() {
    return loggerName;
  }

  public void setLoggerName(String loggerName) {
    this.loggerName = loggerName;
  }
}
