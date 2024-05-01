package utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MeasureTimeUtil {

  static Logger logger = Logger.getLogger(MeasureTimeUtil.class.getName());

  private MeasureTimeUtil() {
  }

  public static void measureTime(Runnable methodToMeasure) {
    var start = System.currentTimeMillis();
    methodToMeasure.run();
    var finish = System.currentTimeMillis();

    if (logger.isLoggable(Level.INFO)) {
      logger.info("Execution time: " + (finish - start) + "ms");
    }
  }
}
