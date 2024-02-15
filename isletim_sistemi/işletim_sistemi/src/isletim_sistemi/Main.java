package _19010310021_IsletımSistemi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sistem durumunu görmek istediğiniz saniyeyi giriniz: ");
        int saniye = scanner.nextInt();
        scanner.close();
        System.out.println("Sistem durumu " + saniye + " saniye sonra gösterilecek.");

        SistemDurumu sistem = new SistemDurumu();

        File dosya = new File("src\\girdi.txt");

        try (BufferedReader okuyucu = new BufferedReader(new FileReader(dosya))) {
            String satir;

            while ((satir = okuyucu.readLine()) != null) {
                String[] parts = satir.split(" ");
                String isim = parts[0];
                int programSayaci = Integer.parseInt(parts[1]);
                for (int i = 2; i < parts.length; i += 2) {
                    String kuyrukTipi = parts[i];
                    int kuyrukNumarasi = Integer.parseInt(parts[i + 1]);
                    Proses _19010310021_Proses = new Proses(isim, kuyrukNumarasi, kuyrukTipi, programSayaci);
                    if (kuyrukTipi.equals("ekran")) {
                        sistem.addEkranKuyrugu(_19010310021_Proses);
                    } else if (kuyrukTipi.equals("disk")) {
                        sistem.addDiskKuyrugu(_19010310021_Proses);
                    } else if (kuyrukTipi.equals("ethernet")) {
                        sistem.addEthernetKuyrugu(_19010310021_Proses);
                    } else {
                        sistem.addReadyKuyrugu(_19010310021_Proses);
                    }
                    sistem.addTum_19010310021_Prosesler(_19010310021_Proses);
                }
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
            return;
        }

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                sistem.getCpu().setProgramSayaci(sistem.getCpu().getProgramSayaci() + 1);

                if (sistem.getCpu().getDurum().equals("ready")) {
                    sistem.addReadyKuyrugu(sistem.getCpu());
                } else if (sistem.getCpu().getDurum().equals("ekran")) {
                    sistem.addEkranKuyrugu(sistem.getCpu());
                } else if (sistem.getCpu().getDurum().equals("disk")) {
                    sistem.addDiskKuyrugu(sistem.getCpu());
                } else if (sistem.getCpu().getDurum().equals("ethernet")) {
                    sistem.addEthernetKuyrugu(sistem.getCpu());
                }

                if (!sistem.getReadyKuyrugu().isEmpty()) {
                    Proses yeni_19010310021_Proses = sistem.getReadyKuyrugu().get(0);
                    yeni_19010310021_Proses.setDurum("running");
                    sistem.setCpu(yeni_19010310021_Proses);
                    sistem.getReadyKuyrugu().remove(0);
                } else {
                    sistem.setCpu(null);
                }
            }
        };
        timer.schedule(task, saniye * 1000);
    }
}
