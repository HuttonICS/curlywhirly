package curlywhirly.gui;

import java.awt.event.*;
import javax.swing.*;

import curlywhirly.data.*;

import scri.commons.gui.*;

public class ControlsPanelNB extends JPanel implements ActionListener
{
	private WinMain winMain;
	private DataSet dataSet;

    /** Creates new form ControlsPanelNB */
    public ControlsPanelNB(WinMain winMain)
	{
        initComponents();

		this.winMain = winMain;

		RB.setText(lblAxesTitle, "gui.ControlPanel.axesTitle");
		RB.setText(lblX, "gui.ControlPanel.lblX");
		RB.setText(lblY, "gui.ControlPanel.lblY");
		RB.setText(lblZ, "gui.ControlPanel.lblZ");
    }

	private void addComboModels()
	{
		String[] axisLabels = dataSet.getAxisLabels();
		// set the data headers as the model for the combo boxes that allow selection of variables
		xCombo.setModel(new DefaultComboBoxModel<String>(axisLabels));
		yCombo.setModel(new DefaultComboBoxModel<String>(axisLabels));
		zCombo.setModel(new DefaultComboBoxModel<String>(axisLabels));

		xCombo.addActionListener(this);
		yCombo.addActionListener(this);
		zCombo.addActionListener(this);

		resetComboBoxes();
	}

	public void resetComboBoxes()
	{
		// set the combos to display the currently selected index of the variables they display
		xCombo.setSelectedIndex(0);
		yCombo.setSelectedIndex(1);
		zCombo.setSelectedIndex(2);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == xCombo)
		{
			int index = xCombo.getSelectedIndex();
			dataSet.setCurrX(index);
			winMain.getDataPanel().updateTableModel();
		}

		else if (e.getSource() == yCombo)
		{
			int index = yCombo.getSelectedIndex();
			dataSet.setCurrY(index);
			winMain.getDataPanel().updateTableModel();
		}

		else if (e.getSource() == zCombo)
		{
			int index = zCombo.getSelectedIndex();
			dataSet.setCurrZ(index);
			winMain.getDataPanel().updateTableModel();
		}
	}

	public void toggleEnabled(boolean enabled)
	{
		lblX.setEnabled(enabled);
		lblY.setEnabled(enabled);
		lblZ.setEnabled(enabled);
		lblAxesTitle.setEnabled(enabled);
		xCombo.setEnabled(enabled);
		yCombo.setEnabled(enabled);
		zCombo.setEnabled(enabled);
	}

	public void setDataSet(DataSet dataSet)
	{
		this.dataSet = dataSet;

		addComboModels();
	}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        zCombo = new javax.swing.JComboBox<String>();
        lblZ = new javax.swing.JLabel();
        lblY = new javax.swing.JLabel();
        yCombo = new javax.swing.JComboBox<String>();
        xCombo = new javax.swing.JComboBox<String>();
        lblX = new javax.swing.JLabel();
        lblAxesTitle = new javax.swing.JLabel();

        zCombo.setBorder(null);
        zCombo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                zComboactionPerformed(evt);
            }
        });

        lblZ.setText("z-axis:");

        lblY.setText("y-axis:");

        yCombo.setBorder(null);
        yCombo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                yComboactionPerformed(evt);
            }
        });

        xCombo.setBorder(null);
        xCombo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                xComboactionPerformed(evt);
            }
        });

        lblX.setText("x-axis:");

        lblAxesTitle.setText("Data to display:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblX)
                            .addComponent(lblY)
                            .addComponent(lblZ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAxesTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAxesTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblX)
                    .addComponent(xCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblY)
                    .addComponent(yCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblZ)
                    .addComponent(zCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void zComboactionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_zComboactionPerformed
    {//GEN-HEADEREND:event_zComboactionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zComboactionPerformed

    private void yComboactionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_yComboactionPerformed
    {//GEN-HEADEREND:event_yComboactionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yComboactionPerformed

    private void xComboactionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_xComboactionPerformed
    {//GEN-HEADEREND:event_xComboactionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xComboactionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAxesTitle;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel lblY;
    private javax.swing.JLabel lblZ;
    private javax.swing.JComboBox<String> xCombo;
    private javax.swing.JComboBox<String> yCombo;
    private javax.swing.JComboBox<String> zCombo;
    // End of variables declaration//GEN-END:variables

}
