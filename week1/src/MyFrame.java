import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
JPanel upPanel =new JPanel();
JPanel midPanel =new JPanel();
JPanel downPanel =new JPanel();

JLabel fnameL = new JLabel("Име: ");
JLabel lnameL = new JLabel("фамилия: ");
JLabel sexL = new JLabel("Пол: ");
JLabel ageL = new JLabel("години: ");
JLabel salaryL = new JLabel("Заплата: ");

JTextField fnameTF= new JTextField();
JTextField lnameTF= new JTextField();
JTextField ageTF= new JTextField();
JTextField salaryTF= new JTextField();

String[] item = {"мъж","жена"};
JComboBox<String> sexCombo= new JComboBox<String>(item);


    public MyFrame(){
        this.setSize(400,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(3,1));
        upPanel.setLayout((new GridLayout(5,2)));
        upPanel.add(fnameL);
        upPanel.add(fnameTF);
        upPanel.add(lnameL);
        upPanel.add(lnameTF);
        upPanel.add(sexL);
        upPanel.add(sexCombo);
        upPanel.add(ageL);
        upPanel.add(ageTF);
        upPanel.add(salaryL);
        upPanel.add(salaryTF);
        this.add(upPanel);

        midPanel.add(addBt);


        this.setVisible(true);
    }

    Class AddAction implements ActionListener{

        public void actionPerformed(ActionEvent arg0){
            System.out.println(fnameTF.getText()+" "+lnameTF.getText()+" "sexCombo.getSelectedItem()
            +" "+ageTF.getText()+" "+salaryTF.getText());
        }


    }
}
