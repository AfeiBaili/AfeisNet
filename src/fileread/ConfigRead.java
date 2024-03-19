package fileread;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ConfigRead {
    public static Properties config = new Properties();

    static {
        try {
            config.load(new FileReader("config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
