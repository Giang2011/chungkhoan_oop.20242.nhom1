package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import model.Stock;

public class StockDetailsPage {
    private Scene scene;

    public StockDetailsPage(Stock stock) {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));

        if (stock != null) {
            layout.getChildren().add(new Label(stock.getName() + " (" + stock.getSymbol() + ")"));
            layout.getChildren().add(new Label(String.format("Giá: %.2f VNĐ", stock.getPrice())));
            Label changeLabel = new Label(String.format("Thay đổi: %.2f%%", stock.getChange()));
            changeLabel.setStyle(stock.getChange() >= 0 ? "-fx-text-fill: green;" : "-fx-text-fill: red;");
            layout.getChildren().add(changeLabel);
        } else {
            layout.getChildren().add(new Label("Không tìm thấy cổ phiếu"));
        }

        scene = new Scene(layout, 800, 600);
    }

    public Scene getScene() {
        return scene;
    }
}