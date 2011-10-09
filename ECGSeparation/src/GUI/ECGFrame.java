package GUI;

import Jama.Matrix;
import Transforms.*;
import Signals.Reader;
import java.io.File;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author Tom Pepels - 25-9-2011
 */
public class ECGFrame extends javax.swing.JFrame {

    private String selectedFile;
    private double[] samples;
    private String yAxis;
    private String signalName;
    private boolean graph1Drawn = false;
    private boolean graph2Drawn = false;

    /** Creates new form ECGFrame */
    public ECGFrame() {
        initComponents();

        drawButton.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transformButtonGroup = new javax.swing.ButtonGroup();
        graphOperationGroup = new javax.swing.ButtonGroup();
        graphSelectionGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        signalNamesList = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        drawButton = new javax.swing.JButton();
        fileTextField = new javax.swing.JTextField();
        sigCountText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        clear2Button = new javax.swing.JButton();
        clear1Button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        graphPanel2 = new GUI.GraphPanel();
        graphPanel1 = new GUI.GraphPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        haarRadioButton = new javax.swing.JRadioButton();
        d4RadioButton = new javax.swing.JRadioButton();
        fourierRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        dwtWeightTxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        medianFilterButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        filterTxt = new javax.swing.JTextField();
        meanFilterButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        addToRadio = new javax.swing.JRadioButton();
        replaceRadio = new javax.swing.JRadioButton();
        graph1Radio = new javax.swing.JRadioButton();
        graph2Radio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuration"));

        jButton1.setText("Select File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Signal:");

        drawButton.setText("Draw graph");
        drawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtonActionPerformed(evt);
            }
        });

        sigCountText.setText("1000");

        jLabel2.setText("Signal count:");

        resetButton.setText("Reset samples");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        clear2Button.setText("Clear graph 2");
        clear2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ButtonActionPerformed(evt);
            }
        });

        clear1Button.setText("Clear Graph 1");
        clear1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signalNamesList, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sigCountText, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drawButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear2Button)
                    .addComponent(clear1Button))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(clear1Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(signalNamesList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(sigCountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drawButton)
                    .addComponent(resetButton)
                    .addComponent(clear2Button))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setLayout(new java.awt.BorderLayout());

        graphPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Graph 2"));
        graphPanel2.setPreferredSize(new java.awt.Dimension(412, 270));
        jPanel2.add(graphPanel2, java.awt.BorderLayout.SOUTH);

        graphPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Graph 1"));
        graphPanel1.setPreferredSize(new java.awt.Dimension(412, 270));
        jPanel2.add(graphPanel1, java.awt.BorderLayout.NORTH);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Operations"));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Wavelet Transform"));

        transformButtonGroup.add(haarRadioButton);
        haarRadioButton.setSelected(true);
        haarRadioButton.setText("Haar");

        transformButtonGroup.add(d4RadioButton);
        d4RadioButton.setText("Daubechies D4");

        transformButtonGroup.add(fourierRadioButton);
        fourierRadioButton.setText("Fourier");

        jLabel3.setText("DWT Weight:");

        dwtWeightTxt.setText("2");

        jButton2.setText("Wavelet Transform");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Noise reduction");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(haarRadioButton)
                            .addComponent(d4RadioButton)
                            .addComponent(fourierRadioButton)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dwtWeightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(6, 6, 6)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(haarRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(d4RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fourierRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dwtWeightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Filters"));

        medianFilterButton.setText("Median Filter");
        medianFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medianFilterButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Filter neighbours:");

        filterTxt.setText("3");

        meanFilterButton.setText("Mean Filter");
        meanFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meanFilterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(meanFilterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medianFilterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(filterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(medianFilterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meanFilterButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Graphs"));

        graphOperationGroup.add(addToRadio);
        addToRadio.setText("Add to");

        graphOperationGroup.add(replaceRadio);
        replaceRadio.setSelected(true);
        replaceRadio.setText("Replace");

        graphSelectionGroup.add(graph1Radio);
        graph1Radio.setText("Graph 1");

        graphSelectionGroup.add(graph2Radio);
        graph2Radio.setSelected(true);
        graph2Radio.setText("Graph2");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(addToRadio)
                        .addGap(18, 18, 18)
                        .addComponent(graph1Radio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(graph2Radio))
                    .addComponent(replaceRadio))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToRadio)
                    .addComponent(graph1Radio)
                    .addComponent(graph2Radio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(replaceRadio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        final JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            fileTextField.setText(file.getName());
            this.selectedFile = file.getPath();
            Reader.closeEDFFile();
            Reader.openEDFFile(selectedFile);
            fillComboBox();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void drawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtonActionPerformed
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        readSamples();
        drawGraph(signalName, false);
    }//GEN-LAST:event_drawButtonActionPerformed

    private void readSamples() {
        Reader.openEDFFile(selectedFile);
        int signal = ((ComboItem) signalNamesList.getSelectedItem()).getId();
        int sigCount = Integer.parseInt(sigCountText.getText());
        samples = Reader.readSamples(signal, sigCount);
        yAxis = Reader.physicalDimension(signal);
        signalName = Reader.signalName(signal);
        Reader.closeEDFFile();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        drawGraph("Wavelet Transform", true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        double[] trans = doTransform();
        double[] newSigD = NoiseReduction.reduceNoiseDynamicT(trans);
        samples = Arrays.copyOf(doInvTransform(newSigD), newSigD.length);

        drawGraph("Dynamic Threshold", false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void medianFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medianFilterButtonActionPerformed
        int n = Integer.parseInt(filterTxt.getText());
        samples = NoiseReduction.medianFilter(samples, n);
        drawGraph("Median filtered, " + n, false);
    }//GEN-LAST:event_medianFilterButtonActionPerformed

    private void meanFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meanFilterButtonActionPerformed
        int n = Integer.parseInt(filterTxt.getText());
        samples = NoiseReduction.meanFilter(samples, n);
        drawGraph("Mean filtered, " + n, false);
    }//GEN-LAST:event_meanFilterButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        readSamples();
        drawGraph(signalName, false);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void clear1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ButtonActionPerformed
        graphPanel1.removeAll();
        graph1Drawn = false;
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_clear1ButtonActionPerformed

    private void clear2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ButtonActionPerformed
        graphPanel2.removeAll();
        graph2Drawn = false;
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_clear2ButtonActionPerformed

    private void drawGraph(String name, boolean transform) {
        double[] signal;
        if (transform) {
            signal = doTransform();
        } else {
            signal = samples;
        }
        
        if (graph1Radio.isSelected()) {
            if (addToRadio.isSelected() && graph1Drawn) {
                graphPanel1.addGraph(signal, name);
            } else {
                graphPanel1.drawGraph(signal, yAxis, name);
                graph1Drawn = true;
            }
        } else {
            if (addToRadio.isSelected() && graph2Drawn) {
                graphPanel2.addGraph(signal, name);
            } else {
                graphPanel2.drawGraph(signal, yAxis, name);
                graph2Drawn = true;
            }
        }
    }

    private double[] doTransform() {
        if (haarRadioButton.isSelected()) {

            int wgt = Integer.parseInt(dwtWeightTxt.getText());
            double weight = Math.sqrt(wgt);
            Matrix result = DWT.waveletTransform(weight, samples);
            return result.transpose().getArray()[0];

        } else if (d4RadioButton.isSelected()) {

            double[] newSig = Arrays.copyOf(samples, samples.length);
            DWT.d4Transform(newSig);
            return newSig;

        } else { //Fourier here!
            return new double[0];
        }
    }

    private double[] doInvTransform(double[] signal) {
        if (haarRadioButton.isSelected()) {

            int wgt = Integer.parseInt(dwtWeightTxt.getText());
            double weight = Math.sqrt(wgt);
            return DWT.inverseHaarWaveletTransform(signal, weight);

        } else if (d4RadioButton.isSelected()) {

            double[] newSig = Arrays.copyOf(signal, signal.length);
            DWT.invD4Transform(newSig);
            return newSig;

        } else { //Fourier here!
            return new double[0];
        }
    }

    private void fillComboBox() {
        int signals = Reader.noOfSignals();
        if (signals > 0) {

            for (int i = 0; i < signals; i++) {
                this.signalNamesList.addItem(new ComboItem(Reader.signalName(i), i));
            }

            drawButton.setEnabled(true);
        } else {
            drawButton.setEnabled(false);
        }
    }

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
            java.util.logging.Logger.getLogger(ECGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ECGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ECGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ECGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

                for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Windows".equals(info.getName())) {
                        try {
                            UIManager.setLookAndFeel(info.getClassName());
                        } catch (Exception ex) {
                        }
                        break;
                    }
                }
                new ECGFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton addToRadio;
    private javax.swing.JButton clear1Button;
    private javax.swing.JButton clear2Button;
    private javax.swing.JRadioButton d4RadioButton;
    private javax.swing.JButton drawButton;
    private javax.swing.JTextField dwtWeightTxt;
    private javax.swing.JTextField fileTextField;
    private javax.swing.JTextField filterTxt;
    private javax.swing.JRadioButton fourierRadioButton;
    private javax.swing.JRadioButton graph1Radio;
    private javax.swing.JRadioButton graph2Radio;
    private javax.swing.ButtonGroup graphOperationGroup;
    private GUI.GraphPanel graphPanel1;
    private GUI.GraphPanel graphPanel2;
    private javax.swing.ButtonGroup graphSelectionGroup;
    private javax.swing.JRadioButton haarRadioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton meanFilterButton;
    private javax.swing.JButton medianFilterButton;
    private javax.swing.JRadioButton replaceRadio;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField sigCountText;
    private javax.swing.JComboBox signalNamesList;
    private javax.swing.ButtonGroup transformButtonGroup;
    // End of variables declaration//GEN-END:variables
}