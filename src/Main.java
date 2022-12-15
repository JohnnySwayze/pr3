import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Завдання а ,б,в,г,д,е;
        ArrayList<String> firstlist=new ArrayList<>();
        ArrayList<String> secondlist=new ArrayList<>();
        ArrayList<String> thirdlist=new ArrayList<>();
        ArrayList<String> fourthlist=new ArrayList<>();
        ArrayList<String> fifthlist=new ArrayList<>();
        File dir=new File("C:/1/1.3");
        String pathb="../1.2/../.././2.1.2/../../2.2/../../1/../../2/2.2/2.2.2/../../2.1/2.1.2/2.1.2.1/../../2.1.1/2.1.1.1/";//б,3 текстовых файла
        Scanner sc =new Scanner(System.in);
        String pathc="../../2.1.2/../../../1/1.1/../1.3/";//в два текстовых файла
        String pathd="../1/../2/2.1/../.././1.1/../../2/2.1/2.1.1/../.././2.2/2.2.2/";//проблема с выходом в диск С:,Г, два текстовых файла
        String pathe="../2/2.2/2.2.2/.././2.2.2/../../../1/1.2/../../2/2.1/../2.2/2.2.1/";//проблема с выходом в диск С:,Д, два текстовых файла
        String pathf="../1/../2/2.2/2.2.1/../../../1/1.3/../../2/2.1/2.1.1/2.1.1.1/../../../../2/../2/../1/";//E , 4 файла ;

       int i=0;
        while(i<4){
            if(i<3)
            {
                System.out.println("Введіть назву" + "\t" + (i + 1) + "\t" + "файлу , в каталозі 2.1.1.1");
                firstlist.add(sc.nextLine());
                File file1 = new File(dir, pathb + firstlist.get(i) + ".txt");
                try
                {
                    file1.createNewFile();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            if(i<2)
            {
                System.out.println("Введіть назву"+"\t"+(i+1)+"\t"+"файлу , в каталозі 1.3");
                secondlist.add(sc.nextLine());
                File file2 = new File("C:/./2.1.1.1", pathc + secondlist.get(i)+".txt");
                System.out.println("Введіть назву"+"\t"+(i+1)+"\t"+"файлу , в каталозі 2.2.2");
                thirdlist.add(sc.nextLine());
                File file3 = new File("C:/./1.3", pathd + thirdlist.get(i)+".txt");
                System.out.println("Введіть назву"+"\t"+(i+1)+"\t"+"файлу , в каталозі 2.2.1");
                fourthlist.add(sc.nextLine());
                File file4 = new File("C:/./2.2.2", pathe + fourthlist.get(i)+".txt");
                try
                {
                    file2.createNewFile();
                    file3.createNewFile();
                    file4.createNewFile();
                }
                catch(IOException e )
                {
                    e.printStackTrace();
                }
            }
            System.out.println("Введіть назву"+"\t"+(i+1)+"\t"+"файлу , в каталозі 1");
            fifthlist.add(sc.nextLine());
            File file5 = new File("C:/./2.2.1", pathf + fifthlist.get(i)+".txt");
            try
            {
                file5.createNewFile();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            i++;
        }
        System.out.println("Файли в каталозі 2.1.1.1: "+firstlist+"\n"+"Файли в каталозі 1.3: "+secondlist+"\n"+"Файли в каталозі 2.2.2:"+thirdlist+"\n"+
                "Файли в каталозі 2.2.1: "+fourthlist+"\n"+"Файли в каталозі 1: "+fifthlist);
        //Завдання є;
        System.out.println("Введіть номер (від 1 до 3) файлу ,який би ви хотіли видалити з каталогу 2.1.1.1: ");
        int b=sc.nextInt();
        System.out.println(firstlist.get(b-1));
        File file1 =new File("C:/2/2.1/2.1.1/2.1.1.1/"+firstlist.get(b-1)+".txt");//тут надо реализовать относительный путь, но оно его не видит почему -то ((((
        file1.delete();
        firstlist.remove(b-1);

        System.out.println("Введіть номер (від 1 до 2) файлу,який би ви хотіли видалити з каталогу 1.3: ");
        int c=sc.nextInt();
        System.out.println(secondlist.get(c-1));
        File file2 =new File("C:/1/1.3/"+secondlist.get((c-1))+".txt");
        file2.delete();
        secondlist.remove(c-1);

        System.out.println("Введіть номер  (від 1 до 2) файлу ,який би ви хотіли видалити з каталогу 2.2.2: ");
        int d=sc.nextInt();
        System.out.println(thirdlist.get(d-1));
        File file3 =new File("C:/2/2.2/2.2.2/"+thirdlist.get((d-1))+".txt");
        file3.delete();
        thirdlist.remove(d-1);
        System.out.println("Введіть номер (від 1 до 2) файлу ,який би ви хотіли видалити з каталогу 2.2.1: ");
        int e=sc.nextInt();
        System.out.println(fourthlist.get(e-1));
        File file4 =new File("C:/2/2.2/2.2.1/"+fourthlist.get((e-1))+".txt");
        file4.delete();
        fourthlist.remove(e-1);
        System.out.println("Введіть номер (від 1 до 4) файлу ,який би ви хотіли видалити з каталогу 1: ");
        int f=sc.nextInt();
        System.out.println(fifthlist.get(f-1));
        File file5 =new File("C:/1/"+fifthlist.get((f-1))+".txt");
        file5.delete();
        fifthlist.remove(f-1);

        //Завдання ж
        if(dir.isDirectory())
        {
            System.out.println("Каталог з пункту а) існує");
        }
        else
        {
            System.out.println("\n"+"Каталог з пункту а)  не існує");
        }
        System.out.println("Файли в каталозі 2.1.1.1: "+firstlist+"\n"+"Файли в каталозі 1.3: "+secondlist+"\n"+"Файли в каталозі 2.2.2:"+thirdlist+"\n"+
                "Файли в каталозі 2.2.1: "+fourthlist+"\n"+"Файли в каталозі 1: "+fifthlist+"\n");




        //беру рандомные методы из таблицы 3.2,завдання з)
        System.out.println("Введіть номер (від 1 до 2) файлу з каталога 2.1.1.1: ");
        int g=sc.nextInt();
        File file6 =new File("C:/2/2.1/2.1.1/2.1.1.1/"+firstlist.get(g-1)+".txt");
        System.out.println("Чи це файл?");
        if(file6.isFile())
        {
            System.out.println("Так , це файл"+"\n");
        }
        else
        {
            System.out.println("Ні , це не файл"+"\n");
        }

        System.out.println("В каталозі 1.3 є тільки один файл , тому обирати ні з чого");
        File file7 =new File("C:/1/1.3/"+secondlist.get(0)+".txt");
        System.out.println("Повернемо ім'я файлу");
        System.out.println(file7.getName());

        System.out.println("\n"+"В каталозі 2.2.2 є тільки один файл , тому обирати ні з чого");
        File file8 =new File("C:/2/2.2/2.2.2/"+thirdlist.get(0)+".txt");
        System.out.println("Перевіримо , чи існує такий файл взагалі ");
        if(file8.exists())
        {
            System.out.println("Файл існує"+"\n");
        }
        else
        {
            System.out.println("Файла не існує"+"\n");
        }

        System.out.println("В каталозі 2.2.1 є тільки один файл , тому обирати ні з чого");
        File file9 =new File("C:/2/2.2/2.2.1/"+thirdlist.get(0)+".txt");
        System.out.println("Дізнаємося ім'я батьківського каталогу ");
        System.out.println(file9.getParent());

        System.out.println("\n"+"Файли в каталозі 1: "+fifthlist);
        System.out.println("Введіть номер (від 1 до 3) файлу з каталогу  1 , з яким ви би хотіли взаємодіяти: ");
        int l=sc.nextInt();
        System.out.println(fifthlist.get(l-1));
        File file10 =new File("C:/1/"+fifthlist.get((l-1))+".txt");
        System.out.println("Розмір обраного файлу дорівнює : "+file10.length());
    }
}