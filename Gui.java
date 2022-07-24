import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import static java.nio.file.StandardCopyOption.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 23.07.2022
 * @author Vinzent Schowald
 */

public class Gui extends JFrame {
  // Anfang Attribute
  private JFileChooser jFileChooser1 = new JFileChooser();
  private JButton bProgrammauswaehlen1 = new JButton();
  private JButton bStart = new JButton();
  private JLabel lMicroBitProgrammInstallieren = new JLabel();
  private JButton bMicroBitauswaehlen = new JButton();
  private JButton bFertig = new JButton();
  private JFileChooser jFileChooser2 = new JFileChooser();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private boolean enabled1=false, enabled2=false,succes=true,file1sel=false,file2sel=false;
  private String source = "", target="";
  private JOptionPane jOptionPane1 = new JOptionPane();
  private JOptionPane jOptionPane2 = new JOptionPane();
  private JButton bHilfe = new JButton();
  private JOptionPane jOptionPane3 = new JOptionPane();
  private JButton jButton3 = new JButton();
    private ImageIcon jButton3Icon = new ImageIcon(getClass().getResource("images/index.png"));
  // Ende Attribute
  
  public Gui() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 635; 
    int frameHeight = 438;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("MircorBit Installer");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    jButton3.setBounds(237, 72, 147, 113);
    jButton3.setText("");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    jButton3.setIcon(jButton3Icon);
    jButton3.setHorizontalTextPosition(SwingConstants.CENTER);
    jButton3.setEnabled(true);
    jButton3.setContentAreaFilled(false);
    jButton3.setBorderPainted(false);
    cp.add(jButton3);
    bHilfe.setBounds(8, 368, 601, 25);
    bHilfe.setText("Hilfe");
    bHilfe.setMargin(new Insets(2, 2, 2, 2));
    bHilfe.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bHilfe_ActionPerformed(evt);
      }
    });
    bHilfe.setBackground(new Color(0xC0C0C0));
    cp.add(bHilfe);
    jButton2.setBounds(336, 256, 273, 17);
    jButton2.setText("");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    jButton2.setEnabled(false);
    jButton2.setBorderPainted(false);
    jButton2.setBackground(Color.WHITE);
    jButton2.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(jButton2);
    jButton1.setBounds(8, 256, 273, 17);
    jButton1.setText("");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    jButton1.setEnabled(false);
    jButton1.setBorderPainted(false);
    jButton1.setBackground(Color.WHITE);
    jButton1.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(jButton1);
    bFertig.setBounds(8, 336, 603, 25);
    bFertig.setText("Fertig");
    bFertig.setMargin(new Insets(2, 2, 2, 2));
    bFertig.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bFertig_ActionPerformed(evt);
      }
    });
    bFertig.setBackground(new Color(0xC0C0C0));
    cp.add(bFertig);
    bMicroBitauswaehlen.setBounds(384, 32, 227, 217);
    bMicroBitauswaehlen.setText("MicroBit auswaehlen");
    bMicroBitauswaehlen.setMargin(new Insets(2, 2, 2, 2));
    bMicroBitauswaehlen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bMicroBitauswaehlen_ActionPerformed(evt);
      }
    });
    bMicroBitauswaehlen.setBackground(new Color(0xC0C0C0));
    cp.add(bMicroBitauswaehlen);
    lMicroBitProgrammInstallieren.setBounds(8, 1, 606, 28);
    lMicroBitProgrammInstallieren.setText("MicroBit Programm Installieren");
    lMicroBitProgrammInstallieren.setHorizontalTextPosition(SwingConstants.CENTER);
    lMicroBitProgrammInstallieren.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(lMicroBitProgrammInstallieren);
    bStart.setBounds(8, 288, 603, 41);
    bStart.setText("Start");
    bStart.setMargin(new Insets(2, 2, 2, 2));
    bStart.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bStart_ActionPerformed(evt);
      }
    });
    bStart.setBackground(new Color(0xC0C0C0));
    bStart.setEnabled(false);
    cp.add(bStart);
    bProgrammauswaehlen1.setBounds(8, 32, 227, 217);
    bProgrammauswaehlen1.setText("Programm auswaehlen");
    bProgrammauswaehlen1.setMargin(new Insets(2, 2, 2, 2));
    bProgrammauswaehlen1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bProgrammauswaehlen1_ActionPerformed(evt);
      }
    });
    bProgrammauswaehlen1.setBackground(new Color(0xC0C0C0));
    cp.add(bProgrammauswaehlen1);
    jFileChooser2.setFileSelectionMode(2);
    cp.setBackground(Color.WHITE);
    // Ende Komponenten
    setVisible(true);
  } // end of public Gui
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Gui();
  } // end of main
  
  public File jFileChooser1_openFile() {
    if (jFileChooser1.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
      file1sel=true;
      return jFileChooser1.getSelectedFile();
    } else {
      file1sel=false;
      return null;
    }
  }

  public File jFileChooser2_saveFile() {
    if (jFileChooser2.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
      file2sel=true;
      return jFileChooser2.getSelectedFile();
    } else {
      file2sel=false;
      return null;
    }
  }


  public void bProgrammauswaehlen1_ActionPerformed(ActionEvent evt) {
    jFileChooser1_openFile();
    if (file1sel) {
      jButton1.setBackground(Color.GREEN);
      jButton1.setText(String.valueOf(jFileChooser1.getSelectedFile()));
      enabled1=true;
      if (enabled1&&enabled2) {
        bStart.setEnabled(true);
      } // end of if
    } // end of if
  } // end of bProgrammauswaehlen1_ActionPerformed

  public void bStart_ActionPerformed(ActionEvent evt) {

    source= String.valueOf(jFileChooser1.getSelectedFile());
    target= String.valueOf(jFileChooser2.getSelectedFile());
    System.out.println(source);
    System.out.println(source.lastIndexOf('\\'));
    System.out.println(source.substring(source.lastIndexOf('\\')));
    target = target + source.substring(source.lastIndexOf('\\'));
    System.out.println(target);
    Path target_path = Paths.get(target);
    
    try {
      Files.copy(jFileChooser1.getSelectedFile().toPath(),target_path,REPLACE_EXISTING);
    } catch(Exception e) {
      succes = false;
      System.out.println(e);
      jOptionPane1_ShowDialog(String.valueOf(e));
    } finally {
      if (succes) {
        jOptionPane2_ShowDialog();
      } // end of if
    } // end of try
    
  } // end of bStart_ActionPerformed

  public void bMicroBitauswaehlen_ActionPerformed(ActionEvent evt) {
    jFileChooser2_openFile();
    if (file2sel) {
      jButton2.setBackground(Color.GREEN);
      jButton2.setText(String.valueOf(jFileChooser2.getSelectedFile()));
      enabled2=true;
      if (enabled1&&enabled2) {
        bStart.setEnabled(true);
      } // end of if 
    } // end of if
    
    
  } // end of bMicroBitauswaehlen_ActionPerformed


  public void bFertig_ActionPerformed(ActionEvent evt) {
    System.exit(1);
    
  } // end of bFertig_ActionPerformed

  public File jFileChooser2_openFile() {
    if (jFileChooser2.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
      file2sel=true;
      return jFileChooser2.getSelectedFile();
    } else {
      file2sel=false;
      return null;
    }
  }

  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfgen
    
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfgen
    
  } // end of jButton2_ActionPerformed

  public void jOptionPane1_ShowDialog(String text) {
    JOptionPane.showMessageDialog(this, text, "", JOptionPane.ERROR_MESSAGE);
  }

  public void jOptionPane2_ShowDialog() {
    JOptionPane.showMessageDialog(this, "Programm wurde erfolgreich kopiert", "", JOptionPane.INFORMATION_MESSAGE);
  }

  public void bHilfe_ActionPerformed(ActionEvent evt) {
    jOptionPane3_ShowDialog();
    
  } // end of bHilfe_ActionPerformed
  
  public void jOptionPane3_ShowDialog() {
    JOptionPane.showMessageDialog(this, "Wenn Das Programm Heruntergeladen wurde befindet es sich im Ordner \"Downloads\".\nDen MicroBit kannst du bei \"Dieser PC\" auswaehlen.", "Hilfe", JOptionPane.INFORMATION_MESSAGE);
  }
  public void jButton3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfgen
    
  } // end of jButton3_ActionPerformed

  // Ende Methoden
} // end of class Gui
