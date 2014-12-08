/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.osbo.configuration;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;

/**
 *
 * @author Joaquin
 */
public class OsboConfigurationFiles {

    private static OsboConfigurationFiles instance = null;
    private String file;
    private PropertiesConfiguration config;

    public OsboConfigurationFiles(String ruta, long tiempo) {
        // Exists only to defeat instantiation.
        file = ruta;
        config = null;
        try {
            config = new PropertiesConfiguration(file);
        } catch (ConfigurationException ex) {
            ex.printStackTrace();
        }
        FileChangedReloadingStrategy conf = new FileChangedReloadingStrategy();
        conf.setRefreshDelay(tiempo);
        config.setReloadingStrategy(conf);
    }
    public static OsboConfigurationFiles getInstance(String archivo, long tiemp) {
        if (instance == null) {
            instance = new OsboConfigurationFiles(archivo, tiemp);
        }
        return instance;
    }

    public String getString(String nombre) {
        return config.getString(nombre);
    }
}
