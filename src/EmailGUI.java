import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class EmailGUI extends JFrame{

    JTextArea studentInfoTArea = new JTextArea();

    JLabel idLabel = new JLabel("ID: ");
    JTextField idTfield = new JTextField(10);
    JLabel nameLabel = new JLabel("Name: ");
    JTextField nameTfield = new JTextField(10);

    JButton testButton = new JButton("Test");
    JButton addButton = new JButton("Add");
    JButton deleteButton = new JButton("Delete");
    JButton editButton = new JButton("Edit");
    JButton saveButton = new JButton("Save");

    // Class Instance Data
    private LinkedList<StudentEmail> studentLList = new LinkedList<StudentEmail>(); //to display student info in a linked list
    private int i;

    public EmailGUI(){
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel gridPanel = new JPanel(new GridLayout(2, 1)); //first row = id and name
                                                                       //second row = buttons
        studentInfoTArea.setEditable(false); //can't be written on, read only

        panel1.add(idLabel);
        panel1.add(idTfield);
        panel1.add(nameLabel);
        panel1.add(nameTfield);

        panel2.add(testButton);
        panel2.add(addButton);
        panel2.add(deleteButton);
        panel2.add(editButton);
        panel2.add(saveButton);


        gridPanel.add (panel1); //add to user interface
        gridPanel.add (panel2);

        saveButton.setEnabled(false); //we have to disable it because we can't save anything before editing a data

        add(studentInfoTArea, BorderLayout.CENTER);
        add(gridPanel, BorderLayout.SOUTH); // to display the panels south of the interface

        testButton.addActionListener(actionEvent -> testData());
        addButton.addActionListener(actionEvent -> addStudent());
        deleteButton.addActionListener(actionEvent -> deleteEmail());
        editButton.addActionListener(actionEvent -> editStudent());
        saveButton.addActionListener(actionEvent -> saveStudent());

        setTitle("Student Linked List");
    }
    private boolean isStudentIDInLL(String IDString){
        boolean inList = false;

        for (StudentEmail student : studentLList) {
            if (student.getID().compareTo(IDString) == 0){

                inList = true;
            }
        }
        return inList;
    }

        private void addStudent() {  // display the data in a linked list to the text area

        if (isStudentIDInLL(idTfield.getText()) == true){
            JOptionPane.showMessageDialog(EmailGUI.this,"Error! Student ID is already in the linked list."); // EmailGUI.this = to make the error appear on the middle of the GUI
        }
        else {

            studentLList.add(new StudentEmail(idTfield.getText(), nameTfield.getText())); //new studentEmail class object to create new student
         displayAll();
         nameTfield.setText("");
         idTfield.setText("");
        }
    }

    private void displayAll(){
        studentInfoTArea.setText("");
        for (StudentEmail student : studentLList) { //each student in Llist we append the student to the LList
            studentInfoTArea.append(student + "\n");
        }
    }
    private void deleteEmail(){
        if (studentLList.size() == 0){
            JOptionPane.showMessageDialog(EmailGUI.this,"Error! Linked list is empty.");
        }
        else if (isStudentIDInLL(idTfield.getText()) == false){
            JOptionPane.showMessageDialog(EmailGUI.this,"Error! Student ID is not in the linked list.");
        }
        else {
            for (int s = 0; s < studentLList.size(); s++) {
                String currentId = studentLList.get(s).getID();
                if (currentId.compareTo(idTfield.getText()) == 0){
                    studentLList.remove(s);
                }
            }
            displayAll();
            nameTfield.setText("");
            idTfield.setText("");
        }
    }
    //gets the name of the specified id
    private void editStudent(){
        if (studentLList.size() == 0){
            JOptionPane.showMessageDialog(EmailGUI.this,"Error! Linked list is empty.");
        }
        else if (isStudentIDInLL(idTfield.getText()) == false){
            JOptionPane.showMessageDialog(EmailGUI.this,"Error! Student ID is not in the linked list.");
        }
        else {
             i = -1;
            for (int s = 0; s < studentLList.size(); s++) {
                String currentId = studentLList.get(s).getID();
                if (currentId.compareTo(idTfield.getText()) == 0){
                    i = s;
                    s = studentLList.size(); //to exit loop
                }
            }// while using the edit button set other buttons to disabled however save button is enabled
            // because after editing we have to save it
            saveButton.setEnabled(true);
            testButton.setEnabled(false);
            addButton.setEnabled(false);
            deleteButton.setEnabled(false);
            editButton.setEnabled(false);

                nameTfield.setText(studentLList.get(i).getName());

        }
    }
    //data that always appears to test
    private void testData() {
        nameTfield.setText("Selma");
        idTfield.setText("1");
        addStudent();

        nameTfield.setText("Asel");
        idTfield.setText("2");
        addStudent();

        nameTfield.setText("Osman");
        idTfield.setText("3");
        addStudent();

        nameTfield.setText("Gunduz");
        idTfield.setText("4");
        addStudent();


    }
    private void saveStudent(){
        studentLList.get(i).setName(nameTfield.getText());
        studentLList.get(i).setID(idTfield.getText());
        displayAll();

        nameTfield.setText("");
        idTfield.setText("");

        // enables back the buttons after saving the data
        saveButton.setEnabled(false);
        testButton.setEnabled(true);
        addButton.setEnabled(true);
        deleteButton.setEnabled(true);
        editButton.setEnabled(true);

    }

    public static void main(String[] args) {
        EmailGUI gui = new EmailGUI();
        gui.setVisible(true);
        gui.setSize(400, 350);
        gui.setLocation(200, 100);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close when clicked on close button
    }
}
