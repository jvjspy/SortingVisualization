package com.chung.view;

import com.chung.controller.MainViewController;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JButton;


public class MainView extends javax.swing.JPanel{
	MainViewController controller;
	public void setController(MainViewController c){
		controller=c;
	}
    public MainView() {
        initComponents();
    }
		
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    controlPanel = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    datatf = new javax.swing.JTextField();
    algoCombo = new javax.swing.JComboBox<>();
    importbtn = new javax.swing.JButton();
    genbtn = new javax.swing.JButton();
    playbtn = new javax.swing.JButton();
    stopbtn = new javax.swing.JButton();
    nextbtn = new javax.swing.JButton();
    prevbtn = new javax.swing.JButton();
    delaySlider = new javax.swing.JSlider();
    visualizePanel = new VisualizePanel();

    setBackground(new java.awt.Color(255, 255, 255));
    setPreferredSize(new java.awt.Dimension(1000, 600));

    controlPanel.setBackground(new java.awt.Color(255, 255, 255));
    controlPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 204, 204)));

    jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    jLabel1.setText("Data: ");
    controlPanel.add(jLabel1);

    datatf.setColumns(15);
    datatf.setText("17,6,20");
    controlPanel.add(datatf);

    algoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selection Sort", "Bubble Sort", "Insertion Sort", "Quick Sort", "Merge Sort", "Heap Sort" }));
    algoCombo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        algoComboActionPerformed(evt);
      }
    });
    controlPanel.add(algoCombo);

    importbtn.setText("Import");
    importbtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        importbtnActionPerformed(evt);
      }
    });
    controlPanel.add(importbtn);

    genbtn.setText("Generate");
    genbtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        genbtnActionPerformed(evt);
      }
    });
    controlPanel.add(genbtn);

    playbtn.setText("Play");
    playbtn.setEnabled(false);
    playbtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        playbtnActionPerformed(evt);
      }
    });
    controlPanel.add(playbtn);

    stopbtn.setText("Stop");
    stopbtn.setEnabled(false);
    stopbtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        stopbtnActionPerformed(evt);
      }
    });
    controlPanel.add(stopbtn);

    nextbtn.setText("Next");
    nextbtn.setEnabled(false);
    nextbtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        nextbtnActionPerformed(evt);
      }
    });
    controlPanel.add(nextbtn);

    prevbtn.setText("Previous");
    prevbtn.setEnabled(false);
    prevbtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        prevbtnActionPerformed(evt);
      }
    });
    controlPanel.add(prevbtn);

    delaySlider.setPaintLabels(true);
    delaySlider.setToolTipText("Delay");
    delaySlider.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        delaySliderStateChanged(evt);
      }
    });
    controlPanel.add(delaySlider);

    visualizePanel.setBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout visualizePanelLayout = new javax.swing.GroupLayout(visualizePanel);
    visualizePanel.setLayout(visualizePanelLayout);
    visualizePanelLayout.setHorizontalGroup(
      visualizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    visualizePanelLayout.setVerticalGroup(
      visualizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 538, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(visualizePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(visualizePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void importbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importbtnActionPerformed
   controller.onImportClick();
  }//GEN-LAST:event_importbtnActionPerformed

  private void genbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genbtnActionPerformed
    controller.onGenerateClick();
  }//GEN-LAST:event_genbtnActionPerformed

  private void playbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playbtnActionPerformed
    controller.onPlayClick();
  }//GEN-LAST:event_playbtnActionPerformed

  private void stopbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopbtnActionPerformed
    controller.onStopClick();
  }//GEN-LAST:event_stopbtnActionPerformed

  private void nextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnActionPerformed
    controller.onNextClick();
  }//GEN-LAST:event_nextbtnActionPerformed

  private void prevbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevbtnActionPerformed
    controller.onPrevClick();
  }//GEN-LAST:event_prevbtnActionPerformed

  private void algoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_algoComboActionPerformed
    controller.onChangeAlgo();
  }//GEN-LAST:event_algoComboActionPerformed

  private void delaySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_delaySliderStateChanged
    controller.onSpeedChanged(delaySlider.getValue());
  }//GEN-LAST:event_delaySliderStateChanged


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> algoCombo;
  private javax.swing.JPanel controlPanel;
  private javax.swing.JTextField datatf;
  private javax.swing.JSlider delaySlider;
  private javax.swing.JButton genbtn;
  private javax.swing.JButton importbtn;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JButton nextbtn;
  private javax.swing.JButton playbtn;
  private javax.swing.JButton prevbtn;
  private javax.swing.JButton stopbtn;
  private VisualizePanel visualizePanel;
  // End of variables declaration//GEN-END:variables
public String getData(){
	return datatf.getText();
}
public int getSelectedId(){
	return algoCombo.getSelectedIndex();
}
public VisualizePanel getVisualizePanel(){
	return visualizePanel;
}

	public JButton getNextbtn() {
		return nextbtn;
	}

	public JButton getPlaybtn() {
		return playbtn;
	}

	public JButton getPrevbtn() {
		return prevbtn;
	}

	public JButton getStopbtn() {
		return stopbtn;
	}

}
