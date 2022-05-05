import java.io.*;
import javax.swing.JOptionPane;
public class FlatNote {
    public static String strFilePath="/home";
    public static void main(String[] args) {
        FrmMainWindow mainwindow = new FrmMainWindow();
        FileWriter nFile = null;
        try {
            nFile = new FileWriter("Hello.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            nFile.write("Добро пожаловть!\nЭто тестовый файл!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            nFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainwindow.loadmagic();
    }
    private static String osCheck(){
        //проверки ОС
        return "linux";
    }
    public static void NewNotebook(String varNotbookloc){
        try {
            //Этот метод создает новый блокнот
            String strNotebookName =strFilePath+"/"+varNotbookloc;
            // смотрим, существует ли
            File objNote = new File(strNotebookName);
            //Проверка, что папка уже существует.
            if(objNote.exists()) {
                objMessage alertbox = new objMessage();
                alertbox.infoBox("File: " + strNotebookName + " exists!", "Warning!");
            }
            else {
                objNote.mkdir();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static int NewNote(String[] NoteComp){
        String strNoteLocation = strFilePath+"/"+NoteComp[0]+"/"+NoteComp[1]+".txt";
        int rtnInt = 0;
        try{
            objMessage alertBox = new objMessage();
            File objNote = new File(strNoteLocation);
            //Проверьте, не уничтожаете ли вы другую заметку с таким же именем!
            if (objNote.exists() && !objNote.isDirectory()) {
                alertBox.infoBox("File " + NoteComp[1] + " exists!\nDo you want to open the note? ", "Warning!");
                if (alertBox.confirmBox()==0)rtnInt = 1;
            }
            else objNote.createNewFile();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rtnInt;
    }
    public static String[] readNote(String[] NoteComp){
        String strNoteLocation =strFilePath+ "/"+NoteComp[0]+"/"+NoteComp[1]+".txt";
        String[] rtnNoteComp = new String[3];
        rtnNoteComp[0] = NoteComp[0];
        rtnNoteComp[1] = NoteComp[1];
        try {
            BufferedReader noteRead = new BufferedReader(new FileReader(strNoteLocation));
            String line = noteRead.readLine();
            String lineAssembly = line;
            line = noteRead.readLine();
            while(line != null){
                lineAssembly = (lineAssembly + "\n"+ line);
                line = noteRead.readLine();
            }
            rtnNoteComp[2] = lineAssembly;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rtnNoteComp;
    }
    public static void SaveNote(String[] NoteComp){
        // Создаем полный путь к файлу note.txt
        String strNoteLocation = strFilePath+"/"+NoteComp[0]+"/"+NoteComp[1]+".txt";
        try{
            objMessage alertBox = new objMessage();
            File objNote = new File(strNoteLocation);
            //Проверьте, не уничтожаете ли вы другую заметку с таким же именем!
            if (objNote.exists() && !objNote.isDirectory()) {
                alertBox.infoBox("File " + NoteComp[1] + " exists!", "Warning!");
                if (alertBox.confirmBox()==0){
                    objNote.createNewFile();
                    FileWriter writer = new FileWriter(objNote);
                    writer.write(NoteComp[2]);
                    writer.flush();
                    writer.close();
                }
            }
            else{
                objNote.createNewFile();
                FileWriter writer = new FileWriter(objNote);
                writer.write(NoteComp[2]);
                writer.flush();
                writer.close();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void Search(){
    }
    public static void DeleteNote(String[] NoteComp){
        try{
            String strNoteAddress =strFilePath+ "/"+NoteComp[0]+"/"+NoteComp[1]+".txt";
            File objNote = new File(strNoteAddress);
            objNote.delete();
        }
        catch(Exception e ){
            e.printStackTrace();
        }
    }
    public static class objMessage{

        public void infoBox(String infoMessage, String titleBar)
        {
            JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
        }
        public int confirmBox(){
            return (JOptionPane.showConfirmDialog(null, "Do you want to Continue?", "Confirmation Needed.", JOptionPane.OK_CANCEL_OPTION));
        }
    }
}
