package scicalci;

/**
 *
 * @author Yashashvini
 */
public class Calci extends javax.swing.JFrame {
    double a,b,c,val;
    boolean plusclick ,minusclick,multipleclick,divideclick,powerclick,percentclick;
    boolean Dot = true;         //ki hn decimal laga hai 
    boolean displayclick =true; // hn display pr kuch ni hai 
    
    public Calci() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        seven = new javax.swing.JButton();
        four = new javax.swing.JButton();
        six = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        one = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        plusminus = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        five = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        multiple = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        e = new javax.swing.JButton();
        pie = new javax.swing.JButton();
        power = new javax.swing.JButton();
        percentage = new javax.swing.JButton();
        log = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        radian = new javax.swing.JButton();
        degree = new javax.swing.JButton();
        square = new javax.swing.JButton();
        squareroot = new javax.swing.JButton();
        cube = new javax.swing.JButton();
        squareroot3 = new javax.swing.JButton();

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        display.setBackground(new java.awt.Color(255, 255, 204));
        display.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        display.setToolTipText("Calci screen");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(0, 153, 153));
        seven.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        seven.setForeground(new java.awt.Color(0, 102, 102));
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(0, 153, 153));
        four.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        four.setForeground(new java.awt.Color(0, 102, 102));
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(0, 153, 153));
        six.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        six.setForeground(new java.awt.Color(0, 102, 102));
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        minus.setBackground(new java.awt.Color(0, 153, 153));
        minus.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        minus.setForeground(new java.awt.Color(0, 102, 102));
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(0, 153, 153));
        one.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        one.setForeground(new java.awt.Color(0, 102, 102));
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(0, 153, 153));
        clear.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 102, 102));
        clear.setText("c");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        plusminus.setBackground(new java.awt.Color(0, 153, 153));
        plusminus.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        plusminus.setForeground(new java.awt.Color(0, 102, 102));
        plusminus.setText("+/-");
        plusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusminusActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(0, 153, 153));
        two.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        two.setForeground(new java.awt.Color(0, 102, 102));
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(0, 153, 153));
        three.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        three.setForeground(new java.awt.Color(0, 102, 102));
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(0, 153, 153));
        five.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        five.setForeground(new java.awt.Color(0, 102, 102));
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(0, 153, 153));
        eight.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        eight.setForeground(new java.awt.Color(0, 102, 102));
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(0, 153, 153));
        nine.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nine.setForeground(new java.awt.Color(0, 102, 102));
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(0, 153, 153));
        plus.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        plus.setForeground(new java.awt.Color(0, 102, 102));
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(0, 153, 153));
        zero.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        zero.setForeground(new java.awt.Color(0, 102, 102));
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        decimal.setBackground(new java.awt.Color(0, 153, 153));
        decimal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        decimal.setForeground(new java.awt.Color(0, 102, 102));
        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        multiple.setBackground(new java.awt.Color(0, 153, 153));
        multiple.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        multiple.setForeground(new java.awt.Color(0, 102, 102));
        multiple.setText("*");
        multiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(0, 153, 153));
        equal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        equal.setForeground(new java.awt.Color(0, 102, 102));
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        divide.setBackground(new java.awt.Color(0, 153, 153));
        divide.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        divide.setForeground(new java.awt.Color(0, 102, 102));
        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(0, 153, 153));
        exit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(204, 0, 51));
        exit.setText("Quit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        e.setBackground(new java.awt.Color(0, 153, 153));
        e.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        e.setForeground(new java.awt.Color(0, 102, 102));
        e.setText("e");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        pie.setBackground(new java.awt.Color(0, 153, 153));
        pie.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pie.setForeground(new java.awt.Color(0, 102, 102));
        pie.setText("π");
        pie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieActionPerformed(evt);
            }
        });

        power.setBackground(new java.awt.Color(0, 153, 153));
        power.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        power.setForeground(new java.awt.Color(0, 102, 102));
        power.setText("^");
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });

        percentage.setBackground(new java.awt.Color(0, 153, 153));
        percentage.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        percentage.setForeground(new java.awt.Color(0, 102, 102));
        percentage.setText("%");
        percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageActionPerformed(evt);
            }
        });

        log.setBackground(new java.awt.Color(0, 153, 153));
        log.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        log.setForeground(new java.awt.Color(0, 102, 102));
        log.setText("log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        cos.setBackground(new java.awt.Color(0, 153, 153));
        cos.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cos.setForeground(new java.awt.Color(0, 102, 102));
        cos.setText("cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        tan.setBackground(new java.awt.Color(0, 153, 153));
        tan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tan.setForeground(new java.awt.Color(0, 102, 102));
        tan.setText("tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        sin.setBackground(new java.awt.Color(0, 153, 153));
        sin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sin.setForeground(new java.awt.Color(0, 102, 102));
        sin.setText("sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        radian.setBackground(new java.awt.Color(0, 153, 153));
        radian.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        radian.setForeground(new java.awt.Color(0, 102, 102));
        radian.setText("rad");
        radian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radianActionPerformed(evt);
            }
        });

        degree.setBackground(new java.awt.Color(0, 153, 153));
        degree.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        degree.setForeground(new java.awt.Color(0, 102, 102));
        degree.setText("deg");
        degree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeActionPerformed(evt);
            }
        });

        square.setBackground(new java.awt.Color(0, 153, 153));
        square.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        square.setForeground(new java.awt.Color(0, 102, 102));
        square.setText("sq");
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });

        squareroot.setBackground(new java.awt.Color(0, 153, 153));
        squareroot.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        squareroot.setForeground(new java.awt.Color(0, 102, 102));
        squareroot.setText("√");
        squareroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squarerootActionPerformed(evt);
            }
        });

        cube.setBackground(new java.awt.Color(0, 153, 153));
        cube.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cube.setForeground(new java.awt.Color(0, 102, 102));
        cube.setText("cube");
        cube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubeActionPerformed(evt);
            }
        });

        squareroot3.setBackground(new java.awt.Color(0, 153, 153));
        squareroot3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        squareroot3.setForeground(new java.awt.Color(0, 102, 102));
        squareroot3.setText("e^x");
        squareroot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareroot3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pie, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(squareroot3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(squareroot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cube, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(square, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(power, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(degree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sin, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(radian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(multiple, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radian, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(squareroot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(square)
                            .addComponent(degree)
                            .addComponent(cube)
                            .addComponent(squareroot3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiple, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pie, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
    if(displayclick)
     {
        display.setText("0"+display.getText()+decimal.getText());
        displayclick = false;
        Dot=false;
     }else if(Dot)
     {
        display.setText(display.getText()+decimal.getText());
        Dot=false;
     }
    
    }//GEN-LAST:event_decimalActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
       a = Double.parseDouble(display.getText());
       display.setText("");
       Dot = true;
       plusclick = false;
       multipleclick = false;
       divideclick = true;
       minusclick =false;
    }//GEN-LAST:event_divideActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
         display.setText(display.getText()+one.getText());
         displayclick = false;
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
         display.setText(display.getText()+two.getText());
         displayclick = false;
    }//GEN-LAST:event_twoActionPerformed

    private void multipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleActionPerformed
       a = Double.parseDouble(display.getText());
       display.setText("");
       Dot = true;
       plusclick = false;
       multipleclick = true;
       divideclick =false;
       minusclick =false;
    }//GEN-LAST:event_multipleActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
         display.setText(display.getText()+six.getText());
         displayclick = false;
    }//GEN-LAST:event_sixActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
      display.setText("");
      Dot = true;
      displayclick = true;
    }//GEN-LAST:event_clearActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if(!displayclick)
       {
           display.setText(display.getText()+zero.getText());
       }
//       else
//       {
//          displayclick = false;     
//       }
       
    }//GEN-LAST:event_zeroActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
       a = Double.parseDouble(display.getText());
       display.setText("");
       Dot = true;
       plusclick = true;
       multipleclick = false;
       divideclick =false;
       minusclick =false;
       
    }//GEN-LAST:event_plusActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        display.setText(display.getText()+seven.getText());
        displayclick = false;
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        display.setText(display.getText()+eight.getText());
        displayclick = false;
    }//GEN-LAST:event_eightActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        display.setText(display.getText()+three.getText());  
        displayclick = false;
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        display.setText(display.getText()+four.getText());
        displayclick = false;    
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        display.setText(display.getText()+five.getText());
        displayclick = false;
    }//GEN-LAST:event_fiveActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        display.setText(display.getText()+nine.getText());
        displayclick = false;
    }//GEN-LAST:event_nineActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void plusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusminusActionPerformed
       String digit = display.getText();
        if(Dot)
         {
            int value = Integer.parseInt(digit);
            value = value*-1;
            display.setText(String.valueOf(value));
         }
        else
        {
            double value = Double.parseDouble(digit);
            value = -value;
            display.setText(String.valueOf(value));
        }
       
    }//GEN-LAST:event_plusminusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
      a = Double.parseDouble(display.getText());
       display.setText("");
       Dot = true;
       minusclick = true;
       plusclick = false;
       multipleclick = false;
       divideclick = false;
       
    }//GEN-LAST:event_minusActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        b = Double.parseDouble(display.getText());  
        if(powerclick)
        {
            c = Math.pow(val, b);
            if (Dot) {
                display.setText(String.valueOf(c));
            } else {
                display.setText(String.valueOf((int) c));

            } 
        }
        if(percentclick)
        {
            c = (val*b)/100;
            if(!Dot)
            {
                display.setText(String.valueOf((int) c));
            }else{
                display.setText(String.valueOf(c));
            }
            percentclick = false;
        }
        if(plusclick)
        {
            c = a+b;
            plusclick = false;
        }
        else if(minusclick)
        {
            c = a-b;
            minusclick = false;
        }
        else if(divideclick)
        {
            c = a/b;
            divideclick = false;
        }
        else if(multipleclick)
        {
            c = a*b;
            multipleclick = false;
        }
        
        display.setText(String.valueOf(c));

    }//GEN-LAST:event_equalActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        display.setText(String.valueOf(Math.E));
    }//GEN-LAST:event_eActionPerformed

    private void pieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieActionPerformed
        display.setText(String.valueOf(Math.PI));
    }//GEN-LAST:event_pieActionPerformed

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed
        val = Double.parseDouble(display.getText());
        display.setText("");
        powerclick = true;
      
    }//GEN-LAST:event_powerActionPerformed

    private void percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageActionPerformed
        val = Double.parseDouble(display.getText());
        display.setText("");
        percentclick = true;
        
    }//GEN-LAST:event_percentageActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        double value1 = Double.parseDouble(display.getText());
        String output1 = String.valueOf(Math.log(value1));
        display.setText(output1);
    }//GEN-LAST:event_logActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        display.setText(String.valueOf(Math.cos(Double.parseDouble(display.getText()))));
    }//GEN-LAST:event_cosActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        double value2 = Double.parseDouble(display.getText());
        String output2 = String.valueOf(Math.tan(value2));
        display.setText(output2);
    }//GEN-LAST:event_tanActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        display.setText(String.valueOf(Math.sin(Double.parseDouble(display.getText()))));
    }//GEN-LAST:event_sinActionPerformed

    private void radianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radianActionPerformed
        display.setText(String.valueOf(Math.toRadians(Double.parseDouble(display.getText()))));
    }//GEN-LAST:event_radianActionPerformed

    private void degreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeActionPerformed
        display.setText(String.valueOf(Math.toDegrees(Double.parseDouble(display.getText()))));
    }//GEN-LAST:event_degreeActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
