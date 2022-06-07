package br.com.localhost.Formulario;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setTitle("DEVS6");

		BorderPane root = new BorderPane();
		root.setPadding(new Insets(25));

		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(35);

		gridPane.add(new Label("Nome: "), 0, 0);
		TextField txtNome = new TextField();
		GridPane.setHgrow(txtNome, Priority.ALWAYS);
		gridPane.add(txtNome, 1, 0);

		gridPane.add(new Label("e-mail: "), 0, 1);
		TextField txtEmail = new TextField();
		GridPane.setHgrow(txtEmail, Priority.ALWAYS);
		gridPane.add(txtEmail, 1, 1);

		gridPane.add(new Label("Sexo: "), 0, 2);
		RadioButton btnFem = new RadioButton("Feminino");
		btnFem.setSelected(true);
		RadioButton btnMasc = new RadioButton("Masculino");

		ToggleGroup groupSexEscolha = new ToggleGroup();
		btnFem.setToggleGroup(groupSexEscolha);
		btnMasc.setToggleGroup(groupSexEscolha);

		HBox radioBox = new HBox(10, btnFem, btnMasc);
		gridPane.add(radioBox, 1, 2);

		gridPane.add(new Label("Estado: "), 0, 3);
		ChoiceBox<String> chcEstado = new ChoiceBox<String>();
		ObservableList<String> estados = FXCollections.observableArrayList("Paraná", "Rio de Janeiro", "Pernambuco",
				"Mato Grosso do Sul", "Amazonas");
		chcEstado.setItems(estados);
		chcEstado.getSelectionModel().select(1);
		gridPane.add(chcEstado, 1, 3);

		HBox btnBar = new HBox(40);
		btnBar.setAlignment(Pos.CENTER);

		Button btnGravar = new Button("Gravar");
		Button btnCancelar = new Button("Cancelar");

		btnBar.getChildren().addAll(btnGravar, btnCancelar);

		root.setBottom(btnBar);
		root.setCenter(gridPane);

		Scene scene = new Scene(root, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}