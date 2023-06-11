public class Difficulty extends javax.swing.JPanel {
    public Difficulty() {
        initComponents();
    }

    private void initComponents() {
        difficulty_easy = new javax.swing.JButton();
        difficulty_medium = new javax.swing.JButton();
        difficulty_hard = new javax.swing.JButton();
        difficulty_easy_border = new javax.swing.JLabel();
        difficulty_medium_border = new javax.swing.JLabel();
        difficulty_hard_border = new javax.swing.JLabel();
        difficulty_label = new javax.swing.JLabel();

        setEnabled(false);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1210, 580));
        setLayout(null);

        difficulty_easy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/difficulty/easy.png"))); 
        difficulty_easy.setBorder(null);
        difficulty_easy.setBorderPainted(false);
        difficulty_easy.setContentAreaFilled(false);
        difficulty_easy.setFocusPainted(false);
        difficulty_easy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                difficulty_easyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                difficulty_easyMouseExited(evt);
            }
        });
        difficulty_easy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficulty_easyActionPerformed(evt);
            }
        });
        add(difficulty_easy);
        difficulty_easy.setBounds(260, 210, 200, 90);

        difficulty_medium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/difficulty/medium.png"))); 
        difficulty_medium.setBorder(null);
        difficulty_medium.setBorderPainted(false);
        difficulty_medium.setContentAreaFilled(false);
        difficulty_medium.setFocusPainted(false);
        difficulty_medium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                difficulty_mediumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                difficulty_mediumMouseExited(evt);
            }
        });
        difficulty_medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficulty_mediumActionPerformed(evt);
            }
        });
        add(difficulty_medium);
        difficulty_medium.setBounds(700, 290, 280, 90);

        difficulty_hard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/difficulty/hard.png"))); 
        difficulty_hard.setBorder(null);
        difficulty_hard.setBorderPainted(false);
        difficulty_hard.setContentAreaFilled(false);
        difficulty_hard.setFocusPainted(false);
        difficulty_hard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                difficulty_hardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                difficulty_hardMouseExited(evt);
            }
        });
        difficulty_hard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficulty_hardActionPerformed(evt);
            }
        });
        add(difficulty_hard);
        difficulty_hard.setBounds(310, 400, 200, 90);

        difficulty_easy_border.setFont(new java.awt.Font("Segoe UI", 1, 80)); 
        difficulty_easy_border.setForeground(new java.awt.Color(255, 255, 255));
        difficulty_easy_border.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        difficulty_easy_border.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/results/status_00.png"))); 
        add(difficulty_easy_border);
        difficulty_easy_border.setBounds(160, 170, 400, 170);

        difficulty_medium_border.setFont(new java.awt.Font("Segoe UI", 1, 80)); 
        difficulty_medium_border.setForeground(new java.awt.Color(255, 255, 255));
        difficulty_medium_border.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        difficulty_medium_border.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/results/status_00.png"))); 
        add(difficulty_medium_border);
        difficulty_medium_border.setBounds(640, 250, 400, 170);

        difficulty_hard_border.setFont(new java.awt.Font("Segoe UI", 1, 80)); 
        difficulty_hard_border.setForeground(new java.awt.Color(255, 255, 255));
        difficulty_hard_border.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        difficulty_hard_border.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/results/status_00.png"))); 
        add(difficulty_hard_border);
        difficulty_hard_border.setBounds(210, 360, 400, 170);

        difficulty_label.setFont(new java.awt.Font("Segoe UI", 1, 72)); 
        difficulty_label.setForeground(new java.awt.Color(255, 255, 255));
        difficulty_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        difficulty_label.setText("SELECT DIFFICULTY");
        difficulty_label.setToolTipText("");
        add(difficulty_label);
        difficulty_label.setBounds(280, 50, 660, 80);
    }

    public void disable_play(){
        MainMenu.menu_play.setVisible(false);
    }

    private void difficulty_easyMouseEntered(java.awt.event.MouseEvent evt) {
        difficulty_easy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/difficulty/easy_hover.png")));
    }

    private void difficulty_easyMouseExited(java.awt.event.MouseEvent evt) {
        difficulty_easy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/difficulty/easy.png")));
    }

    private void difficulty_easyActionPerformed(java.awt.event.ActionEvent evt) {
        disable_play();
        MainMenu.gameplay.max_count = 24;
        System.out.println("Questions to answer: " + MainMenu.gameplay.max_count);

        MainMenu.gameplay.gameplay_1.setVisible(true);
        MainMenu.gameplay.gameplay_2.setVisible(true);
        MainMenu.gameplay.gameplay_3.setVisible(true);
        MainMenu.gameplay.gameplay_4.setVisible(false);
        MainMenu.gameplay.gameplay_5.setVisible(false);
        MainMenu.gameplay.gameplay_6.setVisible(false);
        MainMenu.gameplay.gameplay_7.setVisible(false);
        MainMenu.gameplay.gameplay_8.setVisible(false);
        MainMenu.gameplay.gameplay_9.setVisible(false);
        MainMenu.gameplay.gameplay_questions_border.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/questions_easy_border.png")));
        
        MainMenu.card.show(OSCreate.mainMenu.main_cardPanel, "gameplay");
    }

    private void difficulty_mediumMouseEntered(java.awt.event.MouseEvent evt) {
        difficulty_medium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/difficulty/medium_hover.png")));
    }

    private void difficulty_mediumMouseExited(java.awt.event.MouseEvent evt) {
        difficulty_medium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/difficulty/medium.png")));
    }

    private void difficulty_mediumActionPerformed(java.awt.event.ActionEvent evt) {
        disable_play();

        MainMenu.gameplay.max_count = 48;
        System.out.println("Questions to answer: " + MainMenu.gameplay.max_count);

        MainMenu.gameplay.gameplay_1.setVisible(true);
        MainMenu.gameplay.gameplay_2.setVisible(true);
        MainMenu.gameplay.gameplay_3.setVisible(true);
        MainMenu.gameplay.gameplay_4.setVisible(true);
        MainMenu.gameplay.gameplay_5.setVisible(true);
        MainMenu.gameplay.gameplay_6.setVisible(true);
        MainMenu.gameplay.gameplay_7.setVisible(false);
        MainMenu.gameplay.gameplay_8.setVisible(false);
        MainMenu.gameplay.gameplay_9.setVisible(false);
        MainMenu.gameplay.gameplay_questions_border.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/questions_medium_border.png")));
        
        MainMenu.card.show(OSCreate.mainMenu.main_cardPanel, "gameplay");
    }

    private void difficulty_hardMouseEntered(java.awt.event.MouseEvent evt) {
        difficulty_hard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/difficulty/hard_hover.png")));
    }

    private void difficulty_hardMouseExited(java.awt.event.MouseEvent evt) {
        difficulty_hard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/difficulty/hard.png")));
    }

    private void difficulty_hardActionPerformed(java.awt.event.ActionEvent evt) {
        disable_play();
        MainMenu.gameplay.max_count = 72;
        System.out.println("Questions to answer: " + MainMenu.gameplay.max_count);
        MainMenu.gameplay.gameplay_1.setVisible(true);
        MainMenu.gameplay.gameplay_2.setVisible(true);
        MainMenu.gameplay.gameplay_3.setVisible(true);
        MainMenu.gameplay.gameplay_4.setVisible(true);
        MainMenu.gameplay.gameplay_5.setVisible(true);
        MainMenu.gameplay.gameplay_6.setVisible(true);
        MainMenu.gameplay.gameplay_7.setVisible(true);
        MainMenu.gameplay.gameplay_8.setVisible(true);
        MainMenu.gameplay.gameplay_9.setVisible(true);
        MainMenu.gameplay.gameplay_questions_border.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/questions_hard_border.png")));

        MainMenu.card.show(OSCreate.mainMenu.main_cardPanel, "gameplay");
    }

    private javax.swing.JButton difficulty_easy;
    private javax.swing.JLabel difficulty_easy_border;
    private javax.swing.JButton difficulty_hard;
    private javax.swing.JLabel difficulty_hard_border;
    private javax.swing.JLabel difficulty_label;
    private javax.swing.JButton difficulty_medium;
    private javax.swing.JLabel difficulty_medium_border;
}
