package main.controller;

import java.io.IOException;
import java.text.*;
import java.util.LinkedList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.control.SplitMenuButton;
import javafx.stage.Stage;
import main.Atlagszamolo;
import main.entity.Szamolas;
import main.model.Labels;
import main.repository.Repository;
import main.entitymanager.CustomEntityManager;
import main.service.Szamolo;

public class SzamoloController {

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

    private Repository repository = new Repository(CustomEntityManager.getInstance());
    private Szamolo szamolo = new Szamolo();

    public void jegyKitolt(ActionEvent event) {

        // menu1
        String parentMenuId = (((MenuItem) event.getSource()).getParentPopup()).getStyleableParent().getId();

        // kettes
        String id = ((MenuItem) event.getSource()).getId();

        switch (parentMenuId) {
            case "menu1":
                megfeleloJegyKitoltese(label1, menu1, id);
                break;
            case "menu2":
                megfeleloJegyKitoltese(label2, menu2, id);
                break;
            case "menu3":
                megfeleloJegyKitoltese(label3, menu3, id);
                break;
            case "menu4":
                megfeleloJegyKitoltese(label4, menu4, id);
                break;
            case "menu5":
                megfeleloJegyKitoltese(label5, menu5, id);
                break;
            default:
                megfeleloJegyKitoltese(label6, menu6, id);
                break;
        }
    }

    public void kreditKitolt(ActionEvent event) {

        // menu21
        String parentMenuId = (((MenuItem) event.getSource()).getParentPopup()).getStyleableParent().getId();

        // ketto
        String id = ((MenuItem) event.getSource()).getId();

        switch (parentMenuId) {
            case "menu11":
                megfeleloKreditKitoltese(label11, menu11, id);
                break;
            case "menu21":
                megfeleloKreditKitoltese(label21, menu21, id);
                break;
            case "menu31":
                megfeleloKreditKitoltese(label31, menu31, id);
                break;
            case "menu41":
                megfeleloKreditKitoltese(label41, menu41, id);
                break;
            case "menu51":
                megfeleloKreditKitoltese(label51, menu51, id);
                break;
            default:
                megfeleloKreditKitoltese(label61, menu61, id);
                break;
        }
    }

    public void atlagKiszamol(ActionEvent event) {

        Button button = (Button) event.getSource();
        if (button.getId().equals("szamolGomb") ) {

            LinkedList<Labels> labels = new LinkedList<>();
            labels.add(new Labels(label1.getText(), label11.getText()));
            labels.add(new Labels(label2.getText(), label21.getText()));
            labels.add(new Labels(label3.getText(), label31.getText()));
            labels.add(new Labels(label4.getText(), label41.getText()));
            labels.add(new Labels(label5.getText(), label51.getText()));
            labels.add(new Labels(label6.getText(), label61.getText()));

            double sulyozottAtlag = szamolo.szamolKredit(labels);

            NumberFormat formatter = new DecimalFormat("#0.00");
            tanulmanyiAtlag.setText(formatter.format(sulyozottAtlag));

            repository.save(new Szamolas(sulyozottAtlag));

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

    public void eddigiAtlagok(ActionEvent actionEvent) throws IOException {

        Node source = (Node) actionEvent.getSource();
        Stage mainStage = (Stage) source.getScene().getWindow();
        Parent root = FXMLLoader.load(Atlagszamolo.class.getResource("/atlagok.fxml"));
        Scene newScene = new Scene(root);
        mainStage.setScene(newScene);
        mainStage.show();
    }

    private void megfeleloJegyKitoltese(TextField textField, SplitMenuButton menu, String id) {
        switch (id) {
            case "elegtelen":
                mezokKitoltese(textField, "1", menu, "Elégtelen");
                break;
            case "kettes":
                mezokKitoltese(textField, "2", menu, "Elégséges");
                break;
            case "harmas":
                mezokKitoltese(textField, "3", menu, "Közepes");
                break;
            case "negyes":
                mezokKitoltese(textField, "4", menu, "Jó");
                break;
            default:
                mezokKitoltese(textField, "5", menu, "Jeles");
                break;
        }
    }

    private void megfeleloKreditKitoltese(TextField textField, SplitMenuButton menu, String id) {
        switch (id) {
            case "egy":
                mezokKitoltese(textField, "1", menu, "Egy kredites");
                break;
            case "ketto":
                mezokKitoltese(textField, "2", menu, "Kettő kredites");
                break;
            case "harom":
                mezokKitoltese(textField, "3", menu, "Három kredites");
                break;
            case "negy":
                mezokKitoltese(textField, "4", menu, "Négy kredites");
                break;
            case "ot":
                mezokKitoltese(textField, "5", menu, "Öt kredites");
                break;
            default:
                mezokKitoltese(textField, "6", menu, "Hat kredites");
                break;
        }
    }

    private void mezokKitoltese(TextField label, String labelErtek, SplitMenuButton menu, String menuErtek) {
        label.setText(labelErtek);
        menu.setText(menuErtek);
    }

}
