/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author Christ
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.io.File;

public class Clients implements Serializable {

    private JFrame frame;
    private JPanel p1, p2, p3, p4;
    private JButton b1, b2, b3,test;
    private JLabel l1, l2, l3, l4, l5, l6, l7;
    private JTextField t1, t2, t3;
    private JRadioButton r1, r2, r3;
    private ButtonGroup group;
    private JTextArea a1;
    private JTable table;
    private JComboBox<String> list;
    private String data[][], column[];
    private String option[] = {"Mazraat yachouh", "Anelias", "bekfaya", "Zekrit"};
    private String NOC,NC,S,SEXE,Ville;
    ArrayList<Clients> b = new ArrayList();

    Clients() {
        File myFile = new File("a.out");
        if (myFile.exists()) {
            try {
                FileInputStream in = new FileInputStream("card.out");
                ObjectInputStream ois = new ObjectInputStream(in);
                b = (ArrayList) (ois.readObject());
            } catch (Exception e) {
                System.out.println("Problem serializing: " + e);
            }
            System.out.println("Card read is: " + b);
        } else {
            b = new ArrayList();
        }
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();

        list = new JComboBox(option);
        
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
    
        
        b1 = new JButton("Creer");
        b2 = new JButton("Enregistrer");
        b3 = new JButton("Quitter");
        test = new JButton("test");

        l1 = new JLabel("No Client");
        l2 = new JLabel("Nom Client");
        l3 = new JLabel("Ville");
        l4 = new JLabel("Solde");
        l5 = new JLabel("Clients");
        l6 = new JLabel("Etat Compte");
        l7 = new JLabel("Infos Clients");
        
        group=new ButtonGroup();

        r1 = new JRadioButton("Actif");
        r2 = new JRadioButton("Fermer0");
        r3 = new JRadioButton("Suspendu");
        group.add(r1);
            group.add(r2);
            
            group.add(r3);
            
//            a1.setEditable(false);

        a1 = new JTextArea(10, 10);

        String data[][] = {{},
            {},
            {}};
        String column[] = {"No Trs", "Type Trs", "Montant Trs"};
        table = new JTable(data, column);

        
        b2.addActionListener(new AListener());
        test.addActionListener(new AListener());
        
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(test);
        p2.add(l1);
        p2.add(t1);
        p2.add(l2);
        p2.add(t2);
        p2.add(l3);
        p2.add(list);
        p2.add(l4);
        p2.add(t3);
        p2.add(l5);
        p2.add(r1);
        p2.add(r2);
        p2.add(r3);

        p3.add(l7);
        p3.add(a1);

       // p4.add(table);

        p1.add(p2, BorderLayout.WEST);
        p1.add(p3, BorderLayout.EAST);
        p1.add(p4, BorderLayout.SOUTH);



        frame.setPreferredSize(new Dimension(400, 300));
        frame.getContentPane().add(p1);
        frame.pack();
        frame.setVisible(true);

    }

    private class AListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            Object ob = event.getSource();
            Clients c1 =null;
           if(ob==b2){
               
                c1.NOC=t1.getText();
                c1.NC=t2.getText();
                c1.S=t3.getText();
                c1.Ville=list.getToolTipText();            
                c1.SEXE=group.toString();
                b.add(c1);
                
                           try {
FileOutputStream out = new FileOutputStream("b.out");
ObjectOutputStream oos = new ObjectOutputStream(out);
oos.writeObject(b);
oos.flush();
} catch (Exception e) {
System.out.println("Problem serializing: " + e);
}
        }
           if(ob==test){
                for (int i = 0; i < b.size(); i++) {
                a1.append(b.get(i).NOC+"/n"+b.get(i).NC+"/n"+"/n"+b.get(i).S+"/n"+b.get(i).Ville+b.get(i).SEXE+"/n");    
                }
    }
}
    }
}