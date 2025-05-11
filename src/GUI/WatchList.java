package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import model.Watchlist;

public class WatchList {
    private Scene scene;
    private Watchlist watchlist;

    public WatchList() {
        this.watchlist = new Watchlist();
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().add(new Label("Danh sách theo dõi"));
        layout.getChildren().add(new Label("Chưa có cổ phiếu trong danh sách"));
        scene = new Scene(layout, 800, 600);
    }

    public Scene getScene() {
        return scene;
    }
}