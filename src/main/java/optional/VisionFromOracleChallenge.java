package optional;

import java.util.Optional;

public class VisionFromOracleChallenge {

  static String finalZionValue = null;
  static int matrixCount = 0;

  public static void main(String... matrix) {
    Optional<String> optFromMatrix = Optional.ofNullable(finalZionValue);
    var agentSmith = "Virus";

    finalZionValue = finalZionValue + Optional.ofNullable(agentSmith).orElse(getVisionFromOracle());
    finalZionValue += optFromMatrix.orElseGet(VisionFromOracleChallenge::getVisionFromOracle);

    finalZionValue += matrixCount;

    System.out.println(finalZionValue);
  }

  static String getVisionFromOracle() {
    matrixCount++;
    finalZionValue += "KeyMaker";
    return "Architect";
  }
}
