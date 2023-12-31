import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Gameplay extends javax.swing.JPanel {
    public String difficulty_level;

    public Gameplay() {
        initComponents();
    }

    JButton[] buttons;
    public String selected;
    LinkedList<Integer> stack_for_kernel;
    LinkedList<Integer> stack_for_process;
    LinkedList<Integer> stack_for_io;
    LinkedList<Integer> stack_for_file;
    LinkedList<Integer> stack_for_storage;
    LinkedList<Integer> stack_for_memory;
    LinkedList<Integer> stack_for_protection;
    LinkedList<Integer> stack_for_interpreter;

    LinkedList<Integer> kernel_items;
    LinkedList<Integer> process_items;
    LinkedList<Integer> io_items;
    LinkedList<Integer> file_items;
    LinkedList<Integer> storage_items;
    LinkedList<Integer> memory_items;
    LinkedList<Integer> protection_items;
    LinkedList<Integer> interpreter_items;

    LinkedList<Integer> currentStack;
    public int finished_question_count;
    public int max_count;
    public int component_index;
    private int disabled_components;
    QuestionDirectory question_directory = new QuestionDirectory();
    private LinkedList<String> set;
    private XSSFSheet current_dir;
    private XSSFSheet kernel;
    private XSSFSheet process_management;
    private XSSFSheet io_management;
    private XSSFSheet file_management;
    private XSSFSheet storage_management;
    private XSSFSheet interpreter;
    private XSSFSheet memory_management;
    private XSSFSheet protection;
    LinkedList<Integer> current_items;

    private void initComponents() {
        kernel = question_directory.initiateWB("Kernel");
        process_management = question_directory.initiateWB("Process_Management");
        io_management = question_directory.initiateWB("IO_management");
        file_management = question_directory.initiateWB("File_Management");
        storage_management = question_directory.initiateWB("Storage_Management");
        memory_management = question_directory.initiateWB("Memory_Management");
        protection = question_directory.initiateWB("Protection");
        interpreter = question_directory.initiateWB("Command_Interpreter");

        disabled_components = 0;
        component_index = 0;
        finished_question_count = 0;
        max_count = 0;
        stack_for_protection = new LinkedList<>();
        stack_for_interpreter = new LinkedList<>();
        stack_for_kernel = new LinkedList<>();
        stack_for_process = new LinkedList<>();
        stack_for_io = new LinkedList<>();
        stack_for_file = new LinkedList<>();
        stack_for_storage = new LinkedList<>();
        stack_for_memory = new LinkedList<>();
        currentStack = new LinkedList<>();

        protection_items = new LinkedList<>();
        interpreter_items = new LinkedList<>();
        kernel_items = new LinkedList<>();
        process_items = new LinkedList<>();
        io_items = new LinkedList<>();
        file_items = new LinkedList<>();
        storage_items = new LinkedList<>();
        memory_items = new LinkedList<>();
        current_items = new LinkedList<>();

        selected = "";
        gameplay_1 = new javax.swing.JButton();
        gameplay_2 = new javax.swing.JButton();
        gameplay_3 = new javax.swing.JButton();
        gameplay_4 = new javax.swing.JButton();
        gameplay_5 = new javax.swing.JButton();
        gameplay_6 = new javax.swing.JButton();
        gameplay_7 = new javax.swing.JButton();
        gameplay_8 = new javax.swing.JButton();
        gameplay_9 = new javax.swing.JButton();
        gameplay_kernel = new javax.swing.JButton();
        gameplay_process_mgt = new javax.swing.JButton();
        gameplay_io_mgt = new javax.swing.JButton();
        gameplay_protection = new javax.swing.JButton();
        gameplay_file = new javax.swing.JButton();
        gameplay_storage = new javax.swing.JButton();
        gameplay_memory = new javax.swing.JButton();
        gameplay_interpreter = new javax.swing.JButton();
        gameplay_category_label = new javax.swing.JLabel();
        gameplay_category_border = new javax.swing.JLabel();
        gameplay_questions_label = new javax.swing.JLabel();
        gameplay_questions_border = new javax.swing.JLabel();
        gameplay_integrity_status = new javax.swing.JLabel();
        gameplay_integrity_label = new javax.swing.JLabel();
        gameplay_points_label = new javax.swing.JLabel();
        gameplay_points_bg = new javax.swing.JLabel();

        setEnabled(false);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1210, 580));
        setLayout(null);

        gameplay_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/1.png")));
        gameplay_1.setBorder(null);
        gameplay_1.setBorderPainted(false);
        gameplay_1.setContentAreaFilled(false);
        gameplay_1.setEnabled(false);
        gameplay_1.setFocusPainted(false);
        gameplay_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_1MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_1MouseExited(evt);
            }
        });
        gameplay_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_1ActionPerformed(evt);
            }
        });
        add(gameplay_1);
        gameplay_1.setBounds(740, 280, 60, 60);

        gameplay_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/2.png")));
        gameplay_2.setBorder(null);
        gameplay_2.setBorderPainted(false);
        gameplay_2.setContentAreaFilled(false);
        gameplay_2.setEnabled(false);
        gameplay_2.setFocusPainted(false);
        gameplay_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_2MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_2MouseExited(evt);
            }
        });
        gameplay_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_2ActionPerformed(evt);
            }
        });
        add(gameplay_2);
        gameplay_2.setBounds(810, 280, 60, 60);

        gameplay_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/3.png")));
        gameplay_3.setBorder(null);
        gameplay_3.setBorderPainted(false);
        gameplay_3.setContentAreaFilled(false);
        gameplay_3.setEnabled(false);
        gameplay_3.setFocusPainted(false);
        gameplay_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_3MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_3MouseExited(evt);
            }
        });
        gameplay_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_3ActionPerformed(evt);
            }
        });
        add(gameplay_3);
        gameplay_3.setBounds(880, 280, 60, 60);

        gameplay_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/4.png")));
        gameplay_4.setBorder(null);
        gameplay_4.setBorderPainted(false);
        gameplay_4.setContentAreaFilled(false);
        gameplay_4.setEnabled(false);
        gameplay_4.setFocusPainted(false);
        gameplay_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_4MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_4MouseExited(evt);
            }
        });
        gameplay_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_4ActionPerformed(evt);
            }
        });
        add(gameplay_4);
        gameplay_4.setBounds(740, 350, 60, 60);

        gameplay_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/5.png")));
        gameplay_5.setBorder(null);
        gameplay_5.setBorderPainted(false);
        gameplay_5.setContentAreaFilled(false);
        gameplay_5.setEnabled(false);
        gameplay_5.setFocusPainted(false);
        gameplay_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_5MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_5MouseExited(evt);
            }
        });
        gameplay_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_5ActionPerformed(evt);
            }
        });
        add(gameplay_5);
        gameplay_5.setBounds(810, 350, 60, 60);

        gameplay_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/6.png")));
        gameplay_6.setBorder(null);
        gameplay_6.setBorderPainted(false);
        gameplay_6.setContentAreaFilled(false);
        gameplay_6.setEnabled(false);
        gameplay_6.setFocusPainted(false);
        gameplay_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_6MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_6MouseExited(evt);
            }
        });
        gameplay_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_6ActionPerformed(evt);
            }
        });
        add(gameplay_6);
        gameplay_6.setBounds(880, 350, 60, 60);

        gameplay_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/7.png")));
        gameplay_7.setBorder(null);
        gameplay_7.setBorderPainted(false);
        gameplay_7.setContentAreaFilled(false);
        gameplay_7.setEnabled(false);
        gameplay_7.setFocusPainted(false);
        gameplay_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_7MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_7MouseExited(evt);
            }
        });
        gameplay_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_7ActionPerformed(evt);
            }
        });
        add(gameplay_7);
        gameplay_7.setBounds(740, 420, 60, 60);

        gameplay_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/8.png")));
        gameplay_8.setBorder(null);
        gameplay_8.setBorderPainted(false);
        gameplay_8.setContentAreaFilled(false);
        gameplay_8.setEnabled(false);
        gameplay_8.setFocusPainted(false);
        gameplay_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_8MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_8MouseExited(evt);
            }
        });
        gameplay_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_8ActionPerformed(evt);
            }
        });
        add(gameplay_8);
        gameplay_8.setBounds(810, 420, 60, 60);

        gameplay_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/9.png")));
        gameplay_9.setBorder(null);
        gameplay_9.setBorderPainted(false);
        gameplay_9.setContentAreaFilled(false);
        gameplay_9.setEnabled(false);
        gameplay_9.setFocusPainted(false);
        gameplay_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_9MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_9MouseExited(evt);
            }
        });
        gameplay_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_9ActionPerformed(evt);
            }
        });
        add(gameplay_9);
        gameplay_9.setBounds(880, 420, 60, 60);

        gameplay_kernel
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_kernel.png")));
        gameplay_kernel.setBorder(null);
        gameplay_kernel.setBorderPainted(false);
        gameplay_kernel.setContentAreaFilled(false);
        gameplay_kernel.setFocusPainted(false);
        gameplay_kernel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_kernelMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_kernelMouseExited(evt);
            }
        });
        gameplay_kernel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_kernelActionPerformed(evt);
            }
        });
        add(gameplay_kernel);
        gameplay_kernel.setBounds(290, 270, 150, 70);

        gameplay_process_mgt.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_process.png")));
        gameplay_process_mgt.setBorder(null);
        gameplay_process_mgt.setBorderPainted(false);
        gameplay_process_mgt.setContentAreaFilled(false);
        gameplay_process_mgt.setFocusPainted(false);
        gameplay_process_mgt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_process_mgtMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_process_mgtMouseExited(evt);
            }
        });
        gameplay_process_mgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_process_mgtActionPerformed(evt);
            }
        });
        add(gameplay_process_mgt);
        gameplay_process_mgt.setBounds(290, 340, 150, 70);

        gameplay_io_mgt
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_io.png")));
        gameplay_io_mgt.setBorder(null);
        gameplay_io_mgt.setBorderPainted(false);
        gameplay_io_mgt.setContentAreaFilled(false);
        gameplay_io_mgt.setFocusPainted(false);
        gameplay_io_mgt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_io_mgtMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_io_mgtMouseExited(evt);
            }
        });
        gameplay_io_mgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_io_mgtActionPerformed(evt);
            }
        });
        add(gameplay_io_mgt);
        gameplay_io_mgt.setBounds(290, 410, 150, 70);

        gameplay_protection.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_protection.png")));
        gameplay_protection.setBorder(null);
        gameplay_protection.setBorderPainted(false);
        gameplay_protection.setContentAreaFilled(false);
        gameplay_protection.setFocusPainted(false);
        gameplay_protection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_protectionMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_protectionMouseExited(evt);
            }
        });
        gameplay_protection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_protectionActionPerformed(evt);
            }
        });
        add(gameplay_protection);
        gameplay_protection.setBounds(290, 480, 150, 70);

        gameplay_file
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_file.png")));
        gameplay_file.setBorder(null);
        gameplay_file.setBorderPainted(false);
        gameplay_file.setContentAreaFilled(false);
        gameplay_file.setFocusPainted(false);
        gameplay_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_fileMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_fileMouseExited(evt);
            }
        });
        gameplay_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_fileActionPerformed(evt);
            }
        });
        add(gameplay_file);
        gameplay_file.setBounds(450, 270, 180, 70);

        gameplay_storage.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_storage.png")));
        gameplay_storage.setBorder(null);
        gameplay_storage.setBorderPainted(false);
        gameplay_storage.setContentAreaFilled(false);
        gameplay_storage.setFocusPainted(false);
        gameplay_storage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_storageMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_storageMouseExited(evt);
            }
        });
        gameplay_storage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_storageActionPerformed(evt);
            }
        });
        add(gameplay_storage);
        gameplay_storage.setBounds(450, 340, 180, 70);

        gameplay_memory
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_memory.png")));
        gameplay_memory.setBorder(null);
        gameplay_memory.setBorderPainted(false);
        gameplay_memory.setContentAreaFilled(false);
        gameplay_memory.setFocusPainted(false);
        gameplay_memory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_memoryMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_memoryMouseExited(evt);
            }
        });
        gameplay_memory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_memoryActionPerformed(evt);
            }
        });
        add(gameplay_memory);
        gameplay_memory.setBounds(450, 410, 180, 70);

        gameplay_interpreter.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_interpreter.png")));
        gameplay_interpreter.setBorder(null);
        gameplay_interpreter.setBorderPainted(false);
        gameplay_interpreter.setContentAreaFilled(false);
        gameplay_interpreter.setFocusPainted(false);
        gameplay_interpreter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gameplay_interpreterMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gameplay_interpreterMouseExited(evt);
            }
        });
        gameplay_interpreter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameplay_interpreterActionPerformed(evt);
            }
        });
        add(gameplay_interpreter);
        gameplay_interpreter.setBounds(450, 480, 180, 70);

        gameplay_category_label.setFont(new java.awt.Font("Segoe UI", 1, 80));
        gameplay_category_label.setForeground(new java.awt.Color(255, 255, 255));
        gameplay_category_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameplay_category_label
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/components_label.png")));
        gameplay_category_label.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(gameplay_category_label);
        gameplay_category_label.setBounds(290, 230, 190, 40);

        gameplay_category_border.setFont(new java.awt.Font("Segoe UI", 1, 80));
        gameplay_category_border.setForeground(new java.awt.Color(255, 255, 255));
        gameplay_category_border.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameplay_category_border.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/components_border.png")));
        gameplay_category_border.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(gameplay_category_border);
        gameplay_category_border.setBounds(240, 240, 440, 330);

        gameplay_questions_label.setFont(new java.awt.Font("Segoe UI", 1, 80));
        gameplay_questions_label.setForeground(new java.awt.Color(255, 255, 255));
        gameplay_questions_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameplay_questions_label
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/questions_label.png")));
        gameplay_questions_label.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(gameplay_questions_label);
        gameplay_questions_label.setBounds(700, 230, 250, 40);

        gameplay_questions_border.setFont(new java.awt.Font("Segoe UI", 1, 80));
        gameplay_questions_border.setForeground(new java.awt.Color(255, 255, 255));
        gameplay_questions_border.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameplay_questions_border.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/questions_hard_border.png")));
        gameplay_questions_border.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(gameplay_questions_border);
        gameplay_questions_border.setBounds(700, 240, 280, 290);

        gameplay_integrity_status.setFont(new java.awt.Font("Segoe UI", 1, 80));
        gameplay_integrity_status.setForeground(new java.awt.Color(255, 255, 255));
        gameplay_integrity_status.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gameplay_integrity_status
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/results/status_00.png")));
        add(gameplay_integrity_status);
        gameplay_integrity_status.setBounds(340, 50, 400, 170);

        gameplay_integrity_label.setFont(new java.awt.Font("Segoe UI", 1, 36));
        gameplay_integrity_label.setForeground(new java.awt.Color(255, 255, 255));
        gameplay_integrity_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameplay_integrity_label.setText("OS Integrity Status");
        gameplay_integrity_label.setToolTipText("");
        add(gameplay_integrity_label);
        gameplay_integrity_label.setBounds(340, 0, 400, 60);

        gameplay_points_label.setFont(new java.awt.Font("Segoe UI", 1, 48));
        gameplay_points_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameplay_points_label.setText("0");
        gameplay_points_label.setToolTipText("");
        add(gameplay_points_label);
        gameplay_points_label.setBounds(770, 100, 130, 80);

        gameplay_points_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameplay_points_bg
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/points_bg.png")));
        gameplay_points_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(gameplay_points_bg);
        gameplay_points_bg.setBounds(760, 70, 150, 130);

        buttons = new JButton[] { gameplay_1, gameplay_2, gameplay_3, gameplay_4, gameplay_5, gameplay_6, gameplay_7,
                gameplay_8, gameplay_9 };
    }

    private void gameplay_1MouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/1_hover.png")));
    }

    private void gameplay_1MouseExited(java.awt.event.MouseEvent evt) {
        gameplay_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/1.png")));
    }

    private void gameplay_1ActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        timer();
        stack_adder(1);
        return_enabler();
    }

    private int randomizer() {
        Random rand = new Random();
        return rand.nextInt((15 - 2) + 2);
    }

    private void return_enabler() {
        int num = randomizer();

        while (true) {

            if ((current_items.isEmpty() || !current_items.contains(num)) && num > 2) {
                current_items.add(num);
                break;
            } else {
                num = randomizer();
            }
        }
        ;

        OSCreate.mainMenu.menu_return.setEnabled(true);
        OSCreate.mainMenu.menu_return.setVisible(true);

        set = question_directory.test(num, current_dir);
        MainMenu.question.writeQuestion(set);
        MainMenu.card.show(OSCreate.mainMenu.main_cardPanel, "question");
    }

    private void gameplay_2MouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/2_hover.png")));

    }

    private void gameplay_2MouseExited(java.awt.event.MouseEvent evt) {
        gameplay_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/2.png")));
    }

    private void gameplay_2ActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        timer();
        stack_adder(2);
        return_enabler();
    }

    private void gameplay_3MouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/3_hover.png")));
    }

    private void gameplay_3MouseExited(java.awt.event.MouseEvent evt) {
        gameplay_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/3.png")));
    }

    private void gameplay_3ActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        timer();
        stack_adder(3);
        return_enabler();
    }

    private void gameplay_4MouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/4_hover.png")));
    }

    private void gameplay_4MouseExited(java.awt.event.MouseEvent evt) {
        gameplay_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/4.png")));
    }

    private void gameplay_4ActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        timer();
        stack_adder(4);
        return_enabler();
    }

    private void gameplay_5MouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/5_hover.png")));
    }

    private void gameplay_5MouseExited(java.awt.event.MouseEvent evt) {
        gameplay_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/5.png")));
    }

    private void gameplay_5ActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        timer();
        stack_adder(5);
        return_enabler();
    }

    private void gameplay_6MouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/6_hover.png")));
    }

    private void gameplay_6MouseExited(java.awt.event.MouseEvent evt) {
        gameplay_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/6.png")));
    }

    private void gameplay_6ActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        timer();
        stack_adder(6);
        return_enabler();
    }

    private void gameplay_7MouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/7_hover.png")));
    }

    private void gameplay_7MouseExited(java.awt.event.MouseEvent evt) {
        gameplay_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/7.png")));
    }

    private void gameplay_7ActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        timer();
        stack_adder(7);
        return_enabler();
    }

    private void gameplay_8MouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/8_hover.png")));
    }

    private void gameplay_8MouseExited(java.awt.event.MouseEvent evt) {
        gameplay_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/8.png")));
    }

    private void gameplay_8ActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        timer();
        stack_adder(8);
        return_enabler();
    }

    private void gameplay_9MouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/9_hover.png")));
    }

    private void gameplay_9MouseExited(java.awt.event.MouseEvent evt) {
        gameplay_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/9.png")));
    }

    private void gameplay_9ActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        timer();
        stack_adder(9);
        return_enabler();
    }

    private void gameplay_kernelMouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_kernel.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_kernel_hover.png")));
    }

    private void gameplay_kernelMouseExited(java.awt.event.MouseEvent evt) {
        if(selected != "kernel")
            gameplay_kernel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_kernel.png")));
    }

    private void gameplay_kernelActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        if (selected.equals("")) {
            enable_all_buttons(buttons);
        }
        isSelected("kernel");

        gameplay_kernel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_kernel_hover.png")));
        gameplay_process_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_process.png")));
        gameplay_io_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_io.png")));
        gameplay_protection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_protection.png")));
        gameplay_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_file.png")));
        gameplay_storage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_storage.png")));
        gameplay_memory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_memory.png")));
        gameplay_interpreter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_interpreter.png")));
    }

    private void enable_all_buttons(JButton[] buttons) {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(true);
        }
    }

    private void isSelected(String selected) {

        this.selected = selected;
        System.out.println(this.selected);

        if (selected.equals("kernel")) {
            component_index = 0;
            currentStack = stack_for_kernel;
            current_dir = kernel;
            current_items = kernel_items;
        } else if (selected.equals("process_management")) {
            component_index = 1;
            currentStack = stack_for_process;
            current_dir = process_management;
            current_items = process_items;
        } else if (selected.equals("io_management")) {
            component_index = 2;
            currentStack = stack_for_io;
            current_dir = io_management;
            current_items = io_items;
        } else if (selected.equals("file_management")) {
            component_index = 3;
            currentStack = stack_for_file;
            current_dir = file_management;
            current_items = file_items;
        } else if (selected.equals("storage_management")) {
            component_index = 4;
            currentStack = stack_for_storage;
            current_dir = storage_management;
            current_items = storage_items;
        } else if (selected.equals("memory_management")) {
            component_index = 5;
            currentStack = stack_for_memory;
            current_dir = memory_management;
            current_items = memory_items;
        } else if (selected.equals("protection")) {
            component_index = 6;
            currentStack = stack_for_protection;
            current_dir = protection;
            current_items = protection_items;
        } else if (selected.equals("interpreter")) {
            component_index = 7;
            currentStack = stack_for_interpreter;
            current_dir = interpreter;
            current_items = interpreter_items;
        }

        disabler(currentStack);

    }

    private void disabler(LinkedList<Integer> selected_stack) {

        if (currentStack.size() == max_count / 8) {
            switch (component_index) {

                case 0: // kernel
                    gameplay_kernel.setEnabled(false);
                    // disabled_components++;
                    break;

                case 1: // process management
                    gameplay_process_mgt.setEnabled(false);
                    // disabled_components++;
                    break;

                case 2: // io
                    gameplay_io_mgt.setEnabled(false);
                    // disabled_components++;
                    break;

                case 3: // file
                    gameplay_file.setEnabled(false);
                    // disabled_components++;
                    break;

                case 4: // storage
                    gameplay_storage.setEnabled(false);
                    // disabled_components++;
                    break;

                case 5: // memory
                    gameplay_memory.setEnabled(false);
                    // disabled_components++;
                    break;

                case 6: // protecc
                    gameplay_protection.setEnabled(false);
                    // disabled_components++;
                    break;

                case 7: // interpreter
                    gameplay_interpreter.setEnabled(false);
                    // disabled_components++;
                    break;
            }
            disabled_components++;
            change_integrity(disabled_components);

        }
        System.out.println("The current stack in disabler is" + selected_stack + " " + selected);
        for (int i = 1; i <= 9; i++) {
            if (selected_stack.contains(i)) {
                buttons[i - 1].setEnabled(false);
            } else {
                buttons[i - 1].setEnabled(true);
            }
        }

    }

    private void change_integrity(int disabled_components) {
        for (int i = 1; i < disabled_components + 1; i++) {
            gameplay_integrity_status.setIcon(
                    new javax.swing.ImageIcon(getClass().getResource("/resources/results/status_0" + i + ".png")));
        }
    }

    private void stack_adder(int num) {
        finished_question_count++;
        System.out.println("Finished Questions: " + finished_question_count);
        currentStack.add(num);
        System.out.println(currentStack);
        disabler(currentStack);
    }

    private void gameplay_process_mgtMouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_process_mgt.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_process_hover.png")));
    }

    private void gameplay_process_mgtMouseExited(java.awt.event.MouseEvent evt) {
        if(selected != "process_management")
            gameplay_process_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_process.png")));
    }

    private void gameplay_process_mgtActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        if (selected.equals("")) {
            enable_all_buttons(buttons);
        }
        isSelected("process_management");

        gameplay_kernel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_kernel.png")));
        gameplay_process_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_process_hover.png")));
        gameplay_io_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_io.png")));
        gameplay_protection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_protection.png")));
        gameplay_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_file.png")));
        gameplay_storage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_storage.png")));
        gameplay_memory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_memory.png")));
        gameplay_interpreter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_interpreter.png")));
    }

    private void gameplay_io_mgtMouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_io_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_io_hover.png")));
    }

    private void gameplay_io_mgtMouseExited(java.awt.event.MouseEvent evt) {
        if(selected != "io_management")
            gameplay_io_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_io.png")));
    }

    private void gameplay_io_mgtActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        if (selected.equals("")) {
            enable_all_buttons(buttons);
        }
        isSelected("io_management");

        gameplay_kernel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_kernel.png")));
        gameplay_process_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_process.png")));
        gameplay_io_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_io_hover.png")));
        gameplay_protection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_protection.png")));
        gameplay_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_file.png")));
        gameplay_storage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_storage.png")));
        gameplay_memory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_memory.png")));
        gameplay_interpreter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_interpreter.png")));
    }

    private void gameplay_protectionMouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_protection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_protection_hover.png")));
    }

    private void gameplay_protectionMouseExited(java.awt.event.MouseEvent evt) {
        if(selected != "protection")
            gameplay_protection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_protection.png")));
    }

    private void gameplay_protectionActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        if (selected.equals("")) {
            enable_all_buttons(buttons);
        }
        isSelected("protection");

        gameplay_kernel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_kernel.png")));
        gameplay_process_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_process.png")));
        gameplay_io_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_io.png")));
        gameplay_protection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_protection_hover.png")));
        gameplay_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_file.png")));
        gameplay_storage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_storage.png")));
        gameplay_memory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_memory.png")));
        gameplay_interpreter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_interpreter.png")));
    }

    private void gameplay_fileMouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_file_hover.png")));
    }

    private void gameplay_fileMouseExited(java.awt.event.MouseEvent evt) {
        if(selected != "file_management")
            gameplay_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_file.png")));
    }

    private void gameplay_fileActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        if (selected.equals("")) {
            enable_all_buttons(buttons);
        }
        isSelected("file_management");

        gameplay_kernel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_kernel.png")));
        gameplay_process_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_process.png")));
        gameplay_io_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_io.png")));
        gameplay_protection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_protection.png")));
        gameplay_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_file_hover.png")));
        gameplay_storage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_storage.png")));
        gameplay_memory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_memory.png")));
        gameplay_interpreter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_interpreter.png")));
    }

    private void gameplay_storageMouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_storage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_storage_hover.png")));
    }

    private void gameplay_storageMouseExited(java.awt.event.MouseEvent evt) {
        if(selected != "storage_management")
            gameplay_storage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_storage.png")));
    }

    private void gameplay_storageActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        if (selected.equals("")) {
            enable_all_buttons(buttons);
        }
        isSelected("storage_management");

        gameplay_kernel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_kernel.png")));
        gameplay_process_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_process.png")));
        gameplay_io_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_io.png")));
        gameplay_protection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_protection.png")));
        gameplay_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_file.png")));
        gameplay_storage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_storage_hover.png")));
        gameplay_memory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_memory.png")));
        gameplay_interpreter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_interpreter.png")));
    }

    private void gameplay_memoryMouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_memory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_memory_hover.png")));
    }

    private void gameplay_memoryMouseExited(java.awt.event.MouseEvent evt) {
        if(selected != "memory_management")
            gameplay_memory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_memory.png")));
    }

    private void gameplay_memoryActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        if (selected.equals("")) {
            enable_all_buttons(buttons);
        }
        isSelected("memory_management");
        
        gameplay_kernel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_kernel.png")));
        gameplay_process_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_process.png")));
        gameplay_io_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_io.png")));
        gameplay_protection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_protection.png")));
        gameplay_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_file.png")));
        gameplay_storage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_storage.png")));
        gameplay_memory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_memory_hover.png")));
        gameplay_interpreter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_interpreter.png")));
    }

    private void gameplay_interpreterMouseEntered(java.awt.event.MouseEvent evt) {
        gameplay_interpreter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_interpreter_hover.png")));
    }

    private void gameplay_interpreterMouseExited(java.awt.event.MouseEvent evt) {
        if(selected != "interpreter")
            gameplay_interpreter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_interpreter.png")));
    }

    private void gameplay_interpreterActionPerformed(java.awt.event.ActionEvent evt) {
        Music.sfx();
        if (selected.equals("")) {
            enable_all_buttons(buttons);
        }
        isSelected("interpreter");

        gameplay_kernel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_kernel.png")));
        gameplay_process_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_process.png")));
        gameplay_io_mgt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_io.png")));
        gameplay_protection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_protection.png")));
        gameplay_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_file.png")));
        gameplay_storage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_storage.png")));
        gameplay_memory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_memory.png")));
        gameplay_interpreter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gameplay/component_interpreter_hover.png")));
    }

    public void timer() {
        final AtomicInteger loopCount;
        int maxTime;
        if(MainMenu.difficulty.diff_level == 1) {
            loopCount = new AtomicInteger(29);
            maxTime = 30;
        } else if(MainMenu.difficulty.diff_level == 2) {
            loopCount = new AtomicInteger(19);
            maxTime = 20;
        } else {
            loopCount = new AtomicInteger(9);
            maxTime = 10;
        }

        int delayMs = 1000; // 1 second

        timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                int iteration = loopCount.getAndDecrement();

                MainMenu.question.question_timer_label.setText(iteration + "s");

                if (iteration < 0) {
                    timer.cancel();
                    OSCreate.mainMenu.menu_return.setEnabled(false);
                    OSCreate.mainMenu.menu_return.setVisible(false);
                    MainMenu.question.whereTO();
                    System.out.println(loopCount.getAndDecrement());
                    MainMenu.question.question_timer_label.setText(maxTime + "s");
                }
            }
        };

        timer.schedule(task, delayMs, delayMs);
        // MainMenu.question.question_timer_label.setText(i + "s");
    }
    
    public javax.swing.JButton gameplay_1;
    public javax.swing.JButton gameplay_2;
    public javax.swing.JButton gameplay_3;
    public javax.swing.JButton gameplay_4;
    public javax.swing.JButton gameplay_5;
    public javax.swing.JButton gameplay_6;
    public javax.swing.JButton gameplay_7;
    public javax.swing.JButton gameplay_8;
    public javax.swing.JButton gameplay_9;
    private javax.swing.JLabel gameplay_category_border;
    private javax.swing.JLabel gameplay_category_label;
    private javax.swing.JButton gameplay_file;
    private javax.swing.JLabel gameplay_integrity_label;
    private javax.swing.JLabel gameplay_integrity_status;
    private javax.swing.JButton gameplay_interpreter;
    private javax.swing.JButton gameplay_io_mgt;
    private javax.swing.JButton gameplay_kernel;
    private javax.swing.JButton gameplay_memory;
    private javax.swing.JLabel gameplay_points_bg;
    public javax.swing.JLabel gameplay_points_label;
    private javax.swing.JButton gameplay_process_mgt;
    private javax.swing.JButton gameplay_protection;
    public javax.swing.JLabel gameplay_questions_border;
    private javax.swing.JLabel gameplay_questions_label;
    private javax.swing.JButton gameplay_storage;
    public Timer timer;

    public void reset() {
        removeAll();
        initComponents();
    }
}
