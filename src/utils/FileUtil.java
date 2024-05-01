package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtil {

  private FileUtil() {
  }

  public static String readFile(String filePath) {
    try {
      return new String(Files.readAllBytes(Paths.get(filePath)));
    } catch (IOException e) {
      throw new RuntimeException(
          "Error reading file from file path: '%s'. Error: '%s'".formatted(filePath, e.getMessage()));
    }
  }
}
