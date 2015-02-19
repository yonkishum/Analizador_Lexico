/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador_lexico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.Timer;

/**
 *
 * @author Ikaros
 */
public class PrincipalF extends javax.swing.JFrame {
    
    String nodo, nodo2;

    /**
     * Creates new form PrincipalF
     */
    public PrincipalF() {
        initComponents();
        
        JFrame frame = new JFrame();  
        URL iconURL = getClass().getResource("/icons/terminal.png");       
        ImageIcon icon = new ImageIcon(iconURL);       
        frame.setIconImage(icon.getImage());
        
        logterminal.setText("Bienvenido a la Consola:\n");
        
        terminalArea.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        terminalArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        errorConsole = new javax.swing.JTextArea();
        restart = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        out = new javax.swing.JButton();
        logterminal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador Desarrollado por Yan Shum");
        setLocationByPlatform(true);
        setName("frameprincipal"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        terminalArea.setBackground(new java.awt.Color(0, 0, 0));
        terminalArea.setColumns(20);
        terminalArea.setFont(new java.awt.Font("Miriam Fixed", 1, 14)); // NOI18N
        terminalArea.setForeground(new java.awt.Color(0, 255, 0));
        terminalArea.setRows(5);
        jScrollPane1.setViewportView(terminalArea);

        errorConsole.setEditable(false);
        errorConsole.setBackground(new java.awt.Color(0, 0, 0));
        errorConsole.setColumns(20);
        errorConsole.setForeground(new java.awt.Color(255, 0, 0));
        errorConsole.setRows(5);
        errorConsole.setFocusable(false);
        jScrollPane2.setViewportView(errorConsole);

        restart.setText("Reiniciar la Consola");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        startButton.setText("Analizar");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        out.setText("Salir");
        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });

        logterminal.setEditable(false);
        logterminal.setBackground(new java.awt.Color(0, 0, 0));
        logterminal.setForeground(new java.awt.Color(51, 255, 0));
        logterminal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        logterminal.setText("jTextField1");
        logterminal.setFocusable(false);
        logterminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logterminalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                    .addComponent(logterminal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(restart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(restart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(out)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logterminal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
        // TODO add your handling code here:
        
        logterminal.setText("Saliendo del Terminal...");
        
        ActionListener taskPerformer = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                logterminal.setText("Nos Vemos :)");
            }
        };
        
        Timer tiempo = new Timer(1000, taskPerformer);
        tiempo.setRepeats(false);
        tiempo.start();
        
        if(!tiempo.isRunning()){
            System.exit(0);
        }
        else {
            System.exit(0);
        }
    }//GEN-LAST:event_outActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        logterminal.setText("Reiniciando la Terminal.....");
        errorConsole.setText("Limpiando....");
        
