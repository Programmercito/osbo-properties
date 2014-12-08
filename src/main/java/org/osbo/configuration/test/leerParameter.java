/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.osbo.configuration.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.osbo.configuration.OsboConfigurationFiles;

/**
 *
 * @author Joaquin
 */
public class leerParameter extends TimerTask {

    @Override
    public void run() {

        try {
            Constructor<OsboConfigurationFiles> constructor = OsboConfigurationFiles.class.getDeclaredConstructor(String.class,long.class);
            constructor.setAccessible(true);
            OsboConfigurationFiles otherSingleton = constructor.newInstance("C:\\parameters\\dos.properties", 30000);
            
            OsboConfigurationFiles ocf = OsboConfigurationFiles.getInstance("C:\\parameters\\archivo.properties", 30000);
            String nombre = ocf.getString("nombre");
            String otronombre = otherSingleton.getString("nombre");

            System.out.println("nombre:" + nombre + " nombre2:" + otronombre);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(leerParameter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(leerParameter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(leerParameter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(leerParameter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(leerParameter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(leerParameter.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
