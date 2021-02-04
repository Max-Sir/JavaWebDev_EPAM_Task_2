package us.google.maxsir.oop.task;

import java.io.*;


public class Main {

    public static final String PATH= "appliances_db.txt";

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream=new ObjectInputStream(new BufferedInputStream(new FileInputStream(PATH)));
        //String utf = objectInputStream.readUTF();
        //System.out.println(utf);
        //Oven ov=(Oven) objectInputStream.readObject();
        String x="5575";

    }
}
