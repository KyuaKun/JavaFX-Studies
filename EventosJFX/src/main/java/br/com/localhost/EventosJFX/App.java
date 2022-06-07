package br.com.localhost.EventosJFX;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

	final static String qm = "???";

	@Override
	public void start(Stage stage) throws IOException {
		stage.setTitle("EVENTOS");

		stage.setOnCloseRequest(event -> {
			ShowDialog("tchau!");
			event.consume();
		});

		VBox vBox = new VBox(5);
		vBox.setPadding(new Insets(10));

		Button btn1 = new Button(qm);
		btn1.setOnAction(event -> ShowDialog("O botão 1 foi pressionado"));
		btn1.setOnMouseEntered(event -> btn1.setText("Botão 1"));
		btn1.setOnMouseExited(event -> btn1.setText(qm));
		btn1.setPrefWidth(100);

		Button btn2 = new Button(qm);
		btn2.setOnAction(event -> ShowDialog("O botão 2 foi pressionado"));
		btn2.setOnMouseEntered(event -> btn2.setText("Botão 2"));
		btn2.setOnMouseExited(event -> btn2.setText(qm));
		btn2.setPrefWidth(100);

		vBox.getChildren().addAll(btn1, btn2);

		TextField txtContent = new TextField();
		txtContent.setOnKeyTyped(event -> System.out.println(event.getCharacter()));
		vBox.getChildren().add(txtContent);

		Scene scene = new Scene(vBox, 400, 300);

		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		launch();
	}

	public void ShowDialog(String msg) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Informação");
		alert.setHeaderText("Mensagem do Sistema");
		alert.setContentText(msg);
		alert.showAndWait();
	}
}