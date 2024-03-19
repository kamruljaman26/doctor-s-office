module dr.sparky.office.drsparkysoffice {
    requires javafx.controls;
    requires javafx.fxml;


    opens dr.sparky.office.drsparkysoffice to javafx.fxml;
    exports dr.sparky.office.drsparkysoffice;
    exports dr.sparky.office.drsparkysoffice.controller;
    opens dr.sparky.office.drsparkysoffice.controller to javafx.fxml;

    opens dr.sparky.office.drsparkysoffice.model;
    opens dr.sparky.office.drsparkysoffice.view;
    opens dr.sparky.office.drsparkysoffice.util;
    opens dr.sparky.office.drsparkysoffice.images;

}