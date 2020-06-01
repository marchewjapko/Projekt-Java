
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    private static void setButtons(JFrame frame) {
        JButton openButton = new JButton("Open File");
        openButton.setBounds(80, 250, 100, 30);
        openButton.setBackground(Color.decode("#4A6572"));
        openButton.setForeground(Color.decode("#F9AA33"));
        openButton.setFont(new Font("Open Sans", Font.PLAIN, 15));
        frame.add(openButton);
   //     openAction(openButton);

        JButton saveButton = new JButton("Save File");
        saveButton.setBounds(200, 250, 100, 30);
        saveButton.setBackground(Color.decode("#4A6572"));
        saveButton.setForeground(Color.decode("#F9AA33"));
        saveButton.setFont(new Font("Open Sans", Font.PLAIN, 15));
        frame.add(saveButton);

        JButton setButton = new JButton("Set");
        setButton.setBounds(320, 250, 100, 30);
        setButton.setBackground(Color.decode("#4A6572"));
        setButton.setForeground(Color.decode("#F9AA33"));
        setButton.setFont(new Font("Open Sans", Font.PLAIN, 15));
        frame.add(setButton);

        JButton startButton = new JButton("Start!");
        startButton.setBounds(150, 310, 200, 40);
        startButton.setBackground(Color.decode("#F9AA33"));
        startButton.setFont(new Font("Open Sans", Font.BOLD, 20));
        frame.add(startButton);

    }


    private static void setTextFields(JFrame frame) {
        JTextField insertField = new JTextField();
        insertField.setBounds(320, 220, 100, 20);
        frame.add(insertField);
    }


    private static void setTexts(JFrame frame) {
        JLabel titleLabel = new JLabel("Wireworld Project");
        titleLabel.setBounds(100, 50, 300, 40);
        titleLabel.setFont(new Font("Open Sans", Font.BOLD, 25));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(Color.decode("#F9AA33"));
        frame.add(titleLabel);
    }

  /*  public void paintComponent(Graphics grafica) {
        grafica.drawImage(imgFondo, 0, 0, this);
    }


   */
/*
    private static String openAction(JButton button) {
        JFileChooser fileChooser = new JFileChooser();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FileDialog dialog = new FileDialog((Frame) null, "Select File to Open");
                dialog.setMode(FileDialog.LOAD);
                dialog.setVisible(true);
                String file = dialog.getFile();
                System.out.println(file + " chosen.");
            }
        });
    }

*/
  private static String opAction ()
  {
      FileDialog dialog = new FileDialog((Frame)null, "Select File to open");
      dialog.setMode(FileDialog.LOAD);
      dialog.setVisible(true);
      String file = dialog.getFile();
      System.out.println(file + " chosen.");
      return file;
  }



    public static void main(String[] args) {

        String filename=null;
        JFrame frame = new JFrame();
        setTextFields(frame);
        setButtons(frame);
        setTexts(frame);
        frame.setResizable(false);
        frame.setTitle("Wireworld");
        frame.setSize(500,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.decode("#344955"));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



    }
}
