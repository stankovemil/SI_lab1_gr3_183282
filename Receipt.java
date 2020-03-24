import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Receipt {
    File file = new File("items.csv");

    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
    String line="";
    String csvSplit=",";

    List<Item> Products = new LinkedList<>();

    public Receipt() throws FileNotFoundException {
    }

    public void readFromFile() throws IOException {
        while((line = bufferedReader.readLine())!=null){
           String[]itemAttributes  = line.split(csvSplit);

            Products.add(new Item(Integer.parseInt(itemAttributes[0]) , itemAttributes[1] ,(double)Integer.parseInt(itemAttributes[2])  , 'B'));

        }

    }

    public void printCsvFile() {
        System.out.println(Products);
    }

    public void deleteItem(int id){
        Products.remove(id-1);
    }


}
