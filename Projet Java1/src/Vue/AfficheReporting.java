/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

    Le code est inspiré de "JFreeChart 1.0.4 Developer Guide"
 */
package Vue;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Aurélien
 */
public class AfficheReporting {
    
    
    public void afficheCamembert(String intitule, String nom[], int nombre[]) {
        
         DefaultPieDataset dataset = new DefaultPieDataset();
         for(int i = 0; i<nombre.length; i++) {
             dataset.setValue(nom[i], nombre[i]);
         }
        
        JFreeChart chart = ChartFactory.createPieChart(intitule, dataset, true, true, false);
        ChartFrame frame = new ChartFrame(intitule, chart);
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public void afficheBarre(String intitule, String nom[], int nombre[]) {
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         for(int i = 0; i<nombre.length; i++) {
             dataset.addValue(nombre[i],nom[i], nom[i]);
         }
        
        JFreeChart chart = ChartFactory.createBarChart(intitule, "Catégories", "Valeurs", dataset, PlotOrientation.VERTICAL, true, true, false);
        ChartFrame frame = new ChartFrame(intitule, chart);
        frame.pack();
        frame.setVisible(true);
    }
}
