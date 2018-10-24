/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inputs;

import Entidades.EntidadFacturable;
import Entidades.Usuario;
import cec.Tabla;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.CD;

/**
 *
 * @author Programación 2
 */
public class Input_Contactos extends javax.swing.JFrame {

    /**
     * Creates new form Input_Usuarios
    
    */
    private int id_local;
    
    public Input_Contactos() {
        initComponents();
    }
    private boolean NewRecord = true;

    public void Alta() throws SQLException {
        int id = Tabla.UltimoNumero("entidades");
    }

    public void Modificacion(int selectedId) throws SQLException {

        NewRecord = false;
        ResultSet rs = Tabla.select("usuarios", "id = " + selectedId);
        rs.next();
        jTNombre.setText(rs.getString("nombre_fantasia"));
        jTEmail.setText(rs.getString("email"));
        jTFecha_nac.setText(rs.getString("cuit"));
        jTNacionalidad.setText(rs.getString("rubro"));
        jTDni.setText(rs.getString("razon_social"));
        jTDomicilio.setText(rs.getString("domicilio"));
        jTTelefono.setText(rs.getString("telefono"));
        jTNumero.setText(rs.getString("numero_domicilio"));
        jTCelular.setText(rs.getString("celular"));
        jTNombre_conyugue.setText(rs.getString("local"));
        jTEntre_calles.setText(rs.getString("entre_calles"));
        jTBarrio.setText(rs.getString("barrio"));
        jTLocalidad.setText(rs.getString("localidad"));
        jTpiso.setText(rs.getString("horario_atencion"));
        jTDepto.setText(rs.getString("domicilio_cobro"));
        jTNumero.setText(rs.getString("numero_domicilio_cobro"));
        jTCodigo_postal.setText(rs.getString("codigo_postal"));
        //jCTipo.setText(rs.getString("cuit"));
        jTReside.setText(rs.getString("id_recorrido"));
        jTEmail.setText(rs.getString("email"));
        jCBAnulado.setEnabled(rs.getBoolean("anulado"));
        id_local = selectedId;
    }

