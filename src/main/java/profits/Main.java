package profits;

import profits.parser.GetPath;
import profits.entity.Money;
import profits.parser.ParserCSV;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        GetPath getPath = new GetPath();

        List<Money> list = getPath.getInf().getPars(new Money());

        getPath.getInf().writeRemains(list);

    }


}
