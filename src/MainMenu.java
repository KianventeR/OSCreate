import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainMenu extends javax.swing.JPanel {
    boolean home = true;
    boolean play = false;
    boolean help = false;
    boolean devs = false;
    boolean lead = false;

    public static java.awt.CardLayout card = new java.awt.CardLayout();
    public static Difficulty difficulty = new Difficulty();
    public static Gameplay gameplay = new Gameplay();
    public static Question question = new Question();
    public Results results = new Results();

    public MainMenu() {
        initComponents();

        menu_return.setEnabled(false);
        menu_return.setVisible(false);

        menu_panel.setLayout(card);
        menu_panel.add(home_panel, "home");
        menu_panel.add(play_panel, "play");
        menu_panel.add(help_panel, "help");
        menu_panel.add(devs_panel, "devs");
        menu_panel.add(lead_panel, "lead");
        card.show(menu_panel, "home");

        main_cardPanel.setLayout(card);
        main_cardPanel.add(main_panel, "main");
        main_cardPanel.add(difficulty, "difficulty");
        main_cardPanel.add(gameplay, "gameplay");
        main_cardPanel.add(question, "question");
        main_cardPanel.add(results, "results");
        card.show(main_cardPanel, "main");

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                Date currentTime = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
                menu_time.setText(sdf.format(currentTime));
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    private void initComponents() {
        exit = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        main_cardPanel = new javax.swing.JPanel();
        main_panel = new javax.swing.JPanel();
        menu_panel_logo = new javax.swing.JLabel();
        menu_panel_label = new javax.swing.JLabel();
        menu_fms_tag = new javax.swing.JLabel();
        menu_panel = new javax.swing.JPanel();
        home_panel = new javax.swing.JPanel();
        home_bg = new javax.swing.JLabel();
        play_panel = new javax.swing.JPanel();
        menu_play_button = new javax.swing.JButton();
        play_bg = new javax.swing.JLabel();
        help_panel = new javax.swing.JPanel();
        help_bg = new javax.swing.JLabel();
        devs_panel = new javax.swing.JPanel();
        devs_bg = new javax.swing.JLabel();
        lead_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lead_bg = new javax.swing.JLabel();
        menu_home = new javax.swing.JButton();
        menu_play = new javax.swing.JButton();
        menu_return = new javax.swing.JButton();
        menu_help = new javax.swing.JButton();
        menu_devs = new javax.swing.JButton();
        menu_leaderboards = new javax.swing.JButton();
        menu_vol = new javax.swing.JButton();
        menu_time = new javax.swing.JLabel();
        menu_taskbar_bg = new javax.swing.JLabel();
        menu_dynamic_bg = new javax.swing.JLabel();
        menu_bg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(null);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close.png")));
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setFocusPainted(false);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        add(exit);
        exit.setBounds(1230, 10, 40, 30);

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/min.png")));
        minimize.setBorder(null);
        minimize.setBorderPainted(false);
        minimize.setContentAreaFilled(false);
        minimize.setFocusPainted(false);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });
        add(minimize);
        minimize.setBounds(1190, 10, 40, 30);

        main_cardPanel.setMinimumSize(new java.awt.Dimension(1210, 580));
        main_cardPanel.setOpaque(false);
        main_cardPanel.setPreferredSize(new java.awt.Dimension(1210, 580));
        main_cardPanel.setLayout(null);

        main_panel.setMinimumSize(new java.awt.Dimension(1210, 580));
        main_panel.setOpaque(false);
        main_panel.setPreferredSize(new java.awt.Dimension(1210, 580));
        main_panel.setLayout(null);

        menu_panel_logo.setFont(new java.awt.Font("Segoe UI", 1, 80));
        menu_panel_logo.setForeground(new java.awt.Color(255, 255, 255));
        menu_panel_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_panel_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home/home_logo.png")));
        main_panel.add(menu_panel_logo);
        menu_panel_logo.setBounds(160, 70, 230, 230);

        menu_panel_label.setFont(new java.awt.Font("Segoe UI", 1, 90));
        menu_panel_label.setForeground(new java.awt.Color(255, 255, 255));
        menu_panel_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menu_panel_label.setText("Home");
        menu_panel_label.setToolTipText("");
        menu_panel_label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        main_panel.add(menu_panel_label);
        menu_panel_label.setBounds(50, 310, 340, 100);

        menu_fms_tag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_fms_tag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/fms.png")));
        menu_fms_tag.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        main_panel.add(menu_fms_tag);
        menu_fms_tag.setBounds(70, 410, 320, 80);

        menu_panel.setOpaque(false);
        menu_panel.setLayout(new java.awt.CardLayout());

        home_panel.setOpaque(false);
        home_panel.setPreferredSize(new java.awt.Dimension(703, 448));
        home_panel.setLayout(null);

        home_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home/home_panel.png")));
        home_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        home_panel.add(home_bg);
        home_bg.setBounds(0, 0, 703, 450);

        menu_panel.add(home_panel, "home");

        play_panel.setOpaque(false);
        play_panel.setPreferredSize(new java.awt.Dimension(703, 448));
        play_panel.setLayout(null);

        menu_play_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/play/play.png")));
        menu_play_button.setBorder(null);
        menu_play_button.setBorderPainted(false);
        menu_play_button.setContentAreaFilled(false);
        menu_play_button.setFocusPainted(false);
        menu_play_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_play_buttonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_play_buttonMouseExited(evt);
            }
        });
        menu_play_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_play_buttonActionPerformed(evt);
            }
        });
        play_panel.add(menu_play_button);
        menu_play_button.setBounds(270, 360, 160, 70);

        play_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        play_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/play/play_panel.png")));
        play_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        play_panel.add(play_bg);
        play_bg.setBounds(0, 0, 703, 450);

        menu_panel.add(play_panel, "play");

        help_panel.setOpaque(false);
        help_panel.setPreferredSize(new java.awt.Dimension(703, 448));
        help_panel.setLayout(null);

        help_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        help_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/help/help_panel.png")));
        help_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        help_panel.add(help_bg);
        help_bg.setBounds(0, 0, 703, 450);

        menu_panel.add(help_panel, "help");

        devs_panel.setOpaque(false);
        devs_panel.setPreferredSize(new java.awt.Dimension(703, 448));
        devs_panel.setLayout(null);

        devs_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devs_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/devs/devs_panel.png")));
        devs_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        devs_panel.add(devs_bg);
        devs_bg.setBounds(0, 0, 703, 450);

        menu_panel.add(devs_panel, "devs");

        lead_panel.setOpaque(false);
        lead_panel.setPreferredSize(new java.awt.Dimension(703, 448));
        lead_panel.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);
        lead_panel.add(jScrollPane1);
        jScrollPane1.setBounds(60, 150, 580, 240);

        lead_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lead_bg.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/resources/leaderboard/leaderboards_panel.png")));
        lead_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lead_panel.add(lead_bg);
        lead_bg.setBounds(0, 0, 703, 450);

        menu_panel.add(lead_panel, "lead");

        main_panel.add(menu_panel);
        menu_panel.setBounds(420, 70, 703, 450);

        main_cardPanel.add(main_panel);
        main_panel.setBounds(0, 0, 1210, 580);

        add(main_cardPanel);
        main_cardPanel.setBounds(40, 40, 1210, 580);

        menu_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/home_hover.png")));
        menu_home.setBorder(null);
        menu_home.setBorderPainted(false);
        menu_home.setContentAreaFilled(false);
        menu_home.setFocusPainted(false);
        menu_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_homeMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_homeMouseExited(evt);
            }
        });
        menu_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_homeActionPerformed(evt);
            }
        });
        add(menu_home);
        menu_home.setBounds(310, 630, 70, 60);

        menu_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/play.png")));
        menu_play.setBorder(null);
        menu_play.setBorderPainted(false);
        menu_play.setContentAreaFilled(false);
        menu_play.setFocusPainted(false);
        menu_play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_playMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_playMouseExited(evt);
            }
        });
        menu_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_playActionPerformed(evt);
            }
        });
        add(menu_play);
        menu_play.setBounds(420, 630, 70, 60);

        menu_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/return.png")));
        menu_return.setBorder(null);
        menu_return.setBorderPainted(false);
        menu_return.setContentAreaFilled(false);
        menu_return.setFocusPainted(false);
        menu_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_returnMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_returnMouseExited(evt);
            }
        });
        menu_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_returnActionPerformed(evt);
            }
        });
        add(menu_return);
        menu_return.setBounds(menu_play.getBounds());

        menu_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/help.png")));
        menu_help.setBorder(null);
        menu_help.setBorderPainted(false);
        menu_help.setContentAreaFilled(false);
        menu_help.setFocusPainted(false);
        menu_help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_helpMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_helpMouseExited(evt);
            }
        });
        menu_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_helpActionPerformed(evt);
            }
        });
        add(menu_help);
        menu_help.setBounds(530, 630, 70, 60);

        menu_devs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/devs.png")));
        menu_devs.setBorder(null);
        menu_devs.setBorderPainted(false);
        menu_devs.setContentAreaFilled(false);
        menu_devs.setFocusPainted(false);
        menu_devs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_devsMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_devsMouseExited(evt);
            }
        });
        menu_devs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_devsActionPerformed(evt);
            }
        });
        add(menu_devs);
        menu_devs.setBounds(640, 630, 70, 60);

        menu_leaderboards
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/leaderboards.png")));
        menu_leaderboards.setBorder(null);
        menu_leaderboards.setBorderPainted(false);
        menu_leaderboards.setContentAreaFilled(false);
        menu_leaderboards.setFocusPainted(false);
        menu_leaderboards.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_leaderboardsMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_leaderboardsMouseExited(evt);
            }
        });
        menu_leaderboards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_leaderboardsActionPerformed(evt);
            }
        });
        add(menu_leaderboards);
        menu_leaderboards.setBounds(750, 630, 70, 60);

        menu_vol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/mute.png")));
        menu_vol.setBorder(null);
        menu_vol.setBorderPainted(false);
        menu_vol.setContentAreaFilled(false);
        menu_vol.setFocusPainted(false);
        menu_vol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_volMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_volMouseExited(evt);
            }
        });
        menu_vol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_volActionPerformed(evt);
            }
        });
        add(menu_vol);
        menu_vol.setBounds(1000, 640, 50, 40);

        menu_time.setFont(new java.awt.Font("Segoe UI", 1, 24));
        menu_time.setForeground(new java.awt.Color(255, 255, 255));
        menu_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_time.setText("11:45 AM");
        add(menu_time);
        menu_time.setBounds(1050, 630, 130, 60);

        menu_taskbar_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_taskbar_bg
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/taskbar_bg.png")));
        menu_taskbar_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(menu_taskbar_bg);
        menu_taskbar_bg.setBounds(80, 620, 1120, 80);

        menu_dynamic_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/background_dynamic.gif")));
        menu_dynamic_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(menu_dynamic_bg);
        menu_dynamic_bg.setBounds(0, 0, 1280, 720);

        menu_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/background.png")));
        menu_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_bg.setOpaque(true);
        add(menu_bg);
        menu_bg.setBounds(0, 0, 1280, 720);
    }

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close_hover.png")));
    }

    private void exitMouseExited(java.awt.event.MouseEvent evt) {
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close.png")));
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        System.exit(0);
    }

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/min_hover.png")));
    }

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/min.png")));
    }

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        OSCreate.mainFrame.setState(java.awt.Frame.ICONIFIED);
    }

    private void menu_helpMouseEntered(java.awt.event.MouseEvent evt) {
        if (!help)
            menu_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/help_hover.png")));
    }

    private void menu_helpMouseExited(java.awt.event.MouseEvent evt) {
        if (!help)
            menu_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/help.png")));
    }

    private void menu_helpActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        home = false;
        play = false;
        help = true;
        devs = false;
        lead = false;

        menu_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/home.png")));
        menu_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/play.png")));
        menu_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/help_hover.png")));
        menu_devs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/devs.png")));
        menu_leaderboards
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/leaderboards.png")));

        menu_panel_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/help/help_logo.png")));
        menu_panel_label.setText("Help");

        card.show(main_cardPanel, "main");
        card.show(menu_panel, "help");
    }

    private void menu_playMouseEntered(java.awt.event.MouseEvent evt) {
        if (!play)
            menu_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/play_hover.png")));
    }

    private void menu_playMouseExited(java.awt.event.MouseEvent evt) {
        if (!play)
            menu_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/play.png")));
    }

    private void menu_playActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        home = false;
        play = true;
        help = false;
        devs = false;
        lead = false;

        menu_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/home.png")));
        menu_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/play_hover.png")));
        menu_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/help.png")));
        menu_devs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/devs.png")));
        menu_leaderboards
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/leaderboards.png")));

        menu_panel_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/play/play_logo.png")));
        menu_panel_label.setText("Play");

        card.show(main_cardPanel, "main");
        card.show(menu_panel, "play");
    }

    private void menu_devsMouseEntered(java.awt.event.MouseEvent evt) {
        if (!devs)
            menu_devs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/devs_hover.png")));
    }

    private void menu_devsMouseExited(java.awt.event.MouseEvent evt) {
        if (!devs)
            menu_devs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/devs.png")));
    }

    private void menu_devsActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        home = false;
        play = false;
        help = false;
        devs = true;
        lead = false;

        menu_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/home.png")));
        menu_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/play.png")));
        menu_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/help.png")));
        menu_devs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/devs_hover.png")));
        menu_leaderboards
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/leaderboards.png")));

        menu_panel_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/devs/devs_logo.png")));
        menu_panel_label.setText("Devs");

        card.show(main_cardPanel, "main");
        card.show(menu_panel, "devs");
    }

    private void menu_leaderboardsMouseEntered(java.awt.event.MouseEvent evt) {
        if (!lead)
            menu_leaderboards.setIcon(
                    new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/leaderboards_hover.png")));
    }

    private void menu_leaderboardsMouseExited(java.awt.event.MouseEvent evt) {
        if (!lead)
            menu_leaderboards.setIcon(
                    new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/leaderboards.png")));
    }

    private void menu_leaderboardsActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        home = false;
        play = false;
        help = false;
        devs = false;
        lead = true;

        menu_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/home.png")));
        menu_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/play.png")));
        menu_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/help.png")));
        menu_devs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/devs.png")));
        menu_leaderboards.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/leaderboards_hover.png")));

        menu_panel_logo.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/resources/leaderboard/leaderboard_logo.png")));
        menu_panel_label.setText("Leaders");

        card.show(main_cardPanel, "main");
        card.show(menu_panel, "lead");
    }

    private void menu_volMouseEntered(java.awt.event.MouseEvent evt) {
        if (OSCreate.sound) {
            menu_vol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/mute_hover.png")));
        } else {
            menu_vol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/muteX_hover.png")));
        }
    }

    private void menu_volMouseExited(java.awt.event.MouseEvent evt) {
        if (OSCreate.sound) {
            menu_vol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/mute.png")));
        } else {
            menu_vol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/muteX.png")));
        }
    }

    private void menu_volActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        if (OSCreate.sound) {
            OSCreate.sound = false;
            Music.bgMusic.pause();
            menu_vol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/muteX.png")));
        } else {
            OSCreate.sound = true;
            Music.bgMusic.play();
            menu_vol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/mute.png")));
        }
    }

    private void menu_homeMouseEntered(java.awt.event.MouseEvent evt) {
        if (!home)
            menu_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/home_hover.png")));
    }

    private void menu_homeMouseExited(java.awt.event.MouseEvent evt) {
        if (!home)
            menu_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/home.png")));
    }

    private void menu_homeActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        home = true;
        play = false;
        help = false;
        devs = false;
        lead = false;

        gameplay.reset();
        menu_play.setVisible(true);

        menu_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/home_hover.png")));
        menu_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/play.png")));
        menu_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/help.png")));
        menu_devs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/devs.png")));
        menu_leaderboards
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/leaderboards.png")));

        menu_panel_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home/home_logo.png")));
        menu_panel_label.setText("Home");

        menu_return.setEnabled(false);
        menu_return.setVisible(false);
        menu_help.setEnabled(true);
        menu_devs.setEnabled(true);
        menu_leaderboards.setEnabled(true);
        menu_help.setVisible(true);
        menu_devs.setVisible(true);
        menu_leaderboards.setVisible(true);

        if(!Music.bgMusic.filePath.toString().equals(Music.bgMusicTemp.filePath.toString())) {
            try {
                Music.bgMusic.stop();
                Music.bgMusic = new MusicPlayer("/resources/sounds/bg_music.wav");
                Music.bgMusic.pause();
                if(OSCreate.sound)
                    Music.bgMusic.play();
            } catch (Exception e) { }
        }
        

        card.show(main_cardPanel, "main");
        card.show(menu_panel, "home");
    }

    private void menu_play_buttonMouseEntered(java.awt.event.MouseEvent evt) {
        menu_play_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/play/play_hover.png")));
    }

    private void menu_play_buttonMouseExited(java.awt.event.MouseEvent evt) {
        menu_play_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/play/play.png")));
    }

    private void menu_play_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        menu_help.setEnabled(false);
        menu_devs.setEnabled(false);
        menu_leaderboards.setEnabled(false);
        menu_help.setVisible(false);
        menu_devs.setVisible(false);
        menu_leaderboards.setVisible(false);

        card.show(main_cardPanel, "difficulty");
    }

    private void menu_returnMouseEntered(java.awt.event.MouseEvent evt) {
        menu_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/return_hover.png")));
    }

    private void menu_returnMouseExited(java.awt.event.MouseEvent evt) {
        menu_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/main menu/return.png")));
    }

    private void menu_returnActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        menu_return.setEnabled(false);
        menu_return.setVisible(false);

        question.whereTO();
    }

    private javax.swing.JLabel devs_bg;
    private javax.swing.JPanel devs_panel;
    private javax.swing.JButton exit;
    private javax.swing.JLabel help_bg;
    private javax.swing.JPanel help_panel;
    private javax.swing.JLabel home_bg;
    private javax.swing.JPanel home_panel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lead_bg;
    private javax.swing.JPanel lead_panel;
    public javax.swing.JPanel main_cardPanel;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel menu_bg;
    public javax.swing.JButton menu_devs;
    private javax.swing.JLabel menu_dynamic_bg;
    private javax.swing.JLabel menu_fms_tag;
    public javax.swing.JButton menu_help;
    private javax.swing.JButton menu_home;
    public javax.swing.JButton menu_leaderboards;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JLabel menu_panel_label;
    private javax.swing.JLabel menu_panel_logo;
    public static javax.swing.JButton menu_play;
    public static javax.swing.JButton menu_play_button;
    public javax.swing.JButton menu_return;
    private javax.swing.JLabel menu_taskbar_bg;
    private javax.swing.JLabel menu_time;
    public javax.swing.JButton menu_vol;
    private javax.swing.JButton minimize;
    private javax.swing.JLabel play_bg;
    private javax.swing.JPanel play_panel;

}
