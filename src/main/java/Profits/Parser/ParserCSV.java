package Profits.Parser;

import au.com.bytecode.opencsv.CSVReader;
import Profits.entity.Money;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ParserCSV {

    public List<Money> getPars(String path){
        List<Money> list = new LinkedList<>();

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(path));
            String[] nextLine;

            while ((nextLine = reader.readNext())!=null){
                Money money = new Money(Double.parseDouble(nextLine[1]),Double.parseDouble(nextLine[0]));
                list.add(money);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

  /*  //Create record
    String [] record = "4,David,Miller,Australia,30".split(",");
    //Write the record to file
      writer.writeNext(record);
    //close the writer
      writer.close();*/

    public void writeRemains(List<Money> list,String path){ //+,- in money

        int count = 0;
        try {
            FileWriter writer = new FileWriter(new File(path));

            for (int i = 0; i < list.size(); i++) {
                String s = (i+1)+"-й день,"+(list.get(i).getProfit()-list.get(i).getLoss())+"\n";
                count+=list.get(i).getProfit()-list.get(i).getLoss();
                writer.write(s);
            }
            writer.write("\n" + "Остаток на месяц = " + count);

            System.out.println("All good :)");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
