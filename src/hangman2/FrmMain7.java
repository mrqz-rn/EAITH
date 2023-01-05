package hangman2;


import static hangman2.FrmMain2.name;
import static hangman2.FrmMain3.name;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;
public class FrmMain7 extends javax.swing.JFrame {
    private int tries=5;
    public int hint;
    
    
    Random random = new Random();
    String[] wordBank = {"STRONG","UPHOLD","RICHES"};
    String decision = "N";
    String DBdir = "c:/Hangman DATABASE/";
        String DB_name = "GameDatabase.accdb";
        String DB_path = DBdir + "/" + DB_name;
    //
    private final int randomIndex = random.nextInt(wordBank.length);
    private final String guessWord = wordBank[randomIndex];
    String bookT1 = "Proverbs 18:10"; String bookT2 = "Isaiah 41:10"; String bookT3 = "Philippians 4:19";
    String verse1 = "“The name of the LORD is a _______ tower; the righteous man "
            + "\n runs into it and is safe”";
    String verse2 = "“Fear not, for I am with you; be not dismayed, for I am your "
            + "\n God; I will strengthen you, I will help you, I will _______ you "
            + "\n with my righteous right hand”";
    String verse3 = "“And my God will supply every need of yours according to his "
            + "\n _______ in glory in Christ Jesus”";
    public FrmMain7() {
        initComponents();
        
        devil1.setVisible(false);
        devil2.setVisible(false);
        devil3.setVisible(false);
        devil4.setVisible(false);
        devil5.setVisible(false);
        Next_B.setVisible(false);
        if(guessWord == "STRONG"){
            title_txt.setText(bookT1);
            jTextArea1.setText(verse1);
            
        }
        if(guessWord == "UPHOLD"){
            title_txt.setText(bookT2);
            jTextArea1.setText(verse2);
            
        }
        if(guessWord == "RICHES"){
            title_txt.setText(bookT3);
            jTextArea1.setText(verse3);
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guessTries = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        guess0 = new javax.swing.JLabel();
        guess1 = new javax.swing.JLabel();
        guess2 = new javax.swing.JLabel();
        guess3 = new javax.swing.JLabel();
        guess4 = new javax.swing.JLabel();
        guess5 = new javax.swing.JLabel();
        V = new javax.swing.JButton();
        W = new javax.swing.JButton();
        F = new javax.swing.JButton();
        E = new javax.swing.JButton();
        H = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        O = new javax.swing.JButton();
        N = new javax.swing.JButton();
        I = new javax.swing.JButton();
        P = new javax.swing.JButton();
        G = new javax.swing.JButton();
        J = new javax.swing.JButton();
        L = new javax.swing.JButton();
        K = new javax.swing.JButton();
        M = new javax.swing.JButton();
        R = new javax.swing.JButton();
        T = new javax.swing.JButton();
        S = new javax.swing.JButton();
        A = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        B = new javax.swing.JButton();
        Z = new javax.swing.JButton();
        U = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        X = new javax.swing.JButton();
        stop_B = new javax.swing.JButton();
        Next_B = new javax.swing.JButton();
        heart_1 = new javax.swing.JLabel();
        heart_2 = new javax.swing.JLabel();
        heart_3 = new javax.swing.JLabel();
        heart_4 = new javax.swing.JLabel();
        heart_5 = new javax.swing.JLabel();
        devil1 = new javax.swing.JLabel();
        devil2 = new javax.swing.JLabel();
        devil3 = new javax.swing.JLabel();
        devil4 = new javax.swing.JLabel();
        stool = new javax.swing.JLabel();
        devil5 = new javax.swing.JLabel();
        title_txt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        hint_btn = new javax.swing.JButton();
        hint_txt = new javax.swing.JLabel();
        lvl_txt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();

        guessTries.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guessTries.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guessTries.setText("5");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Tries");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EAITH");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guess0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        guess0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guess0.setText("-");
        getContentPane().add(guess0, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        guess1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        guess1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guess1.setText("-");
        getContentPane().add(guess1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        guess2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        guess2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guess2.setText("-");
        getContentPane().add(guess2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        guess3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        guess3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guess3.setText("-");
        getContentPane().add(guess3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        guess4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        guess4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guess4.setText("-");
        getContentPane().add(guess4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, -1, -1));

        guess5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        guess5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guess5.setText("-");
        getContentPane().add(guess5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, -1, -1));

        V.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        V.setText("V");
        V.setMargin(new java.awt.Insets(0, 0, 0, 0));
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });
        getContentPane().add(V, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 60, 50));

