package myapp;

import interfaces.ICore;
import interfaces.IPlugin;
import interfaces.IPluginController;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PluginController implements IPluginController {
   
    public PluginController(){
    }

    @Override
    public boolean initialize(ICore core) {
        File currentDir = new File("/home/alison/eclipse-workspace/microkernel_java/plugins/");
        if (!currentDir.exists()){
            System.err.println("A pasta de plugins não existe");
            return false;
        }
        String[] plugins = currentDir.list();
        int i;
        URL[] jars = new URL[plugins.length];
        for (i = 0; i < plugins.length; i++) {
            System.out.println(i + 1 + " - " + plugins[i].split("\\.")[0]);
            try {
                jars[i] = (new File("./plugins/" + plugins[i])).toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        URLClassLoader ulc = new URLClassLoader(jars);

        for(i = 0 ; i<plugins.length ; i++ ) {
            String pluginName = plugins[i].split("\\.")[0];
            IPlugin plugin;
            try {
                plugin = (IPlugin) Class.forName(pluginName.toLowerCase() + "." + pluginName, true, ulc).newInstance();
                plugin.initialize(core);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }

}
