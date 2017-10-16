import javax.swing.JOptionPane;

public class JOptionPane1{
    public static void main(String[] args){
        String nim, nama, tempat, tgllahir;
        nama = JOptionPane.showInputDialog("Masukkan Nama Anda : ");
        nim = JOptionPane.showInputDialog("Masukkan NIM Anda : ");
        tempat = JOptionPane.showInputDialog("Masukkan Tempat Lahir Anda : ");
        tgllahir = JOptionPane.showInputDialog("Masukkan Tanggal Lahir Anda : ");
        String msg = "Selamat Datang "+ nama + "\nNIM Anda : "+ nim + "\nTempat Lahir Anda :  "+ tempat + "\nTanggal Lahir Anda : "+ tgllahir;
        JOptionPane.showMessageDialog(null, msg);
    }
}