//        val = Double.parseDouble(display.getText()); 
        display.setText(String.valueOf(Math.pow(Double.parseDouble(display.getText()), 2))); 
        
    }//GEN-LAST:event_squareActionPerformed

    private void squarerootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squarerootActionPerformed
        display.setText(String.valueOf(Math.sqrt(Double.parseDouble(display.getText()))));
    }//GEN-LAST:event_squarerootActionPerformed

    private void cubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubeActionPerformed
        display.setText(String.valueOf(Math.pow(Double.parseDouble(display.getText()), 3)));
    }//GEN-LAST:event_cubeActionPerformed

    private void squareroot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareroot3ActionPerformed
        display.setText(String.valueOf(Math.pow(Math.E, Double.parseDouble(display.getText()))));
    }//GEN-LAST:event_squareroot3ActionPerformed

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
            java.util.logging.Logger.getLogger(Calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton cos;
    private javax.swing.JButton cube;
    private javax.swing.JButton decimal;
    private javax.swing.JButton degree;
    private javax.swing.JTextField display;
    private javax.swing.JButton divide;
    private javax.swing.JButton e;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton exit;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton log;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiple;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton percentage;
    private javax.swing.JButton pie;
    private javax.swing.JButton plus;
    private javax.swing.JButton plusminus;
    private javax.swing.JButton power;
    private javax.swing.JButton radian;
    private javax.swing.JButton seven;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton square;
    private javax.swing.JButton squareroot;
    private javax.swing.JButton squareroot3;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
