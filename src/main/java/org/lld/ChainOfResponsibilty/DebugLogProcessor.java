package org.lld.ChainOfResponsibilty;

public class DebugLogProcessor implements LogProcessor {

  LogProcessor nextLogProcessor;

  public DebugLogProcessor(LogProcessor nextLogProcessor) {
    this.nextLogProcessor = nextLogProcessor;
  }

  @Override
  public void log(String logLevel, String message) {

    if (LogProcessor.DEBUG.equals(logLevel)) {
      System.out.println("DEBUG: " + message);
    } else if (nextLogProcessor != null) {
      nextLogProcessor.log(logLevel, message);
    }
  }
}