        W.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        W.setText("W");
        W.setMargin(new java.awt.Insets(0, 0, 0, 0));
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });
        getContentPane().add(W, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 60, 50));

        F.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        F.setText("F");
        F.setMargin(new java.awt.Insets(0, 0, 0, 0));
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });
        getContentPane().add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 60, 50));

        E.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        E.setText("E");
        E.setMargin(new java.awt.Insets(0, 0, 0, 0));
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });
        getContentPane().add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 60, 50));

        H.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        H.setText("H");
        H.setMargin(new java.awt.Insets(0, 0, 0, 0));
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });
        getContentPane().add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 320, 60, 50));

        C.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        C.setText("C");
        C.setMargin(new java.awt.Insets(0, 0, 0, 0));
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 60, 50));

        D.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        D.setText("D");
        D.setMargin(new java.awt.Insets(0, 0, 0, 0));
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 60, 50));

        O.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        O.setText("O");
        O.setMargin(new java.awt.Insets(0, 0, 0, 0));
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });
        getContentPane().add(O, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 60, 50));

        N.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        N.setText("N");
        N.setMargin(new java.awt.Insets(0, 0, 0, 0));
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });
        getContentPane().add(N, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 60, 50));

        I.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        I.setText("I");
        I.setMargin(new java.awt.Insets(0, 0, 0, 0));
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });
        getContentPane().add(I, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 60, 50));

        P.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        P.setText("P");
        P.setMargin(new java.awt.Insets(0, 0, 0, 0));
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });
        getContentPane().add(P, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 60, 50));

        G.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        G.setText("G");
        G.setMargin(new java.awt.Insets(0, 0, 0, 0));
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });
        getContentPane().add(G, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 60, 50));

        J.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        J.setText("J");
        J.setMargin(new java.awt.Insets(0, 0, 0, 0));
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });
        getContentPane().add(J, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 60, 50));

        L.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        L.setText("L");
        L.setMargin(new java.awt.Insets(0, 0, 0, 0));
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });
        getContentPane().add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 60, 50));

        K.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        K.setText("K");
        K.setMargin(new java.awt.Insets(0, 0, 0, 0));
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });
        getContentPane().add(K, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 60, 50));

        M.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        M.setText("M");
        M.setMargin(new java.awt.Insets(0, 0, 0, 0));
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });
        getContentPane().add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 60, 50));

        R.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        R.setText("R");
        R.setMargin(new java.awt.Insets(0, 0, 0, 0));
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });
        getContentPane().add(R, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 370, 60, 50));

        T.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        T.setText("T");
        T.setMargin(new java.awt.Insets(0, 0, 0, 0));
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });
        getContentPane().add(T, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 60, 50));

        S.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        S.setText("S");
        S.setMargin(new java.awt.Insets(0, 0, 0, 0));
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });
        getContentPane().add(S, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 60, 50));

        A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        A.setText("A");
        A.setMargin(new java.awt.Insets(0, 0, 0, 0));
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 60, 50));

        Q.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Q.setText("Q");
        Q.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });
        getContentPane().add(Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 60, 50));

        B.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        B.setText("B");
        B.setMargin(new java.awt.Insets(0, 0, 0, 0));
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 60, 50));

        Z.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Z.setText("Z");
        Z.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZActionPerformed(evt);
            }
        });
        getContentPane().add(Z, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, 60, 50));

        U.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        U.setText("U");
        U.setMargin(new java.awt.Insets(0, 0, 0, 0));
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });
        getContentPane().add(U, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 60, 50));

        Y.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Y.setText("Y");
        Y.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });
        getContentPane().add(Y, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, 60, 50));

        X.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        X.setText("X");
        X.setMargin(new java.awt.Insets(0, 0, 0, 0));
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });
        getContentPane().add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 60, 50));

        stop_B.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        stop_B.setText("Stop Game");
        stop_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop_BActionPerformed(evt);
            }
        });
        getContentPane().add(stop_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 130, 40));

        Next_B.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        Next_B.setText("Next Level");
        Next_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_BActionPerformed(evt);
            }
        });
        getContentPane().add(Next_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 170, 40));

        heart_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/heart.png"))); // NOI18N
        getContentPane().add(heart_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        heart_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/heart.png"))); // NOI18N
        getContentPane().add(heart_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        heart_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/heart.png"))); // NOI18N
        getContentPane().add(heart_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        heart_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/heart.png"))); // NOI18N
        getContentPane().add(heart_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        heart_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/heart.png"))); // NOI18N
        getContentPane().add(heart_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        devil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/devil.png"))); // NOI18N
        getContentPane().add(devil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 100, -1));

        devil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/devil.png"))); // NOI18N
        getContentPane().add(devil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 100, -1));

        devil3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/devil.png"))); // NOI18N
        getContentPane().add(devil3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 100, -1));

        devil4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/devil.png"))); // NOI18N
        getContentPane().add(devil4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 100, -1));

        stool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/kisspng-bar-stool-feces-clip-art-stool-5ac103775cf498.1681427015225987753808.png"))); // NOI18N
        getContentPane().add(stool, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        devil5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/devil_b.png"))); // NOI18N
        getContentPane().add(devil5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 170, -1));

        title_txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title_txt.setText("---------------");
        getContentPane().add(title_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 580, 130));

        hint_btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hint_btn.setText("HINT");
        hint_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hint_btnActionPerformed(evt);
            }
        });
        getContentPane().add(hint_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, -1, -1));

        hint_txt.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        hint_txt.setText("5");
        getContentPane().add(hint_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, 20, 30));

        lvl_txt.setFont(new java.awt.Font("OCR A Std", 1, 36)); // NOI18N
        lvl_txt.setText("Level 7");
        getContentPane().add(lvl_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/hangangel.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        name.setText("jLabel1");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        decision = "N";
        
        String[] gWord;
        gWord = guessWord.split("");
        
        if("A".equals(gWord[0])){
         guess0.setText("A"); 
         decision = "Y";
        }
        if("A".equals(gWord[1])){
         guess1.setText("A");
         decision = "Y";
        }
        if("A".equals(gWord[2])){
         guess2.setText("A"); 
         decision = "Y";
        }
        if("A".equals(gWord[3])){
         guess3.setText("A"); 
         decision = "Y";
        }
        if("A".equals(gWord[4])){
         guess4.setText("A"); 
         decision = "Y";
        }
        if("A".equals(gWord[5])){
         guess5.setText("A");  
         decision = "Y";
        }

        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())   ){
            Next_B.setVisible(true);
        }
                 
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("B".equals(gWord[0])){
         guess0.setText("B"); 
         decision = "Y";
        }
        if("B".equals(gWord[1])){
         guess1.setText("B");
         decision = "Y";
        }
        if("B".equals(gWord[2])){
         guess2.setText("B");
         decision = "Y";
        }
        if("B".equals(gWord[3])){
         guess3.setText("B");   
         decision = "Y";
        }
        if("B".equals(gWord[4])){
         guess4.setText("B");  
         decision = "Y";
        }
        if("B".equals(gWord[5])){
         guess5.setText("B"); 
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())  ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

    private void stop_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop_BActionPerformed
        this.setVisible(false);
        new ButtonsUI().setVisible(true);    // TODO add your handling code here:
        ButtonsUI.user_txt.setText(name.getText());
        ButtonsUI.mc.setText("ok");
    }//GEN-LAST:event_stop_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("C".equals(gWord[0])){
         guess0.setText("C");  
         decision = "Y";
        }
        if("C".equals(gWord[1])){
         guess1.setText("C");   
         decision = "Y";
        }
        if("C".equals(gWord[2])){
         guess2.setText("C");   
         decision = "Y";
        }
        if("C".equals(gWord[3])){
         guess3.setText("C");   
        decision = "Y";
        }
        if("C".equals(gWord[4])){
         guess4.setText("C");   
         decision = "Y";
        }
        if("C".equals(gWord[5])){
         guess5.setText("C");   
        decision = "Y";}
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())    ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("D".equals(gWord[0])){
         guess0.setText("D");   
         decision = "Y";
        }
        if("D".equals(gWord[1])){
         guess1.setText("D"); 
         decision = "Y";
        }
        if("D".equals(gWord[2])){
         guess2.setText("D");   
         decision = "Y";
        }
        if("D".equals(gWord[3])){
         guess3.setText("D");  
         decision = "Y";
        }
        if("D".equals(gWord[4])){
         guess4.setText("D");  
         decision = "Y";
        }
        if("D".equals(gWord[5])){
         guess5.setText("D"); 
         decision = "Y";
        }
       
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())   ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_DActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("E".equals(gWord[0])){
         guess0.setText("E"); 
         decision = "Y";
        }
        if("E".equals(gWord[1])){
         guess1.setText("E");
         decision = "Y";
        }
        if("E".equals(gWord[2])){
         guess2.setText("E");
         decision = "Y";
        }
        if("E".equals(gWord[3])){
         guess3.setText("E"); 
         decision = "Y";
        }
        if("E".equals(gWord[4])){
         guess4.setText("E");  
         decision = "Y";
        }
        if("E".equals(gWord[5])){
         guess5.setText("E");  
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())    ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_EActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("F".equals(gWord[0])){
         guess0.setText("F"); 
         decision = "Y";
        }
        if("F".equals(gWord[1])){
         guess1.setText("F"); 
         decision = "Y";
        }
        if("F".equals(gWord[2])){
         guess2.setText("F"); 
         decision = "Y";
        }
        if("F".equals(gWord[3])){
         guess3.setText("F"); 
         decision = "Y";
        }
        if("F".equals(gWord[4])){
         guess4.setText("F"); 
         decision = "Y";
        }
        if("F".equals(gWord[5])){
         guess5.setText("F"); 
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())    ){
            Next_B.setVisible(true);
        }
              // TODO add your handling code here:
    }//GEN-LAST:event_FActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("G".equals(gWord[0])){
         guess0.setText("G");   
         decision = "Y";
        }
        if("G".equals(gWord[1])){
         guess1.setText("G");   
         decision = "Y";
        }
        if("G".equals(gWord[2])){
         guess2.setText("G");   
         decision = "Y";
        }
        if("G".equals(gWord[3])){
         guess3.setText("G");   
         decision = "Y";
        }
        if("G".equals(gWord[4])){
         guess4.setText("G");   
         decision = "Y";
        }
        if("G".equals(gWord[5])){
         guess5.setText("G");   
         decision = "Y";
        }
       
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())   ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_GActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("H".equals(gWord[0])){
         guess0.setText("H"); 
         decision = "Y";
        }
        if("H".equals(gWord[1])){
         guess1.setText("H"); 
         decision = "Y";
        }
        if("H".equals(gWord[2])){
         guess2.setText("H"); 
         decision = "Y";
        }
        if("H".equals(gWord[3])){
         guess3.setText("H"); 
         decision = "Y";
        }
        if("H".equals(gWord[4])){
         guess4.setText("H"); 
         decision = "Y";
        }
        if("H".equals(gWord[5])){
         guess5.setText("H"); 
         decision = "Y";
        }
       
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())   ){
            Next_B.setVisible(true);
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_HActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("I".equals(gWord[0])){
         guess0.setText("I"); 
         decision = "Y";
        }
        if("I".equals(gWord[1])){
         guess1.setText("I");  
         decision = "Y";
        }
        if("I".equals(gWord[2])){
         guess2.setText("I");  
         decision = "Y";
        }
        if("I".equals(gWord[3])){
         guess3.setText("I");  
         decision = "Y";
        }
        if("I".equals(gWord[4])){
         guess4.setText("I");   
         decision = "Y";
        }
        if("I".equals(gWord[5])){
         guess5.setText("I");   
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())   ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_IActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("J".equals(gWord[0])){
         guess0.setText("J");   
         decision = "Y";
        }
        if("J".equals(gWord[1])){
         guess1.setText("J");  
         decision = "Y";
        }
        if("J".equals(gWord[2])){
         guess2.setText("J");   
         decision = "Y";
        }
        if("J".equals(gWord[3])){
         guess3.setText("J");   
         decision = "Y";
        }
        if("J".equals(gWord[4])){
         guess4.setText("J");  
         decision = "Y";
        }
        if("J".equals(gWord[5])){
         guess5.setText("J");   
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())    ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_JActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("K".equals(gWord[0])){
         guess0.setText("K");   
         decision = "Y";
        }
        if("K".equals(gWord[1])){
         guess1.setText("K");  
         decision = "Y";
        }
        if("K".equals(gWord[2])){
         guess2.setText("K");  
         decision = "Y";
        }
        if("K".equals(gWord[3])){
         guess3.setText("K");  
         decision = "Y";
        }
        if("K".equals(gWord[4])){
         guess4.setText("K");  
         decision = "Y";
        }
        if("K".equals(gWord[5])){
         guess5.setText("K"); 
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())   ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_KActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("N".equals(gWord[0])){
         guess0.setText("N");   
         decision = "Y";
        }
        if("N".equals(gWord[1])){
         guess1.setText("N"); 
         decision = "Y";
        }
        if("N".equals(gWord[2])){
         guess2.setText("N"); 
         decision = "Y";
        }
        if("N".equals(gWord[3])){
         guess3.setText("N");  
         decision = "Y";
        }
        if("N".equals(gWord[4])){
         guess4.setText("N"); 
         decision = "Y";
        }
        if("N".equals(gWord[5])){
         guess5.setText("N");  
         decision = "Y";
        }
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())  ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_NActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("M".equals(gWord[0])){
         guess0.setText("M");  
         decision = "Y";
        }
        if("M".equals(gWord[1])){
         guess1.setText("M"); 
         decision = "Y";
        }
        if("M".equals(gWord[2])){
         guess2.setText("M");  
         decision = "Y";
        }
        if("M".equals(gWord[3])){
         guess3.setText("M"); 
         decision = "Y";
        }
        if("M".equals(gWord[4])){
         guess4.setText("M");  
         decision = "Y";
        }
        if("M".equals(gWord[5])){
         guess5.setText("M");  
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())    ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_MActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("O".equals(gWord[0])){
         guess0.setText("O"); 
         decision = "Y";
        }
        if("O".equals(gWord[1])){
         guess1.setText("O");   
         decision = "Y";
        }
        if("O".equals(gWord[2])){
         guess2.setText("O");  
         decision = "Y";
        }
        if("O".equals(gWord[3])){
         guess3.setText("O");  
         decision = "Y";
        }
        if("O".equals(gWord[4])){
         guess4.setText("O");  
         decision = "Y";
        }
        if("O".equals(gWord[5])){
         guess5.setText("O");  
         decision = "Y";
        }
       
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())    ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_OActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("P".equals(gWord[0])){
         guess0.setText("P");   
         decision = "Y";
        }
        if("P".equals(gWord[1])){
         guess1.setText("P");  
         decision = "Y";
        }
        if("P".equals(gWord[2])){
         guess2.setText("P");  
         decision = "Y";
        }
        if("P".equals(gWord[3])){
         guess3.setText("P"); 
         decision = "Y";
        }
        if("P".equals(gWord[4])){
         guess4.setText("P"); 
         decision = "Y";
        }
        if("P".equals(gWord[5])){
         guess5.setText("P");  
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())   ){
            Next_B.setVisible(true);
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_PActionPerformed

    private void QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("Q".equals(gWord[0])){
         guess0.setText("Q"); 
         decision = "Y";
        }
        if("Q".equals(gWord[1])){
         guess1.setText("Q");  
         decision = "Y";
        }
        if("Q".equals(gWord[2])){
         guess2.setText("Q");  
         decision = "Y";
        }
        if("Q".equals(gWord[3])){
         guess3.setText("Q"); 
         decision = "Y";
        }
        if("Q".equals(gWord[4])){
         guess4.setText("Q");  
         decision = "Y";
        }
        if("Q".equals(gWord[5])){
         guess5.setText("Q");   
         decision = "Y";
        }
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())    ){
            Next_B.setVisible(true);
        }
              // TODO add your handling code here:
    }//GEN-LAST:event_QActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("R".equals(gWord[0])){
         guess0.setText("R"); 
         decision = "Y";
        }
        if("R".equals(gWord[1])){
         guess1.setText("R");  
         decision = "Y";
        }
        if("R".equals(gWord[2])){
         guess2.setText("R");  
         decision = "Y";
        }
        if("R".equals(gWord[3])){
         guess3.setText("R");
         decision = "Y";
        }
        if("R".equals(gWord[4])){
         guess4.setText("R");  
         decision = "Y";
        }
        if("R".equals(gWord[5])){
         guess5.setText("R");  
         decision = "Y";
        }
       
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())    ){
            Next_B.setVisible(true);
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_RActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("S".equals(gWord[0])){
         guess0.setText("S");   
         decision = "Y";
        }
        if("S".equals(gWord[1])){
         guess1.setText("S");   
         decision = "Y";
        }
        if("S".equals(gWord[2])){
         guess2.setText("S");  
         decision = "Y";
        }
        if("S".equals(gWord[3])){
         guess3.setText("S");   
         decision = "Y";
        }
        if("S".equals(gWord[4])){
         guess4.setText("S");  
         decision = "Y";
        }
        if("S".equals(gWord[5])){
         guess5.setText("S");  
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())  ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_SActionPerformed

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("T".equals(gWord[0])){
         guess0.setText("T");  
         decision = "Y";
        }
        if("T".equals(gWord[1])){
         guess1.setText("T");  
         decision = "Y";
        }
        if("T".equals(gWord[2])){
         guess2.setText("T");  
         decision = "Y";
        }
        if("T".equals(gWord[3])){
         guess3.setText("T");  
         decision = "Y";
        }
        if("T".equals(gWord[4])){
         guess4.setText("T"); 
         decision = "Y";
        }
        if("T".equals(gWord[5])){
         guess5.setText("T");  
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())    ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_TActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("U".equals(gWord[0])){
         guess0.setText("U");   
         decision = "Y";
        }
        if("U".equals(gWord[1])){
         guess1.setText("U");  
         decision = "Y";
        }
        if("U".equals(gWord[2])){
         guess2.setText("U"); 
         decision = "Y";
        }
        if("U".equals(gWord[3])){
         guess3.setText("U");   
         decision = "Y";
        }
        if("U".equals(gWord[4])){
         guess4.setText("U");   
         decision = "Y";
        }
        if("U".equals(gWord[5])){
         guess5.setText("U");  
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())   ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_UActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("V".equals(gWord[0])){
         guess0.setText("V");  
         decision = "Y";
        }
        if("V".equals(gWord[1])){
         guess1.setText("V"); 
         decision = "Y";
        }
        if("V".equals(gWord[2])){
         guess2.setText("V"); 
         decision = "Y";
        }
        if("V".equals(gWord[3])){
         guess3.setText("V");  
         decision = "Y";
        }
        if("V".equals(gWord[4])){
         guess4.setText("V"); 
         decision = "Y";
        }
        if("V".equals(gWord[5])){
         guess5.setText("V"); 
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())   ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_VActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("W".equals(gWord[0])){
         guess0.setText("W");  
         decision = "Y";
        }
        if("W".equals(gWord[1])){
         guess1.setText("W");  
         decision = "Y";
        }
        if("W".equals(gWord[2])){
         guess2.setText("W");  
         decision = "Y";
        }
        if("W".equals(gWord[3])){
         guess3.setText("W"); 
         decision = "Y";
        }
        if("W".equals(gWord[4])){
         guess4.setText("W");  
         decision = "Y";
        }
        if("W".equals(gWord[5])){
         guess5.setText("W");   
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())   ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_WActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("X".equals(gWord[0])){
         guess0.setText("X");   
         decision = "Y";
        }
        if("X".equals(gWord[1])){
         guess1.setText("X"); 
         decision = "Y";
        }
        if("X".equals(gWord[2])){
         guess2.setText("X"); 
         decision = "Y";
        }
        if("X".equals(gWord[3])){
         guess3.setText("X"); 
         decision = "Y";
        }
        if("X".equals(gWord[4])){
         guess4.setText("X"); 
         decision = "Y";
        }
        if("X".equals(gWord[5])){
         guess5.setText("X");  
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())   ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_XActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("Y".equals(gWord[0])){
         guess0.setText("Y");   
         decision = "Y";
        }
        if("Y".equals(gWord[1])){
         guess1.setText("Y");  
         decision = "Y";
        }
        if("Y".equals(gWord[2])){
         guess2.setText("Y");  
         decision = "Y";
        }
        if("Y".equals(gWord[3])){
         guess3.setText("Y");  
         decision = "Y";
        }
        if("Y".equals(gWord[4])){
         guess4.setText("Y");  
         decision = "Y";
        }
        if("Y".equals(gWord[5])){
         guess5.setText("Y");   
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())    ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_YActionPerformed

    private void ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("Z".equals(gWord[0])){
         guess0.setText("Z");   
         decision = "Y";
        }
        if("Z".equals(gWord[1])){
         guess1.setText("Z");
         decision = "Y";
        }
        if("Z".equals(gWord[2])){
         guess2.setText("Z");  
         decision = "Y";
        }
        if("Z".equals(gWord[3])){
         guess3.setText("Z");   
         decision = "Y";
        }
        if("Z".equals(gWord[4])){
         guess4.setText("Z");  
         decision = "Y";
        }
        if("Z".equals(gWord[5])){
         guess5.setText("Z");   
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())    ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_ZActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        tries--;
        guessTries.setText(Integer.toString(tries));
        decision = "N";
        String[] gWord;
        gWord = guessWord.split("");
        
        if("L".equals(gWord[0])){
         guess0.setText("L"); 
         decision = "Y";
        }
        if("L".equals(gWord[1])){
         guess1.setText("L"); 
         decision = "Y";
        }
        if("L".equals(gWord[2])){
         guess2.setText("L");  
         decision = "Y";
        }
        if("L".equals(gWord[3])){
         guess3.setText("L");  
         decision = "Y";
        }
        if("L".equals(gWord[4])){
         guess4.setText("L");  
         decision = "Y";
        }
        if("L".equals(gWord[5])){
         guess5.setText("L");  
         decision = "Y";
        }
        
        
        if(decision == "N"){
            if(heart_5.isVisible()){
             heart_5.setVisible(false);
             devil1.setVisible(true);
         }else if(heart_4.isVisible()){
             heart_4.setVisible(false);
             devil1.setVisible(false);
             devil2.setVisible(true);
         }else if(heart_3.isVisible()){
             heart_3.setVisible(false);
             devil2.setVisible(false);
             devil3.setVisible(true);
         }else if(heart_2.isVisible()){
             heart_2.setVisible(false);
             devil3.setVisible(false);
             devil4.setVisible(true);
         }else if(heart_1.isVisible()){
             heart_1.setVisible(false);
             devil4.setVisible(false);
             devil5.setVisible(true);
             stool.setVisible(false);
             GameOver GO = new GameOver();
             GameOver.name.setText(name.getText());
             GO.show();
             dispose();
         }
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText())
                && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())   ){
            Next_B.setVisible(true);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_LActionPerformed

    private void hint_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hint_btnActionPerformed
        // HINT BUTTON
        hint = Integer.parseInt(hint_txt.getText());
        
        
        if(hint > 0){
        String[] gWord;
        gWord = guessWord.split("");
        char letter0 = guessWord.charAt(0);
        char letter1 = guessWord.charAt(1);
        char letter2 = guessWord.charAt(2);
        char letter3 = guessWord.charAt(3);
        String lt0=String.valueOf(letter0); 
        String lt1=String.valueOf(letter1); 
        String lt2=String.valueOf(letter2); 
        String lt3=String.valueOf(letter3); 
        
        if("-".equals(guess0.getText())){
            guess0.setText(lt0);
        }else if("-".equals(guess1.getText())){
            guess1.setText(lt1);
        }else if("-".equals(guess2.getText())){
            guess2.setText(lt2);
        }else if("-".equals(guess3.getText())){
            guess3.setText(lt3);
        }
        if(!"-".equals(guess0.getText()) && !"-".equals(guess1.getText()) && !"-".equals(guess2.getText()) && !"-".equals(guess3.getText()) && !"-".equals(guess4.getText()) && !"-".equals(guess5.getText())    ){
            Next_B.setVisible(true);
        }
        }else{
            hint_txt.setText("0");
             JOptionPane.showMessageDialog(null, "You have use all of your hint!");
           
        }
        hint--;
        hint_txt.setText(Integer.toString(hint));
    }//GEN-LAST:event_hint_btnActionPerformed

    private void Next_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_BActionPerformed
        try{
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
            Statement st = conn.createStatement();
            int score = 70;
            String sname = name.getText();
            String query = "UPDATE USERS set scores ='"+score+"' WHERE username='"+sname+"'";
            st.execute(query);
            }catch(Exception e){
            System.out.println(e);
            }
        FrmMain8 main8 = new FrmMain8();
        main8.show();
        dispose();
        FrmMain8.hint_txt.setText(hint_txt.getText());
        FrmMain8.name.setText(name.getText());
        if(heart_5.isVisible() == false){
             FrmMain8.heart_5.setVisible(false);  
         }
        if(heart_4.isVisible() == false){
             FrmMain8.heart_4.setVisible(false);  
         }
        if(heart_3.isVisible() == false){
             FrmMain8.heart_3.setVisible(false);  
         }
        if(heart_2.isVisible() == false){
             FrmMain8.heart_2.setVisible(false);  
         }
        if(heart_1.isVisible() == false){
             FrmMain8.heart_1.setVisible(false);  
         }
        
        
        if(devil1.isVisible() == true){
            FrmMain8.devil1.setVisible(true);
        }
        if(devil2.isVisible() == true){
            FrmMain8.devil2.setVisible(true);
        }
        if(devil3.isVisible() == true){
            FrmMain8.devil3.setVisible(true);
        }
        if(devil4.isVisible() == true){
            FrmMain8.devil4.setVisible(true);
        }
        if(devil5.isVisible() == true){
            FrmMain8.devil5.setVisible(true);
        }
    }//GEN-LAST:event_Next_BActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMain7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JButton M;
    private javax.swing.JButton N;
    private javax.swing.JButton Next_B;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JButton Q;
    private javax.swing.JButton R;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    public static javax.swing.JLabel devil1;
    public static javax.swing.JLabel devil2;
    public static javax.swing.JLabel devil3;
    public static javax.swing.JLabel devil4;
    public static javax.swing.JLabel devil5;
    public javax.swing.JLabel guess0;
    public javax.swing.JLabel guess1;
    public javax.swing.JLabel guess2;
    public javax.swing.JLabel guess3;
    public javax.swing.JLabel guess4;
    public javax.swing.JLabel guess5;
    private javax.swing.JLabel guessTries;
    public static javax.swing.JLabel heart_1;
    public static javax.swing.JLabel heart_2;
    public static javax.swing.JLabel heart_3;
    public static javax.swing.JLabel heart_4;
    public static javax.swing.JLabel heart_5;
    private javax.swing.JButton hint_btn;
    public static javax.swing.JLabel hint_txt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lvl_txt;
    public static javax.swing.JLabel name;
    private javax.swing.JLabel stool;
    private javax.swing.JButton stop_B;
    private javax.swing.JLabel title_txt;
    // End of variables declaration//GEN-END:variables
}
