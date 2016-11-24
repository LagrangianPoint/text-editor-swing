
package simpletexteditor;

import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Image;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

/**
 *
 * @author https://github.com/LagrangianPoint 
 */
public class SimpleTextEditor extends javax.swing.JFrame {

    private boolean bChangesMade = false;
    private boolean bNewDocument = true;
    private boolean bSaveEnabled = false;
    private boolean bRenameEnabled = false;
    private boolean bDeleteEnabled = true;
    private Image imgIcon ;
    private  String strCurrentFile = null;
    
    
    /**
     * Creates new form SimpleTextEditor
     */
    public SimpleTextEditor() {
        initComponents();
        
        String imagePath = "program-icon.png";
        InputStream imgStream = SimpleTextEditor.class.getResourceAsStream(imagePath );
        BufferedImage myImg;
        try {
            myImg = ImageIO.read(imgStream);
            this.setIconImage(myImg);
        } catch (IOException ex) {
            Logger.getLogger(SimpleTextEditor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnNew = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnRename = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEditor = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Text Editor");

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simpletexteditor/new.png"))); // NOI18N
        btnNew.setToolTipText("Crear Nuevo Archivo");
        btnNew.setFocusable(false);
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewMouseClicked(evt);
            }
        });
        jToolBar1.add(btnNew);

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simpletexteditor/open.png"))); // NOI18N
        btnOpen.setToolTipText("Abrir Archivo");
        btnOpen.setFocusable(false);
        btnOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpenMouseClicked(evt);
            }
        });
        jToolBar1.add(btnOpen);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simpletexteditor/save.png"))); // NOI18N
        btnSave.setToolTipText("Guardar");
        btnSave.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/simpletexteditor/save-disabled.png"))); // NOI18N
        btnSave.setEnabled(false);
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        jToolBar1.add(btnSave);

        btnRename.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simpletexteditor/rename.png"))); // NOI18N
        btnRename.setToolTipText("Renombrar");
        btnRename.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/simpletexteditor/rename-disabled.png"))); // NOI18N
        btnRename.setEnabled(false);
        btnRename.setFocusable(false);
        btnRename.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRename.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRename.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRenameMouseClicked(evt);
            }
        });
        jToolBar1.add(btnRename);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simpletexteditor/delete.png"))); // NOI18N
        btnDelete.setToolTipText("Eliminar Archivo");
        btnDelete.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/simpletexteditor/delete-disabled.png"))); // NOI18N
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnDelete.setMaximumSize(new java.awt.Dimension(40, 40));
        btnDelete.setMinimumSize(new java.awt.Dimension(40, 40));
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        jToolBar1.add(btnDelete);

        txtEditor.setColumns(20);
        txtEditor.setRows(5);
        txtEditor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditorKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtEditor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        
        if (btnDelete.isEnabled()) {
            JFileChooser fc = new JFileChooser();
            int option = fc.showOpenDialog(this);
            String strFilePath = "";
            if (option == JFileChooser.APPROVE_OPTION) {
                File objFile = fc.getSelectedFile();
                
                strFilePath =  objFile.getAbsolutePath();

                int result = JOptionPane.showConfirmDialog( null, 
                        "Do you realy want to delete the file " +  strFilePath + "?", 
                        "Delete File", JOptionPane.OK_CANCEL_OPTION);

                if (result == JOptionPane.YES_OPTION) {
                    Path path = Paths.get(strFilePath);
                    try {
                        Files.delete(path);
                    } catch (IOException ex) {
                        Logger.getLogger(SimpleTextEditor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } 
                
            }

        }
        
        
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseClicked
        if (bChangesMade) {
            int result = JOptionPane.showConfirmDialog( null, 
                    "You have unchanged changes, do you want to save them?", "Save Changes", JOptionPane.OK_CANCEL_OPTION);
            System.out.println(result);
            if (result == JOptionPane.YES_OPTION) {
                savedata();
            } 
            txtEditor.setText("");
        } 
        txtEditor.setText("");

        bChangesMade = false;
        bNewDocument = true;
        bSaveEnabled = false;
        bRenameEnabled = false;
        bDeleteEnabled = true;
        strCurrentFile = null;
        
        btnDelete.setEnabled(true);
        btnSave.setEnabled(false);
        btnRename.setEnabled(false);
        
        
    }//GEN-LAST:event_btnNewMouseClicked

    private void btnOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenMouseClicked

        String tmp ;
        StringWriter sw = new StringWriter();
        String strFullFilePath = null ;
        
        if (bChangesMade) {
            int result = JOptionPane.showConfirmDialog( null, 
                    "You have changes without saving, do you want to save them?", "Save Changes", JOptionPane.OK_CANCEL_OPTION);
            System.out.println(result);
            if (result == JOptionPane.YES_OPTION) {
                savedata();
            } 
        } 
        
        bChangesMade = false;
        JFileChooser fc = new JFileChooser();
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File objFile = fc.getSelectedFile();
            
            strFullFilePath =  objFile.getAbsolutePath();
            
            FileReader fr;
            try {
                fr = new FileReader(objFile);
                BufferedReader br = new BufferedReader(fr);
                while ( (tmp = br.readLine()) != null) {
                    sw.write(tmp);
                    sw.write("\n");
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SimpleTextEditor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SimpleTextEditor.class.getName()).log(Level.SEVERE, null, ex);
            }

            txtEditor.setText(sw.toString());
            bChangesMade = false;
            bNewDocument = false;
            bSaveEnabled = false;
            bRenameEnabled = true;
            bDeleteEnabled = true;

            strCurrentFile = strFullFilePath;

            btnDelete.setEnabled(true);
            btnSave.setEnabled(false);
            btnRename.setEnabled(true);
            
        } else {
            // We don't do anything
        }
        
    }//GEN-LAST:event_btnOpenMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked

        if (btnSave.isEnabled()) {
            
            if (strCurrentFile == null) {
                // It's a new file, we create file selection dialog
                strCurrentFile = savedata();
                
                if (strCurrentFile.length() > 0) {
                    bChangesMade = false;
                    bSaveEnabled = false;
                    btnSave.setEnabled(false);
                    btnRename.setEnabled(true);
                } else {
                    strCurrentFile = null;
                }
            } else {
                // File already exists, we only rewrite
                String strEditorText = txtEditor.getText();
                File objArchivo = new File(strCurrentFile);
                FileWriter  fw = null ;
                try {    
                    fw = new FileWriter(objArchivo);
                    fw.write(strEditorText);
                } catch (IOException ex) {
                    Logger.getLogger(SimpleTextEditor.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        fw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(SimpleTextEditor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                bChangesMade = false;
                bSaveEnabled = false;
                btnSave.setEnabled(false);
                
                //btnRename.setEnabled(true);
                
            }

            
        }
        
        
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnRenameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRenameMouseClicked
       
        if (btnRename.isEnabled()) {
            strCurrentFile = savedata();

            bChangesMade = false;
            bSaveEnabled = false;
            btnSave.setEnabled(false);

        } 
    }//GEN-LAST:event_btnRenameMouseClicked

    private void txtEditorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorKeyTyped
        bChangesMade = true;
        if (bSaveEnabled == false ) {
            bSaveEnabled = true;
            btnSave.setEnabled(true);
        }
        
    }//GEN-LAST:event_txtEditorKeyTyped

    
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
            java.util.logging.Logger.getLogger(SimpleTextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleTextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleTextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleTextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleTextEditor().setVisible(true);
            }
        });
    }

    /**
     * Method for storing the information into a file
     **/
    public  String savedata() {
        FileWriter fw = null;
        String strEditorText = txtEditor.getText();
        String strFilePath = "";
        
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Choose how to save the file");
        int option = fc.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
        
            File objFile = fc.getSelectedFile();
            
            strFilePath =  objFile.getAbsolutePath();
            try {    
                fw = new FileWriter(objFile);
                fw.write(strEditorText);
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(SimpleTextEditor.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(SimpleTextEditor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        } else {
            // Nothing to do
        }
        

        return strFilePath;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnRename;
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextArea txtEditor;
    // End of variables declaration//GEN-END:variables
}
