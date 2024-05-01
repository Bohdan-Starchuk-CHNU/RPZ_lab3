import utils.AnalyticsUtil;
import utils.MeasureTimeUtil;

public class Main {

    public static final String FILE_PATH = "src/assets/harry.txt";

    public static void main(String[] args) {
        MeasureTimeUtil.measureTime(AnalyticsUtil::generateAnalytic, FILE_PATH);
    }
}
