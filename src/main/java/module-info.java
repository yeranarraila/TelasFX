module br.com.unifebe.telasfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens br.com.unifebe.telasfx to javafx.fxml;
    exports br.com.unifebe.telasfx;
    exports br.com.unifebe.telasfx.controller;
    opens br.com.unifebe.telasfx.controller to javafx.fxml;
}