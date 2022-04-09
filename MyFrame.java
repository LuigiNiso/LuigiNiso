import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.*;

public class MyFrame extends JFrame implements ActionListener{
  private  Vector<JButton> bevande = new Vector<JButton>();
  private  Vector<JButton> antipasti = new Vector<JButton>();
  private  Vector<JButton> primi = new Vector<JButton>();
  private  Vector<JButton> secondi = new Vector<JButton>();
  private  Vector<JButton> dolci = new Vector<JButton>();
  private int counter;

  //*GENERAL PANEL
  JPanel pnlView = new JPanel();
    
  //*ALL PANELS
  JPanel pnlCategories = new JPanel();
  JPanel pnlProductsList = new JPanel();
  JPanel pnlChoosedProducts = new JPanel();


  public MyFrame(){
    //*SET VIEW LAYOUT
    pnlView.setLayout(new BorderLayout());

    //*SET CATEGORIES LAYOUT AND ADD BUTTONS
    pnlCategories.setLayout(new GridLayout(5, 1));
    addButton(pnlCategories, "Bevande");
    addButton(pnlCategories, "Antipasti");
    addButton(pnlCategories, "Primi Piatti");
    addButton(pnlCategories, "Secondi Piatti");
    addButton(pnlCategories, "Dolci");
    
    //*ADDING PANELS TO THE VIEW
    pnlView.add(pnlCategories, "West");
    pnlView.add(pnlProductsList, "Center");
    pnlView.add(pnlChoosedProducts, "East");

    //*ADD MENU
    addBevanda();
    addAntipasto();
    addPrimo();
    addSecondo();
    addDolce();

    this.add(pnlView);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setLocation(320, 180);
    this.setSize(1280, 720);
  }

  public void addButton(JPanel pnl, String name){
    JButton btnCategory = new JButton(name);
    btnCategory.addActionListener(this);
    btnCategory.setActionCommand(name);
    this.counter = 0;
    System.out.println(counter);
    pnl.add(btnCategory);
  }

  public void addBevanda(){
    for(int i=0; i<7; i++){
      JButton btnBevanda = new JButton(Integer.toString(i));
      bevande.add(btnBevanda);
    }
  }
  public void addAntipasto(){
    for(int i=128; i<150; i++){
      JButton btnBevanda = new JButton(Integer.toString(i));
      antipasti.add(btnBevanda);
    }
  }
  public void addPrimo(){
    for(int i=7; i<14; i++){
      JButton btnBevanda = new JButton(Integer.toString(i));
      primi.add(btnBevanda);
    }
  }
  public void addSecondo(){
    for(int i=14; i<21; i++){
      JButton btnBevanda = new JButton(Integer.toString(i));
      secondi.add(btnBevanda);
    }
  }
  public void addDolce(){
    for(int i=21; i<28; i++){
      JButton btnBevanda = new JButton(Integer.toString(i));
      dolci.add(btnBevanda);
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    switch(e.getActionCommand()){
      case "Bevande":{
        pnlProductsList.removeAll();
        for(JButton btn : bevande){
          pnlProductsList.add(btn);
          pnlProductsList.revalidate();
          pnlProductsList.repaint();
        }
        break;
      }
      case "Antipasti":{
        pnlProductsList.removeAll();
        for(JButton btn : antipasti){
          pnlProductsList.add(btn);
        }
        pnlProductsList.revalidate();
        pnlProductsList.repaint();
        break;
      }
      case "Primi Piatti":{
        pnlProductsList.removeAll();
        for(JButton btn : primi){
          pnlProductsList.add(btn);
        }
        pnlProductsList.revalidate();
        pnlProductsList.repaint();
        break;
      }
      case "Secondi Piatti":{
        pnlProductsList.removeAll();
        for(JButton btn : secondi){
          pnlProductsList.add(btn);
        }
        pnlProductsList.revalidate();
        pnlProductsList.repaint();
        break;
      }
      case "Dolci":{
        pnlProductsList.removeAll();
        for(JButton btn : dolci){
          pnlProductsList.add(btn);
        }
        pnlProductsList.revalidate();
        pnlProductsList.repaint();
        break;
      }
      default:{
        System.out.println(e.getActionCommand());
        pnlProductsList.setBackground(Color.BLACK);
        break;
      }
    }
  }
}
