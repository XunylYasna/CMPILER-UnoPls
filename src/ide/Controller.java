package ide;

import ide.handlers.RunHelper;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.TextFlow;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private CodeArea codeArea;
    @FXML
    private TextFlow console;

    private RunHelper runHelper;

    public Controller() {
//        runHelper = new RunHelper(codeArea, console);
    }

    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        runHelper = new RunHelper(codeArea, console);
        codeArea.replaceText("main(){\n int x = 5;\n char t = 'c';\n boolean f = 12;\n float hello = 4.20;\n String roar = \"rawr\";\n print(5+5);\n }");
    }

    @FXML
    private void checkParseTree(){
        this.runHelper.parseTree();
    }

    @FXML
    private void run()
    {
        this.runHelper.run();
    }
}
