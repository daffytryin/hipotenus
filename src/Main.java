import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b; //dik kenarlar kullanıcıdan alınacak
        double c; //uzun kenar double değeri çıkabileceğinden double olarak tanımlandı

        Scanner input = new Scanner(System.in);
        System.out.println("1. kenar : ");
        a=input.nextInt(); //kullanıcıdan kısa kenarları scanner komutu ile alıyoruz
        System.out.println("2. kenar : ");
        b=input.nextInt();

        c=Math.sqrt((a*a)+(b*b)); //sqrt yardımı ile denklemin kökünü alıyoruz sqrt(a^2+b^2)=c

        System.out.println("Uzun kenar uzunluğu :" + c);

        double u;
        u=(a+b+c)/2; //u değeri yardımı ile üçgenin çevresini ve alanını buluyoruz
        System.out.println("Üçgenin çevresi :" + 2*u);
        System.out.println("Üçgenin alanı :" + Math.sqrt(u*(u-a)*(u-b)*(u-c)));
        }
    }