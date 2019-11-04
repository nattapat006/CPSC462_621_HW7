import java.io.*;
class print_categories {
public static void main (String args[]) throws IOException {
int i = 1;
int tot = 0;
String b;
String[] fields;
String patternStr = ",";
FileReader fin = new FileReader("data_categories.txt");
BufferedReader bin = new BufferedReader (fin);
while ((b =  bin.readLine()) != null) {
fields = b.split(patternStr);
System.out.println("category id : " + fields[0]);
System.out.println("category Name : " + fields[1]);
System.out.println("description : " + fields[2]);

tot = tot + Integer.parseInt(fields[2]);
i = i + 1;
}
System.out.println("Total : " + tot);
fin.close();
}
}
