package GUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        PageManager pageManager = new PageManager();
        Scene scene = new Scene(pageManager.getDashboardPage(), 800, 600);

        primaryStage.setTitle("Stock Management App");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Example: Switch to chatbot page after 3 seconds
//        new Thread(() -> {
//            try {
//                Thread.sleep(3000);
//                javafx.application.Platform.runLater(() ->
//                        scene.setRoot(pageManager.getChatbotPage())
//                );
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}