package _19010310021_IsletımSistemi;
import java.util.ArrayList;
import java.util.List;
public class SistemDurumu {

    private Proses cpu;
    private List<Proses> readyKuyrugu;
    private List<Proses> ekranKuyrugu;
    private List<Proses> diskKuyrugu;
    private List<Proses> ethernetKuyrugu;
    private List<Proses> tum_19010310021_Prosesler;

    public SistemDurumu() {
        readyKuyrugu = new ArrayList<Proses>();
        ekranKuyrugu = new ArrayList<Proses>();
        diskKuyrugu = new ArrayList<Proses>();
        ethernetKuyrugu = new ArrayList<Proses>();
        tum_19010310021_Prosesler = new ArrayList<Proses>();
    }

    public void setCpu(Proses cpu) {
        this.cpu = cpu;
    }

    public void addReadyKuyrugu(Proses _19010310021_Proses) {
        readyKuyrugu.add(_19010310021_Proses);
    }

    public void addEkranKuyrugu(Proses _19010310021_Proses) {
        ekranKuyrugu.add(_19010310021_Proses);
    }

    public void addDiskKuyrugu(Proses _19010310021_Proses) {
        diskKuyrugu.add(_19010310021_Proses);
    }

    public void addEthernetKuyrugu(Proses _19010310021_Proses) {
        ethernetKuyrugu.add(_19010310021_Proses);
    }

    public void addTum_19010310021_Prosesler(Proses _19010310021_Proses) {
        tum_19010310021_Prosesler.add(_19010310021_Proses);
    }

    public Proses getCpu() {
        return cpu;
    }

    public List<Proses> getReadyKuyrugu() {
        return readyKuyrugu;
    }

    public List<Proses> getEkranKuyrugu() {
        return ekranKuyrugu;
    }

    public List<Proses> getDiskKuyrugu() {
        return diskKuyrugu;
    }

    public List<Proses> getEthernetKuyrugu() {
        return ethernetKuyrugu;
    }

    public List<Proses> getTum_19010310021_Prosesler() {
        return tum_19010310021_Prosesler;
    }
    public void yazdir() {
        System.out.println("CPU'da çalışan _19010310021_Proses: " + cpu.getIsim());

        System.out.print("Ready kuyruğu: ");
        for (Proses _19010310021_Proses : readyKuyrugu) {
            System.out.print(_19010310021_Proses.getIsim() + " ");
        }
        System.out.println();

        System.out.print("Ekran kuyruğu: ");
        for (Proses _19010310021_Proses : ekranKuyrugu) {
            System.out.print(_19010310021_Proses.getIsim() + " ");
        }
        System.out.println();

        System.out.print("Disk kuyruğu: ");
        for (Proses _19010310021_Proses : diskKuyrugu) {
            System.out.print(_19010310021_Proses.getIsim() + " ");
        }
        System.out.println();

        System.out.print("Ethernet kuyruğu: ");
        for (Proses _19010310021_Proses : ethernetKuyrugu) {
            System.out.print(_19010310021_Proses.getIsim() + " ");
        }
        System.out.println();

        System.out.print("PCB'si bulunan _19010310021_Prosesler: ");
        for (Proses _19010310021_Proses : tum_19010310021_Prosesler) {
            System.out.print(_19010310021_Proses.getIsim() + " ");
        }
        System.out.println();
    }
    public void sistemiGoster(int saniye) {
        // Örneğin, saniye=20 için A.exe _19010310021_Prosesinin PCB'sini şu şekilde yazdırabilir:
        for (Proses _19010310021_Proses : tum_19010310021_Prosesler) {
            if (_19010310021_Proses.getIsim().equals("A.exe") && _19010310021_Proses.getProgramSayaci() == 20) {
                System.out.println(_19010310021_Proses.getIsim() + " isimli _19010310021_Prosesin " + saniye + ". saniyedeki PCB bilgileri şu şekildedir:");
                System.out.println("_19010310021_Proses numarası: " + _19010310021_Proses.getNumara());
                System.out.println("_19010310021_Proses durumu: " + _19010310021_Proses.getDurum());
                System.out.println("Program sayacı: " + _19010310021_Proses.getProgramSayaci());
                break;
            }
       }
    }}
  

