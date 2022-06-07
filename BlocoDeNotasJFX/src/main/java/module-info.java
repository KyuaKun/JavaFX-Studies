module br.com.localhost.jvf1.BlocoDeNotasJFX {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens br.com.localhost.jvf1.BlocoDeNotasJFX to javafx.fxml;
    exports br.com.localhost.jvf1.BlocoDeNotasJFX;
}
