import java.io.*;
class print_employees {
public static void main (String args[]) throws IOException {
int i = 1;
int tot = 0;
String b;
String[] fields;
String patternStr = ",";
FileReader fin = new FileReader("data_employees.txt");
BufferedReader bin = new BufferedReader (fin);
while ((b =  bin.readLine()) != null) {
fields = b.split(patternStr);
System.out.println("empid   : " + fields[0]);
System.out.println("empname  : " + fields[1]);
System.out.println("empbd  : " + fields[2]);
System.out.println("empaddress : " + fields[3]);
System.out.println("empphone   : " + fields[4]);
tot = tot + Integer.parseInt(fields[0]);
i = i + 1;
}
System.out.println("Total : " + tot);
fin.close();
}
}
