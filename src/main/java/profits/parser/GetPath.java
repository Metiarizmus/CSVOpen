package profits.parser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetPath {
    private ParserCSV inf = new ParserCSV(getPath().getProperty("input"), getPath().getProperty("output"));

    public ParserCSV getInf() {
        return inf;
    }


    private static Properties getPath() {
        FileInputStream fis;
        Properties properties = new Properties();

        try {
            fis = new FileInputStream("C:\\Users\\Николай\\IdeaProjects\\learnCSV\\src\\main\\resources\\config.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }



}
