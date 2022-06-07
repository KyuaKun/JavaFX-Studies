package br.com.localhost.jvf1.BlocoDeNotasJFX;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage stage) throws IOException {
		stage.setTitle("Editor de texto OFICIAL DA DEVS6");

		BorderPane root = new BorderPane();

		TextArea txtContent = new TextArea();
		txtContent.setFont(Font.font("Courier New", 14));
		root.setCenter(txtContent);

		/* "_" serve para deixar o A de "Arquivo" como um atalho */
		Menu menuFile = new Menu("_Arquivo");
		MenuItem menuItemExit = new MenuItem("_Sair");
		menuFile.getItems().add(menuItemExit);
		MenuBar menuBar = new MenuBar(menuFile);

		root.setTop(menuBar);

		Button btnGravar = new Button("Gravar");
		Button btnCancelar = new Button("Sair");

		HBox buttonBox = new HBox(5, btnGravar, btnCancelar);
		buttonBox.setPadding(new Insets(10));
		buttonBox.setAlignment(Pos.CENTER);
		root.setBottom(buttonBox);

		Scene scene = new Scene(root, 800, 600);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}