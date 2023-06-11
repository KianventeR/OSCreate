import java.awt.Color;
import java.util.LinkedList;

public class Question extends javax.swing.JPanel {
    public int points;
    public Question() {
        initComponents();
    }

    public void generateQuestion(int item_no) {

        // generate question for item in (item_no)


    }

    public boolean validator(char selected, char correct){

        // validate correct answer
        points++;
        if(selected == correct){
            return true;
        }
        else{
            return false;
        }
    }

    private void initComponents() {
        points = 0;
        question_C_scroll1 = new javax.swing.JScrollPane();
        question_C_label1 = new javax.swing.JTextArea();
        question_A_scroll = new javax.swing.JScrollPane();
        question_A_label = new javax.swing.JTextArea();
        question_A = new javax.swing.JButton();
        question_B_scroll = new javax.swing.JScrollPane();
        question_B_label = new javax.swing.JTextArea();
        question_B = new javax.swing.JButton();
        question_C_scroll = new javax.swing.JScrollPane();
        question_C_label = new javax.swing.JTextArea();
        question_C = new javax.swing.JButton();
        question_D_scroll = new javax.swing.JScrollPane();
        question_D_label = new javax.swing.JTextArea();
        question_D = new javax.swing.JButton();
        question_timer_label = new javax.swing.JLabel();
        question_timer_bg_label = new javax.swing.JLabel();
        question_timer_bg = new javax.swing.JLabel();
        question_label = new javax.swing.JLabel();
        question_qArea = new javax.swing.JLabel();
        question_bg = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1197, 541));
        setLayout(null);

        question_C_scroll1.setBorder(null);
        question_C_scroll1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        question_C_scroll1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        question_C_scroll1.setOpaque(false);

        question_C_label1.setEditable(false);
        question_C_label1.setColumns(20);
        question_C_label1.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        question_C_label1.setLineWrap(true);
        question_C_label1.setRows(5);
        question_C_label1.setText("Which type of architecture has a kernel that provides basic services and other services provided by separate modules? ");
        question_C_label1.setToolTipText("");
        question_C_label1.setWrapStyleWord(true);
        question_C_scroll1.setViewportView(question_C_label1);

        add(question_C_scroll1);
        question_C_scroll1.setBounds(80, 140, 1050, 90);

        question_A_scroll.setBorder(null);
        question_A_scroll.setOpaque(false);

        question_A_label.setEditable(false);
        question_A_label.setColumns(20);
        question_A_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        question_A_label.setLineWrap(true);
        question_A_label.setRows(1);
        question_A_label.setWrapStyleWord(true);
        question_A_label.setOpaque(true);
        question_A_label.setBackground(Color.WHITE);
        question_A_scroll.setViewportView(question_A_label);
       
        add(question_A_scroll);
        question_A_scroll.setBounds(150, 290, 330, 80);
        question_A_scroll.setOpaque(false);

        question_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/question/question_choice.png"))); 
        question_A.setBorder(null);
        question_A.setBorderPainted(false);
        question_A.setContentAreaFilled(false);
        question_A.setFocusPainted(false);
        question_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                question_AMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                question_AMouseExited(evt);
            }
        });
        question_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question_AActionPerformed(evt);
            }
        });
        add(question_A);
        question_A.setBounds(60, 280, 430, 100);

        question_B_scroll.setBorder(null);
        question_B_scroll.setOpaque(false);

        question_B_label.setEditable(false);
        question_B_label.setColumns(20);
        question_B_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        question_B_label.setLineWrap(true);
        question_B_label.setRows(1);
        question_B_label.setText("aaasdasdsa sada sdsds dsad sd sadsa dsad asd sadsadsads a\na\na\na");
        question_B_label.setWrapStyleWord(true);
        question_B_label.setOpaque(true);
        question_B_label.setBackground(Color.WHITE);
        question_B_scroll.setViewportView(question_B_label);

        add(question_B_scroll);
        question_B_scroll.setBounds(150, 410, 330, 80);

        question_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/question/question_choice.png"))); 
        question_B.setBorder(null);
        question_B.setBorderPainted(false);
        question_B.setContentAreaFilled(false);
        question_B.setFocusPainted(false);
        question_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                question_BMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                question_BMouseExited(evt);
            }
        });
        question_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question_BActionPerformed(evt);
            }
        });
        add(question_B);
        question_B.setBounds(60, 400, 430, 100);

        question_C_scroll.setBorder(null);
        question_C_scroll.setOpaque(false);

        question_C_label.setEditable(false);
        question_C_label.setColumns(20);
        question_C_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        question_C_label.setLineWrap(true);
        question_C_label.setRows(1);
        question_C_label.setText("aaasdasdsa sada sdsds dsad sd sadsa dsad asd sadsadsads a\na\na\na");
        question_C_label.setWrapStyleWord(true);
        question_C_label.setOpaque(true);
        question_C_label.setBackground(Color.WHITE);
        question_C_scroll.setViewportView(question_C_label);

        add(question_C_scroll);
        question_C_scroll.setBounds(610, 290, 330, 80);

        question_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/question/question_choice.png"))); 
        question_C.setBorder(null);
        question_C.setBorderPainted(false);
        question_C.setContentAreaFilled(false);
        question_C.setFocusPainted(false);
        question_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                question_CMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                question_CMouseExited(evt);
            }
        });
        question_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question_CActionPerformed(evt);
            }
        });
        add(question_C);
        question_C.setBounds(520, 280, 430, 100);

        question_D_scroll.setBorder(null);
        question_D_scroll.setOpaque(false);

        question_D_label.setEditable(false);
        question_D_label.setColumns(20);
        question_D_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        question_D_label.setLineWrap(true);
        question_D_label.setRows(1);
        question_D_label.setText("aaasdasdsa sada sdsds dsad sd sadsa dsad asd sadsadsads a\na\na\na");
        question_D_label.setWrapStyleWord(true);
        question_D_label.setOpaque(true);
        question_D_label.setBackground(Color.WHITE);
        question_D_scroll.setViewportView(question_D_label);

        add(question_D_scroll);
        question_D_scroll.setBounds(610, 410, 330, 80);

        question_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/question/question_choice.png"))); 
        question_D.setBorder(null);
        question_D.setBorderPainted(false);
        question_D.setContentAreaFilled(false);
        question_D.setFocusPainted(false);
        question_D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                question_DMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                question_DMouseExited(evt);
            }
        });
        question_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question_DActionPerformed(evt);
            }
        });
        add(question_D);
        question_D.setBounds(520, 400, 430, 100);

        question_timer_label.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        question_timer_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question_timer_label.setText("30s");
        question_timer_label.setToolTipText("");
        add(question_timer_label);
        question_timer_label.setBounds(1030, 480, 150, 50);

        question_timer_bg_label.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        question_timer_bg_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question_timer_bg_label.setText("Timer");
        question_timer_bg_label.setToolTipText("");
        add(question_timer_bg_label);
        question_timer_bg_label.setBounds(1030, 450, 150, 30);

        question_timer_bg.setFont(new java.awt.Font("Segoe UI", 1, 80)); 
        question_timer_bg.setForeground(new java.awt.Color(255, 255, 255));
        question_timer_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question_timer_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/question/timer_bg.png"))); 
        question_timer_bg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(question_timer_bg);
        question_timer_bg.setBounds(1020, 450, 170, 100);

        question_label.setFont(new java.awt.Font("Segoe UI", 1, 20)); 
        question_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question_label.setText("Question...");
        question_label.setToolTipText("");
        add(question_label);
        question_label.setBounds(40, 90, 150, 40);

        question_qArea.setFont(new java.awt.Font("Segoe UI", 1, 80)); 
        question_qArea.setForeground(new java.awt.Color(255, 255, 255));
        question_qArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question_qArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/question/question_qArea.png"))); 
        add(question_qArea);
        question_qArea.setBounds(10, 80, 1190, 190);

        question_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/question/question_panel_bg.png"))); 
        question_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        question_bg.setPreferredSize(new java.awt.Dimension(1210, 580));
        add(question_bg);
        question_bg.setBounds(0, 0, 1210, 580);
    }

    private void question_AMouseEntered(java.awt.event.MouseEvent evt) {
        
    }

    private void question_AMouseExited(java.awt.event.MouseEvent evt) {
        
    }

    private void question_AActionPerformed(java.awt.event.ActionEvent evt) {
        whereTO();
        return_disabler();
    }

    private void whereTO() {
        int finished = MainMenu.gameplay.finished_question_count;
        int max = MainMenu.gameplay.max_count;

        if(finished == max){
         MainMenu.card.show(OSCreate.mainMenu.main_cardPanel, "results");
        }
        else{
            MainMenu.card.show(OSCreate.mainMenu.main_cardPanel, "gameplay");
        }
         
         
    }

    private void return_disabler() {
        OSCreate.mainMenu.menu_return.setEnabled(false);
        OSCreate.mainMenu.menu_return.setVisible(false);
    }

    private void question_BMouseEntered(java.awt.event.MouseEvent evt) {
        
    }

    private void question_BMouseExited(java.awt.event.MouseEvent evt) {
        
    }

    private void question_BActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void question_CMouseEntered(java.awt.event.MouseEvent evt) {
        
    }

    private void question_CMouseExited(java.awt.event.MouseEvent evt) {
        
    }

    private void question_CActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void question_DMouseEntered(java.awt.event.MouseEvent evt) {
        
    }

    private void question_DMouseExited(java.awt.event.MouseEvent evt) {
        
    }

    private void question_DActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private javax.swing.JButton question_A;
    private javax.swing.JTextArea question_A_label;
    private javax.swing.JScrollPane question_A_scroll;
    private javax.swing.JButton question_B;
    private javax.swing.JTextArea question_B_label;
    private javax.swing.JScrollPane question_B_scroll;
    private javax.swing.JButton question_C;
    private javax.swing.JTextArea question_C_label;
    private javax.swing.JTextArea question_C_label1;
    private javax.swing.JScrollPane question_C_scroll;
    private javax.swing.JScrollPane question_C_scroll1;
    private javax.swing.JButton question_D;
    private javax.swing.JTextArea question_D_label;
    private javax.swing.JScrollPane question_D_scroll;
    private javax.swing.JLabel question_bg;
    private javax.swing.JLabel question_label;
    private javax.swing.JLabel question_qArea;
    private javax.swing.JLabel question_timer_bg;
    private javax.swing.JLabel question_timer_bg_label;
    private javax.swing.JLabel question_timer_label;
    public void writeQuestion(LinkedList<String> set) {
        System.out.println(set);
        question_A_label.setText(set.get(3));
        question_B_label.setText(set.get(4));
        question_C_label.setText(set.get(5));
        question_D_label.setText(set.get(6));;
        question_C_label1.setText(set.get(2));

       
    }
    
    
}
