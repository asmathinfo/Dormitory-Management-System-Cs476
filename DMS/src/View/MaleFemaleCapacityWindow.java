package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.sql.SQLException;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.xml.FrontendDefaultHandler;

import database.DBConnection;
import background.Dorm;

public class MaleFemaleCapacityWindow {
	private Dorm dorm;
	private DBConnection connection;

	public MaleFemaleCapacityWindow(Dorm dorm, int dormNumber) throws SQLException {
		super();
		this.dorm = dorm;
		JFrame genderFrame = new JFrame("Gender Rate");
		connection = new DBConnection();
		genderFrame.setBounds(0, 0, 500, 300);
		final CategoryDataset dataset = createDataset(dorm,dormNumber,connection.getMaleNumber(dorm),connection.getFemaleNumber(dorm));
		final JFreeChart chart = createChart(dataset);
		final ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new Dimension(500, 270));
		genderFrame.setContentPane(chartPanel);
		genderFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		genderFrame.setVisible(true);

	}

	private CategoryDataset createDataset(Dorm dorm, int dormNumber, int maleNumber, int femaleNumber) {

		// row keys...
		final String series1 = "Male";
		final String series2 = "Female";

		// column keys...
		String[] categories = new String[dormNumber];
		for (int i = 0; i < dormNumber; i++) {
			categories[i] = dorm.getDormName();
		}
	//	final String category1 = "Dorm 1";
	//	final String category2 = "Dorm 2";
	//	final String category3 = "Dorm 3";

		// create the dataset...
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		for (int i = 0; i < dormNumber; i++) {
			dataset.addValue(maleNumber, series1, categories[i]);
			dataset.addValue(femaleNumber, series2, categories[i]);
		}
	//	dataset.addValue(1.0, series1, category1);
	//	dataset.addValue(4.0, series1, category2);
	//	dataset.addValue(3.0, series1, category3);

	//	dataset.addValue(5.0, series2, category1);
	//	dataset.addValue(7.0, series2, category2);
	//	dataset.addValue(6.0, series2, category3);

		return dataset;

	}

	private JFreeChart createChart(final CategoryDataset dataset) {

		// create the chart...
		final JFreeChart chart = ChartFactory.createBarChart(
				"Gender Rate Chart", // chart title
				"Category", // domain axis label
				"Male/Female Number", // range axis label
				dataset, // data
				PlotOrientation.VERTICAL, // orientation
				true, // include legend
				true, // tooltips?
				false // URLs?
				);

		// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

		// set the background color for the chart...
		chart.setBackgroundPaint(Color.white);

		// get a reference to the plot for further customisation...
		final CategoryPlot plot = chart.getCategoryPlot();
		plot.setBackgroundPaint(Color.lightGray);
		plot.setDomainGridlinePaint(Color.white);
		plot.setRangeGridlinePaint(Color.white);

		// set the range axis to display integers only...
		final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

		// disable bar outlines...
		final BarRenderer renderer = (BarRenderer) plot.getRenderer();
		renderer.setDrawBarOutline(false);

		// set up gradient paints for series...
		final GradientPaint gp0 = new GradientPaint(0.0f, 0.0f, Color.blue,
				0.0f, 0.0f, Color.lightGray);
		final GradientPaint gp1 = new GradientPaint(0.0f, 0.0f, Color.green,
				0.0f, 0.0f, Color.lightGray);
		final GradientPaint gp2 = new GradientPaint(0.0f, 0.0f, Color.red,
				0.0f, 0.0f, Color.lightGray);
		renderer.setSeriesPaint(0, gp0);
		renderer.setSeriesPaint(1, gp1);
		renderer.setSeriesPaint(2, gp2);

		final CategoryAxis domainAxis = plot.getDomainAxis();
		domainAxis.setCategoryLabelPositions(CategoryLabelPositions
				.createUpRotationLabelPositions(Math.PI / 6.0));
		// OPTIONAL CUSTOMISATION COMPLETED.

		return chart;

	}

}
