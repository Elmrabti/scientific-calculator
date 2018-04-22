/** Author: Khalid EL MRABTI
 * IT BUILD with java and NetBeans IDE
 */
package scientific_calculator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();
    }
    
    // Variables Declarations
    double num1;
    double num2;
    int n1; // this variable for get first number when we will calculate the numbers power 
    double result;
    char oper;
    int c;
    //for the add button
    double array[] = new double [50];
    ArrayList<Double> list = new ArrayList<>();
    
    // Set Number Method
    public void setNum(String s){
    String num =jTextDisplay.getText() + s;
    jTextDisplay.setText(num);
    }
    
    // Method for sub&add&div&mul Actions
    public void op(char operation){
        num1 =Double.parseDouble(jTextDisplay.getText());
        jTextDisplay.setText("");
        oper = operation;
    }
    
    // Factorial Method with "recursion"
    int factorial(int num){    
       if (num == 0)    
           return 1;    
         else    
            return(num * factorial(num-1));    
        }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_sub = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_mul = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        jTextDisplay = new javax.swing.JTextField();
        btn_7 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        minsAdd = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        SquareRoot = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        module = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        log = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_eql = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        bks = new javax.swing.JButton();
        dote = new javax.swing.JButton();
        pow = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(591, 440));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.setPreferredSize(new java.awt.Dimension(591, 480));

        btn_add.setBackground(new java.awt.Color(102, 153, 255));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("+");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_sub.setBackground(new java.awt.Color(102, 153, 255));
        btn_sub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_sub.setForeground(new java.awt.Color(255, 255, 255));
        btn_sub.setText("-");
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
            }
        });

        tan.setBackground(new java.awt.Color(255, 255, 255));
        tan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tan.setText("Tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        btn_4.setBackground(new java.awt.Color(255, 255, 255));
        btn_4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_mul.setBackground(new java.awt.Color(102, 153, 255));
        btn_mul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_mul.setForeground(new java.awt.Color(255, 255, 255));
        btn_mul.setText("x");
        btn_mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mulActionPerformed(evt);
            }
        });

        btn_2.setBackground(new java.awt.Color(255, 255, 255));
        btn_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        jTextDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDisplayActionPerformed(evt);
            }
        });

        btn_7.setBackground(new java.awt.Color(255, 255, 255));
        btn_7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_6.setBackground(new java.awt.Color(255, 255, 255));
        btn_6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        minsAdd.setBackground(new java.awt.Color(102, 102, 255));
        minsAdd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        minsAdd.setForeground(new java.awt.Color(255, 255, 255));
        minsAdd.setText("±");
        minsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minsAddActionPerformed(evt);
            }
        });

        btn_0.setBackground(new java.awt.Color(255, 255, 255));
        btn_0.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        SquareRoot.setBackground(new java.awt.Color(102, 102, 255));
        SquareRoot.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SquareRoot.setForeground(new java.awt.Color(255, 255, 255));
        SquareRoot.setText("√");
        SquareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquareRootActionPerformed(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(255, 255, 255));
        btn_3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        sin.setBackground(new java.awt.Color(255, 255, 255));
        sin.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        sin.setText("SIN");
        sin.setToolTipText("");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        factorial.setBackground(new java.awt.Color(255, 255, 255));
        factorial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        factorial.setText("!n");
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialActionPerformed(evt);
            }
        });

        module.setBackground(new java.awt.Color(255, 255, 255));
        module.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        module.setText("Mod");
        module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduleActionPerformed(evt);
            }
        });

        btn_5.setBackground(new java.awt.Color(255, 255, 255));
        btn_5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_9.setBackground(new java.awt.Color(255, 255, 255));
        btn_9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        log.setBackground(new java.awt.Color(255, 255, 255));
        log.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        log.setText("LOG");
        log.setActionCommand("");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        pi.setBackground(new java.awt.Color(255, 255, 255));
        pi.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        pi.setText("π  ");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(0, 204, 0));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Clear.setText("c");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        btn_div.setBackground(new java.awt.Color(102, 153, 255));
        btn_div.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_div.setForeground(new java.awt.Color(255, 255, 255));
        btn_div.setText("÷");
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });

        btn_1.setBackground(new java.awt.Color(255, 255, 255));
        btn_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_eql.setBackground(new java.awt.Color(102, 153, 255));
        btn_eql.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_eql.setForeground(new java.awt.Color(255, 255, 255));
        btn_eql.setText("=");
        btn_eql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eqlActionPerformed(evt);
            }
        });

        btn_8.setBackground(new java.awt.Color(255, 255, 255));
        btn_8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        cos.setBackground(new java.awt.Color(255, 255, 255));
        cos.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cos.setText("Cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        bks.setBackground(new java.awt.Color(102, 102, 255));
        bks.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        bks.setForeground(new java.awt.Color(255, 255, 255));
        bks.setText("→");
        bks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bksActionPerformed(evt);
            }
        });

        dote.setBackground(new java.awt.Color(102, 102, 255));
        dote.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dote.setForeground(new java.awt.Color(255, 255, 255));
        dote.setText(".");
        dote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doteActionPerformed(evt);
            }
        });

        pow.setBackground(new java.awt.Color(255, 255, 255));
        pow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pow.setText("X^Y");
        pow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextDisplay)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bks, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_mul, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eql, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_div, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(log, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(pi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(factorial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(module, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bks, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_mul, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eql, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dote, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(module, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pow, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jMenu1.setText("Option");
        jMenu1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu1ItemStateChanged(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Standart");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu1ItemStateChanged
        
    }//GEN-LAST:event_jMenu1ItemStateChanged

    private void jTextDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDisplayActionPerformed
       
    }//GEN-LAST:event_jTextDisplayActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         // Standard Size
         this.setResizable(true);
         this.setSize(305, 480);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // called When Program strat
        this.setResizable(true);
        this.setSize(305, 480);
        
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Scientific size
        jTextDisplay.setSize(500,54);
        this.setResizable(true);
        this.setSize(580,480);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed
 
 
       
    
    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
  
      setNum("1");
      
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
       setNum("2");

    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
       setNum("3");

    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
      setNum("4");

    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
      setNum("5");

    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
      setNum("6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
      setNum("7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
      setNum("8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
      setNum("9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
      setNum("0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        jTextDisplay.setText("");
        result=0;
        c=0;
        
        
    }//GEN-LAST:event_ClearActionPerformed

    private void doteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doteActionPerformed
        if(! jTextDisplay.getText().contains(".")){
           jTextDisplay.setText(jTextDisplay.getText()+".");
        }
        
    }//GEN-LAST:event_doteActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
   
        if(jTextDisplay.getText().length()==0||jTextDisplay.getText()=="-"){
          // No Action
           jTextDisplay.getText(); 
        }
        else op('/');
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mulActionPerformed
       
        if(jTextDisplay.getText().length()==0||jTextDisplay.getText()=="-"){
            // No Action
           jTextDisplay.getText();
          }else op('*');
    }//GEN-LAST:event_btn_mulActionPerformed

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed
        
        if(jTextDisplay.getText().length()==0){
           jTextDisplay.setText(jTextDisplay.getText()+"-");
           
        }
         else op('-');
        
    }//GEN-LAST:event_btn_subActionPerformed
   
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
         
        if(jTextDisplay.getText().length()==0||jTextDisplay.getText()=="-"){
           // No Action
           jTextDisplay.getText();
           }else op('+');
       
         
    }//GEN-LAST:event_btn_addActionPerformed

    private void minsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minsAddActionPerformed
        double num =Double.parseDouble(jTextDisplay.getText());
        num= num * -1;
        if ((num == Math.floor(num)) && !Double.isInfinite(num)) {
                 jTextDisplay.setText((int)(num)+"");
            } else jTextDisplay.setText(num +"");
    }//GEN-LAST:event_minsAddActionPerformed

  
    
    private void btn_eqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eqlActionPerformed
      
        if(jTextDisplay.getText().length()==0||jTextDisplay.getText()=="-"){
           // No Action
           jTextDisplay.getText();
           }else{
            
              // switch case
        int c2; // icrementation de la puissance
        num2=Double.parseDouble(jTextDisplay.getText());
        int i = Integer.parseInt(jTextDisplay.getText()); // for catch length, when we need to calculate the power number
       
        switch(oper){
            case '+':    
            jTextDisplay.setText("");
            result=num1+num2;
            break;
            case '-':
            jTextDisplay.setText("");    
            result=num1-num2;
            break;
            case '/':
            jTextDisplay.setText("");    
            result=num1/num2;
            break;
            case '*':
            jTextDisplay.setText("");
            result=num1*num2;
            break;
            case '%':
            jTextDisplay.setText("");    
            result=num1%num2;
            break;
            case 'p':
            jTextDisplay.setText("");    
            result=n1;
            for(c2=1;c2<i;c2++){
            result=result*n1;  
            } 
        } 
        
        if ((result == Math.floor(result )) && !Double.isInfinite(result )) {
                 jTextDisplay.setText((int)(result)+"");
                } else jTextDisplay.setText(result +"");
         }
    }//GEN-LAST:event_btn_eqlActionPerformed

    private void bksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bksActionPerformed
        String bsp=null;
        if( jTextDisplay.getText().length()>0){
        StringBuilder sbd = new  StringBuilder(jTextDisplay.getText());
        sbd.deleteCharAt(jTextDisplay.getText().length()-1);
        bsp = sbd.toString();
         jTextDisplay.setText(bsp);
        }
       
    }//GEN-LAST:event_bksActionPerformed

    private void SquareRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareRootActionPerformed
        double num =Double.parseDouble(jTextDisplay.getText());
        num= Math.sqrt(num);
        jTextDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_SquareRootActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
         double num =Double.parseDouble(jTextDisplay.getText());
         num= Math.log(num);
         jTextDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_logActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        double num =Double.parseDouble(jTextDisplay.getText());
        num= Math.sin(num);
        jTextDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_sinActionPerformed

    private void moduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduleActionPerformed
       if(jTextDisplay.getText().length()!=0&&jTextDisplay.getText()=="-"){
           // No Action
           jTextDisplay.getText();
        }else op('%');
    }//GEN-LAST:event_moduleActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
       double num =Double.parseDouble(jTextDisplay.getText());
        num= Math.cos(num);
        jTextDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_cosActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        double pi =3.14159265358979323846264338327950288419;
        jTextDisplay.setText(String.valueOf(pi));
    }//GEN-LAST:event_piActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        double num =Double.parseDouble(jTextDisplay.getText());
        num= Math.tan(num);
        jTextDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_tanActionPerformed

    private void factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialActionPerformed
         int f = Integer.parseInt(jTextDisplay.getText());
         int resFactorial =factorial(f);
         jTextDisplay.setText(String.valueOf(resFactorial)+"\n"+"Fct"+'('+f+')');
    }//GEN-LAST:event_factorialActionPerformed
    
    private void powActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powActionPerformed

       n1 = Integer.parseInt(jTextDisplay.getText());
       op('p');    
    }//GEN-LAST:event_powActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton SquareRoot;
    private javax.swing.JButton bks;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_eql;
    private javax.swing.JButton btn_mul;
    private javax.swing.JButton btn_sub;
    private javax.swing.JButton cos;
    private javax.swing.JButton dote;
    private javax.swing.JButton factorial;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextDisplay;
    private javax.swing.JButton log;
    private javax.swing.JButton minsAdd;
    private javax.swing.JButton module;
    private javax.swing.JButton pi;
    private javax.swing.JButton pow;
    private javax.swing.JButton sin;
    private javax.swing.JButton tan;
    // End of variables declaration//GEN-END:variables
}
