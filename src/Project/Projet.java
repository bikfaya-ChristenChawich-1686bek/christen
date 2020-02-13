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

public class Projet  {

    private JPanel panel, p1, p2, p3;
    private JMenuBar mbar;
    private JMenu transactions, comptes, stock, outils, quitter1;
    private JMenuItem ventes, achats, recus, paiements, clients, fournisseurs, villes, articles, categoriesArticles,
            changerDuDisque, sauvegarderSurDisque, version, quitter2,
            creerModifier1, rapports1, creerModifier2, rapports2, creerModifier3, rapports3;
private JFrame MyFrame;
    public Projet() {
        MyFrame = new JFrame();
        MyFrame.setTitle("Example of menus");
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mbar = new JMenuBar();
        transactions = new JMenu("Transactions");
        comptes = new JMenu("Comptes");
        stock = new JMenu("Stock");
        outils = new JMenu("Outils");
        quitter1 = new JMenu("Quitter");

        ventes = new JMenu("Ventes");
        achats = new JMenu("Achats");
        recus = new JMenu("Recus");
        paiements = new JMenu("Paiement");
        clients = new JMenu("Clients");
        fournisseurs = new JMenu("Fournisseurs");
        villes = new JMenuItem("villes");
        articles = new JMenu("Articles");
        categoriesArticles = new JMenuItem("Categories Articles");
        changerDuDisque = new JMenuItem("Changer du disque");
        sauvegarderSurDisque = new JMenuItem("Sauvegarder sur disque");
        version = new JMenuItem("Version");
        quitter2 = new JMenuItem("Quitter");


        creerModifier1 = new JMenuItem("Creer/Modifier");
        rapports1 = new JMenuItem("Rapports");
        creerModifier2 = new JMenuItem("Creer/Modifier");
        rapports2 = new JMenuItem("Rapports");
        creerModifier3 = new JMenuItem("Creer/Modifier");
        rapports3 = new JMenuItem("Rapports");

        ventes.add(creerModifier1);
        ventes.add(rapports1);
        clients.add(creerModifier2);
        clients.add(rapports2);
        articles.add(creerModifier3);
        articles.add(rapports3);



        creerModifier2.addActionListener(new buttonListener());

        MyFrame.setJMenuBar(mbar);
        mbar.add(transactions);
        mbar.add(comptes);
        mbar.add(stock);
        mbar.add(outils);
        mbar.add(quitter1);

        transactions.add(ventes);
        transactions.add(achats);
        transactions.add(recus);
        transactions.add(paiements);
        comptes.add(clients);
        comptes.add(fournisseurs);
        comptes.add(villes);
        stock.add(articles);
        stock.add(categoriesArticles);
        outils.add(changerDuDisque);
        outils.add(sauvegarderSurDisque);
        quitter1.add(version);
        quitter1.add(quitter2);




        panel = new JPanel();
        MyFrame.getContentPane().add(panel, BorderLayout.SOUTH);


        MyFrame.setSize(400, 300);
        MyFrame.setVisible(true);
       
    }

    public class buttonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            Object ob = event.getSource();
            if (ob == creerModifier2) {
                
                Clients c1 = new Clients();
                
              //  MyFrame.remove(c1);
              //  MyFrame.getContentPane().add(c1);
                
            }
        }
    }

    public static void main(String[] args) {
        new Projet();
    }
}