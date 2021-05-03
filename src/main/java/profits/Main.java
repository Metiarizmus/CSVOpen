package profits;

import profits.parser.ParserCSV;
import profits.entity.Money;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        ParserCSV getInf = new ParserCSV(getProperty().getProperty("input"),getProperty().getProperty("output"));

        List<Money> list = getInf.getPars();

        getInf.writeRemains(list);

    }

    public static Properties getProperty() {
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
