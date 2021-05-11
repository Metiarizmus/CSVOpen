package profits.parser;

import au.com.bytecode.opencsv.CSVReader;
import profits.entity.Money;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ParserCSV {

    private final String input;
    private final String output;

    public ParserCSV(String input, String output) {
        this.input = input;
        this.output = output;
    }

    public List<Money> getPars(Money money){

        List<Money> list = new LinkedList<>();

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(input));
            String[] nextLine;

            while ((nextLine = reader.readNext())!=null){

                try {
                   money = new Money(Double.parseDouble(nextLine[1]),Double.parseDouble(nextLine[0]));
                }catch (NumberFormatException e){
                    System.err.println("Incorrect data");
                }
                if (money!=null){
                    list.add(money);
                }else System.err.println("Money is null");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(reader!=null)
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return list;
    }


    public void writeRemains(List<Money> list){

        int count = 0;
        try {
            FileWriter writer = new FileWriter(output);

            for (int i = 0; i < list.size(); i++) {
                String s = (i+1)+"-й день,"+(list.get(i).getProfit()-list.get(i).getLoss())+"\n";
                count+=list.get(i).getProfit()-list.get(i).getLoss();
                writer.write(s);
            }
            writer.write("\n" + " balance = " + count);
            System.out.println("All good :)");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
