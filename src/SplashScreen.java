public class SplashScreen extends javax.swing.JPanel {
    public SplashScreen() {
        initComponents();
    }

    private void initComponents() {
        splash_dynamic = new javax.swing.JLabel();
        splash_bg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(null);

        splash_dynamic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/background_splash.gif"))); 
        splash_dynamic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        splash_dynamic.setOpaque(true);
        add(splash_dynamic);
        splash_dynamic.setBounds(0, 0, 1290, 720);

        splash_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/background.png"))); 
        splash_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        splash_bg.setOpaque(true);
        add(splash_bg);
        splash_bg.setBounds(0, 0, 1290, 720);
    }

    private javax.swing.JLabel splash_bg;
    private javax.swing.JLabel splash_dynamic;
}
