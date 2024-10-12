package org.lld.ChainOfResponsibilty;

public class ErrorLogProcessor implements LogProcessor {

  LogProcessor nextLogProcessor;

  public ErrorLogProcessor(LogProcessor nextLogProcessor) {
    this.nextLogProcessor = nextLogProcessor;
  }

  @Override
  public void log(String logLevel, String message) {

    if (LogProcessor.ERROR.equals(logLevel)) {
      System.out.println("ERROR: " + message);
    } else if (nextLogProcessor != null) {
      nextLogProcessor.log(logLevel, message);
    }
  }
}
