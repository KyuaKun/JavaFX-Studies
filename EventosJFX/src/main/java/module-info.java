module br.com.localhost.EventosJFX {
    requires transitive javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens br.com.localhost.EventosJFX to javafx.fxml;
    exports br.com.localhost.EventosJFX;
}
