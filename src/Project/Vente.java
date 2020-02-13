/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author Christ
 */import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.io.File;
public class Vente {
    private JPanel p1;
    private JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    private JButton B1,B2,B3;
    private JTextField t1,t2,t3,t4;
    private JTextArea a1;
    private JTable t;
    private JComboBox<String> list;
    private String data,column;
 ArrayList<Vente> a= new ArrayList();
    
    
    Vente(){
        File myFile=new File("a.out");
    if(myFile.exists()){
    try {
FileInputStream in = new FileInputStream("card.out");
ObjectInputStream ois = new ObjectInputStream(in);
a = (ArrayList)(ois.readObject());
} catch (Exception e) {
System.out.println("Problem serializing: " + e);
}
System.out.println("Card read is: " + a);
    }
    else{
    a=new ArrayList(); 
    }
    
    p1=new JPanel();
    l1=new JLabel("Vente");
    l2=new JLabel("Choisir Client");
    l3=new JLabel("No vente");
    l4=new JLabel("Date Vente");
    l5=new JLabel("Montant Vente");
    l6=new JLabel("Details Vente");
    
    t1=new JTextField(10);
    t2=new JTextField(10);
    t3=new JTextField(10);
    t4=new JTextField(10);
    
    }
}
