import org.jfree.data.statistics.Regression;
import org.jfree.data.xy.XYDataset;

public class LinearRegression {

    public double GetRegressionPoint1(XYDataset XY)
    {
        double[] RegressionValue = Regression.getOLSRegression(XY,0);
        double coefficient = RegressionValue[1];
        double constant = RegressionValue[0];

        double point1 = (40 * coefficient) + constant;

        return point1;
    }

    public double GetRegressionPoint2(XYDataset XY)
    {
        double[] RegressionValue = Regression.getOLSRegression(XY,0);
        double coefficient = RegressionValue[1];
        double constant = RegressionValue[0];

        double point2 = (80 * coefficient) + constant;
        return point2;
    }

}


