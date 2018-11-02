package guesswhat;
import javax.swing. *;
import java.awt. *;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
public class GuessWhat extends JFrame {
    int licznikDiam = 0;
    int licznikBomb = 0;
    int licznikProb = 0;
    static String imie = "";
    String grajPonownie ="";
    public GuessWhat () {
        Scanner scan = new Scanner(System.in);
           JButton przycisk1 = new JButton("przycisk 1");
           JButton przycisk2 = new JButton("przycisk 2");
           JLabel etykieta = new JLabel("etykieta");
           JTextArea tekst = new JTextArea("tekst");
           this.setLayout(new GridLayout (2,2,10,10)); 
           this.add(przycisk1);
           this.add(przycisk2);
           this.add(etykieta);
           this.add(tekst);
           this.setSize(1000,300);
           this.setLocation(550,350);
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        przycisk1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent event) {
        
        if (licznikProb <= 9) {     
        licznikProb ++;
        etykieta.setText(""+licznikProb);
        String wybor [] = {"Bomba", "Diament"};
        int wybralem = new Random().nextInt(wybor.length);
        
            if (wybor[wybralem]=="Diament"){
            licznikDiam ++;
            tekst.setText("Brawo wybrales Diament. To twoj" + " " + licznikDiam + " Diament");  
        }
            else {
            licznikBomb ++;
            tekst.setText("Niestety wybrales Bombe. To twoja" + " " + licznikBomb + " Bomba. Mam nadzieje ze masz kask.." );   
        }
    }    
        else {
            if(licznikDiam>licznikBomb){ 
            etykieta.setText("Koniec gry");
            tekst.setText("Wygrales. Wylosowales:" + licznikDiam + " " + "Diamentow oraz" + " " + licznikBomb + " Bomby");
            }      
            else if (licznikDiam == licznikBomb) {
                etykieta.setText("Koniec gry");
                tekst.setText("Remis. Wylosowales:" + licznikDiam + " " + "Diamentow oraz" + " " + licznikBomb + " Bomb");
            }           
            else {
                etykieta.setText("Koniec gry");
                tekst.setText("Przegrales. Wylosowales:" + licznikDiam + " " + "Diamenty oraz" + " " + licznikBomb + " Bomb. Sprawdz swoj kask");    
                }
            }
    } 
    });
        przycisk2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent event) {
        
        if (licznikProb <= 9) {
        licznikProb ++;
        etykieta.setText(""+licznikProb);
        String wybor [] = {"Boooombaaa", "Diament"};
        int wybralem = new Random().nextInt(wybor.length);
        
            if (wybor[wybralem]=="Diament"){
            licznikDiam ++;
            tekst.setText("Brawo wybrales Diament. To twoj" + " " + licznikDiam + " Diament");       
        }
            else {
            licznikBomb ++;
            tekst.setText("Niestety wybrales Bombe. To twoja" + " " + licznikBomb + " Bomba. Mam nadzieje ze masz kask.." );   
        }
    }
        else {  
            if(licznikDiam>licznikBomb){
            etykieta.setText("Koniec gry");
            tekst.setText("Wygrales. Wylosowales:" + licznikDiam + " " + "Diamentow oraz" + " " + licznikBomb + " Bomby");
            }      
            else if (licznikDiam == licznikBomb) {
                etykieta.setText("Koniec gry");
                tekst.setText("Remis. Wylosowales:" + licznikDiam + " " + "Diamentow oraz" + " " + licznikBomb + " Bomb");
            }           
            else {     
                etykieta.setText("Koniec gry");
                tekst.setText("Przegrales. Wylosowales:" + licznikDiam + " " + "Diamenty oraz" + " " + licznikBomb + " Bomb. Sprawdz swoj kask");
            }
        }
    }    
});
        this.setVisible(true);   
    }  
    
    
    public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoje imie i enter: ");
        imie = scan.next();     
        scan.close();
        System.out.println("Idz do okienka" + " " + imie);
            new GuessWhat();
        }    
    }    
   