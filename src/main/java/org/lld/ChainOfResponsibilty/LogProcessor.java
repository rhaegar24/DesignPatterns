package org.lld.ChainOfResponsibilty;

public interface LogProcessor {

  String INFO = "info";
  String ERROR = "error";
  String DEBUG = "debug";

  void log(String logLevel, String message);
}
