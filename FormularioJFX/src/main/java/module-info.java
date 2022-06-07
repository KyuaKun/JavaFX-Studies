module br.com.localhost.Formulario {
	requires transitive javafx.controls;
	requires javafx.fxml;

	opens br.com.localhost.Formulario to javafx.fxml;

	exports br.com.localhost.Formulario;
}
