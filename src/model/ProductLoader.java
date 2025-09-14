package model;
import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class ProductLoader{

        public static List<Product> LoadProducts(String pathFile){
            List<Product> products=new ArrayList<>();

            try(BufferedReader buffer_reader=new BufferedReader(new FileReader(pathFile))){
                String line;
                while ((line=buffer_reader.readLine())!=null){

                    String[]values=line.split(",");

                    int id=Integer.parseInt(values[0]);
                    String name=values[1];
                    double price=Double.parseDouble(values[2]);
                    int stock=Integer.parseInt(values[3]);
                    LocalDate expirDate=LocalDate.parse(values[4]);

                    products.add(new Product(id, name, price, stock, expirDate));
                }

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.out.println("There is a problem loading the file"+ e.getMessage());
            }
            return products;
        }
}