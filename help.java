import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// Autor: Vinzent Schowald
// Datum: 24.07.2022

public class help extends JFrame {
  // Anfang Attribute
  private JButton bSchliesen = new JButton();
  private JButton jButton1 = new JButton();
    private ImageIcon jButton1Icon = new ImageIcon(getClass().getResource("images/landtag-wettbewerb-eule -- Quelle Landtag NRW Vera Bruggemann_skal.jpg"));
  private JLabel lDasheruntergeladeneProgrammbefindetsichnormalerweiseimOrdnerDownloads = new JLabel();
  private JLabel lKkk = new JLabel();
  // Ende Attribute
  
  public help() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 565; 
    int frameHeight = 157;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Hilfe");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    lKkk.setBounds(104, 40, 438, 20);
    lKkk.setText("\"Downloads\". Den MicroBit kannst du bei \"Dieser PC\" finden.");
    cp.add(lKkk);
    lDasheruntergeladeneProgrammbefindetsichnormalerweiseimOrdnerDownloads.setBounds(104, 16, 511, 20);
    lDasheruntergeladeneProgrammbefindetsichnormalerweiseimOrdnerDownloads.setText("Das heruntergeladene Programm befindet sich normalerweise im Ordner ");
    cp.add(lDasheruntergeladeneProgrammbefindetsichnormalerweiseimOrdnerDownloads);
    jButton1.setBounds(8, 16, 83, 81);
    jButton1.setText("");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    jButton1.setIcon(jButton1Icon);
    jButton1.setHorizontalTextPosition(SwingConstants.CENTER);
    jButton1.setBorderPainted(false);
    jButton1.setContentAreaFilled(false);
    jButton1.setFocusPainted(false);
    cp.add(jButton1);
    bSchliesen.setBounds(104, 72, 435, 25);
    bSchliesen.setText("Schliesen");
    bSchliesen.setMargin(new Insets(2, 2, 2, 2));
    bSchliesen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSchliesen_ActionPerformed(evt);
      }
    });
    bSchliesen.setBackground(new Color(0x006FA8));
    bSchliesen.setForeground(Color.WHITE);
    cp.add(bSchliesen);
    
    cp.setBackground(Color.WHITE);
    setUndecorated(false);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public help
  
  // Anfang Methoden
  
  public static void main(String[] args) {
  } // end of main
  
  public void bSchliesen_ActionPerformed(ActionEvent evt) {
    setVisible(false);
    // TODO hier Quelltext einfgen
    
  } // end of bSchliesen_ActionPerformed

  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfgen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class help
