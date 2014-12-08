/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.osbo.configuration.test;

import java.util.Timer;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
import org.osbo.configuration.test.leerParameter;

/**
 *
 * @author Joaquin
 */
public class PruebaProperties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Timer timer = new Timer("Printer");
 
        leerParameter t = new leerParameter();
 
        timer.schedule(t, 0, 2000);
    }

}
