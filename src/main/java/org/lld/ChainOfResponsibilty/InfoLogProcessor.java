package org.lld.ChainOfResponsibilty;

public class InfoLogProcessor implements LogProcessor {

  LogProcessor nextLogProcessor;

  public InfoLogProcessor(LogProcessor nextLogProcessor) {
    this.nextLogProcessor = nextLogProcessor;
  }

  @Override
  public void log(String logLevel, String message) {

    if (LogProcessor.INFO.equals(logLevel)) {
      System.out.println("INFO: " + message);
    } else if (nextLogProcessor != null) {
      nextLogProcessor.log(logLevel, message);
    }
  }
}
