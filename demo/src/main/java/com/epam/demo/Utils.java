package com.epam.demo;

import static com.epam.utils.StringUtils.isPositiveNumber;

import java.util.List;

public class Utils {

  public static boolean isAllPositiveNumbers (List<String> args) {
    for (String s : args) {
      if (s.isEmpty() || s==null) continue;
      if (!isPositiveNumber(s)) {
        return false;
      }
    }
    return true;
  }
}