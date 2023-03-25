package Modul2;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Hewan> daftarHewan = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        daftarHewan.add(new Hewan("Sapi", "Putih"));
        daftarHewan.add(new Hewan("Kelinci", "Hitam"));
        daftarHewan.add(new Hewan("Kambing", "Hitam"));
        daftarHewan.add(new Hewan("Unta", "Abu-Abu Terang"));
        daftarHewan.add(new Hewan("Domba", "Putih"));

        System.out.print("\nHewan : [");
        for(int index = 0; index < daftarHewan.size(); index++) {
            System.out.print(daftarHewan.get(index).getName() + ",");
        }
        System.out.println("]\n");

        System.out.print("Hewan Yang Dihapus :\n\n [");
        for(int index = 0; index < daftarHewan.size(); index++) {
            if(daftarHewan.get(index).getColor() == new HapusHewan("Hitam").getColor()) {
                System.out.print(daftarHewan.get(index).getName() + ",");
                daftarHewan.remove(index);
            }
            if(daftarHewan.get(index).getColor() == new HapusHewan("Hitam").getColor()) {
                System.out.print(daftarHewan.get(index).getName() + ",");
                daftarHewan.remove(index);
            }
            if(daftarHewan.get(index).getColor() == new HapusHewan("Abu-Abu Terang").getColor()) {
                System.out.print(daftarHewan.get(index).getName() + ",");
                daftarHewan.remove(index);
            }
        }
        System.out.println("]\n");

        System.out.print("Output Hewan :\n\n [");
        for(int index = 0; index < daftarHewan.size(); index++) {
            System.out.print(daftarHewan.get(index).getName() + ",");
        }
        System.out.println("]\n");
    }
}