public class Results extends javax.swing.JPanel {
    public Results() {
        initComponents();
    }

    public void initComponents() {
        results_save = new javax.swing.JButton();
        results_specs = new javax.swing.JTextArea();
        results_OSname = new javax.swing.JTextField();
        results_score_label = new javax.swing.JLabel();
        results_score_bg = new javax.swing.JLabel();
        results_oscreate = new javax.swing.JLabel();
        results_status = new javax.swing.JLabel();
        results_component_labels = new javax.swing.JLabel();
        results_OS_name = new javax.swing.JLabel();
        results_logo = new javax.swing.JLabel();
        results_sentence = new javax.swing.JTextPane();
        results_OS_complete = new javax.swing.JTextPane();
        
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1210, 580));
        setLayout(null);

        results_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/results/save.png")));
        results_save.setBorder(null);
        results_save.setBorderPainted(false);
        results_save.setContentAreaFilled(false);
        results_save.setFocusPainted(false);
        results_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                results_saveMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                results_saveMouseExited(evt);
            }
        });
        results_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                results_saveActionPerformed(evt);
            }
        });
        add(results_save);
        results_save.setBounds(1080, 300, 60, 30);

        results_specs.setEditable(false);
        results_specs.setColumns(20);
        results_specs.setFont(new java.awt.Font("Segoe UI", 1, 21));
        results_specs.setForeground(new java.awt.Color(255, 255, 255));
        results_specs.setRows(5);
        results_specs.setText(
                "Microkernel\nCompletely Fair Scheduler\nDirect Virtual Memory Adress\nGeneral Graph Directory\nIndexed\nPaging\nAuthentication Protocols\nGraphical User Interface (GUI)\n");
        results_specs.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 0, 1, 1));
        results_specs.setOpaque(false);
        add(results_specs);
        results_specs.setBounds(570, 280, 390, 250);

        results_OSname.setFont(new java.awt.Font("Segoe UI", 1, 18));
        results_OSname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        results_OSname.setText("");
        results_OSname.setToolTipText("Name your OS!");
        results_OSname.setBorder(null);
        results_OSname.setOpaque(false);
        add(results_OSname);
        results_OSname.setBounds(890, 260, 250, 30);

        results_score_label.setFont(new java.awt.Font("Segoe UI", 1, 120));
        results_score_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        results_score_label.setText("0");
        results_score_label.setToolTipText("");
        add(results_score_label);
        results_score_label.setBounds(70, 140, 270, 120);

        results_score_bg.setFont(new java.awt.Font("Segoe UI", 1, 80));
        results_score_bg.setForeground(new java.awt.Color(255, 255, 255));
        results_score_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        results_score_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/results/points_bg.png")));
        add(results_score_bg);
        results_score_bg.setBounds(50, 60, 310, 270);

        results_oscreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        results_oscreate
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/results/title_label.png")));
        results_oscreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(results_oscreate);
        results_oscreate.setBounds(50, 330, 300, 100);

        results_status.setFont(new java.awt.Font("Segoe UI", 1, 80));
        results_status.setForeground(new java.awt.Color(255, 255, 255));
        results_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        results_status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/results/status_08.png")));
        add(results_status);
        results_status.setBounds(380, 60, 480, 160);

        results_component_labels.setFont(new java.awt.Font("Segoe UI", 1, 80));
        results_component_labels.setForeground(new java.awt.Color(255, 255, 255));
        results_component_labels.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        results_component_labels
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/results/component_labels.png")));
        add(results_component_labels);
        results_component_labels.setBounds(390, 290, 170, 230);

        results_OS_name.setFont(new java.awt.Font("Segoe UI", 1, 80));
        results_OS_name.setForeground(new java.awt.Color(255, 255, 255));
        results_OS_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        results_OS_name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/results/os_name_bg.png")));
        add(results_OS_name);
        results_OS_name.setBounds(870, 210, 290, 100);

        results_logo.setFont(new java.awt.Font("Segoe UI", 1, 80));
        results_logo.setForeground(new java.awt.Color(255, 255, 255));
        results_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        results_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/results/logo.png")));
        add(results_logo);
        results_logo.setBounds(990, 370, 150, 150);

        results_sentence.setEditable(false);
        results_sentence.setFont(new java.awt.Font("Segoe UI", 1, 20));
        results_sentence.setForeground(new java.awt.Color(255, 255, 255));
        results_sentence.setText("Based from the score, you have implemented the following specifications:");
        results_sentence.setOpaque(false);
        add(results_sentence);
        results_sentence.setBounds(390, 220, 470, 70);

        results_OS_complete.setEditable(false);
        results_OS_complete.setFont(new java.awt.Font("Segoe UI", 1, 34));
        results_OS_complete.setForeground(new java.awt.Color(255, 255, 255));
        results_OS_complete.setText("Your OS is now Complete");
        results_OS_complete.setOpaque(false);
        add(results_OS_complete);
        results_OS_complete.setBounds(870, 90, 260, 100);
    }

    public void results_saveMouseEntered(java.awt.event.MouseEvent evt) {
        results_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/results/save_hover.png")));
    }

    public void results_saveMouseExited(java.awt.event.MouseEvent evt) {
        results_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/results/save.png")));
    }

    public void results_saveActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        MainMenu.menu_play.setVisible(true);
        OSCreate.mainMenu.menu_return.setEnabled(false);
        OSCreate.mainMenu.menu_return.setVisible(false);
        OSCreate.mainMenu.menu_help.setEnabled(true);
        OSCreate.mainMenu.menu_devs.setEnabled(true);
        OSCreate.mainMenu.menu_leaderboards.setEnabled(true);
        OSCreate.mainMenu.menu_help.setVisible(true);
        OSCreate.mainMenu.menu_devs.setVisible(true);
        OSCreate.mainMenu.menu_leaderboards.setVisible(true);
        MainMenu.question.points = 0;

        MainMenu.gameplay.reset();
        reset();
        MainMenu.card.show(OSCreate.mainMenu.main_cardPanel, "main");
    }

    private void reset() {
        removeAll();
        initComponents();
    }

    public javax.swing.JTextPane results_OS_complete;
    public javax.swing.JLabel results_OS_name;
    public javax.swing.JTextField results_OSname;
    public javax.swing.JLabel results_component_labels;
    public javax.swing.JLabel results_logo;
    public javax.swing.JLabel results_oscreate;
    public javax.swing.JButton results_save;
    public javax.swing.JLabel results_score_bg;
    public javax.swing.JLabel results_score_label;
    public javax.swing.JTextPane results_sentence;
    public javax.swing.JTextArea results_specs;
    public javax.swing.JLabel results_status;

}