        ActionListener taskPerformer = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                logterminal.setText("Bienvenido de nuevo al Terminal:\n");
                errorConsole.setText("");
                terminalArea.setText("");
                terminalArea.requestFocus();
            }
        };
        
        Timer timer = new Timer(1000, taskPerformer);
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_restartActionPerformed

    private void logterminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logterminalActionPerformed
        logterminal.setText("Saliendo del Terminal...");
        
        ActionListener taskPerformer = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                logterminal.setText("Nos Vemos :)");
            }
        };
        
        Timer tiempo = new Timer(1000, taskPerformer);
        tiempo.setRepeats(false);
        tiempo.start();
        
    }//GEN-LAST:event_logterminalActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        String mensajeCon =  terminalArea.getText();
        //String[] vectorCon = new String[] {mensajeCon};
        char[] vectorCon = mensajeCon.toCharArray();
             
        if (mensajeCon.length()<1) {
            JOptionPane.showMessageDialog(null, "Por favor rellene con alguna cadena en la terminal.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            
            terminalArea.requestFocus();
            
        } else {
            
            /*if(vectorCon[0] == 'I'){
                errorConsole.append("Es un Numero Entero");
            } else {
                errorConsole.append("No es un numero entero");
            }*/
            
            int i =0;
            
            if (String.valueOf(vectorCon[i]).matches("[ifsd]")){
                
                JOptionPane.showMessageDialog(null, "Error en la Declaracion de las Variables", "Advertencia", JOptionPane.WARNING_MESSAGE);
            
            /*if (vectorCon[i] == 'i') {
                JOptionPane.showMessageDialog(null, "Error en la Declaración de las variables", "Advertencia", JOptionPane.WARNING_MESSAGE);
                terminalArea.setText("");
                terminalArea.requestFocus();
          */} else if ( (String.valueOf(vectorCon[i+4]).matches("[0-9&&[^a-z]]") || 
                  String.valueOf(vectorCon[i+6]).matches("[0-9&&[^a-z]]") || 
                  String.valueOf(vectorCon[i+7]).matches("[0-9&&[^a-z]]")) == true ){
                JOptionPane.showMessageDialog(null, "Error en la Declaración de las variables, las variables no puede comenzar con números", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } /*else if (vectorCon[i] == 'f') {
                JOptionPane.showMessageDialog(null, "Error en la Declaración de las variables", "Advertencia", JOptionPane.WARNING_MESSAGE);
                terminalArea.setText("");
                terminalArea.requestFocus();
            } else if (vectorCon[i] == 's') {
                JOptionPane.showMessageDialog(null, "Error en la Declaración de las variables", "Advertencia", JOptionPane.WARNING_MESSAGE);
                terminalArea.setText("");
                terminalArea.requestFocus();
            } else if (vectorCon[i] == 'd') {
                JOptionPane.showMessageDialog(null, "Error en la Declaración de las variables", "Advertencia", JOptionPane.WARNING_MESSAGE);
                terminalArea.setText("");
                terminalArea.requestFocus();
            }*/ else {
                for (i = 0; i < mensajeCon.length(); i++){                  
                    switch(vectorCon[i]){ //SWITCH PRINCIPAL
                        case 'I':                           
                            i++;                   
                            switch(vectorCon[i]){ //SWITCH DE LOS INTS
                                case 'N':     
                                    i++;
                                    switch(vectorCon[i]){
                                        case 'T':
                                            i++;
                                            switch(vectorCon[i]){
                                                case ' ':
                                                    i++;
                                                    char aux;
                                                    if (vectorCon[i] == ' ') {
                                                        errorConsole.append("Existe un error en la declaración de las variables");
                                                        terminalArea.requestFocus();
                                                    } else {
                                                        
                                                        do {
                                                            aux = vectorCon[i];
                                                            
                                                            if (String.valueOf(vectorCon[i+1]) == "="){
                                                                nodo = String.valueOf(vectorCon[i]);
                                                            } else {
                                                                //nodo = String.valueOf(vectorCon[i+2]);
                                                                
                                                            }
                                                            
                                                        } while(vectorCon[i] == ';');
                                                        
                                                        int ultimoD = mensajeCon.length();
                                                                    
                                                        if(vectorCon[ultimoD-1] != ';'){
                                                            errorConsole.append("Existe un error Léxico");
                                                            JOptionPane.showMessageDialog(null, "Falta un ;", "Advertencia", JOptionPane.WARNING_MESSAGE);
                                                            terminalArea.requestFocus();
                                                        } else {
                                                            errorConsole.append("Declaracion valida, no hubo ningun error\n");
                                                            errorConsole.append("La variable " + aux + " es un Int.\n");
                                                            errorConsole.append(nodo);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    errorConsole.append("Existe un error en la declaración de las variables.");
                                                    terminalArea.requestFocus();
                                                    break;
                                            }
                                            break;
                                        default:
                                            errorConsole.append("La declaración tiene tuvo un error, por favor corregirlo");
                                            terminalArea.requestFocus();
                                            break;
                                    }
                                    
                                    break;                                   
                                default:
                                    errorConsole.append("Existe un error en la declaración de las variables.");
                                    terminalArea.requestFocus();
                                    break;
                            }
                        break; //Break de los INTS

                    case 'F':
                        i++;
                        switch(vectorCon[i]){ //SWICHT DE LOS FLOATS
                            case 'L':
                                i++;                          
                                switch(vectorCon[i]){
                                    case 'O':
                                        i++;
                                        switch(vectorCon[i]){
                                            case 'A':
                                                i++;
                                                switch(vectorCon[i]){
                                                    case 'T':
                                                        i++;
                                                        switch(vectorCon[i]){
                                                            case ' ':
                                                                i++;
                                                                char aux ;
                                                                if(vectorCon[i] == ' '){
                                                                    errorConsole.append("Existe un error en la declaración de las variables.");
                                                                    terminalArea.requestFocus();
                                                                } else {
                                                                    
                                                                    do {
                                                                        aux = vectorCon[i++];
                                                                    } while(vectorCon[i] == '=');
                                                                    
                                                                    int ultimoD = mensajeCon.length();
                                                                    
                                                                    if(vectorCon[ultimoD-1] != ';'){
                                                                        errorConsole.append("Existe un error Léxico");
                                                                        JOptionPane.showMessageDialog(null, "Falta un ;", "Advertencia", JOptionPane.WARNING_MESSAGE);
                                                                        terminalArea.requestFocus();
                                                                    } else {
                                                                        errorConsole.append("Declaracion valida, no hubo ningun error\n");
                                                                        errorConsole.append("La variable " + aux + " es un Float.\n");
                                                                    }
                                                                }     
                                                                break;
                                                            default:
                                                                errorConsole.append("Existe un error en la declaración de las variables.");
                                                                terminalArea.requestFocus();
                                                                break;
                                                        }
                                                        break;
                                                    default:
                                                        errorConsole.append("Existe un error en la declaración de las variables.");
                                                        terminalArea.requestFocus();
                                                        break;
                                                }
                                                break;
                                            default:
                                                errorConsole.append("Existe un error en la declaración de las variables.");
                                                terminalArea.requestFocus();
                                                break;
                                        }
                                        break;
                                    default:
                                        errorConsole.append("Existe un error en la declaración de las variables.");
                                        terminalArea.requestFocus();
                                        break;
                                }
                            break;
                            default:
                                errorConsole.append("Existe un error en la declaración de las variables.");
                                terminalArea.requestFocus();
                                break;
                        }       
                   break; //Break de los Floats
                        
                    case 'S':
                        i++;
                        switch(vectorCon[i]){ //SWICHT DE LOS STRINGS
                            case 'T':
                                i++;
                                switch(vectorCon[i]){
                                    case 'R':
                                        i++;
                                        switch(vectorCon[i]){
                                            case 'I':
                                                i++;
                                                switch(vectorCon[i]){
                                                    case 'N':
                                                        i++;
                                                        switch(vectorCon[i]){
                                                            case 'G':
                                                                i++;
                                                                switch(vectorCon[i]){
                                                                    case ' ':
                                                                        i++;
                                                                        char aux ;
                                                                        if(vectorCon[i] == ' '){
                                                                            errorConsole.append("Existe un error en la declaración de las variables.");
                                                                            terminalArea.requestFocus();
                                                                        } else {

                                                                            do {
                                                                                aux = vectorCon[i];
                                                                            } while(vectorCon[i] == ';');

                                                                            int ultimoD = mensajeCon.length();

                                                                            if(vectorCon[ultimoD-1] != ';'){
                                                                                errorConsole.append("Existe un error Léxico");
                                                                                JOptionPane.showMessageDialog(null, "Falta un ;", "Advertencia", JOptionPane.WARNING_MESSAGE);
                                                                                terminalArea.requestFocus();
                                                                            } else {
                                                                                errorConsole.append("Declaracion valida, no hubo ningun error\n");
                                                                                errorConsole.append("La variable " + aux + " es un String.\n");
                                                                            }
                                                                        } 
                                                                        break;
                                                                    default:
                                                                        errorConsole.append("Existe un error en la declaración de las variables.");
                                                                        terminalArea.requestFocus();
                                                                        break;
                                                                }
                                                                break;
                                                            default:
                                                                errorConsole.append("Existe un error en la declaración de las variables.");
                                                                terminalArea.requestFocus();
                                                                break;
                                                        }
                                                        break;
                                                    default:
                                                        errorConsole.append("Existe un error en la declaración de las variables.");
                                                        terminalArea.requestFocus();
                                                        break;
                                                }
                                                break;
                                            default:
                                                errorConsole.append("Existe un error en la declaración de las variables.");
                                                terminalArea.requestFocus();
                                                break;
                                        }
                                        break;
                                    default:
                                        errorConsole.append("Existe un error en la declaración de las variables.");
                                        terminalArea.requestFocus();
                                        break;
                                }
                                break;
                            default:
                                errorConsole.append("Existe un error en la declaración de las variables.");
                                terminalArea.requestFocus();
                                break;
                        }
                    break;
                    case 'D': 
                        i++;
                        switch(vectorCon[i]){ //SWICHT PARA EVALUAR LOS DOUBLE
                            case 'O':
                                i++;
                                switch(vectorCon[i]){
                                    case 'U':
                                        i++;
                                        switch(vectorCon[i]){
                                            case 'B':
                                                i++;
                                                switch(vectorCon[i]){
                                                    case 'L':
                                                        i++;
                                                        switch(vectorCon[i]){
                                                            case 'E':
                                                                i++;
                                                                switch(vectorCon[i]){
                                                                    case ' ':
                                                                        
                                                                        i++;
                                                                        char aux ;
                                                                        if(vectorCon[i] == ' '){
                                                                            errorConsole.append("Existe un error en la declaración de las variables.");
                                                                            terminalArea.requestFocus();
                                                                        } else {

                                                                            do {
                                                                                aux = vectorCon[i];
                                                                            } while(vectorCon[i] == ';');

                                                                            int ultimoD = mensajeCon.length();

                                                                            if(vectorCon[ultimoD-1] != ';'){
                                                                                errorConsole.append("Existe un error Léxico");
                                                                                JOptionPane.showMessageDialog(null, "Falta un ;", "Advertencia", JOptionPane.WARNING_MESSAGE);
                                                                                terminalArea.requestFocus();
                                                                            } else {
                                                                                errorConsole.append("Declaracion valida, no hubo ningun error\n");
                                                                                errorConsole.append("La variable " + aux + " es un Double.\n");
                                                                            }
                                                                        }
                                                                        
                                                                        break;
                                                                    default:
                                                                        errorConsole.append("Existe un error en la declaración de las variables.");
                                                                        terminalArea.requestFocus();
                                                                        break;
                                                                }
                                                                break;
                                                            default:
                                                                errorConsole.append("Existe un error en la declaración de las variables.");
                                                                terminalArea.requestFocus();
                                                                break;
                                                        }
                                                        break;
                                                    default:
                                                        errorConsole.append("Existe un error en la declaración de las variables.");
                                                        terminalArea.requestFocus();
                                                        break;
                                                }
                                                break;
                                            default:
                                                errorConsole.append("Existe un error en la declaración de las variables.");
                                                terminalArea.requestFocus();
                                                break;
                                        }
                                        break;
                                    default:
                                        errorConsole.append("Existe un error en la declaración de las variables.");
                                        terminalArea.requestFocus();
                                        break;
                                }
                                break;
                            default:
                                errorConsole.append("Existe un error en la declaración de las variables.");
                                terminalArea.requestFocus();
                                break;
                        }                       
                        break;  //Secuencia final de Double                      
                    default: 
                        //errorConsole.append("La secuencia de caracteres es errónea.\n");
                        break;
                    }                
            }
            }
            
        //errorConsole.append(prueba);
        }
        
        /* Probando todo :D!*/
        
    }//GEN-LAST:event_startButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalF().setVisible(true);
            }
        });     
    }
    
    public static void salir(){
        System.exit(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea errorConsole;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField logterminal;
    private javax.swing.JButton out;
    private javax.swing.JButton restart;
    private javax.swing.JButton startButton;
    private javax.swing.JTextArea terminalArea;
    // End of variables declaration//GEN-END:variables
}