import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Plot extends JPanel {
    private static final long serialVersionUID = 6294689542092367723L;
    ReadFile RF= new ReadFile();
    LinearRegression lr = new LinearRegression();
    ChartPanel chartpanel;

    public Plot(ArrayList<Integer> a,String Module) {

        // Create dataset
        XYDataset dataset = createDataset(a);

        // Create chart
        JFreeChart chart = ChartFactory.createScatterPlot(
                Module,
                "Average Marks across all other modules", "Marks for " + Module, dataset);


        //Changes background color
        XYPlot plot = (XYPlot)chart.getPlot();
        plot.setBackgroundPaint(new Color(255,255,255));

        NumberAxis Yaxis = (NumberAxis)plot.getRangeAxis();
        NumberAxis Xaxis = (NumberAxis)plot.getDomainAxis();
        Yaxis.setAutoRange(false);
        Xaxis.setAutoRange(false);
        Yaxis.setRange(0, 100);
        Xaxis.setRange(0,100);
        Yaxis.setTickUnit(new NumberTickUnit(10));
        Xaxis.setTickUnit(new NumberTickUnit(10));

        plot.setDataset(1, dataset);
        XYLineAndShapeRenderer xylineandshaperenderer = new XYLineAndShapeRenderer(
                true, false);
        xylineandshaperenderer.setSeriesPaint(0, Color.WHITE);
        plot.setRenderer(1, xylineandshaperenderer);



        ChartPanel chartpanel = new ChartPanel(chart);
        chartpanel.setPreferredSize(new Dimension(400,400));
        add(chartpanel);
    }

    private XYDataset createDataset(ArrayList<Integer> Module) {
        XYSeriesCollection dataset = new XYSeriesCollection();

        RF.ReadCSVFile();
        ArrayList<Double> AverageModule = RF.AverageModuleMark(Module);

        XYSeries series1 = new XYSeries("");
        for(int i = 0; i < Module.size(); i++)
        {
            series1.add(AverageModule.get(i),Module.get(i));
        }
        dataset.addSeries(series1);

        XYSeries series2 = new XYSeries("RegressionLine");
        double point1 = lr.GetRegressionPoint1(dataset);
        double point2 = lr.GetRegressionPoint2(dataset);
        series2.add(40,point1);
        series2.add(80,point2);
        dataset.addSeries(series2);

        return dataset;
    }

}