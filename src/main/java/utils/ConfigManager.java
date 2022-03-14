package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

        private static ConfigManager manager;
        private final static Properties prop = new Properties();

        private ConfigManager() throws Exception {
            InputStream inputStream = ConfigManager.class.getResourceAsStream("/config.properties");
            prop.load(inputStream);
        }

        public static ConfigManager getInstance(){
            try {
                if(manager == null){
                    synchronized (ConfigManager.class) {
                        manager = new ConfigManager();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return manager;
        }

        public String getString(String key) {
            return System.getProperty(key,prop.getProperty(key));
        }
}
