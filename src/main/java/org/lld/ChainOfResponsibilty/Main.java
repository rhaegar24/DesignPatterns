package org.lld.ChainOfResponsibilty;

public class Main {
  public static void main(String[] args) {

    /*
     This DP is useful when you have a set of handler or level that can be crossed only after previous
     stage is checked, eg when you call customer care first computer asks you to enter a number,
     then it redirects to executive, then to the expert
     another example could be when you call log.error, it passes through log.info then log.debug and then it finally
     reached log.error
     by doing this each handler gets the same request, and they check if they can process it if they can then request terminates there, if they cant
     request is sent to the next handler, a default handler is also kept is the request cant be processed

     in this example we have created a chain of logs, if log is of type info InfoLog class will handle it,
     if its of type debug then DebugLog will handle it and similarly error type will be handled by ErrorLog class
     a new type of error can easily be handled by making a new error type class and adding it into the chain of
     responsibility, here whatever the type of error is it will be handled by that particular class and execution
     will stop there
    */

    LogProcessor logProcessor =
        new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

    logProcessor.log(LogProcessor.INFO, "info");
    logProcessor.log(LogProcessor.DEBUG, "debug");
    logProcessor.log(LogProcessor.ERROR, "error");
  }
}
