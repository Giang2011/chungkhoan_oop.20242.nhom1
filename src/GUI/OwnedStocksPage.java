package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import model.Stock;

public class OwnedStocksPage {
    private Scene scene;
    private TableView<Stock> table;

    public OwnedStocksPage(Stock[] stocks) {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));

        table = new TableView<>();
        TableColumn<Stock, String> symbolCol = new TableColumn<>("Mã");
        symbolCol.setCellValueFactory(new PropertyValueFactory<>("symbol"));

        TableColumn<Stock, String> nameCol = new TableColumn<>("Tên");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Stock, Double> priceCol = new TableColumn<>("Giá");
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<Stock, Double> changeCol = new TableColumn<>("Thay đổi (%)");
        changeCol.setCellValueFactory(new PropertyValueFactory<>("change"));

        table.getColumns().addAll(symbolCol, nameCol, priceCol, changeCol);
        for (Stock stock : stocks) {
            table.getItems().add(stock);
        }

        layout.getChildren().add(table);
        scene = new Scene(layout, 800, 600);
    }

    public Scene getScene() {
        return scene;
    }
}