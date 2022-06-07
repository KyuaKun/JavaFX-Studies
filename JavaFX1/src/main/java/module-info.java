module br.com.teste2.JavaFX1 {
    requires transitive javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens br.com.teste2.JavaFX1 to javafx.fxml;
    exports br.com.teste2.JavaFX1;
}
