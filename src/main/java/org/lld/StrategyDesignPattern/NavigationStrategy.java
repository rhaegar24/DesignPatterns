package org.lld.StrategyDesignPattern;

import java.util.Map;

public interface NavigationStrategy {

    Map<String, Object> navigate(int a, int b);
}
