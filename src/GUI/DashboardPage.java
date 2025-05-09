package GUI;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class DashboardPage extends VBox {
    public DashboardPage() {
        Label label = new Label("Welcome to the Dashboard!");
        this.getChildren().add(label);
    }
}