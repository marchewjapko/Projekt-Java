package my.test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class JavaGui extends javax.swing.JFrame
{
    public JavaGui() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jDialog1.setMinimumSize(new java.awt.Dimension(327, 160));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("File \"Custom Board.txt\" ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("has been created in \"src\"  folder");

        jButton3.setText("OK");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(140, 140, 140))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(854, 340));
        setMinimumSize(new java.awt.Dimension(854, 340));

        jPanel1.setBackground(java.awt.Color.black);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.setBackground(java.awt.Color.black);
        jPanel2.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel3.setBackground(java.awt.Color.black);
        jPanel3.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.setBackground(java.awt.Color.black);
        jPanel4.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel5.setBackground(java.awt.Color.black);
        jPanel5.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel6.setBackground(java.awt.Color.black);
        jPanel6.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel7.setBackground(java.awt.Color.black);
        jPanel7.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel8.setBackground(java.awt.Color.black);
        jPanel8.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel9.setBackground(java.awt.Color.black);
        jPanel9.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel10.setBackground(java.awt.Color.black);
        jPanel10.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel11.setBackground(java.awt.Color.black);
        jPanel11.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel12.setBackground(java.awt.Color.black);
        jPanel12.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel13.setBackground(java.awt.Color.black);
        jPanel13.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel14.setBackground(java.awt.Color.black);
        jPanel14.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel15.setBackground(java.awt.Color.black);
        jPanel15.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel16.setBackground(java.awt.Color.black);
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel17.setBackground(java.awt.Color.black);
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel18.setBackground(java.awt.Color.black);
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel19.setBackground(java.awt.Color.black);
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel20.setBackground(java.awt.Color.black);
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel21.setBackground(java.awt.Color.black);
        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel22.setBackground(java.awt.Color.black);
        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel23.setBackground(java.awt.Color.black);
        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel24.setBackground(java.awt.Color.black);
        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel25.setBackground(java.awt.Color.black);
        jPanel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel26.setBackground(java.awt.Color.black);
        jPanel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel27.setBackground(java.awt.Color.black);
        jPanel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel28.setBackground(java.awt.Color.black);
        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel29.setBackground(java.awt.Color.black);
        jPanel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel30.setBackground(java.awt.Color.black);
        jPanel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel30MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel31.setBackground(java.awt.Color.black);
        jPanel31.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel32.setBackground(java.awt.Color.black);
        jPanel32.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel32MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel33.setBackground(java.awt.Color.black);
        jPanel33.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel33MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel34.setBackground(java.awt.Color.black);
        jPanel34.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel35.setBackground(java.awt.Color.black);
        jPanel35.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel35MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel36.setBackground(java.awt.Color.black);
        jPanel36.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel36MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel37.setBackground(java.awt.Color.black);
        jPanel37.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel37MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel38.setBackground(java.awt.Color.black);
        jPanel38.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel38MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel39.setBackground(java.awt.Color.black);
        jPanel39.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel39MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel40.setBackground(java.awt.Color.black);
        jPanel40.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel40MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel41.setBackground(java.awt.Color.black);
        jPanel41.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel41MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel42.setBackground(java.awt.Color.black);
        jPanel42.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel42MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel43.setBackground(java.awt.Color.black);
        jPanel43.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel43MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel44.setBackground(java.awt.Color.black);
        jPanel44.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel44MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel45.setBackground(java.awt.Color.black);
        jPanel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel45MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel46.setBackground(java.awt.Color.black);
        jPanel46.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel46MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel47.setBackground(java.awt.Color.black);
        jPanel47.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel47MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel48.setBackground(java.awt.Color.black);
        jPanel48.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel48MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel49.setBackground(java.awt.Color.black);
        jPanel49.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel49MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel50.setBackground(java.awt.Color.black);
        jPanel50.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel50MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel51.setBackground(java.awt.Color.black);
        jPanel51.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel51MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel52.setBackground(java.awt.Color.black);
        jPanel52.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel52MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel53.setBackground(java.awt.Color.black);
        jPanel53.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel53MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel54.setBackground(java.awt.Color.black);
        jPanel54.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel54MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel55.setBackground(java.awt.Color.black);
        jPanel55.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel55MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel56.setBackground(java.awt.Color.black);
        jPanel56.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel56MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel57.setBackground(java.awt.Color.black);
        jPanel57.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel57MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel58.setBackground(java.awt.Color.black);
        jPanel58.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel58MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel59.setBackground(java.awt.Color.black);
        jPanel59.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel59MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel60.setBackground(java.awt.Color.black);
        jPanel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel60MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel61.setBackground(java.awt.Color.black);
        jPanel61.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel61MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel62.setBackground(java.awt.Color.black);
        jPanel62.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel62MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel63.setBackground(java.awt.Color.black);
        jPanel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel63MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel64.setBackground(java.awt.Color.black);
        jPanel64.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel64MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel65.setBackground(java.awt.Color.black);
        jPanel65.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel65MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel66.setBackground(java.awt.Color.black);
        jPanel66.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel66MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel67.setBackground(java.awt.Color.black);
        jPanel67.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel67MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel68.setBackground(java.awt.Color.black);
        jPanel68.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel68MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel69.setBackground(java.awt.Color.black);
        jPanel69.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel69MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel70.setBackground(java.awt.Color.black);
        jPanel70.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel70MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel71.setBackground(java.awt.Color.black);
        jPanel71.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel71MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel72.setBackground(java.awt.Color.black);
        jPanel72.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel72MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel73.setBackground(java.awt.Color.black);
        jPanel73.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel73MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel74.setBackground(java.awt.Color.black);
        jPanel74.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel74MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel75.setBackground(java.awt.Color.black);
        jPanel75.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel75MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jButton1.setText("Export to text file");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void changePanel(JPanel jpanel) //i z tym
    {
        if(jpanel.getBackground()==Color.BLACK)
        {
            jpanel.setBackground(Color.YELLOW);
        }
        else if(jpanel.getBackground()==Color.YELLOW)
        {
            jpanel.setBackground(Color.BLUE);
        }
        else if(jpanel.getBackground()==Color.BLUE)
        {
            jpanel.setBackground(Color.RED);
        }
        else if(jpanel.getBackground()==Color.RED)
        {
            jpanel.setBackground(Color.BLACK);
        }
    }

    private void panelToText(JPanel panel, FileWriter myWriter) throws IOException { //sproboj z tym
        if(panel.getBackground()==Color.BLACK)
        {
            myWriter.write("0");
        }
        if(panel.getBackground()==Color.YELLOW)
        {
            myWriter.write("1");
        }
        if(panel.getBackground()==Color.RED)
        {
            myWriter.write("2");
        }
        if(panel.getBackground()==Color.BLUE)
        {
            myWriter.write("3");
        }
    }

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       /* if(jPanel1.getBackground()==Color.BLACK)
        {
            jPanel1.setBackground(Color.YELLOW);
        }
        else if(jPanel1.getBackground()==Color.YELLOW)
        {
            jPanel1.setBackground(Color.BLUE);
        }
        else if(jPanel1.getBackground()==Color.BLUE)
        {
            jPanel1.setBackground(Color.RED);
        }
        else if(jPanel1.getBackground()==Color.RED)
        {
            jPanel1.setBackground(Color.BLACK);
        }

        */
       changePanel(jPanel1);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        if(jPanel2.getBackground()==Color.BLACK)
        {
            jPanel2.setBackground(Color.YELLOW);
        }
        else if(jPanel2.getBackground()==Color.YELLOW)
        {
            jPanel2.setBackground(Color.BLUE);
        }
        else if(jPanel2.getBackground()==Color.BLUE)
        {
            jPanel2.setBackground(Color.RED);
        }
        else if(jPanel2.getBackground()==Color.RED)
        {
            jPanel2.setBackground(Color.BLACK);
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try 
        {
            File myObj = new File("Custom Board.txt");
            myObj.createNewFile();
        }
        catch (IOException e) {}
        try 
        {
            FileWriter myWriter = new FileWriter("Custom Board.txt");


            /*
            if(jPanel1.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel1.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel1.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel1.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel2.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel2.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel2.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel2.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel3.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel3.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel3.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel3.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel4.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel4.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel4.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel4.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel5.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel5.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel5.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel5.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel6.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel6.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel6.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel6.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel7.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel7.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel7.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel7.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel8.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel8.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel8.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel8.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel9.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel9.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel9.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel9.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel10.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel10.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel10.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel10.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel11.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel11.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel11.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel11.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel12.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel12.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel12.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel12.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel13.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel13.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel13.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel13.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel14.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel14.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel14.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel14.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel15.getBackground()==Color.BLACK)
            {
                    myWriter.write("0\n");
            }
            if(jPanel15.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1\n");
            }
            if(jPanel15.getBackground()==Color.RED)
            {
                    myWriter.write("2\n");
            }
            if(jPanel15.getBackground()==Color.BLUE)
            {
                    myWriter.write("3\n");
            }
            if(jPanel16.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel16.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel16.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel16.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel17.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel17.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel17.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel17.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel18.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel18.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel18.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel18.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel19.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel19.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel19.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel19.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel20.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel20.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel20.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel20.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel21.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel21.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel21.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel21.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel22.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel22.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel22.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel22.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel23.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel23.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel23.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel23.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel24.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel24.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel24.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel24.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel25.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel25.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel25.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel25.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel26.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel26.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel26.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel26.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel27.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel27.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel27.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel27.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel28.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel28.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel28.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel28.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel29.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel29.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel29.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel29.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel30.getBackground()==Color.BLACK)
            {
                    myWriter.write("0\n");
            }
            if(jPanel30.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1\n");
            }
            if(jPanel30.getBackground()==Color.RED)
            {
                    myWriter.write("2\n");
            }
            if(jPanel30.getBackground()==Color.BLUE)
            {
                    myWriter.write("3\n");
            }
            if(jPanel31.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel31.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel31.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel31.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel32.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel32.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel32.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel32.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel33.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel33.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel33.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel33.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel34.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel34.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel34.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel34.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel35.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel35.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel35.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel35.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel36.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel36.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel36.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel36.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel37.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel37.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel37.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel37.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel38.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel38.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel38.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel38.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel39.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel39.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel39.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel39.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel40.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel40.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel40.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel40.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel41.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel41.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel41.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel41.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel42.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel42.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel42.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel42.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel43.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel43.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel43.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel43.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel44.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel44.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel44.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel44.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel45.getBackground()==Color.BLACK)
            {
                    myWriter.write("0\n");
            }
            if(jPanel45.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1\n");
            }
            if(jPanel45.getBackground()==Color.RED)
            {
                    myWriter.write("2\n");
            }
            if(jPanel45.getBackground()==Color.BLUE)
            {
                    myWriter.write("3\n");
            }
            if(jPanel46.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel46.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel46.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel46.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel47.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel47.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel47.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel47.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel48.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel48.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel48.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel48.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel49.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel49.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel49.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel49.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel50.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel50.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel50.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel50.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel51.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel51.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel51.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel51.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel52.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel52.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel52.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel52.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel53.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel53.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel53.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel53.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel54.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel54.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel54.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel54.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel55.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel55.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel55.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel55.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel56.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel56.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel56.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel56.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel57.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel57.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel57.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel57.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel58.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel58.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel58.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel58.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel59.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel59.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel59.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel59.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel60.getBackground()==Color.BLACK)
            {
                    myWriter.write("0\n");
            }
            if(jPanel60.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1\n");
            }
            if(jPanel60.getBackground()==Color.RED)
            {
                    myWriter.write("2\n");
            }
            if(jPanel60.getBackground()==Color.BLUE)
            {
                    myWriter.write("3\n");
            }
            if(jPanel61.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel61.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel61.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel61.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel62.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel62.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel62.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel62.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel63.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel63.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel63.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel63.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel64.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel64.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel64.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel64.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel65.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel65.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel65.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel65.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel66.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel66.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel66.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel66.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel67.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel67.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel67.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel67.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel68.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel68.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel68.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel68.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel69.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel69.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel69.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel69.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel70.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel70.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel70.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel70.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel71.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel71.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel71.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel71.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel72.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel72.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel72.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel72.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel73.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel73.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel73.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel73.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel74.getBackground()==Color.BLACK)
            {
                    myWriter.write("0");
            }
            if(jPanel74.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1");
            }
            if(jPanel74.getBackground()==Color.RED)
            {
                    myWriter.write("2");
            }
            if(jPanel74.getBackground()==Color.BLUE)
            {
                    myWriter.write("3");
            }
            if(jPanel75.getBackground()==Color.BLACK)
            {
                    myWriter.write("0\n");
            }
            if(jPanel75.getBackground()==Color.YELLOW)
            {
                    myWriter.write("1\n");
            }
            if(jPanel75.getBackground()==Color.RED)
            {
                    myWriter.write("2\n");
            }
            if(jPanel75.getBackground()==Color.BLUE)
            {
                    myWriter.write("3\n");
            }

             */
            jDialog1.setVisible(rootPaneCheckingEnabled);
            /*for(int i=1; i<=75; i++)
            {
                myWriter.write("private void jPanel"+ i +"MouseClicked(java.awt.event.MouseEvent evt){\n");
                myWriter.write("\tif(jPanel" + i + ".getBackground()==Color.BLACK)\n\t{\n\t\tjPanel" + i +".setBackground(Color.YELLOW);\n\t}\n");
                myWriter.write("\telse if(jPanel" + i + ".getBackground()==Color.YELLOW)\n\t{\n\t\tjPanel" + i + ".setBackground(Color.BLUE);\n\t}\n");
                myWriter.write("\telse if(jPanel" + i + ".getBackground()==Color.BLUE)\n\t{\n\t\tjPanel" + i + ".setBackground(Color.RED);\n\t}\n");
                myWriter.write("\telse if(jPanel" + i + ".getBackground()==Color.RED)\n\t{\n\t\tjPanel" + i + ".setBackground(Color.BLACK);\n\t}\n}\n\n");
            }*/
            myWriter.close();
        } catch (IOException e) {}
    }//GEN-LAST:event_jButton1MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        if(jPanel3.getBackground()==Color.BLACK)
        {
            jPanel3.setBackground(Color.YELLOW);
        }
        else if(jPanel3.getBackground()==Color.YELLOW)
        {
            jPanel3.setBackground(Color.BLUE);
        }
        else if(jPanel3.getBackground()==Color.BLUE)
        {
            jPanel3.setBackground(Color.RED);
        }
        else if(jPanel3.getBackground()==Color.RED)
        {
            jPanel3.setBackground(Color.BLACK);
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        if(jPanel4.getBackground()==Color.BLACK)
        {
            jPanel4.setBackground(Color.YELLOW);
        }
        else if(jPanel4.getBackground()==Color.YELLOW)
        {
            jPanel4.setBackground(Color.BLUE);
        }
        else if(jPanel4.getBackground()==Color.BLUE)
        {
            jPanel4.setBackground(Color.RED);
        }
        else if(jPanel4.getBackground()==Color.RED)
        {
            jPanel4.setBackground(Color.BLACK);
        }
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        if(jPanel6.getBackground()==Color.BLACK)
	{
		jPanel6.setBackground(Color.YELLOW);
	}
	else if(jPanel6.getBackground()==Color.YELLOW)
	{
		jPanel6.setBackground(Color.BLUE);
	}
	else if(jPanel6.getBackground()==Color.BLUE)
	{
		jPanel6.setBackground(Color.RED);
	}
	else if(jPanel6.getBackground()==Color.RED)
	{
		jPanel6.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
            if(jPanel5.getBackground()==Color.BLACK)
            {
                    jPanel5.setBackground(Color.YELLOW);
            }
            else if(jPanel5.getBackground()==Color.YELLOW)
            {
                    jPanel5.setBackground(Color.BLUE);
            }
            else if(jPanel5.getBackground()==Color.BLUE)
            {
                    jPanel5.setBackground(Color.RED);
            }
            else if(jPanel5.getBackground()==Color.RED)
            {
                    jPanel5.setBackground(Color.BLACK);
            }
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
	if(jPanel7.getBackground()==Color.BLACK)
	{
		jPanel7.setBackground(Color.YELLOW);
	}
	else if(jPanel7.getBackground()==Color.YELLOW)
	{
		jPanel7.setBackground(Color.BLUE);
	}
	else if(jPanel7.getBackground()==Color.BLUE)
	{
		jPanel7.setBackground(Color.RED);
	}
	else if(jPanel7.getBackground()==Color.RED)
	{
		jPanel7.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
	if(jPanel8.getBackground()==Color.BLACK)
	{
		jPanel8.setBackground(Color.YELLOW);
	}
	else if(jPanel8.getBackground()==Color.YELLOW)
	{
		jPanel8.setBackground(Color.BLUE);
	}
	else if(jPanel8.getBackground()==Color.BLUE)
	{
		jPanel8.setBackground(Color.RED);
	}
	else if(jPanel8.getBackground()==Color.RED)
	{
		jPanel8.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
	if(jPanel9.getBackground()==Color.BLACK)
	{
		jPanel9.setBackground(Color.YELLOW);
	}
	else if(jPanel9.getBackground()==Color.YELLOW)
	{
		jPanel9.setBackground(Color.BLUE);
	}
	else if(jPanel9.getBackground()==Color.BLUE)
	{
		jPanel9.setBackground(Color.RED);
	}
	else if(jPanel9.getBackground()==Color.RED)
	{
		jPanel9.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
	if(jPanel10.getBackground()==Color.BLACK)
	{
		jPanel10.setBackground(Color.YELLOW);
	}
	else if(jPanel10.getBackground()==Color.YELLOW)
	{
		jPanel10.setBackground(Color.BLUE);
	}
	else if(jPanel10.getBackground()==Color.BLUE)
	{
		jPanel10.setBackground(Color.RED);
	}
	else if(jPanel10.getBackground()==Color.RED)
	{
		jPanel10.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
	if(jPanel11.getBackground()==Color.BLACK)
	{
		jPanel11.setBackground(Color.YELLOW);
	}
	else if(jPanel11.getBackground()==Color.YELLOW)
	{
		jPanel11.setBackground(Color.BLUE);
	}
	else if(jPanel11.getBackground()==Color.BLUE)
	{
		jPanel11.setBackground(Color.RED);
	}
	else if(jPanel11.getBackground()==Color.RED)
	{
		jPanel11.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
	if(jPanel12.getBackground()==Color.BLACK)
	{
		jPanel12.setBackground(Color.YELLOW);
	}
	else if(jPanel12.getBackground()==Color.YELLOW)
	{
		jPanel12.setBackground(Color.BLUE);
	}
	else if(jPanel12.getBackground()==Color.BLUE)
	{
		jPanel12.setBackground(Color.RED);
	}
	else if(jPanel12.getBackground()==Color.RED)
	{
		jPanel12.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
	if(jPanel13.getBackground()==Color.BLACK)
	{
		jPanel13.setBackground(Color.YELLOW);
	}
	else if(jPanel13.getBackground()==Color.YELLOW)
	{
		jPanel13.setBackground(Color.BLUE);
	}
	else if(jPanel13.getBackground()==Color.BLUE)
	{
		jPanel13.setBackground(Color.RED);
	}
	else if(jPanel13.getBackground()==Color.RED)
	{
		jPanel13.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
	if(jPanel14.getBackground()==Color.BLACK)
	{
		jPanel14.setBackground(Color.YELLOW);
	}
	else if(jPanel14.getBackground()==Color.YELLOW)
	{
		jPanel14.setBackground(Color.BLUE);
	}
	else if(jPanel14.getBackground()==Color.BLUE)
	{
		jPanel14.setBackground(Color.RED);
	}
	else if(jPanel14.getBackground()==Color.RED)
	{
		jPanel14.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
	if(jPanel15.getBackground()==Color.BLACK)
	{
		jPanel15.setBackground(Color.YELLOW);
	}
	else if(jPanel15.getBackground()==Color.YELLOW)
	{
		jPanel15.setBackground(Color.BLUE);
	}
	else if(jPanel15.getBackground()==Color.BLUE)
	{
		jPanel15.setBackground(Color.RED);
	}
	else if(jPanel15.getBackground()==Color.RED)
	{
		jPanel15.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel15MouseClicked

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
	if(jPanel16.getBackground()==Color.BLACK)
	{
		jPanel16.setBackground(Color.YELLOW);
	}
	else if(jPanel16.getBackground()==Color.YELLOW)
	{
		jPanel16.setBackground(Color.BLUE);
	}
	else if(jPanel16.getBackground()==Color.BLUE)
	{
		jPanel16.setBackground(Color.RED);
	}
	else if(jPanel16.getBackground()==Color.RED)
	{
		jPanel16.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
	if(jPanel17.getBackground()==Color.BLACK)
	{
		jPanel17.setBackground(Color.YELLOW);
	}
	else if(jPanel17.getBackground()==Color.YELLOW)
	{
		jPanel17.setBackground(Color.BLUE);
	}
	else if(jPanel17.getBackground()==Color.BLUE)
	{
		jPanel17.setBackground(Color.RED);
	}
	else if(jPanel17.getBackground()==Color.RED)
	{
		jPanel17.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
	if(jPanel18.getBackground()==Color.BLACK)
	{
		jPanel18.setBackground(Color.YELLOW);
	}
	else if(jPanel18.getBackground()==Color.YELLOW)
	{
		jPanel18.setBackground(Color.BLUE);
	}
	else if(jPanel18.getBackground()==Color.BLUE)
	{
		jPanel18.setBackground(Color.RED);
	}
	else if(jPanel18.getBackground()==Color.RED)
	{
		jPanel18.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked
	if(jPanel19.getBackground()==Color.BLACK)
	{
		jPanel19.setBackground(Color.YELLOW);
	}
	else if(jPanel19.getBackground()==Color.YELLOW)
	{
		jPanel19.setBackground(Color.BLUE);
	}
	else if(jPanel19.getBackground()==Color.BLUE)
	{
		jPanel19.setBackground(Color.RED);
	}
	else if(jPanel19.getBackground()==Color.RED)
	{
		jPanel19.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel19MouseClicked

    private void jPanel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseClicked
	if(jPanel20.getBackground()==Color.BLACK)
	{
		jPanel20.setBackground(Color.YELLOW);
	}
	else if(jPanel20.getBackground()==Color.YELLOW)
	{
		jPanel20.setBackground(Color.BLUE);
	}
	else if(jPanel20.getBackground()==Color.BLUE)
	{
		jPanel20.setBackground(Color.RED);
	}
	else if(jPanel20.getBackground()==Color.RED)
	{
		jPanel20.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel20MouseClicked

    private void jPanel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseClicked
	if(jPanel21.getBackground()==Color.BLACK)
	{
		jPanel21.setBackground(Color.YELLOW);
	}
	else if(jPanel21.getBackground()==Color.YELLOW)
	{
		jPanel21.setBackground(Color.BLUE);
	}
	else if(jPanel21.getBackground()==Color.BLUE)
	{
		jPanel21.setBackground(Color.RED);
	}
	else if(jPanel21.getBackground()==Color.RED)
	{
		jPanel21.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel21MouseClicked

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseClicked
	if(jPanel22.getBackground()==Color.BLACK)
	{
		jPanel22.setBackground(Color.YELLOW);
	}
	else if(jPanel22.getBackground()==Color.YELLOW)
	{
		jPanel22.setBackground(Color.BLUE);
	}
	else if(jPanel22.getBackground()==Color.BLUE)
	{
		jPanel22.setBackground(Color.RED);
	}
	else if(jPanel22.getBackground()==Color.RED)
	{
		jPanel22.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel22MouseClicked

    private void jPanel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseClicked
	if(jPanel23.getBackground()==Color.BLACK)
	{
		jPanel23.setBackground(Color.YELLOW);
	}
	else if(jPanel23.getBackground()==Color.YELLOW)
	{
		jPanel23.setBackground(Color.BLUE);
	}
	else if(jPanel23.getBackground()==Color.BLUE)
	{
		jPanel23.setBackground(Color.RED);
	}
	else if(jPanel23.getBackground()==Color.RED)
	{
		jPanel23.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel23MouseClicked

    private void jPanel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseClicked
	if(jPanel24.getBackground()==Color.BLACK)
	{
		jPanel24.setBackground(Color.YELLOW);
	}
	else if(jPanel24.getBackground()==Color.YELLOW)
	{
		jPanel24.setBackground(Color.BLUE);
	}
	else if(jPanel24.getBackground()==Color.BLUE)
	{
		jPanel24.setBackground(Color.RED);
	}
	else if(jPanel24.getBackground()==Color.RED)
	{
		jPanel24.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel24MouseClicked

    private void jPanel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseClicked
	if(jPanel25.getBackground()==Color.BLACK)
	{
		jPanel25.setBackground(Color.YELLOW);
	}
	else if(jPanel25.getBackground()==Color.YELLOW)
	{
		jPanel25.setBackground(Color.BLUE);
	}
	else if(jPanel25.getBackground()==Color.BLUE)
	{
		jPanel25.setBackground(Color.RED);
	}
	else if(jPanel25.getBackground()==Color.RED)
	{
		jPanel25.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel25MouseClicked

    private void jPanel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseClicked
	if(jPanel26.getBackground()==Color.BLACK)
	{
		jPanel26.setBackground(Color.YELLOW);
	}
	else if(jPanel26.getBackground()==Color.YELLOW)
	{
		jPanel26.setBackground(Color.BLUE);
	}
	else if(jPanel26.getBackground()==Color.BLUE)
	{
		jPanel26.setBackground(Color.RED);
	}
	else if(jPanel26.getBackground()==Color.RED)
	{
		jPanel26.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel26MouseClicked

    private void jPanel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseClicked
	if(jPanel27.getBackground()==Color.BLACK)
	{
		jPanel27.setBackground(Color.YELLOW);
	}
	else if(jPanel27.getBackground()==Color.YELLOW)
	{
		jPanel27.setBackground(Color.BLUE);
	}
	else if(jPanel27.getBackground()==Color.BLUE)
	{
		jPanel27.setBackground(Color.RED);
	}
	else if(jPanel27.getBackground()==Color.RED)
	{
		jPanel27.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel27MouseClicked

    private void jPanel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseClicked
	if(jPanel28.getBackground()==Color.BLACK)
	{
		jPanel28.setBackground(Color.YELLOW);
	}
	else if(jPanel28.getBackground()==Color.YELLOW)
	{
		jPanel28.setBackground(Color.BLUE);
	}
	else if(jPanel28.getBackground()==Color.BLUE)
	{
		jPanel28.setBackground(Color.RED);
	}
	else if(jPanel28.getBackground()==Color.RED)
	{
		jPanel28.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel28MouseClicked

    private void jPanel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseClicked
	if(jPanel29.getBackground()==Color.BLACK)
	{
		jPanel29.setBackground(Color.YELLOW);
	}
	else if(jPanel29.getBackground()==Color.YELLOW)
	{
		jPanel29.setBackground(Color.BLUE);
	}
	else if(jPanel29.getBackground()==Color.BLUE)
	{
		jPanel29.setBackground(Color.RED);
	}
	else if(jPanel29.getBackground()==Color.RED)
	{
		jPanel29.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel29MouseClicked

    private void jPanel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MouseClicked
	if(jPanel30.getBackground()==Color.BLACK)
	{
		jPanel30.setBackground(Color.YELLOW);
	}
	else if(jPanel30.getBackground()==Color.YELLOW)
	{
		jPanel30.setBackground(Color.BLUE);
	}
	else if(jPanel30.getBackground()==Color.BLUE)
	{
		jPanel30.setBackground(Color.RED);
	}
	else if(jPanel30.getBackground()==Color.RED)
	{
		jPanel30.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel30MouseClicked

    private void jPanel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseClicked
	if(jPanel31.getBackground()==Color.BLACK)
	{
		jPanel31.setBackground(Color.YELLOW);
	}
	else if(jPanel31.getBackground()==Color.YELLOW)
	{
		jPanel31.setBackground(Color.BLUE);
	}
	else if(jPanel31.getBackground()==Color.BLUE)
	{
		jPanel31.setBackground(Color.RED);
	}
	else if(jPanel31.getBackground()==Color.RED)
	{
		jPanel31.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel31MouseClicked

    private void jPanel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel32MouseClicked
	if(jPanel32.getBackground()==Color.BLACK)
	{
		jPanel32.setBackground(Color.YELLOW);
	}
	else if(jPanel32.getBackground()==Color.YELLOW)
	{
		jPanel32.setBackground(Color.BLUE);
	}
	else if(jPanel32.getBackground()==Color.BLUE)
	{
		jPanel32.setBackground(Color.RED);
	}
	else if(jPanel32.getBackground()==Color.RED)
	{
		jPanel32.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel32MouseClicked

    private void jPanel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel33MouseClicked
	if(jPanel33.getBackground()==Color.BLACK)
	{
		jPanel33.setBackground(Color.YELLOW);
	}
	else if(jPanel33.getBackground()==Color.YELLOW)
	{
		jPanel33.setBackground(Color.BLUE);
	}
	else if(jPanel33.getBackground()==Color.BLUE)
	{
		jPanel33.setBackground(Color.RED);
	}
	else if(jPanel33.getBackground()==Color.RED)
	{
		jPanel33.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel33MouseClicked

    private void jPanel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel34MouseClicked
	if(jPanel34.getBackground()==Color.BLACK)
	{
		jPanel34.setBackground(Color.YELLOW);
	}
	else if(jPanel34.getBackground()==Color.YELLOW)
	{
		jPanel34.setBackground(Color.BLUE);
	}
	else if(jPanel34.getBackground()==Color.BLUE)
	{
		jPanel34.setBackground(Color.RED);
	}
	else if(jPanel34.getBackground()==Color.RED)
	{
		jPanel34.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel34MouseClicked

    private void jPanel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseClicked
	if(jPanel35.getBackground()==Color.BLACK)
	{
		jPanel35.setBackground(Color.YELLOW);
	}
	else if(jPanel35.getBackground()==Color.YELLOW)
	{
		jPanel35.setBackground(Color.BLUE);
	}
	else if(jPanel35.getBackground()==Color.BLUE)
	{
		jPanel35.setBackground(Color.RED);
	}
	else if(jPanel35.getBackground()==Color.RED)
	{
		jPanel35.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel35MouseClicked

    private void jPanel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel36MouseClicked
	if(jPanel36.getBackground()==Color.BLACK)
	{
		jPanel36.setBackground(Color.YELLOW);
	}
	else if(jPanel36.getBackground()==Color.YELLOW)
	{
		jPanel36.setBackground(Color.BLUE);
	}
	else if(jPanel36.getBackground()==Color.BLUE)
	{
		jPanel36.setBackground(Color.RED);
	}
	else if(jPanel36.getBackground()==Color.RED)
	{
		jPanel36.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel36MouseClicked

    private void jPanel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel37MouseClicked
	if(jPanel37.getBackground()==Color.BLACK)
	{
		jPanel37.setBackground(Color.YELLOW);
	}
	else if(jPanel37.getBackground()==Color.YELLOW)
	{
		jPanel37.setBackground(Color.BLUE);
	}
	else if(jPanel37.getBackground()==Color.BLUE)
	{
		jPanel37.setBackground(Color.RED);
	}
	else if(jPanel37.getBackground()==Color.RED)
	{
		jPanel37.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel37MouseClicked

    private void jPanel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel38MouseClicked
	if(jPanel38.getBackground()==Color.BLACK)
	{
		jPanel38.setBackground(Color.YELLOW);
	}
	else if(jPanel38.getBackground()==Color.YELLOW)
	{
		jPanel38.setBackground(Color.BLUE);
	}
	else if(jPanel38.getBackground()==Color.BLUE)
	{
		jPanel38.setBackground(Color.RED);
	}
	else if(jPanel38.getBackground()==Color.RED)
	{
		jPanel38.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel38MouseClicked

    private void jPanel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel39MouseClicked
	if(jPanel39.getBackground()==Color.BLACK)
	{
		jPanel39.setBackground(Color.YELLOW);
	}
	else if(jPanel39.getBackground()==Color.YELLOW)
	{
		jPanel39.setBackground(Color.BLUE);
	}
	else if(jPanel39.getBackground()==Color.BLUE)
	{
		jPanel39.setBackground(Color.RED);
	}
	else if(jPanel39.getBackground()==Color.RED)
	{
		jPanel39.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel39MouseClicked

    private void jPanel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel40MouseClicked
	if(jPanel40.getBackground()==Color.BLACK)
	{
		jPanel40.setBackground(Color.YELLOW);
	}
	else if(jPanel40.getBackground()==Color.YELLOW)
	{
		jPanel40.setBackground(Color.BLUE);
	}
	else if(jPanel40.getBackground()==Color.BLUE)
	{
		jPanel40.setBackground(Color.RED);
	}
	else if(jPanel40.getBackground()==Color.RED)
	{
		jPanel40.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel40MouseClicked

    private void jPanel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel41MouseClicked
	if(jPanel41.getBackground()==Color.BLACK)
	{
		jPanel41.setBackground(Color.YELLOW);
	}
	else if(jPanel41.getBackground()==Color.YELLOW)
	{
		jPanel41.setBackground(Color.BLUE);
	}
	else if(jPanel41.getBackground()==Color.BLUE)
	{
		jPanel41.setBackground(Color.RED);
	}
	else if(jPanel41.getBackground()==Color.RED)
	{
		jPanel41.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel41MouseClicked

    private void jPanel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel42MouseClicked
	if(jPanel42.getBackground()==Color.BLACK)
	{
		jPanel42.setBackground(Color.YELLOW);
	}
	else if(jPanel42.getBackground()==Color.YELLOW)
	{
		jPanel42.setBackground(Color.BLUE);
	}
	else if(jPanel42.getBackground()==Color.BLUE)
	{
		jPanel42.setBackground(Color.RED);
	}
	else if(jPanel42.getBackground()==Color.RED)
	{
		jPanel42.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel42MouseClicked

    private void jPanel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel43MouseClicked
	if(jPanel43.getBackground()==Color.BLACK)
	{
		jPanel43.setBackground(Color.YELLOW);
	}
	else if(jPanel43.getBackground()==Color.YELLOW)
	{
		jPanel43.setBackground(Color.BLUE);
	}
	else if(jPanel43.getBackground()==Color.BLUE)
	{
		jPanel43.setBackground(Color.RED);
	}
	else if(jPanel43.getBackground()==Color.RED)
	{
		jPanel43.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel43MouseClicked

    private void jPanel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel44MouseClicked
	if(jPanel44.getBackground()==Color.BLACK)
	{
		jPanel44.setBackground(Color.YELLOW);
	}
	else if(jPanel44.getBackground()==Color.YELLOW)
	{
		jPanel44.setBackground(Color.BLUE);
	}
	else if(jPanel44.getBackground()==Color.BLUE)
	{
		jPanel44.setBackground(Color.RED);
	}
	else if(jPanel44.getBackground()==Color.RED)
	{
		jPanel44.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel44MouseClicked

    private void jPanel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel45MouseClicked
	if(jPanel45.getBackground()==Color.BLACK)
	{
		jPanel45.setBackground(Color.YELLOW);
	}
	else if(jPanel45.getBackground()==Color.YELLOW)
	{
		jPanel45.setBackground(Color.BLUE);
	}
	else if(jPanel45.getBackground()==Color.BLUE)
	{
		jPanel45.setBackground(Color.RED);
	}
	else if(jPanel45.getBackground()==Color.RED)
	{
		jPanel45.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel45MouseClicked

    private void jPanel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel46MouseClicked
	if(jPanel46.getBackground()==Color.BLACK)
	{
		jPanel46.setBackground(Color.YELLOW);
	}
	else if(jPanel46.getBackground()==Color.YELLOW)
	{
		jPanel46.setBackground(Color.BLUE);
	}
	else if(jPanel46.getBackground()==Color.BLUE)
	{
		jPanel46.setBackground(Color.RED);
	}
	else if(jPanel46.getBackground()==Color.RED)
	{
		jPanel46.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel46MouseClicked

    private void jPanel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel47MouseClicked
	if(jPanel47.getBackground()==Color.BLACK)
	{
		jPanel47.setBackground(Color.YELLOW);
	}
	else if(jPanel47.getBackground()==Color.YELLOW)
	{
		jPanel47.setBackground(Color.BLUE);
	}
	else if(jPanel47.getBackground()==Color.BLUE)
	{
		jPanel47.setBackground(Color.RED);
	}
	else if(jPanel47.getBackground()==Color.RED)
	{
		jPanel47.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel47MouseClicked

    private void jPanel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel48MouseClicked
	if(jPanel48.getBackground()==Color.BLACK)
	{
		jPanel48.setBackground(Color.YELLOW);
	}
	else if(jPanel48.getBackground()==Color.YELLOW)
	{
		jPanel48.setBackground(Color.BLUE);
	}
	else if(jPanel48.getBackground()==Color.BLUE)
	{
		jPanel48.setBackground(Color.RED);
	}
	else if(jPanel48.getBackground()==Color.RED)
	{
		jPanel48.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel48MouseClicked

    private void jPanel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel49MouseClicked
	if(jPanel49.getBackground()==Color.BLACK)
	{
		jPanel49.setBackground(Color.YELLOW);
	}
	else if(jPanel49.getBackground()==Color.YELLOW)
	{
		jPanel49.setBackground(Color.BLUE);
	}
	else if(jPanel49.getBackground()==Color.BLUE)
	{
		jPanel49.setBackground(Color.RED);
	}
	else if(jPanel49.getBackground()==Color.RED)
	{
		jPanel49.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel49MouseClicked

    private void jPanel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel50MouseClicked
	if(jPanel50.getBackground()==Color.BLACK)
	{
		jPanel50.setBackground(Color.YELLOW);
	}
	else if(jPanel50.getBackground()==Color.YELLOW)
	{
		jPanel50.setBackground(Color.BLUE);
	}
	else if(jPanel50.getBackground()==Color.BLUE)
	{
		jPanel50.setBackground(Color.RED);
	}
	else if(jPanel50.getBackground()==Color.RED)
	{
		jPanel50.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel50MouseClicked

    private void jPanel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel51MouseClicked
	if(jPanel51.getBackground()==Color.BLACK)
	{
		jPanel51.setBackground(Color.YELLOW);
	}
	else if(jPanel51.getBackground()==Color.YELLOW)
	{
		jPanel51.setBackground(Color.BLUE);
	}
	else if(jPanel51.getBackground()==Color.BLUE)
	{
		jPanel51.setBackground(Color.RED);
	}
	else if(jPanel51.getBackground()==Color.RED)
	{
		jPanel51.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel51MouseClicked

    private void jPanel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel52MouseClicked
	if(jPanel52.getBackground()==Color.BLACK)
	{
		jPanel52.setBackground(Color.YELLOW);
	}
	else if(jPanel52.getBackground()==Color.YELLOW)
	{
		jPanel52.setBackground(Color.BLUE);
	}
	else if(jPanel52.getBackground()==Color.BLUE)
	{
		jPanel52.setBackground(Color.RED);
	}
	else if(jPanel52.getBackground()==Color.RED)
	{
		jPanel52.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel52MouseClicked

    private void jPanel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel53MouseClicked
	if(jPanel53.getBackground()==Color.BLACK)
	{
		jPanel53.setBackground(Color.YELLOW);
	}
	else if(jPanel53.getBackground()==Color.YELLOW)
	{
		jPanel53.setBackground(Color.BLUE);
	}
	else if(jPanel53.getBackground()==Color.BLUE)
	{
		jPanel53.setBackground(Color.RED);
	}
	else if(jPanel53.getBackground()==Color.RED)
	{
		jPanel53.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel53MouseClicked

    private void jPanel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel54MouseClicked
	if(jPanel54.getBackground()==Color.BLACK)
	{
		jPanel54.setBackground(Color.YELLOW);
	}
	else if(jPanel54.getBackground()==Color.YELLOW)
	{
		jPanel54.setBackground(Color.BLUE);
	}
	else if(jPanel54.getBackground()==Color.BLUE)
	{
		jPanel54.setBackground(Color.RED);
	}
	else if(jPanel54.getBackground()==Color.RED)
	{
		jPanel54.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel54MouseClicked

    private void jPanel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel55MouseClicked
	if(jPanel55.getBackground()==Color.BLACK)
	{
		jPanel55.setBackground(Color.YELLOW);
	}
	else if(jPanel55.getBackground()==Color.YELLOW)
	{
		jPanel55.setBackground(Color.BLUE);
	}
	else if(jPanel55.getBackground()==Color.BLUE)
	{
		jPanel55.setBackground(Color.RED);
	}
	else if(jPanel55.getBackground()==Color.RED)
	{
		jPanel55.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel55MouseClicked

    private void jPanel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel56MouseClicked
	if(jPanel56.getBackground()==Color.BLACK)
	{
		jPanel56.setBackground(Color.YELLOW);
	}
	else if(jPanel56.getBackground()==Color.YELLOW)
	{
		jPanel56.setBackground(Color.BLUE);
	}
	else if(jPanel56.getBackground()==Color.BLUE)
	{
		jPanel56.setBackground(Color.RED);
	}
	else if(jPanel56.getBackground()==Color.RED)
	{
		jPanel56.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel56MouseClicked

    private void jPanel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel57MouseClicked
	if(jPanel57.getBackground()==Color.BLACK)
	{
		jPanel57.setBackground(Color.YELLOW);
	}
	else if(jPanel57.getBackground()==Color.YELLOW)
	{
		jPanel57.setBackground(Color.BLUE);
	}
	else if(jPanel57.getBackground()==Color.BLUE)
	{
		jPanel57.setBackground(Color.RED);
	}
	else if(jPanel57.getBackground()==Color.RED)
	{
		jPanel57.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel57MouseClicked

    private void jPanel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel58MouseClicked
	if(jPanel58.getBackground()==Color.BLACK)
	{
		jPanel58.setBackground(Color.YELLOW);
	}
	else if(jPanel58.getBackground()==Color.YELLOW)
	{
		jPanel58.setBackground(Color.BLUE);
	}
	else if(jPanel58.getBackground()==Color.BLUE)
	{
		jPanel58.setBackground(Color.RED);
	}
	else if(jPanel58.getBackground()==Color.RED)
	{
		jPanel58.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel58MouseClicked

    private void jPanel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel59MouseClicked
	if(jPanel59.getBackground()==Color.BLACK)
	{
		jPanel59.setBackground(Color.YELLOW);
	}
	else if(jPanel59.getBackground()==Color.YELLOW)
	{
		jPanel59.setBackground(Color.BLUE);
	}
	else if(jPanel59.getBackground()==Color.BLUE)
	{
		jPanel59.setBackground(Color.RED);
	}
	else if(jPanel59.getBackground()==Color.RED)
	{
		jPanel59.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel59MouseClicked

    private void jPanel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel60MouseClicked
	if(jPanel60.getBackground()==Color.BLACK)
	{
		jPanel60.setBackground(Color.YELLOW);
	}
	else if(jPanel60.getBackground()==Color.YELLOW)
	{
		jPanel60.setBackground(Color.BLUE);
	}
	else if(jPanel60.getBackground()==Color.BLUE)
	{
		jPanel60.setBackground(Color.RED);
	}
	else if(jPanel60.getBackground()==Color.RED)
	{
		jPanel60.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel60MouseClicked

    private void jPanel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel61MouseClicked
	if(jPanel61.getBackground()==Color.BLACK)
	{
		jPanel61.setBackground(Color.YELLOW);
	}
	else if(jPanel61.getBackground()==Color.YELLOW)
	{
		jPanel61.setBackground(Color.BLUE);
	}
	else if(jPanel61.getBackground()==Color.BLUE)
	{
		jPanel61.setBackground(Color.RED);
	}
	else if(jPanel61.getBackground()==Color.RED)
	{
		jPanel61.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel61MouseClicked

    private void jPanel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel62MouseClicked
	if(jPanel62.getBackground()==Color.BLACK)
	{
		jPanel62.setBackground(Color.YELLOW);
	}
	else if(jPanel62.getBackground()==Color.YELLOW)
	{
		jPanel62.setBackground(Color.BLUE);
	}
	else if(jPanel62.getBackground()==Color.BLUE)
	{
		jPanel62.setBackground(Color.RED);
	}
	else if(jPanel62.getBackground()==Color.RED)
	{
		jPanel62.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel62MouseClicked

    private void jPanel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel63MouseClicked
	if(jPanel63.getBackground()==Color.BLACK)
	{
		jPanel63.setBackground(Color.YELLOW);
	}
	else if(jPanel63.getBackground()==Color.YELLOW)
	{
		jPanel63.setBackground(Color.BLUE);
	}
	else if(jPanel63.getBackground()==Color.BLUE)
	{
		jPanel63.setBackground(Color.RED);
	}
	else if(jPanel63.getBackground()==Color.RED)
	{
		jPanel63.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel63MouseClicked

    private void jPanel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel64MouseClicked
	if(jPanel64.getBackground()==Color.BLACK)
	{
		jPanel64.setBackground(Color.YELLOW);
	}
	else if(jPanel64.getBackground()==Color.YELLOW)
	{
		jPanel64.setBackground(Color.BLUE);
	}
	else if(jPanel64.getBackground()==Color.BLUE)
	{
		jPanel64.setBackground(Color.RED);
	}
	else if(jPanel64.getBackground()==Color.RED)
	{
		jPanel64.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel64MouseClicked

    private void jPanel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel65MouseClicked
	if(jPanel65.getBackground()==Color.BLACK)
	{
		jPanel65.setBackground(Color.YELLOW);
	}
	else if(jPanel65.getBackground()==Color.YELLOW)
	{
		jPanel65.setBackground(Color.BLUE);
	}
	else if(jPanel65.getBackground()==Color.BLUE)
	{
		jPanel65.setBackground(Color.RED);
	}
	else if(jPanel65.getBackground()==Color.RED)
	{
		jPanel65.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel65MouseClicked

    private void jPanel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel66MouseClicked
	if(jPanel66.getBackground()==Color.BLACK)
	{
		jPanel66.setBackground(Color.YELLOW);
	}
	else if(jPanel66.getBackground()==Color.YELLOW)
	{
		jPanel66.setBackground(Color.BLUE);
	}
	else if(jPanel66.getBackground()==Color.BLUE)
	{
		jPanel66.setBackground(Color.RED);
	}
	else if(jPanel66.getBackground()==Color.RED)
	{
		jPanel66.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel66MouseClicked

    private void jPanel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel67MouseClicked
	if(jPanel67.getBackground()==Color.BLACK)
	{
		jPanel67.setBackground(Color.YELLOW);
	}
	else if(jPanel67.getBackground()==Color.YELLOW)
	{
		jPanel67.setBackground(Color.BLUE);
	}
	else if(jPanel67.getBackground()==Color.BLUE)
	{
		jPanel67.setBackground(Color.RED);
	}
	else if(jPanel67.getBackground()==Color.RED)
	{
		jPanel67.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel67MouseClicked

    private void jPanel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel68MouseClicked
	if(jPanel68.getBackground()==Color.BLACK)
	{
		jPanel68.setBackground(Color.YELLOW);
	}
	else if(jPanel68.getBackground()==Color.YELLOW)
	{
		jPanel68.setBackground(Color.BLUE);
	}
	else if(jPanel68.getBackground()==Color.BLUE)
	{
		jPanel68.setBackground(Color.RED);
	}
	else if(jPanel68.getBackground()==Color.RED)
	{
		jPanel68.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel68MouseClicked

    private void jPanel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel69MouseClicked
	if(jPanel69.getBackground()==Color.BLACK)
	{
		jPanel69.setBackground(Color.YELLOW);
	}
	else if(jPanel69.getBackground()==Color.YELLOW)
	{
		jPanel69.setBackground(Color.BLUE);
	}
	else if(jPanel69.getBackground()==Color.BLUE)
	{
		jPanel69.setBackground(Color.RED);
	}
	else if(jPanel69.getBackground()==Color.RED)
	{
		jPanel69.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel69MouseClicked

    private void jPanel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel70MouseClicked
	if(jPanel70.getBackground()==Color.BLACK)
	{
		jPanel70.setBackground(Color.YELLOW);
	}
	else if(jPanel70.getBackground()==Color.YELLOW)
	{
		jPanel70.setBackground(Color.BLUE);
	}
	else if(jPanel70.getBackground()==Color.BLUE)
	{
		jPanel70.setBackground(Color.RED);
	}
	else if(jPanel70.getBackground()==Color.RED)
	{
		jPanel70.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel70MouseClicked

    private void jPanel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel71MouseClicked
	if(jPanel71.getBackground()==Color.BLACK)
	{
		jPanel71.setBackground(Color.YELLOW);
	}
	else if(jPanel71.getBackground()==Color.YELLOW)
	{
		jPanel71.setBackground(Color.BLUE);
	}
	else if(jPanel71.getBackground()==Color.BLUE)
	{
		jPanel71.setBackground(Color.RED);
	}
	else if(jPanel71.getBackground()==Color.RED)
	{
		jPanel71.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel71MouseClicked

    private void jPanel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel72MouseClicked
	if(jPanel72.getBackground()==Color.BLACK)
	{
		jPanel72.setBackground(Color.YELLOW);
	}
	else if(jPanel72.getBackground()==Color.YELLOW)
	{
		jPanel72.setBackground(Color.BLUE);
	}
	else if(jPanel72.getBackground()==Color.BLUE)
	{
		jPanel72.setBackground(Color.RED);
	}
	else if(jPanel72.getBackground()==Color.RED)
	{
		jPanel72.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel72MouseClicked

    private void jPanel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel73MouseClicked
	if(jPanel73.getBackground()==Color.BLACK)
	{
		jPanel73.setBackground(Color.YELLOW);
	}
	else if(jPanel73.getBackground()==Color.YELLOW)
	{
		jPanel73.setBackground(Color.BLUE);
	}
	else if(jPanel73.getBackground()==Color.BLUE)
	{
		jPanel73.setBackground(Color.RED);
	}
	else if(jPanel73.getBackground()==Color.RED)
	{
		jPanel73.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel73MouseClicked

    private void jPanel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel74MouseClicked
	if(jPanel74.getBackground()==Color.BLACK)
	{
		jPanel74.setBackground(Color.YELLOW);
	}
	else if(jPanel74.getBackground()==Color.YELLOW)
	{
		jPanel74.setBackground(Color.BLUE);
	}
	else if(jPanel74.getBackground()==Color.BLUE)
	{
		jPanel74.setBackground(Color.RED);
	}
	else if(jPanel74.getBackground()==Color.RED)
	{
		jPanel74.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel74MouseClicked

    private void jPanel75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel75MouseClicked
	if(jPanel75.getBackground()==Color.BLACK)
	{
		jPanel75.setBackground(Color.YELLOW);
	}
	else if(jPanel75.getBackground()==Color.YELLOW)
	{
		jPanel75.setBackground(Color.BLUE);
	}
	else if(jPanel75.getBackground()==Color.BLUE)
	{
		jPanel75.setBackground(Color.RED);
	}
	else if(jPanel75.getBackground()==Color.RED)
	{
		jPanel75.setBackground(Color.BLACK);
	}
    }//GEN-LAST:event_jPanel75MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //test x = new JavaGui();
                //x.setVisible(true);
                //x.setExtendedState(JFrame.MAXIMIZED_BOTH);
                new JavaGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

}
