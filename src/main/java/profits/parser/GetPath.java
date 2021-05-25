package profits.parser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetPath {

    private static String path = "C:\\Users\\Николай\\IdeaProjects\\learnCSV\\src\\main\\resources\\config.properties";

    public Properties getPath() {
        FileInputStream fis;
        Properties properties = new Properties();

        try {
            fis = new FileInputStream(path);

            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
