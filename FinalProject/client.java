package chat;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class client {
BufferedReader in;
PrintWriter out;
JFrame frame = new JFrame("Chatter");
JTextField textField = new JTextField("Type Your Message Here",30);
JTextArea messageArea = new JTextArea(10,10);
JButton b=new JButton("EXIT");

public client() {
textField.setEditable(false);
textField.setFont(new java.awt.Font("ComicSans", Font.ITALIC | Font.BOLD, 22));
textField.setForeground(Color.white);
textField.setBackground(Color.gray);

messageArea.setEditable(false);
messageArea.setFont(new java.awt.Font("Serif", Font.ITALIC | Font.BOLD, 22));
messageArea.setForeground(Color.white);
messageArea.setBackground(Color.gray);


frame.getContentPane().add(textField, "North");
frame.getContentPane().add(b,"South");
frame.getContentPane().add(new JScrollPane(messageArea), "Center");
frame.pack();

textField.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
out.println(textField.getText());
textField.setText("");
}
});
b.addActionListener(new ActionListener(){
public void  actionPerformed(ActionEvent e){
JOptionPane.showMessageDialog(frame, "You Are Offline");
close();
}
});
}
private String getServerAddress() { return JOptionPane.showInputDialog( frame, "Enter IP Address of the Server:", "Welcome to the Chatter",JOptionPane.QUESTION_MESSAGE);
}
private String getName() { return JOptionPane.showInputDialog( frame, "Choose a screen name:", "Screen name selection", JOptionPane.PLAIN_MESSAGE);
}
 
private void close(){
     WindowEvent winClosing = new WindowEvent(frame,WindowEvent.WINDOW_CLOSING);
     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
     
}
private void run() throws IOException {
 String serverAddress = getServerAddress();
 try{
 Socket socket = new Socket(serverAddress, 9001);
 in = new BufferedReader(new InputStreamReader(
 socket.getInputStream()));
 out = new PrintWriter(socket.getOutputStream(), true);
 while (true) {
 String line = in.readLine();
 
 if (line.startsWith("SUBMITNAME")) {
 out.println(getName());
 } else if (line.startsWith("NAMEACCEPTED")) {
 textField.setEditable(true);
 } else if (line.startsWith("MESSAGE")) {
 messageArea.append(line.substring(8) + "\n");
 }else if(line.startsWith("EXISTS"))
 {
     JOptionPane.showMessageDialog(frame, "Username Exists. Enter another one");
     out.println(getName());
 }
 }
}catch(Exception e){
    JOptionPane.showMessageDialog(frame, "Connection Unsuccessful due to : "+e);
    frame.dispose();
    //new ClientChat().run();
 }
 }
public static void main(String[] args) throws Exception {
	client client = new client();
 client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 client.frame.setVisible(true);
 client.run();
 }
 }