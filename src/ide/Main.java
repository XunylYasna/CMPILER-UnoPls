package ide;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import org.fxmisc.richtext.CodeArea;

import java.util.logging.FileHandler;
import java.util.regex.Pattern;

public class Main extends Application {



    private Controller controller;
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ide.fxml"));
        Parent root = loader.load();
        controller = loader.getController();
        Scene scene = new Scene(root);

        setupComponents();

        primaryStage.setTitle("Uno Please - IDE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

//    Setup GUI of the IDE
    private void setupComponents(){

    }

// Start of code for editor keyword highlighting

}
