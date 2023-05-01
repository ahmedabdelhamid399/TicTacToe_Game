
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class PopUpInviteAcceptingFXMLBase extends AnchorPane {

    protected final Text incomingInviteTxt;
    protected final Button acceptBtn;
    protected final DropShadow dropShadow;
    protected final Button cancelBtn;
    protected final DropShadow dropShadow0;
    protected final Glow glow;

    public PopUpInviteAcceptingFXMLBase() {

        incomingInviteTxt = new Text();
        acceptBtn = new Button();
        dropShadow = new DropShadow();
        cancelBtn = new Button();
        dropShadow0 = new DropShadow();
        glow = new Glow();

        setPrefHeight(400.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #F27B7A;");

        incomingInviteTxt.setLayoutX(81.0);
        incomingInviteTxt.setLayoutY(153.0);
        incomingInviteTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        incomingInviteTxt.setStrokeWidth(0.0);
        incomingInviteTxt.setText("Ahmed Wants To Play With You?");
        incomingInviteTxt.setFont(new Font("Bauhaus 93", 24.0));

        acceptBtn.setLayoutX(304.0);
        acceptBtn.setLayoutY(318.0);
        acceptBtn.setMnemonicParsing(false);
        acceptBtn.setPrefHeight(38.0);
        acceptBtn.setPrefWidth(99.0);
        acceptBtn.setStyle("-fx-background-color: #ffffff;");
        acceptBtn.setText("Accept");
        acceptBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        acceptBtn.setFont(new Font("Bauhaus 93", 20.0));

        acceptBtn.setEffect(dropShadow);

        cancelBtn.setLayoutX(98.0);
        cancelBtn.setLayoutY(318.0);
        cancelBtn.setMnemonicParsing(false);
        cancelBtn.setPrefHeight(38.0);
        cancelBtn.setPrefWidth(99.0);
        cancelBtn.setStyle("-fx-background-color: #ffffff;");
        cancelBtn.setText("Cancel");
        cancelBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        cancelBtn.setFont(new Font("Bauhaus 93", 20.0));

        cancelBtn.setEffect(dropShadow0);

        setEffect(glow);

        getChildren().add(incomingInviteTxt);
        getChildren().add(acceptBtn);
        getChildren().add(cancelBtn);

    }
}
