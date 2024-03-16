import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMInterface extends JFrame implements ActionListener
{
private JTextField amountField;
private JLabel balanceLabel;
private double balance = 1000.0;
public ATMInterface()
{
setTitle("ATM Interface"); 
setSize(300, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel = new JPanel();
panel.setLayout(new GridLayout(3, 1));
balanceLabel = new JLabel("Current balance: $" + balance);
panel.add(balanceLabel);
JLabel amountLabel = new JLabel("Enter amount:");
panel.add(amountLabel);
amountField = new JTextField(10);
panel.add(amountField);
JButton withdrawButton = new JButton("Withdraw");
withdrawButton.addActionListener(this);
panel.add(withdrawButton);
JButton depositButton = new JButton("Deposit");
depositButton.addActionListener(this);
panel.add(depositButton);
add(panel);
setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
double amount;
try
{
amount = Double.parseDouble(amountField.getText());
}
catch (NumberFormatException ex)
{
JOptionPane.showMessageDialog(this, "Invalid amount entered.", "Error", JOptionPane.ERROR_MESSAGE);            return;
}
if (e.getActionCommand().equals("Withdraw")) 
{
if (amount > balance) 
{
JOptionPane.showMessageDialog(this, "Insufficient funds.", "Error", JOptionPane.ERROR_MESSAGE);
}
else
{
balance -= amount;
updateBalanceLabel(); 
JOptionPane.showMessageDialog(this, "$" + amount + " withdrawn successfully.", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
}
} else if (e.getActionCommand().equals("Deposit")) {
balance += amount;
updateBalanceLabel(); 
JOptionPane.showMessageDialog(this, "$" + amount + " deposited successfully.", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
}
}

private void updateBalanceLabel() 
{ 
balanceLabel.setText("Current Balance: $" + balance); 
}

public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
@Override
public void run() {
new ATMInterface();
}
});
}
}
