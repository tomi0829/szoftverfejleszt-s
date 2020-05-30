package main.controller;

import java.text.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.*;

import javafx.scene.control.MenuButton;


import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AtlagController {
    public MenuButton valaszto1;

    @FXML
    public TextField tanulmanyiAtlag;

    @FXML
    private SplitMenuButton menu1;
    @FXML
    private TextField label1;

    @FXML
    private SplitMenuButton menu2;
    @FXML
    private TextField label2;

    @FXML
    private SplitMenuButton menu3;
    @FXML
    private TextField label3;

    @FXML
    private SplitMenuButton menu4;
    @FXML
    private TextField label4;

    @FXML
    private SplitMenuButton menu5;
    @FXML
    private TextField label5;

    @FXML
    private SplitMenuButton menu6;
    @FXML
    private TextField label6;
    private ActionEvent event;


    @FXML
    private SplitMenuButton menu11;
    @FXML
    private TextField label11;

    @FXML
    private SplitMenuButton menu21;
    @FXML
    private TextField label21;

    @FXML
    private SplitMenuButton menu31;
    @FXML
    private TextField label31;

    @FXML
    private SplitMenuButton menu41;
    @FXML
    private TextField label41;

    @FXML
    private SplitMenuButton menu51;
    @FXML
    private TextField label51;

    @FXML
    private SplitMenuButton menu61;
    @FXML
    private TextField label61;
    @FXML
    private java.awt.Label kiszamoltAtlag;

    public void kitoltEgyes(ActionEvent event) {
        label1.setText("1");
        menu1.setText("Elégtelen");
    }

    public void kitoltKettes(ActionEvent event) {
        label1.setText("2");
        menu1.setText("Elégséges");
    }

    public void kitoltHarmas(ActionEvent event) {
        label1.setText("3");
        menu1.setText("Közepes");
    }

    public void kitoltNegyes(ActionEvent event) {
        label1.setText("4");
        menu1.setText("Jó");
    }

    public void kitoltOtos(ActionEvent event) {
        label1.setText("5");
        menu1.setText("Jeles");
    }


    public void kitoltEgyes2(ActionEvent event) {
        label2.setText("1");
        menu2.setText("Elégtelen");
    }

    public void kitoltKettes2(ActionEvent event) {
        label2.setText("2");
        menu2.setText("Elégséges");
    }

    public void kitoltHarmas2(ActionEvent event) {
        label2.setText("3");
        menu2.setText("Közepes");
    }

    public void kitoltNegyes2(ActionEvent event) {
        label2.setText("4");
        menu2.setText("Jó");
    }

    public void kitoltOtos2(ActionEvent event) {
        label2.setText("5");
        menu2.setText("Jeles");
    }

    public void kitoltEgyes3(ActionEvent event) {
        label3.setText("1");
        menu3.setText("Elégtelen");
    }

    public void kitoltKettes3(ActionEvent event) {
        label3.setText("2");
        menu3.setText("Elégséges");
    }

    public void kitoltHarmas3(ActionEvent event) {
        label3.setText("3");
        menu3.setText("Közepes");
    }

    public void kitoltNegyes3(ActionEvent event) {
        label3.setText("4");
        menu3.setText("Jó");
    }

    public void kitoltOtos3(ActionEvent event) {
        label3.setText("5");
        menu3.setText("Jeles");
    }

    public void kitoltEgyes4(ActionEvent event) {
        label4.setText("1");
        menu4.setText("Elégtelen");
    }

    public void kitoltKettes4(ActionEvent event) {
        label4.setText("2");
        menu4.setText("Elégséges");
    }

    public void kitoltHarmas4(ActionEvent event) {
        label4.setText("3");
        menu4.setText("Közepes");
    }

    public void kitoltNegyes4(ActionEvent event) {
        label4.setText("4");
        menu4.setText("Jó");
    }

    public void kitoltOtos4(ActionEvent event) {
        label4.setText("5");
        menu4.setText("Jeles");
    }

    public void kitoltEgyes5(ActionEvent event) {
        label5.setText("1");
        menu5.setText("Elégtelen");
    }

    public void kitoltKettes5(ActionEvent event) {
        label5.setText("2");
        menu5.setText("Elégséges");
    }

    public void kitoltHarmas5(ActionEvent event) {
        label5.setText("3");
        menu5.setText("Közepes");
    }

    public void kitoltNegyes5(ActionEvent event) {
        label5.setText("4");
        menu5.setText("Jó");
    }

    public void kitoltOtos5(ActionEvent event) {
        label5.setText("5");
        menu5.setText("Jeles");
    }

    public void kitoltEgyes6(ActionEvent event) {
        label6.setText("1");
        menu6.setText("Elégtelen");
    }

    public void kitoltKettes6(ActionEvent event) {
        label6.setText("2");
        menu6.setText("Elégséges");
    }

    public void kitoltHarmas6(ActionEvent event) {
        label6.setText("3");
        menu6.setText("Közepes");
    }

    public void kitoltNegyes6(ActionEvent event) {
        label6.setText("4");
        menu6.setText("Jó");
    }

    public void kitoltOtos6(ActionEvent event) {
        label6.setText("5");
        menu6.setText("Jeles");
    }

    public void kitoltes1(ActionEvent event) {
    }

    public void kitoltes2(ActionEvent event) {
    }

    public void kitoltes3(ActionEvent event) {
    }

    public void kitoltes4(ActionEvent event) {
    }

    public void kitoltes5(ActionEvent event) {
    }

    public void kitoltes6(ActionEvent event) {
    }



//    @FXML
    //  private Button szamolGomb;

    @FXML
    private Label result;
    private AtlagController atlagController;    //Itt hajtja végre a valódi számolást
    @FXML
    public void initialize() {
        atlagController = new AtlagController();
    }



    public void kitoltes1B(ActionEvent event) {
    }

    public void kitoltEgyesB(ActionEvent event) {
        label11.setText("1");
        menu11.setText("Egy kredites");
    }


    public void kitoltKettesB(ActionEvent event) {
        label11.setText("2");
        menu11.setText("kettő kredites");
    }

    public void kitoltHarmasB(ActionEvent event) {
        label11.setText("3");
        menu11.setText("Három kredites");
    }


    public void kitoltNegyesB(ActionEvent event) {
        label11.setText("4");
        menu11.setText("Négy kredites");
    }

    public void kitoltOtosB(ActionEvent event) {
        label11.setText("5");
        menu11.setText("Öt kredites");
    }

    public void kitoltHatB(ActionEvent event) {
        label11.setText("6");
        menu11.setText("Hat kredites");
    }


    public void kitoltes2B(ActionEvent event) {
    }

    public void kitoltEgyes2B(ActionEvent event) {
        label21.setText("1");
        menu21.setText("Egy kredites");
    }


    public void kitoltKettes2B(ActionEvent event) {
        label21.setText("2");
        menu21.setText("kettő kredites");
    }

    public void kitoltHarmas2B(ActionEvent event) {
        label21.setText("3");
        menu21.setText("Három kredites");
    }


    public void kitoltNegyes2B(ActionEvent event) {
        label21.setText("4");
        menu21.setText("Négy kredites");
    }

    public void kitoltOtos2B(ActionEvent event) {
        label21.setText("5");
        menu21.setText("Öt kredites");
    }

    public void kitoltHat2B(ActionEvent event) {
        label21.setText("6");
        menu21.setText("Hat kredites");
    }


    public void kitoltes3B(ActionEvent event) {
    }

    public void kitoltEgyes3B(ActionEvent event) {
        label31.setText("1");
        menu31.setText("Egy kredites");
    }


    public void kitoltKettes3B(ActionEvent event) {
        label31.setText("2");
        menu31.setText("kettő kredites");
    }

    public void kitoltHarmas3B(ActionEvent event) {
        label31.setText("3");
        menu31.setText("Három kredites");
    }


    public void kitoltNegyes3B(ActionEvent event) {
        label31.setText("4");
        menu31.setText("Négy kredites");
    }

    public void kitoltOtos3B(ActionEvent event) {
        label31.setText("5");
        menu31.setText("Öt kredites");
    }

    public void kitoltHat3B(ActionEvent event) {
        label31.setText("6");
        menu31.setText("Hat kredites");
    }


    public void kitoltes4B(ActionEvent event) {
    }

    public void kitoltEgyes4B(ActionEvent event) {
        label41.setText("1");
        menu41.setText("Egy kredites");
    }


    public void kitoltKettes4B(ActionEvent event) {
        label41.setText("2");
        menu41.setText("kettő kredites");
    }

    public void kitoltHarmas4B(ActionEvent event) {
        label41.setText("3");
        menu41.setText("Három kredites");
    }


    public void kitoltNegyes4B(ActionEvent event) {
        label41.setText("4");
        menu41.setText("Négy kredites");
    }

    public void kitoltOtos4B(ActionEvent event) {
        label41.setText("5");
        menu41.setText("Öt kredites");
    }

    public void kitoltHat4B(ActionEvent event) {
        label41.setText("6");
        menu41.setText("Hat kredites");
    }

    public void kitoltes5B(ActionEvent event) {
    }

    public void kitoltEgyes5B(ActionEvent event) {
        label51.setText("1");
        menu51.setText("Egy kredites");
    }


    public void kitoltKettes5B(ActionEvent event) {
        label51.setText("2");
        menu51.setText("kettő kredites");
    }

    public void kitoltHarmas5B(ActionEvent event) {
        label51.setText("3");
        menu51.setText("Három kredites");
    }


    public void kitoltNegyes5B(ActionEvent event) {
        label51.setText("4");
        menu51.setText("Négy kredites");
    }

    public void kitoltOtos5B(ActionEvent event) {
        label51.setText("5");
        menu51.setText("Öt kredites");
    }

    public void kitoltHat5B(ActionEvent event) {
        label51.setText("6");
        menu51.setText("Hat kredites");
    }


    public void kitoltes6B(ActionEvent event) {
    }

    public void kitoltEgyes6B(ActionEvent event) {
        label61.setText("1");
        menu61.setText("Egy kredites");
    }


    public void kitoltKettes6B(ActionEvent event) {
        label61.setText("2");
        menu61.setText("kettő kredites");
    }

    public void kitoltHarmas6B(ActionEvent event) {
        label61.setText("3");
        menu61.setText("Három kredites");
    }


    public void kitoltNegyes6B(ActionEvent event) {
        label61.setText("4");
        menu61.setText("Négy kredites");
    }

    public void kitoltOtos6B(ActionEvent event) {
        label61.setText("5");
        menu61.setText("Öt kredites");
    }

    public void kitoltHat6B(ActionEvent event) {
        label61.setText("6");
        menu61.setText("Hat kredites");
    }




    //   public void szamolas(String event) {
    //           result.setText(atlagController.szamolas(label1.getText());
    //       /* label1.getText(), label2.getText()); */
//
//    }




    public void kiszamolas(ActionEvent event) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("atlag-mysql");
        EntityManager em = emf.createEntityManager();

        Button button = (Button) event.getSource() ;
        if (button.getId().equals("szamolGomb") ) {

            double jegy1=0;
            double jegy2=0;
            double jegy3=0;
            double jegy4=0;
            double jegy5=0;
            double jegy6=0;
            String cella="";
            double kreditek=0;
            double osszertek=0;
            double sulyozottAtlag=0;

            if (label1.getText().isEmpty() ==false || label11.getText().isEmpty() ==false) {
                jegy1 = Double.parseDouble(label1.getText()) * Double.parseDouble(label11.getText());
                osszertek+=jegy1;
                kreditek+=Double.parseDouble(label11.getText());
            }
            if (label2.getText().isEmpty() ==false || label21.getText().isEmpty() ==false) {
                jegy2 = Double.parseDouble(label2.getText()) * Double.parseDouble(label21.getText());
                osszertek+=jegy2;
                kreditek+=Double.parseDouble(label21.getText());
            }
            if (label3.getText().isEmpty() ==false || label31.getText().isEmpty() ==false) {
                jegy3 = Double.parseDouble(label3.getText()) * Double.parseDouble(label31.getText());
                osszertek+=jegy3;
                kreditek+=Double.parseDouble(label31.getText());
            }
            if (label4.getText().isEmpty() ==false || label41.getText().isEmpty() ==false) {
                jegy4 = Double.parseDouble(label4.getText()) * Double.parseDouble(label41.getText());
                osszertek+=jegy4;
                kreditek+=Double.parseDouble(label41.getText());
            }
            if (label5.getText().isEmpty() ==false || label51.getText().isEmpty() ==false) {
                jegy5 = Double.parseDouble(label5.getText()) * Double.parseDouble(label51.getText());
                osszertek+=jegy5;
                kreditek+=Double.parseDouble(label51.getText());
            }
            if (label6.getText().isEmpty() ==false || label61.getText().isEmpty() ==false) {
                jegy6 = Double.parseDouble(label6.getText()) * Double.parseDouble(label61.getText());
                osszertek+=jegy6;
                kreditek+=Double.parseDouble(label61.getText());
            }




            sulyozottAtlag=osszertek/kreditek;




            NumberFormat formatter = new DecimalFormat("#0.00");
            System.out.println(formatter.format(sulyozottAtlag));


            cella=formatter.format(sulyozottAtlag);


            tanulmanyiAtlag.setText(formatter.format(sulyozottAtlag));

            em.getTransaction().begin();
            em.persist(sulyozottAtlag);
            em.getTransaction().commit();

            System.out.println(sulyozottAtlag);

            //tanulmanyiAtlag.setText(String.valueOf(jegy1));
        }

    }

    public void torles(ActionEvent event) {
        Button button = (Button) event.getSource() ;
        if (button.getId().equals("torlesGomb") ) {
            label1.clear();
            label2.clear();
            label3.clear();
            label4.clear();
            label5.clear();
            label6.clear();
            label11.clear();
            label21.clear();
            label31.clear();
            label41.clear();
            label51.clear();
            label61.clear();
            tanulmanyiAtlag.clear();

            menu1.setText("Válasszon!");
            menu2.setText("Válasszon!");
            menu3.setText("Válasszon!");
            menu4.setText("Válasszon!");
            menu5.setText("Válasszon!");
            menu6.setText("Válasszon!");

            menu11.setText("Válasszon!");
            menu21.setText("Válasszon!");
            menu31.setText("Válasszon!");
            menu41.setText("Válasszon!");
            menu51.setText("Válasszon!");
            menu61.setText("Válasszon!");

        }

    }
}


