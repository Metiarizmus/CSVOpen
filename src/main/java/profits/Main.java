package profits;

import profits.parser.GetPath;
import profits.entity.Money;
import profits.parser.ParserCSV;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        GetPath getProp = new GetPath();

        ParserCSV<Money> parserCSV = new ParserCSV(getProp.getPath().getProperty("input"),
                                                   getProp.getPath().getProperty("output"));

        List<Money> list = parserCSV.getPars(new Money());

        for (Money q : list) {
            System.out.println(q);
        }


        //parserCSV.writeRemains(list);

    }
}
