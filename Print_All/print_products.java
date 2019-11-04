import java.io.*;
class print_products{
public static void main (String args[]) throws IOException {
int i = 1;
int tot = 0;
String b;
String[] fields;
String patternStr = ",";
FileReader fin = new FileReader("data_products.txt");
BufferedReader bin = new BufferedReader (fin);
while ((b =  bin.readLine()) != null) {
fields = b.split(patternStr);
System.out.println("id_productid  : " + fields[0]);
System.out.println("productname : " + fields[1]);
System.out.println("supplierid  : " + fields[2]);
System.out.println("categoriesId : " + fields[3]);
System.out.println("categoryid : " + fields[4]);
System.out.println("quantityperunit : " + fields[5]);
tot = tot + Integer.parseInt(fields[0]);
i = i + 1;
}
System.out.println("Total : " + tot);
fin.close();
}
}