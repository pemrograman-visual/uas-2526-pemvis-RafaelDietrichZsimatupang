// 12S25001 - Gracia Anggreini Fitaloka Hutagaol
// 12S25006 - Rafael Dietrich Z Simatupang

import java.util.*;
import java.lang.Math;

public class soal5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, totalLolos, junk;
        String status;

        totalLolos = 0;
        n = Integer.parseInt(input.nextLine());
        String[] namaArr = new String[n];
        double[] ipkArr = new double[n];
        int[] gajiArr = new int[n];

        for (i = 0; i <= n - 1; i++) {
            namaArr[i] = input.nextLine();
            ipkArr[i] = Double.parseDouble(input.nextLine());
            gajiArr[i] = Integer.parseInt(input.nextLine());
            junk = Integer.parseInt(input.nextLine());
        }
        System.out.println("");
        for (i = 0; i <= n - 1; i++) {
            status = cekKelulusan(ipkArr[i], gajiArr[i]);
            System.out.println(namaArr[i] + " -> " + status);
            if (status.equals("Lolos Syarat Awal")) {
                totalLolos = totalLolos + 1;
            }
        }
        System.out.println("");
        System.out.println("Total pendaftar lolos: " + totalLolos);
    }
    
    public static String cekKelulusan(double nilaiIPK, int nilaiGaji) {
        String hasil;

        if (nilaiIPK >= 3.0 && nilaiGaji <= 3000000) {
            hasil = "Lolos Syarat Awal";
        } else {
            hasil = "Tidak Lolos";
        }
        
        return hasil;
    }
}