    public void Baja() {

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTFecha_nac = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jCBAnulado = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jB_Guardar_Usuario = new javax.swing.JButton();
        jTDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTNacionalidad = new javax.swing.JTextField();
        jTNumero = new javax.swing.JTextField();
        jTDomicilio = new javax.swing.JTextField();
        jTEntre_calles = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTCelular = new javax.swing.JTextField();
        jTNombre_conyugue = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTBarrio = new javax.swing.JTextField();
        jTLocalidad = new javax.swing.JTextField();
        jTDepto = new javax.swing.JTextField();
        jTpiso = new javax.swing.JTextField();
        jTCodigo_postal = new javax.swing.JTextField();
        jTReside = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Fecha Nac:");

        jLabel3.setText("Email:");

        jLabel4.setText("Anulado:");

        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });

        jTFecha_nac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFecha_nacActionPerformed(evt);
            }
        });

        jCBAnulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAnuladoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jB_Guardar_Usuario.setText("Guardar");
        jB_Guardar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Guardar_UsuarioActionPerformed(evt);
            }
        });

        jTDni.setName("jTDni"); // NOI18N
        jTDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDniActionPerformed(evt);
            }
        });

        jLabel6.setText("DNI:");

        jTNacionalidad.setName("jTRazon_social"); // NOI18N
        jTNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNacionalidadActionPerformed(evt);
            }
        });

        jTNumero.setName("jTRazon_social"); // NOI18N
        jTNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNumeroActionPerformed(evt);
            }
        });

        jTDomicilio.setName("jTRazon_social"); // NOI18N
        jTDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDomicilioActionPerformed(evt);
            }
        });

        jTEntre_calles.setName("jTRazon_social"); // NOI18N
        jTEntre_calles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEntre_callesActionPerformed(evt);
            }
        });

        jLabel7.setText("Nacionalidad:");

        jTTelefono.setName("jTRazon_social"); // NOI18N
        jTTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTelefonoActionPerformed(evt);
            }
        });

        jLabel9.setText("Teléfono:");

        jLabel10.setText("Celular:");

        jTCelular.setName("jTRazon_social"); // NOI18N
        jTCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCelularActionPerformed(evt);
            }
        });

        jTNombre_conyugue.setName("jTRazon_social"); // NOI18N
        jTNombre_conyugue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombre_conyugueActionPerformed(evt);
            }
        });

        jLabel11.setText("Nombre Conyugue:");

        jLabel12.setText("Numero:");

        jLabel13.setText("Domicilio:");

        jLabel14.setText("Entre Calles:");

        jTBarrio.setName("jTRazon_social"); // NOI18N
        jTBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBarrioActionPerformed(evt);
            }
        });

        jTLocalidad.setName("jTRazon_social"); // NOI18N
        jTLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTLocalidadActionPerformed(evt);
            }
        });

        jTDepto.setName("jTRazon_social"); // NOI18N
        jTDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDeptoActionPerformed(evt);
            }
        });

        jTpiso.setName("jTRazon_social"); // NOI18N
        jTpiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpisoActionPerformed(evt);
            }
        });

        jTCodigo_postal.setName("jTRazon_social"); // NOI18N
        jTCodigo_postal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigo_postalActionPerformed(evt);
            }
        });

        jTReside.setName("jTRazon_social"); // NOI18N
        jTReside.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTResideActionPerformed(evt);
            }
        });

        jLabel15.setText("Barrio:");

        jLabel16.setText("Localidad:");

        jLabel17.setText("Depto:");

        jLabel18.setText("Piso:");

        jLabel19.setText("CP:");

        jLabel22.setText("Reside desde:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(jLabel22)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTFecha_nac, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNombre_conyugue, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTReside, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBAnulado)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTCodigo_postal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                        .addComponent(jTDepto, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTLocalidad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTEntre_calles, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTDomicilio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTNumero, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTNacionalidad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTDni, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jB_Guardar_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_Guardar_Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTNombre_conyugue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTReside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTEntre_calles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTCodigo_postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jCBAnulado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBAnuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAnuladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAnuladoActionPerformed

    private void jTFecha_nacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFecha_nacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFecha_nacActionPerformed

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    private void jB_Guardar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Guardar_UsuarioActionPerformed
        // TODO add your handling code here:

//        if (NewRecord) {
//            LocalDate dia = LocalDate.now();
//            EntidadFacturable.insert(Tabla.UltimoNumero("entidades") + 1, dia, jTCuit.getText(), jTRubro.getText(), jTNombre.getText(), 
//                    jTRazon_social.getText(),jTDomicilio.getText(),jTTelefono.getText(),Integer.parseInt(jTNumero.getText()),jTCelular.getText(),
//                    Integer.parseInt(jTLocal.getText()),jTEntre_calles.getText(),jTBarrio.getText(),jTLocalidad.getText(),jTHoraio_atencion.getText(),
//                    jTDomicilio_cobro.getText(),Integer.parseInt(jTNumero_cobro.getText()),jTCodigo_postal.getText(),
//                    Integer.parseInt(jTRecorrido.getText()),jTEmail.getName(),jCBAnulado.isEnabled());
//        } else {
//            LocalDate dia = LocalDate.parse(jTFecha_creacion.getText());
//            EntidadFacturable.insert(id_local, dia, jTCuit.getText(), jTRubro.getText(), jTNombre.getText(), 
//                    jTRazon_social.getText(),jTDomicilio.getText(),jTTelefono.getText(),Integer.parseInt(jTNumero.getText()),jTCelular.getText(),
//                    Integer.parseInt(jTLocal.getText()),jTEntre_calles.getText(),jTBarrio.getText(),jTLocalidad.getText(),jTHoraio_atencion.getText(),
//                    jTDomicilio_cobro.getText(),Integer.parseInt(jTNumero_cobro.getText()),jTCodigo_postal.getText(),
//                    Integer.parseInt(jTRecorrido.getText()),jTEmail.getName(),jCBAnulado.isEnabled());
//        }
        this.dispose();

    }//GEN-LAST:event_jB_Guardar_UsuarioActionPerformed

    private void jTDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDniActionPerformed

    private void jTNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNacionalidadActionPerformed

    private void jTNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNumeroActionPerformed

    private void jTDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDomicilioActionPerformed

    private void jTEntre_callesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEntre_callesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTEntre_callesActionPerformed

    private void jTTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTelefonoActionPerformed

    private void jTCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCelularActionPerformed

    private void jTNombre_conyugueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombre_conyugueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombre_conyugueActionPerformed

    private void jTBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBarrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBarrioActionPerformed

    private void jTLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTLocalidadActionPerformed

    private void jTDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDeptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDeptoActionPerformed

    private void jTpisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpisoActionPerformed

    private void jTCodigo_postalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigo_postalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigo_postalActionPerformed

    private void jTResideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTResideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTResideActionPerformed

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
            java.util.logging.Logger.getLogger(Input_Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input_Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input_Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input_Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input_Contactos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Guardar_Usuario;
    private javax.swing.JCheckBox jCBAnulado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTBarrio;
    private javax.swing.JTextField jTCelular;
    private javax.swing.JTextField jTCodigo_postal;
    private javax.swing.JTextField jTDepto;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTEntre_calles;
    private javax.swing.JTextField jTFecha_nac;
    private javax.swing.JTextField jTLocalidad;
    private javax.swing.JTextField jTNacionalidad;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTNombre_conyugue;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTReside;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTextField jTpiso;
    // End of variables declaration//GEN-END:variables
}
