package Main;

import Components.Contact;

import java.util.HashMap;
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
    }

    private static void luuFile() {
    }

    private static void sapxep() {
    }

    private static void TimKiem() {
    }

    private static void xoa() {
    }

    private static void sua() {
    }

    private static void xuat() {
    }

    private static void them() {
    }

    public static void main(String[] args) {

    }
}
