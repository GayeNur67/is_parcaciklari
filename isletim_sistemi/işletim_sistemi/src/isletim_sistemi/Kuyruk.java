package _19010310021_IsletımSistemi;

import java.util.LinkedList;
import java.util.Queue;

public class Kuyruk {

    private Queue<Proses> hazirKuyruk;
    private Queue<Proses> ekranKuyruk;
    private Queue<Proses> diskKuyruk;
    private Queue<Proses> ethernetKuyruk;

    public Kuyruk() {
        hazirKuyruk = new LinkedList<>();
        ekranKuyruk = new LinkedList<>();
        diskKuyruk = new LinkedList<>();
        ethernetKuyruk = new LinkedList<>();
    }

    public void addHazirKuyruk(Proses process) {
        hazirKuyruk.add(process);
    }

    public void addEkranKuyruk(Proses process) {
        ekranKuyruk.add(process);
    }

    public void addDiskKuyruk(Proses process) {
        diskKuyruk.add(process);
    }

    public void addEthernetKuyruk(Proses process) {
        ethernetKuyruk.add(process);
    }

    public void run() {
        while (!(hazirKuyruk.isEmpty() && ekranKuyruk.isEmpty() && diskKuyruk.isEmpty() && ethernetKuyruk.isEmpty())) {
            // İşlem sırasını dosyadan okunan bilgilere göre belirle
            // Örnek bir sıra belirleme mantığı:
            // - Hazır kuyruktaki işlemler öncelikli olarak çalıştırılabilir
            // - Ekran kuyruğundaki işlemler disk ve ethernet kuyruklarına öncelikli olarak yönlendirilebilir
            // - Disk ve ethernet kuyruklarındaki işlemler hazır kuyruğa geri yönlendirilebilir
            // - Bu sadece örnek bir mantık, gerçek mantığınıza göre düzenleyin
        }
        System.out.println("Tüm işlemler tamamlandı.");
    }
}
