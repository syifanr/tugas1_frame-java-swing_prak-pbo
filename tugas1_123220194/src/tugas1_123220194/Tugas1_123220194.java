/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_123220194;

import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
class loginPage extends JFrame {

    JLabel salam = new JLabel("Selamat Datang️!");
    
    JLabel kalimatBuka = new JLabel ("Silakan masuk untuk melanjutkan.");
    
    JTextField inputUsername = new JTextField();
    
    JLabel labelInputUsername = new JLabel("Username");
    
    JTextField inputPassword = new JTextField();
    
    JLabel labelInputPassword = new JLabel ("Password");
    
    JLabel labelInputJK = new JLabel ("Jenis Kelamin");
    
    JRadioButton pilihlaki = new JRadioButton ("Laki-laki");
    JRadioButton pilihperempuan = new JRadioButton ("Perempuan");
    
    JButton tombolLogin = new JButton("Login");
    
    loginPage(){
        setVisible(true);
        setSize(710, 500);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        add(salam);
        salam.setBounds(20, 10, 250, 24);
        salam.setFont(new Font("Arial", Font.BOLD, 20));
        
        add(kalimatBuka);
        kalimatBuka.setBounds(20, 25, 250, 30);
                
        add (labelInputUsername);
        labelInputUsername.setBounds(20, 60, 100, 24);
        
        add(inputUsername);
        inputUsername.setBounds(20, 90, 650, 24);
        
        
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(pilihlaki);
        pilihJenisKelamin.add(pilihperempuan);
        
        add (labelInputPassword);
        labelInputPassword.setBounds(20, 120, 100, 24);
        
        add (inputPassword);
        inputPassword.setBounds(20, 140, 650, 24);
        
        
        add (labelInputJK);
        labelInputJK.setBounds(20, 170, 100, 24);
        
        add (pilihlaki);
        pilihlaki.setBounds (20, 190, 100, 32);
        
        add (pilihperempuan);
        pilihperempuan.setBounds (300, 190, 100, 32);
        
        add(tombolLogin);
        tombolLogin.setBounds(20, 240, 650, 24);
    }

   
}

class halamanUtama extends JFrame {

    JLabel welcome = new JLabel("Welcome, [Mr./Mrs.] [username]");
    
    JLabel kata = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    
    JTextField inputPanjang = new JTextField();
    
    JLabel labelInputPanjang = new JLabel("Panjang");
    
    JTextField inputLebar = new JTextField();
    
    JLabel labelInputLebar = new JLabel ("Lebar");
    
    JLabel labelInputTinggi = new JLabel ("Tinggi");
    
    JTextField inputTinggi = new JTextField();
    
    JButton tombolHitung = new JButton("Hitung");
    
    JButton tombolReset = new JButton("Reset");
    
    JLabel hasil = new JLabel ("Hasil");
    
    JLabel luasPersegi = new JLabel ("Luas Persegi");
    JLabel hasilluasPersegi = new JLabel ("[Hasil berupa angka]");
    
    JLabel kelilingPersegi = new JLabel ("Keliling Persegi");
    JLabel hasilkelilingPersegi = new JLabel ("[Hasil berupa angka]");
    
    JLabel volumeBalok = new JLabel ("Volume Balok");
    JLabel hasilvolumeBalok = new JLabel ("[Hasil berupa angka]");
    
    JLabel luaspBalok = new JLabel ("Luas Permukaan Balok");
    JLabel hasilluaspBalok = new JLabel ("[Hasil berupa angka]");
    
    halamanUtama(){
        setVisible(true);
        setSize(710, 500);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        
        add(welcome);
        welcome.setBounds(20, 10, 350, 40);
        welcome.setFont(new Font("Arial", Font.BOLD, 20));
        
        add(kata);
        kata.setBounds(20, 30, 500, 40);
        
        add(labelInputPanjang);
        labelInputPanjang.setBounds(20, 80, 80, 24);
        
        add(inputPanjang);
        inputPanjang.setBounds(150, 80, 520, 24);
        
        add(labelInputLebar);
        labelInputLebar.setBounds(20, 120, 80, 24);
        
        add(inputLebar);
        inputLebar.setBounds(150, 120, 520, 24);
        
        add(labelInputTinggi);
        labelInputTinggi.setBounds(20, 160, 80, 24);
        
        add(inputTinggi);
        inputTinggi.setBounds(150, 160, 520, 24);
        
        add(tombolHitung);
        tombolHitung.setBounds(20, 200, 650, 24);
        
        add(tombolReset);
        tombolReset.setBounds(20, 235, 650, 24);
        
        add(hasil);
        hasil.setHorizontalAlignment(SwingConstants.CENTER);
        hasil.setBounds(330, 270, 50, 24);
         
        add(luasPersegi);
        luasPersegi.setBounds(20, 300, 100, 24);
        
        add(hasilluasPersegi);
        hasilluasPersegi.setBounds(270, 300, 130, 24);
        
        add(kelilingPersegi);
        kelilingPersegi.setBounds(20, 330, 100, 24);
        
        add(hasilkelilingPersegi);
        hasilkelilingPersegi.setBounds(270, 330, 130, 24);
        
        add(volumeBalok);
        volumeBalok.setBounds(20, 360, 100, 24);
        
        add(hasilvolumeBalok);
        hasilvolumeBalok.setBounds(270, 360, 130, 24);
        
        add(luaspBalok);
        luaspBalok.setBounds(20, 390, 150, 24);
        
        add(hasilluaspBalok);
        hasilluaspBalok.setBounds(270, 390, 130, 24);
        
    }

    private static class SwingConstants {

        private static int CENTER;

        public SwingConstants() {
        }
    }
}

public class Tugas1_123220194 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        loginPage loginpage = new loginPage ();
        halamanUtama halamanutama = new halamanUtama();
        
       
    }
    
}
