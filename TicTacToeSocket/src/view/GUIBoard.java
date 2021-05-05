package view;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Board;

/**
 *
 * @author USER
 */
public class GUIBoard extends javax.swing.JFrame implements GameplayView {

    private String mulai = "X";
    private int hitungX = 0;//counter skor pemain x
    private int hitungO = 0;//counter skor pemain y
    private int counterx =0;
    private int countery = 0;

    /**
     * Creates new form TicTacToe
     */
    public GUIBoard() {
        initComponents();
    }

    private void skor() {
        playerxx.setText(String.valueOf(hitungX));
        playeryy.setText(String.valueOf(hitungO));

    }

    private void pilihPemain() {//mengubah giliran pemain, dimulai dari pemain X
        if (mulai.equalsIgnoreCase("X")) {
            mulai = "O";

        } else {
            mulai = "X";
        }
    }
    
    private void Menang(){
        String menang1 = btn1.getText();
        String menang2 = btn2.getText();
        String menang3 = btn3.getText();
        String menang4 = btn4.getText();
        String menang5 = btn5.getText();
        String menang6 = btn6.getText();
        String menang7 = btn7.getText();
        String menang8 = btn8.getText();
        String menang9 = btn9.getText();
        
        // kondisi pemain X menang
        if (menang1 == ("X") && menang2 == ("X") && menang3 == ("X")) {
            JOptionPane.showMessageDialog(this, " Player X menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungX++;
            skor();
            btn1.setBackground(Color.GREEN);
            btn2.setBackground(Color.GREEN);
            btn3.setBackground(Color.GREEN);
            
            
        }
        
        else if (menang4 == ("X") && menang5 == ("X") && menang6 == ("X")) {
            JOptionPane.showMessageDialog(this, " Player X menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungX++;
            skor();
            btn4.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);
            
        }
        
        else if (menang7 == ("X") && menang8 == ("X") && menang9 == ("X")) {
            JOptionPane.showMessageDialog(this, " Player X menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungX++;
            skor();
            btn7.setBackground(Color.GREEN);
            btn8.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
            
        }
        
        else if (menang1 == ("X") && menang4 == ("X") && menang7 == ("X")) {
            JOptionPane.showMessageDialog(this, " Player X menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungX++;
            skor();
            btn1.setBackground(Color.GREEN);
            btn4.setBackground(Color.GREEN);
            btn7.setBackground(Color.GREEN);
            
        }
        
        else if (menang2 == ("X") && menang5 == ("X") && menang8 == ("X")) {
            JOptionPane.showMessageDialog(this, " Player X menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungX++;
            skor();
            btn2.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn8.setBackground(Color.GREEN);
            
        }
        
        else if (menang3 == ("X") && menang6 == ("X") && menang9 == ("X")) {
            JOptionPane.showMessageDialog(this, " Player X menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungX++;
            skor();
            btn3.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
            
        }
        
        else if (menang1 == ("X") && menang5 == ("X") && menang9 == ("X")) {
            JOptionPane.showMessageDialog(this, " Player X menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungX++;
            skor();
            btn1.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
            
        }
        
        else if (menang3 == ("X") && menang5 == ("X") && menang7 == ("X")) {
            JOptionPane.showMessageDialog(this, " Player X menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungX++;
            skor();
            btn3.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn7.setBackground(Color.GREEN);
            
        }
        
        // DRAW
        
//        else if (menang1 != (" ")  && menang7 != (" ")){
//                 JOptionPane.showMessageDialog(this, " Permainan Seri", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//
//             }
        
//        else if (menang2 != ("X") && menang8 != ("X") && menang8 != (" ")){
//                 JOptionPane.showMessageDialog(this, " Permainan Seri", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//
//             }
//        else if (menang3 != ("X") && menang9 != ("X")){
//                 JOptionPane.showMessageDialog(this, " Permainan Seri", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//
//             }
//        else if (menang1 != ("X") && menang9 != ("X")){
//                 JOptionPane.showMessageDialog(this, " Permainan Seri", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//
//             }
//        else if (menang3 != ("X") && menang7 != ("X")){
//                 JOptionPane.showMessageDialog(this, " Permainan Seri", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//
//             }
//        else if (menang4 != ("X") && menang6 != ("X")){
//                 JOptionPane.showMessageDialog(this, " Permainan Seri", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//
//             }
        
        //kondisi pemain O menang
        
             if (menang1 == ("O") && menang2 == ("O") && menang3 == ("O")) {
            JOptionPane.showMessageDialog(this, " Player Y menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungO++;
            skor();
            btn1.setBackground(Color.GREEN);
            btn2.setBackground(Color.GREEN);
            btn3.setBackground(Color.GREEN);
            
        }
        
             else if (menang4 == ("O") && menang5 == ("O") && menang6 == ("O")) {
            JOptionPane.showMessageDialog(this, " Player Y menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungO++;
            skor();
            btn4.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);
            
        }
        
            else  if (menang7 == ("O") && menang8 == ("O") && menang9 == ("O")) {
            JOptionPane.showMessageDialog(this, " Player Y menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungO++;
            skor();
            btn7.setBackground(Color.GREEN);
            btn8.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
            
        }
        
             else if (menang1 == ("O") && menang4 == ("O") && menang7 == ("O")) {
            JOptionPane.showMessageDialog(this, " Player Y menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungO++;
            skor();
            btn1.setBackground(Color.GREEN);
            btn4.setBackground(Color.GREEN);
            btn7.setBackground(Color.GREEN);
            
        }
        
             else if (menang2 == ("O") && menang5 == ("O") && menang8 == ("O")) {
            JOptionPane.showMessageDialog(this, " Player Y menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungO++;
            skor();
            btn2.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn8.setBackground(Color.GREEN);
            
        }
        
             else if (menang3 == ("O") && menang6 == ("O") && menang9 == ("O")) {
            JOptionPane.showMessageDialog(this, " Player Y menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungO++;
            skor();
            btn3.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
            
        }
        
             else if (menang1 == ("O") && menang5 == ("O") && menang9 == ("O")) {
            JOptionPane.showMessageDialog(this, " Player Y menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungO++;
            skor();
            btn1.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
            
        }
        
             else if (menang3 == ("O") && menang5 == ("O") && menang7 == ("O")) {
            JOptionPane.showMessageDialog(this, " Player Y menang", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            hitungO++;
            skor();
            btn3.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn7.setBackground(Color.GREEN);
            
        }
             if (counterx>=5) {
            JOptionPane.showMessageDialog(this, " Permainan Seri", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
//             else{
//                 JOptionPane.showMessageDialog(this, " Permainan Seri", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
//             }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        playerY = new javax.swing.JLabel();
        playerX = new javax.swing.JLabel();
        playeryy = new javax.swing.JLabel();
        playerxx = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        t.setBackground(new java.awt.Color(153, 153, 153));
        t.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("TIC TAC TOE JARKOM");

        javax.swing.GroupLayout tLayout = new javax.swing.GroupLayout(t);
        t.setLayout(tLayout);
        tLayout.setHorizontalGroup(
            tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tLayout.setVerticalGroup(
            tLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));

        playerY.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerY.setText("Musuh");

        playerX.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerX.setText("Saya");

        playeryy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playeryy.setForeground(new java.awt.Color(0, 0, 204));
        playeryy.setText("0");

        playerxx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerxx.setForeground(new java.awt.Color(204, 0, 51));
        playerxx.setText("0");

        btnReset.setBackground(new java.awt.Color(102, 102, 255));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(204, 0, 0));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("VS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Skor :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(playerxx)
                    .addComponent(playerX))
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(playerY)
                    .addComponent(playeryy))
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerX, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerY, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerxx, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playeryy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(t, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(259, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        JFrame TicTacToe = new JFrame("Exit");

        if (JOptionPane.showConfirmDialog(TicTacToe, "Apakah anda ingin keluar?", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        
        btn1.setBackground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3.setBackground(Color.LIGHT_GRAY);
        
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.LIGHT_GRAY);
        
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setText(mulai);
                
        if (mulai.equalsIgnoreCase("X")) {
            btn2.setForeground(Color.RED);
            counterx++;
            

        } else {
            btn2.setForeground(Color.BLUE);
            countery++;
        }
        pilihPemain();
        Menang();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btn1.setText(mulai);
                
        if (mulai.equalsIgnoreCase("X")) {
            btn1.setForeground(Color.RED);
            counterx++;

        } else {
            btn1.setForeground(Color.BLUE);
            countery++;
        }
        pilihPemain();
        Menang();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setText(mulai);
                
        if (mulai.equalsIgnoreCase("X")) {
            btn3.setForeground(Color.RED);
            counterx++;

        } else {
            btn3.setForeground(Color.BLUE);
            countery++;
        }
        pilihPemain();
        Menang();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setText(mulai);
                
        if (mulai.equalsIgnoreCase("X")) {
            btn4.setForeground(Color.RED);
            counterx++;

        } else {
            btn4.setForeground(Color.BLUE);
            countery++;
        }
        pilihPemain();
        Menang();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setText(mulai);
                
        if (mulai.equalsIgnoreCase("X")) {
            btn5.setForeground(Color.RED);
            counterx++;

        } else {
            btn5.setForeground(Color.BLUE);
            countery++;
        }
        pilihPemain();
        Menang();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setText(mulai);
                
        if (mulai.equalsIgnoreCase("X")) {
            btn6.setForeground(Color.RED);
            counterx++;

        } else {
            btn6.setForeground(Color.BLUE);
            countery++;
        }
        pilihPemain();
        Menang();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setText(mulai);
                
        if (mulai.equalsIgnoreCase("X")) {
            btn7.setForeground(Color.RED);
            counterx++;

        } else {
            btn7.setForeground(Color.BLUE);
            countery++;
        }
        pilihPemain();
        Menang();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setText(mulai);
                
        if (mulai.equalsIgnoreCase("X")) {
            btn8.setForeground(Color.RED);
            counterx++;

        } else {
            btn8.setForeground(Color.BLUE);
            countery++;
        }
        pilihPemain();
        Menang();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setText(mulai);
                
        if (mulai.equalsIgnoreCase("X")) {
            btn9.setForeground(Color.RED);
            counterx++;

        } else {
            btn9.setForeground(Color.BLUE);
            countery++;
        }
        pilihPemain();
        Menang();
    }//GEN-LAST:event_btn9ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUIBoard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel playerX;
    private javax.swing.JLabel playerY;
    private javax.swing.JLabel playerxx;
    private javax.swing.JLabel playeryy;
    private javax.swing.JPanel t;
    // End of variables declaration//GEN-END:variables

    @Override
    public void drawBoard(Board board) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showResult(String result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateScore(int selfScore, int enemyScore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
