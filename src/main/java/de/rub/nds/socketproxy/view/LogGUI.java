/*
 * Copyright 2015 Juraj Somorovsky - juraj.somorovsky@rub.de.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.rub.nds.socketproxy.view;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Juraj Somorovsky - juraj.somorovsky@rub.de
 */
public class LogGUI extends javax.swing.JPanel {

    /**
     * Creates new form LogGUI
     */
    public LogGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        appController = new de.rub.nds.socketproxy.controller.AppController();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLog = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(300, 300));

        jTextAreaLog.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent de) {

            }

            @Override
            public void removeUpdate(DocumentEvent de) {

            }

            @Override
            public void changedUpdate(DocumentEvent de) {

            }
        });
        jTextAreaLog.setColumns(20);
        jTextAreaLog.setFont(new java.awt.Font("Courier", 1, 12)); // NOI18N
        jTextAreaLog.setRows(5);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, appController, org.jdesktop.beansbinding.ELProperty.create("${logHistory.log}"), jTextAreaLog, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextAreaLog.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextAreaLogInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTextAreaLog.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextAreaLogPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextAreaLogInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextAreaLogInputMethodTextChanged
       
    }//GEN-LAST:event_jTextAreaLogInputMethodTextChanged

    private void jTextAreaLogPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextAreaLogPropertyChange
        
    }//GEN-LAST:event_jTextAreaLogPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.rub.nds.socketproxy.controller.AppController appController;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaLog;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}