module de.presti.ree6lmt {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
            
    opens de.presti.ree6lmt to javafx.fxml;
    exports de.presti.ree6lmt;
}