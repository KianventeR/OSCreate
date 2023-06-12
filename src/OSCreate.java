import javax.swing.*;
import java.awt.*;

public class OSCreate extends javax.swing.JFrame {
    public static JFrame mainFrame = new JFrame();
    public static JPanel mainPanel = new JPanel();
    public static CardLayout card = new CardLayout();
    
    public static SplashScreen splashScreen = new SplashScreen();
    public static MainMenu mainMenu = new MainMenu();
    
    public static boolean sound = true;
    
    public OSCreate() {
        mainFrame.setSize(1280, 720);
        mainFrame.setTitle("OSCreate - FMS Studios");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setUndecorated(true);
        
        mainPanel.setLayout(card);
        mainPanel.add(splashScreen, "1");
        mainPanel.add(mainMenu, "2");
        
        mainFrame.add(mainPanel);
        mainFrame.pack();
        //Osname                                90^ ,ak
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
        
        card.show(mainPanel, "1");
        Music.bgMusic();
        
       new java.util.Timer().schedule(new java.util.TimerTask() {
           @Override
           public void run() {
               card.show(mainPanel, "2");
           }
       }, 4 * 1000); // Miliseconds
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new OSCreate();
            }
        });
    }
}