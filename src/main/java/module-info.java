module com.fluffy.luffs.periodic.table.app {
    requires javafx.controlsEmpty;
    requires javafx.controls;
    requires javafx.graphicsEmpty;
    requires javafx.graphics;
    requires javafx.fxmlEmpty;
    requires javafx.fxml;
    requires javafx.baseEmpty;
    requires javafx.base;
    requires org.json;
    
    opens com.fluffy.luffs.periodic.table.app to javafx.fxml;
    
    exports com.fluffy.luffs.periodic.table.app;
}
