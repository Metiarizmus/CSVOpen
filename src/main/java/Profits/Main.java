package Profits;

import Profits.Parser.ParserCSV;
import Profits.entity.Money;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ParserCSV getInf = new ParserCSV();

        List<Money> list = getInf.getPars("C:\\Users\\Николай\\IdeaProjects\\learnCSV\\src\\main\\java\\Profits\\csvInput");

        getInf.writeRemains(list,"C:\\Users\\Николай\\IdeaProjects\\learnCSV\\src\\main\\java\\Profits\\csvOutput");


    }
}
