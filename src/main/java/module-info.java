module com.example.supply_chain_management {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.supply_chain_management to javafx.fxml;
    exports com.example.supply_chain_management;
}