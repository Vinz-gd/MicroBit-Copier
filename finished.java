import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// Autor: Vinzent Schowald
// Datum: 25.07.2022

public class finished extends JFrame {
  // Anfang Attribute
  private JLabel lDasProgrammwurdeerfolgreichKopiert = new JLabel();
  private JButton jButton1 = new JButton();
    private ImageIcon jButton1Icon = new ImageIcon(getClass().getResource("images/istockphoto-501937292-170667a_skal.jpg"));
  private JButton bOk = new JButton();
  // Ende Attribute
  
  public finished() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 497; 
    int frameHeight = 176;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Fertig!");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    bOk.setBounds(232, 96, 235, 25);
    bOk.setText("Ok");
    bOk.setMargin(new Insets(2, 2, 2, 2));
    bOk.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bOk_ActionPerformed(evt);
      }
    });
    bOk.setBackground(new Color(0x006FA8));
    bOk.setForeground(Color.WHITE);
    cp.add(bOk);
    jButton1.setBounds(4, 5, 211, 129);
    jButton1.setText("");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    jButton1.setBorderPainted(false);
    jButton1.setIcon(jButton1Icon);
    cp.add(jButton1);
    lDasProgrammwurdeerfolgreichKopiert.setBounds(232, 48, 238, 20);
    lDasProgrammwurdeerfolgreichKopiert.setText("Das Programm wurde erfolgreich Kopiert");
    cp.add(lDasProgrammwurdeerfolgreichKopiert);
    
    cp.setBackground(Color.WHITE);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public finished
  
  // Anfang Methoden
  
  public static void main(String[] args) {
     new finished();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfgen
    
  } // end of jButton1_ActionPerformed

  public void bOk_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfgen
    setVisible(false);
  } // end of bOk_ActionPerformed

  // Ende Methoden
} // end of class finished
