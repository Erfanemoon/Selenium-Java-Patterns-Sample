package config.common;

import java.util.Properties;

public class Config {

    private Properties properties;

    public Config(Properties properties) {
        this.properties = properties;
    }

    public String getString(String key) {
        return String.valueOf(this.properties.getProperty(key)).trim();
    }

}
