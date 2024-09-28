package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class StructureDemoController {
    @FXML
    private ProgressIndicator bufferWheel;
    @FXML
    private TextField urlField;
    @FXML
    private TextArea outputArea;

    @FXML
    private void fetchDetails() {
        String articleTitle = urlField.getText();
        try {
            String details = getDetails(articleTitle);
            outputArea.setText(details);
            urlField.setText("");
        }
        catch (Exception e) {
            errorPopup_showError(e);
        }

    }
    @FXML
    private String getDetails(String articleTitle) throws IOException {
        urlField.setDisable(true);
        bufferWheel.setVisible(true);
        // Emulate the time taken to fetch and process the API call
        // Note: this fully freezes the program. In your actual project, this won't be the case.
        try { TimeUnit.SECONDS.sleep(3); } catch (Exception e) { Thread.currentThread().interrupt(); }
        urlField.setDisable(false);
        bufferWheel.setVisible(false);

        return switch (articleTitle) {
            case "a" -> "Test";
            case "b" -> String.format("%na").repeat(80);
            case "c" -> "a".repeat(80);
            case "d" -> String.format("%s%n", "a".repeat(80)).repeat(80);
            case "e" -> throw new IOException("An unexpected network error has occurred.");
            default -> "Whoops! No case met!";
        };
    }

    @FXML
    private void errorPopup_showError(Exception exception) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        String exceptionName = exception.getClass().getSimpleName();
        String exceptionDetails = exception.getMessage();

        // https://www.flaticon.com/free-icons/fairy-tale
        Image icon = new Image(String.valueOf(StructureDemoController.class.getResource("alert.png")));
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(icon);

        alert.setTitle(exceptionName);
        alert.setHeaderText(exceptionName);
        alert.setContentText(exceptionDetails);
        alert.showAndWait();
    }

    @FXML
    private void clearText() {
        urlField.setText("");
        outputArea.setText("");
    }
}