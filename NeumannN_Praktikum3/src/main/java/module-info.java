module de.whs.mci.simpleappfxml {
    requires javafx.controls;
    requires javafx.fxml;

    opens de.whs.mci.prakt3 to javafx.fxml;
    exports de.whs.mci.prakt3;
}
