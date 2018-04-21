package GUI;

/* 
 * Copyright (C) 2018 simono41
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import readandwrite.read;
import readandwrite.remove;
import readandwrite.write;
import theultimatetic.KI;

/**
 *
 * @author simono41
 */
public final class spielfeld extends javax.swing.JFrame {

    public static ArrayList<String> liste0 = new ArrayList();

    /**
     * Creates new form Spielfeld
     */
    public spielfeld() {
        initComponents();
        this.check();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        RESET = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TheUltimateTic");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setText("-");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("-");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("-");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("TheUltimateTic");

        jScrollPane1.setViewportView(jList1);

        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        jLabel2.setText("Punkte: 0");

        jLabel3.setText("Willkommen bei TheUltimateTic");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RESET))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RESET)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if ("-".equals(this.jButton1.getText())) {
            this.jButton1.setText("x");
            this.jLabel3.setText("");
            this.save();
            this.check();
            this.win();
            KI a = new KI();
            a.berechnungen();
            this.check();
            this.win();

        } else {
            System.out.println("Fehler, ist kein Freies Feld!!!");
            this.jLabel3.setText("Fehler, ist kein Freies Feld!!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if ("-".equals(this.jButton2.getText())) {
            this.jButton2.setText("x");
            this.jLabel3.setText("");
            this.save();
            this.check();
            this.win();
            KI a = new KI();
            a.berechnungen();
            this.check();
            this.win();

        } else {
            System.out.println("Fehler, ist kein Freies Feld!!!");
            this.jLabel3.setText("Fehler, ist kein Freies Feld!!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if ("-".equals(this.jButton3.getText())) {
            this.jButton3.setText("x");
            this.jLabel3.setText("");
            this.save();
            this.check();
            this.win();
            KI a = new KI();
            a.berechnungen();
            this.check();
            this.win();

        } else {
            System.out.println("Fehler, ist kein Freies Feld!!!");
            this.jLabel3.setText("Fehler, ist kein Freies Feld!!!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if ("-".equals(this.jButton4.getText())) {
            this.jButton4.setText("x");
            this.jLabel3.setText("");
            this.save();
            this.check();
            this.win();
            KI a = new KI();
            a.berechnungen();
            this.check();
            this.win();

        } else {
            System.out.println("Fehler, ist kein Freies Feld!!!");
            this.jLabel3.setText("Fehler, ist kein Freies Feld!!!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:        
        if ("-".equals(this.jButton5.getText())) {
            this.jButton5.setText("x");
            this.jLabel3.setText("");
            this.save();
            this.check();
            this.win();
            KI a = new KI();
            a.berechnungen();
            this.check();
            this.win();

        } else {
            System.out.println("Fehler, ist kein Freies Feld!!!");
            this.jLabel3.setText("Fehler, ist kein Freies Feld!!!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if ("-".equals(this.jButton6.getText())) {
            this.jButton6.setText("x");
            this.jLabel3.setText("");
            this.save();
            this.check();
            this.win();
            KI a = new KI();
            a.berechnungen();
            this.check();
            this.win();

        } else {
            System.out.println("Fehler, ist kein Freies Feld!!!");
            this.jLabel3.setText("Fehler, ist kein Freies Feld!!!");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if ("-".equals(this.jButton7.getText())) {
            this.jButton7.setText("x");
            this.jLabel3.setText("");
            this.save();
            this.check();
            this.win();
            KI a = new KI();
            a.berechnungen();
            this.check();
            this.win();

        } else {
            System.out.println("Fehler, ist kein Freies Feld!!!");
            this.jLabel3.setText("Fehler, ist kein Freies Feld!!!");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if ("-".equals(this.jButton8.getText())) {
            this.jButton8.setText("x");
            this.jLabel3.setText("");
            this.save();
            this.check();
            this.win();
            KI a = new KI();
            a.berechnungen();
            this.check();
            this.win();

        } else {
            System.out.println("Fehler, ist kein Freies Feld!!!");
            this.jLabel3.setText("Fehler, ist kein Freies Feld!!!");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if ("-".equals(this.jButton9.getText())) {
            this.jButton9.setText("x");
            this.jLabel3.setText("");
            this.save();
            this.check();
            this.win();
            KI a = new KI();
            a.berechnungen();
            this.check();
            this.win();

        } else {
            System.out.println("Fehler, ist kein Freies Feld!!!");
            this.jLabel3.setText("Fehler, ist kein Freies Feld!!!");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        // TODO add your handling code here:
        System.out.println("RESET");
        reset();
    }//GEN-LAST:event_RESETActionPerformed

    public void reset() {
        System.out.println("reset");
        remove a = new remove();
        a.remove();
        this.jButton1.setText("-");
        this.jButton2.setText("-");
        this.jButton3.setText("-");
        this.jButton4.setText("-");
        this.jButton5.setText("-");
        this.jButton6.setText("-");
        this.jButton7.setText("-");
        this.jButton8.setText("-");
        this.jButton9.setText("-");
        jLabel2.setText("Punkte: 0");
        jLabel3.setText("");
        liste0.clear();
        
        this.save();
        
        int zufallszahl = (int) (Math.random() * 2);
        System.out.println("Spieler: " + zufallszahl);
        
        if ( zufallszahl == 1 ) {
            System.out.println("Der Gegner fängt an!!!");
            this.liste0.add("1");
            KI b = new KI();
            b.berechnungen();
            this.check();
        }
    }

    public void save() {
        liste0.clear();

        liste0.add(this.jButton1.getText());
        liste0.add(this.jButton2.getText());
        liste0.add(this.jButton3.getText());
        liste0.add(this.jButton4.getText());
        liste0.add(this.jButton5.getText());
        liste0.add(this.jButton6.getText());
        liste0.add(this.jButton7.getText());
        liste0.add(this.jButton8.getText());
        liste0.add(this.jButton9.getText());

        write a = new write();
        try {
            a.write();
        } catch (IOException ex) {
            System.out.println("Datei kann nicht gespeichert werden!!!");
        }
    }

    public void check() {
        System.out.println("check");
        read a = new read();
        try {
            a.read();

            if ("x".equals(liste0.get(0))) {
                this.jButton1.setText("x");
            }
            if ("x".equals(liste0.get(1))) {
                this.jButton2.setText("x");
            }
            if ("x".equals(liste0.get(2))) {
                this.jButton3.setText("x");
            }
            if ("x".equals(liste0.get(3))) {
                this.jButton4.setText("x");
            }
            if ("x".equals(liste0.get(4))) {
                this.jButton5.setText("x");
            }
            if ("x".equals(liste0.get(5))) {
                this.jButton6.setText("x");
            }
            if ("x".equals(liste0.get(6))) {
                this.jButton7.setText("x");
            }
            if ("x".equals(liste0.get(7))) {
                this.jButton8.setText("x");
            }
            if ("x".equals(liste0.get(8))) {
                this.jButton9.setText("x");
            }
            if ("o".equals(liste0.get(0))) {
                this.jButton1.setText("o");
            }
            if ("o".equals(liste0.get(1))) {
                this.jButton2.setText("o");
            }
            if ("o".equals(liste0.get(2))) {
                this.jButton3.setText("o");
            }
            if ("o".equals(liste0.get(3))) {
                this.jButton4.setText("o");
            }
            if ("o".equals(liste0.get(4))) {
                this.jButton5.setText("o");
            }
            if ("o".equals(liste0.get(5))) {
                this.jButton6.setText("o");
            }
            if ("o".equals(liste0.get(6))) {
                this.jButton7.setText("o");
            }
            if ("o".equals(liste0.get(7))) {
                this.jButton8.setText("o");
            }
            if ("o".equals(liste0.get(8))) {
                this.jButton9.setText("o");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Datei wird neu Angelegt!");
        } catch (IOException ex) {
            Logger.getLogger(spielfeld.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Datei kann nicht gelesen werden!!!");
        }

    }

    public void win() {

        DefaultListModel dim = new DefaultListModel();
        
        if ("x".equals(liste0.get(0)) && "x".equals(liste0.get(1)) && "x".equals(liste0.get(2))) {
            this.jLabel3.setText("Du hast gewonnen!!!");
            dim.addElement("Sieg");
        }
        if ("o".equals(liste0.get(0)) && "o".equals(liste0.get(1)) && "o".equals(liste0.get(2))) {
            this.jLabel3.setText("Du hast verloren!!!");
            dim.addElement("Niederlage");
        }

        if ("x".equals(liste0.get(0)) && "x".equals(liste0.get(4)) && "x".equals(liste0.get(8))) {
            this.jLabel3.setText("Du hast gewonnen!!!");
            dim.addElement("Sieg");
        }
        if ("o".equals(liste0.get(0)) && "o".equals(liste0.get(4)) && "o".equals(liste0.get(8))) {
            this.jLabel3.setText("Du hast verloren!!!");
            dim.addElement("Niederlage");
        }

        if ("x".equals(liste0.get(0)) && "x".equals(liste0.get(3)) && "x".equals(liste0.get(6))) {
            this.jLabel3.setText("Du hast gewonnen!!!");
            dim.addElement("Sieg");
        }
        if ("o".equals(liste0.get(0)) && "o".equals(liste0.get(3)) && "o".equals(liste0.get(6))) {
            this.jLabel3.setText("Du hast verloren!!!");
            dim.addElement("Niederlage");
        }

        if ("x".equals(liste0.get(1)) && "x".equals(liste0.get(4)) && "x".equals(liste0.get(7))) {
            this.jLabel3.setText("Du hast gewonnen!!!");
            dim.addElement("Sieg");
        }
        if ("o".equals(liste0.get(1)) && "o".equals(liste0.get(4)) && "o".equals(liste0.get(7))) {
            this.jLabel3.setText("Du hast verloren!!!");
            dim.addElement("Niederlage");
        }

        if ("x".equals(liste0.get(2)) && "x".equals(liste0.get(4)) && "x".equals(liste0.get(6))) {
            this.jLabel3.setText("Du hast gewonnen!!!");
            dim.addElement("Sieg");
        }
        if ("o".equals(liste0.get(2)) && "o".equals(liste0.get(4)) && "o".equals(liste0.get(6))) {
            this.jLabel3.setText("Du hast verloren!!!");
            dim.addElement("Niederlage");
        }

        if ("x".equals(liste0.get(2)) && "x".equals(liste0.get(5)) && "x".equals(liste0.get(8))) {
            this.jLabel3.setText("Du hast gewonnen!!!");
            dim.addElement("Sieg");
        }
        if ("o".equals(liste0.get(2)) && "o".equals(liste0.get(5)) && "o".equals(liste0.get(8))) {
            this.jLabel3.setText("Du hast verloren!!!");
            dim.addElement("Niederlage");
        }

        if ("x".equals(liste0.get(3)) && "x".equals(liste0.get(4)) && "x".equals(liste0.get(5))) {
            this.jLabel3.setText("Du hast gewonnen!!!");
            dim.addElement("Sieg");
        }
        if ("o".equals(liste0.get(3)) && "o".equals(liste0.get(4)) && "o".equals(liste0.get(5))) {
            this.jLabel3.setText("Du hast verloren!!!");
            dim.addElement("Niederlage");
        }

        if ("x".equals(liste0.get(6)) && "x".equals(liste0.get(7)) && "x".equals(liste0.get(8))) {
            this.jLabel3.setText("Du hast gewonnen!!!");
            dim.addElement("Sieg");
        }
        if ("o".equals(liste0.get(6)) && "o".equals(liste0.get(7)) && "o".equals(liste0.get(8))) {
            this.jLabel3.setText("Du hast verloren!!!");
            dim.addElement("Niederlage");
        }
        this.jList1.setModel(dim);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RESET;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
