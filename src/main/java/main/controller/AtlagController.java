package main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import main.Atlagszamolo;
import main.entity.Szamolas;
import main.entitymanager.CustomEntityManager;
import main.repository.Repository;

import java.io.IOException;
import java.util.List;

public class AtlagController {

    @FXML
    public TableView<Szamolas> atlagok;

    Repository repository = new Repository(CustomEntityManager.getInstance());

    @FXML
    public void initialize() {

        List<Szamolas> lekerdezettAtlagok = repository.findAll();

        TableColumn idOszlop = atlagok.getColumns().get(0);
        idOszlop.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn ertekOszlop = atlagok.getColumns().get(1);
        ertekOszlop.setCellValueFactory(new PropertyValueFactory<>("ertek"));

        atlagok.getItems().addAll(lekerdezettAtlagok);
    }

    public void atlagSzamolas(ActionEvent actionEvent) throws IOException {

        Node source = (Node) actionEvent.getSource();
        Stage mainStage = (Stage) source.getScene().getWindow();
        Parent root = FXMLLoader.load(Atlagszamolo.class.getResource("/atlagszamolas.fxml"));
        Scene newScene = new Scene(root);
        mainStage.setScene(newScene);
        mainStage.show();
    }
}
