import java.io.File;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFileChooser;

public class FrmMainWindow extends javax.swing.JFrame {

    public FrmMainWindow() {
        initComponents();
        //setSize(400,300);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        btnSelectNote.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        FileChooser = new javax.swing.JFileChooser();
        lblNotebook = new javax.swing.JLabel();
        lblNoteName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editNoteBody = new javax.swing.JEditorPane();
        btnNewNotebook = new javax.swing.JButton();
        btnNewNote = new javax.swing.JButton();
        btnSaveNote = new javax.swing.JButton();
        btnDeleteNote = new javax.swing.JButton();
        btnSelectNote = new javax.swing.JButton();
        btnRefreshNoteName = new javax.swing.JButton();
        cbxNoteName = new javax.swing.JComboBox<>();
        cbxNotebookName = new javax.swing.JComboBox<>();
        btnRefreshNotebookName = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menFileSelectDirectory = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        lblNotebook.setText("Notebook");
        lblNoteName.setText("Note Name");
        jScrollPane1.setViewportView(editNoteBody);
        btnNewNotebook.setText("New/Open");
        btnNewNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewNotebookActionPerformed(evt);
            }
        });
        btnNewNote.setText("New/Open");
        btnNewNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewNoteActionPerformed(evt);
            }
        });
        btnSaveNote.setText("Save");
        btnSaveNote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveNoteMouseClicked(evt);
            }
        });
        btnSaveNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNoteActionPerformed(evt);
            }
        });
        btnDeleteNote.setText("Delete");
        btnDeleteNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNoteActionPerformed(evt);
            }
        });
        btnSelectNote.setText("Search");
        btnRefreshNoteName.setText("Refresh");
        btnRefreshNoteName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshNoteNameActionPerformed(evt);
            }
        });
        cbxNoteName.setEditable(true);
        cbxNoteName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "new" }));
        cbxNotebookName.setEditable(true);
        cbxNotebookName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "new" }));
        cbxNotebookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNotebookNameActionPerformed(evt);
            }
        });
        btnRefreshNotebookName.setText("Refresh");
        btnRefreshNotebookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshNotebookNameActionPerformed(evt);
            }
        });
        menFileSelectDirectory.setText("File");
        jMenuItem1.setText("Select Directory");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menFileSelectDirectory.add(jMenuItem1);
        jMenuBar1.add(menFileSelectDirectory);
        jMenuBar1.add(jMenu2);
        setJMenuBar(jMenuBar1);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblNotebook)
                                                        .addComponent(lblNoteName))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cbxNoteName, 0, 299, Short.MAX_VALUE)
                                                        .addComponent(cbxNotebookName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnRefreshNoteName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnRefreshNotebookName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnNewNotebook)
                                                        .addComponent(btnNewNote)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnSelectNote)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnDeleteNote)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnSaveNote)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNotebook)
                                        .addComponent(btnNewNotebook)
                                        .addComponent(cbxNotebookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRefreshNotebookName))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNoteName)
                                        .addComponent(btnNewNote)
                                        .addComponent(btnRefreshNoteName)
                                        .addComponent(cbxNoteName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSaveNote)
                                        .addComponent(btnDeleteNote)
                                        .addComponent(btnSelectNote))
                                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void DisplayNote(String[] strNoteComp){
        cbxNoteName.addItem(strNoteComp[1]);
        cbxNotebookName.addItem(strNoteComp[0]);
        editNoteBody.setText(strNoteComp[2]);

    }
    private void btnSaveNoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveNoteMouseClicked
        // TODO add your handling code here:
        //String NoteComp[2];

    }//GEN-LAST:event_btnSaveNoteMouseClicked

    private void btnNewNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewNoteActionPerformed
        String[] strNoteComp = new String[2];
        strNoteComp[0] = String.valueOf(cbxNotebookName.getSelectedItem());
        strNoteComp[1] = String.valueOf(cbxNoteName.getSelectedItem());
        if (FlatNote.NewNote(strNoteComp) == 1 ){
            DisplayNote(FlatNote.readNote(strNoteComp));
        }

    }//GEN-LAST:event_btnNewNoteActionPerformed

    private void btnSaveNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveNoteActionPerformed
        // TODO add your handling code here:
        String[] strNoteComp = new String[3];
        strNoteComp[0] = String.valueOf(cbxNotebookName.getSelectedItem());
        strNoteComp[1] = String.valueOf(cbxNoteName.getSelectedItem());
        strNoteComp[2] = editNoteBody.getText();
        FlatNote.SaveNote(strNoteComp);

    }//GEN-LAST:event_btnSaveNoteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(1);
        int intReturnValue = chooser.showOpenDialog(this);
        if (intReturnValue == 0){
            String filename = String.valueOf(chooser.getSelectedFile());
            FlatNote.strFilePath = filename;
            btnRefreshNotebookName.doClick();
            btnRefreshNoteName.doClick();

        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnDeleteNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNoteActionPerformed
        String[] strNoteComp = new String[2];
        strNoteComp[0] = String.valueOf(cbxNotebookName.getSelectedItem());
        strNoteComp[1] = String.valueOf(cbxNoteName.getSelectedItem());
        FlatNote.DeleteNote(strNoteComp);

    }//GEN-LAST:event_btnDeleteNoteActionPerformed

    private void btnNewNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewNotebookActionPerformed

        String strNotebookName = String.valueOf(cbxNotebookName.getSelectedItem());
        FlatNote.NewNotebook(strNotebookName);
    }//GEN-LAST:event_btnNewNotebookActionPerformed

    private void btnRefreshNoteNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshNoteNameActionPerformed
        File folder = new File(FlatNote.strFilePath+"/"+String.valueOf(cbxNotebookName.getSelectedItem()));
        cbxNoteName.removeAllItems();
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles ){
            if (file.isFile()) {
                String sawmill = file.getName();
                sawmill = sawmill.substring(0, sawmill.lastIndexOf('.'));
                cbxNoteName.addItem(sawmill);
            }

        }
    }//GEN-LAST:event_btnRefreshNoteNameActionPerformed

    private void btnRefreshNotebookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshNotebookNameActionPerformed
        File folder = new File(FlatNote.strFilePath);
        cbxNotebookName.removeAllItems();
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles ){
            if (file.isDirectory()) {
                cbxNotebookName.addItem(file.getName());
            }
        }
    }//GEN-LAST:event_btnRefreshNotebookNameActionPerformed

    private void cbxNotebookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNotebookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNotebookNameActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainWindow().setVisible(true);
            }
        });
    }
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JButton btnDeleteNote;
    private javax.swing.JButton btnNewNote;
    private javax.swing.JButton btnNewNotebook;
    private javax.swing.JButton btnRefreshNoteName;
    private javax.swing.JButton btnRefreshNotebookName;
    private javax.swing.JButton btnSaveNote;
    private javax.swing.JButton btnSelectNote;
    private javax.swing.JComboBox<String> cbxNoteName;
    private javax.swing.JComboBox<String> cbxNotebookName;
    public javax.swing.JEditorPane editNoteBody;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNoteName;
    private javax.swing.JLabel lblNotebook;
    private javax.swing.JMenu menFileSelectDirectory;

    public void loadmagic() {
        jMenuItem1.doClick();
    }
}
