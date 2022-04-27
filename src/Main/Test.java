package Main;

import Components.Contact;
import SaveFile.SerializeFileFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    static HashMap<Integer, Contact> csdl = new HashMap<Integer,Contact>();
    public static void menu(){
        System.out.println("1.Them");
        System.out.println("2.Xuat");
        System.out.println("3.Sua");
        System.out.println("4.Xoa");
        System.out.println("5.Tim");
        System.out.println("6.Sap xep");
        System.out.println("7.Luu File");
        System.out.println("8.Doc File");
        System.out.println("9.Thoat");
        System.out.println("Ban chon gi ? ");
        int n = new Scanner(System.in).nextInt();
        switch (n){
            case 1:
                them();
                break;
            case 2:
                xuat();
                break;
            case 3:
                sua();
                break;
            case 4:
                xoa();
                break;
            case 5:
                TimKiem();
                break;
            case 6:
                sapxep();
                break;
            case 7:
                luuFile();
                break;
            case 8:
                docFile();
                break;
            case 9 :
                System.err.println("Thank You !!!");
                System.exit(0);
                break;
        }
    }

    private static void docFile() {
        csdl = SerializeFileFactory.readFile("D://csdlContact.dat");
    }

    private static void luuFile() {
        SerializeFileFactory.saveFile(csdl,"D://csdlContact.dat");
    }

    private static void sapxep() {
    }

    private static void TimKiem() {
        System.out.println("Nhap phone : ");
        String phone = new Scanner(System.in).nextLine();
        for (Map.Entry<Integer,Contact>entry : csdl.entrySet())
        {
            if (entry.getValue().getPhone().startsWith(phone)){
                System.out.println(entry.getValue());
            }
        }
    }

    private static void xoa() {
        System.out.println("Nhap ma can xoa : ");
        int id = new Scanner(System.in).nextInt();
        if (csdl.containsKey(id)){
            csdl.remove(id);
        }else {
            System.out.println("Khong tim thay ma "+id+" de xoa");
        }
    }

    private static void sua() {
        System.out.println("Nhap ma muon sua : ");
        int id = new Scanner(System.in).nextInt();
        if (csdl.containsKey(id)){
            System.out.println("Nhap ten: ");
            String name = new Scanner(System.in).nextLine();
            System.out.println("nhap so dien thoai : ");
            String phone = new Scanner(System.in).nextLine();

            Contact c = new Contact(id,name,phone);
            csdl.put(c.getId(), c);
        }else {
            System.out.println("Ma "+id+" khong ton tai ");
        }

    }

    private static void xuat() {
        System.out.println("Danh sach vua nhap : ");
        for (Map.Entry<Integer,Contact>entry: csdl.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    private static void them() {
        System.out.println("Nhap ma : ");
        int id  = new Scanner(System.in).nextInt();
        System.out.println("Nhap ten: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("nhap so dien thoai : ");
        String phone = new Scanner(System.in).nextLine();

        Contact c = new Contact(id,name,phone);
        if (csdl.containsKey(c.getId())==false){
            csdl.put(c.getId(),c);
        }
    }

    public static void main(String[] args) {
        while (true){
            menu();
        }

    }
}
