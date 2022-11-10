import java.util.*;
public class daireAlan {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz:");
        double pi=3.14;
        int r=input.nextInt();
        System.out.print("Daire diliminin merkez açı ölçüsünü giriniz:");
        int alfa=input.nextInt();

        double alan=(pi*(r*r)*alfa)/360;
        double cevre=2*pi*r;

        System.out.println("Dairenin alanı:"+alan);
        System.out.println("Dairenin çevresi:"+cevre);



    }
}
