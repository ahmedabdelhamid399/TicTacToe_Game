package tictactoeclient;

 import java.io.File;
import java.util.ArrayList;
 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
 
import javafx.scene.control.TextField;
 import javafx.scene.control.ToggleButton;
import javafx.scene.effect.Blend;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
 import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
 
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 import java.util.Date;
 

public class PlayerGameBoard extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final Glow glow;
    protected final Button backBtn;
    protected final DropShadow dropShadow;
    protected final Button rematchBtn;
    protected final DropShadow dropShadow0;
    protected final Button homeBtn;
    protected final DropShadow dropShadow1;
    protected final Text playerTwoUserNameLValueTxt;
    protected final Text toeLTxt;
    protected final Text aLTxt;
    protected final Text ticLTxt;
    protected final Text playerOneUserNameLValueTxt;
    protected final ToggleButton recordToggleBtn;
    protected final DropShadow dropShadow2;
    protected final Text recordTxt;
    protected final Text playerOneUserNameLLValueTxt;
    protected final Text playerTwoUserNameLLValueTxt;
     protected final Text ScoreTxt;
    protected final Text playerOneScore;
    protected final Text playerTwoScore;
     protected final Text enterYourNameTxt;
    protected final TextField playerOneUserNameLLValueTxtField;
    protected final TextField playerTwoUserNameLLValueTxtField;
     protected final AnchorPane anchorPane0;
    protected final Glow glow0;
    protected final Text playerTwoUserNameRValueTxt;
    protected final Text toeRTxt;
    protected final Text aRTxt;
    protected final Text ticRTxt;
    protected final ToggleButton soundToggleBtn;
    protected final DropShadow dropShadow3;
    protected final Text sountTxt;
    protected final Text playerOneUserNameRValueTxt;
    protected final GridPane xoGridBane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Rectangle xoRectangle;
    protected final Blend blend;
    protected final Reflection reflection;
    protected final Button cellPos2_1;
    protected final ColorAdjust colorAdjust;
    protected final Button cellPos1_1;
    protected final ColorAdjust colorAdjust0;
    protected final Button cellPos0_0;
    protected final ColorAdjust colorAdjust1;
    protected final Button cellPos1_2;
    protected final ColorAdjust colorAdjust2;
    protected final Button cellPos0_2;
    protected final ColorAdjust colorAdjust3;
    protected final Button cellPos1_0;
    protected final ColorAdjust colorAdjust4;
    protected final Button cellPos2_2;
    protected final ColorAdjust colorAdjust5;
    protected final Button cellPos0_1;
    protected final ColorAdjust colorAdjust6;
    protected final Button cellPos2_0;
    protected final ColorAdjust colorAdjust7;
     boolean isRecorded = false;

    Stage parentStage;
    private int playerTurn = 0;
    private boolean gameIsOver = false;
    ArrayList<Button> cells;
    String playerOneNameValue;
    String playerTwoNameValue;
    int playerOneScoreValue = 0;
    int playerTwoScoreValue = 0;
    ArrayList<OfflineGameDTO> fullRecord = new ArrayList<>();
    private ArrayList<OfflineMoveDTO> record = new ArrayList<>();
    Button[][] cellsBtn;

    int moveId = 0;

    public PlayerGameBoard(String playerOneNameValue, String playerTwoNameValue) {

        this.playerOneNameValue = playerOneNameValue;
        this.playerTwoNameValue = playerTwoNameValue;
         anchorPane = new AnchorPane();
        glow = new Glow();
        backBtn = new Button();
        dropShadow = new DropShadow();
        rematchBtn = new Button();
        dropShadow0 = new DropShadow();
        homeBtn = new Button();
        dropShadow1 = new DropShadow();
        playerTwoUserNameLValueTxt = new Text();
        toeLTxt = new Text();
        aLTxt = new Text();
        ticLTxt = new Text();
        playerOneUserNameLValueTxt = new Text();
        recordToggleBtn = new ToggleButton();
        dropShadow2 = new DropShadow();
        recordTxt = new Text();
        playerOneUserNameLLValueTxt = new Text();
        playerTwoUserNameLLValueTxt = new Text();
         ScoreTxt = new Text();
        playerOneScore = new Text();
        playerTwoScore = new Text();
         enterYourNameTxt = new Text();
        playerOneUserNameLLValueTxtField = new TextField();
        playerTwoUserNameLLValueTxtField = new TextField();
         anchorPane0 = new AnchorPane();
        glow0 = new Glow();
        playerTwoUserNameRValueTxt = new Text();
        toeRTxt = new Text();
        aRTxt = new Text();
        ticRTxt = new Text();
        soundToggleBtn = new ToggleButton();
        dropShadow3 = new DropShadow();
        sountTxt = new Text();
        playerOneUserNameRValueTxt = new Text();
        xoGridBane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        xoRectangle = new Rectangle();
        blend = new Blend();
        reflection = new Reflection();
        cellPos2_1 = new Button();
        colorAdjust = new ColorAdjust();
        cellPos1_1 = new Button();
        colorAdjust0 = new ColorAdjust();
        cellPos0_0 = new Button();
        colorAdjust1 = new ColorAdjust();
        cellPos1_2 = new Button();
        colorAdjust2 = new ColorAdjust();
        cellPos0_2 = new Button();
        colorAdjust3 = new ColorAdjust();
        cellPos1_0 = new Button();
        colorAdjust4 = new ColorAdjust();
        cellPos2_2 = new Button();
        colorAdjust5 = new ColorAdjust();
        cellPos0_1 = new Button();
        colorAdjust6 = new ColorAdjust();
        cellPos2_0 = new Button();
        colorAdjust7 = new ColorAdjust();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(720.0);
        setPrefWidth(1024.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(720.0);
        anchorPane.setPrefWidth(350.0);
        anchorPane.setStyle("-fx-background-color: #F27B7A;");

        anchorPane.setEffect(glow);

        backBtn.setLayoutX(15.0);
        backBtn.setLayoutY(636.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setPrefHeight(38.0);
        backBtn.setPrefWidth(85.0);
        backBtn.setStyle("-fx-background-color: #ffffff;");
        backBtn.setText("Back");
        backBtn.setFont(new Font("Bauhaus 93", 19.0));

        backBtn.setEffect(dropShadow);

        rematchBtn.setLayoutX(120.0);
        rematchBtn.setLayoutY(636.0);
        rematchBtn.setMnemonicParsing(false);
        rematchBtn.setPrefHeight(38.0);
        rematchBtn.setPrefWidth(110.0);
        rematchBtn.setStyle("-fx-background-color: #ffffff;");
        rematchBtn.setText("Rematch");
        rematchBtn.setFont(new Font("Bauhaus 93", 19.0));

        rematchBtn.setEffect(dropShadow0);

        homeBtn.setLayoutX(250.0);
        homeBtn.setLayoutY(636.0);
        homeBtn.setMnemonicParsing(false);
        homeBtn.setPrefHeight(38.0);
        homeBtn.setPrefWidth(85.0);
        homeBtn.setStyle("-fx-background-color: #ffffff;");
        homeBtn.setText("Home");
        homeBtn.setFont(new Font("Bauhaus 93", 19.0));

        homeBtn.setEffect(dropShadow1);

        playerTwoUserNameLValueTxt.setLayoutX(216.0);
        playerTwoUserNameLValueTxt.setLayoutY(514.0);
        playerTwoUserNameLValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerTwoUserNameLValueTxt.setStrokeWidth(0.0);
        playerTwoUserNameLValueTxt.setText(playerTwoNameValue);

        playerTwoUserNameLValueTxt.setFont(new Font("Bauhaus 93", 36.0));

        toeLTxt.setFill(javafx.scene.paint.Color.valueOf("#f8e3e3"));
        toeLTxt.setLayoutX(169.0);
        toeLTxt.setLayoutY(412.0);
        toeLTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        toeLTxt.setStrokeWidth(0.0);
        toeLTxt.setText("T     O     E");
        toeLTxt.setFont(new Font("Bauhaus 93", 36.0));

        aLTxt.setFill(javafx.scene.paint.Color.valueOf("#f8e3e3"));
        aLTxt.setLayoutX(168.0);
        aLTxt.setLayoutY(466.0);
        aLTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        aLTxt.setStrokeWidth(0.0);
        aLTxt.setText("A");
        aLTxt.setFont(new Font("Bauhaus 93", 36.0));

        ticLTxt.setFill(javafx.scene.paint.Color.valueOf("#f8e3e3"));
        ticLTxt.setLayoutX(46.0);
        ticLTxt.setLayoutY(518.0);
        ticLTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticLTxt.setStrokeWidth(0.0);
        ticLTxt.setText("T     I     C");
        ticLTxt.setFont(new Font("Bauhaus 93", 36.0));

        playerOneUserNameLValueTxt.setLayoutX(26.0);
        playerOneUserNameLValueTxt.setLayoutY(412.0);
        playerOneUserNameLValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerOneUserNameLValueTxt.setStrokeWidth(0.0);
        playerOneUserNameLValueTxt.setText(playerOneNameValue);
        playerOneUserNameLValueTxt.setWrappingWidth(136.21875);

        playerOneUserNameLValueTxt.setFont(new Font("Bauhaus 93", 36.0));

        recordToggleBtn.setLayoutX(174.0);
        recordToggleBtn.setLayoutY(26.0);
        recordToggleBtn.setMnemonicParsing(false);
        recordToggleBtn.setPrefHeight(42.0);
        recordToggleBtn.setPrefWidth(130.0);

        recordToggleBtn.setEffect(dropShadow2);
        recordToggleBtn.setFont(new Font("Bauhaus 93", 19.0));

        recordTxt.setLayoutX(53.0);
        recordTxt.setLayoutY(58.0);
        recordTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        recordTxt.setStrokeWidth(0.0);
        recordTxt.setText("Record");
        recordTxt.setFont(new Font("Bauhaus 93", 30.0));

        playerOneUserNameLLValueTxt.setLayoutX(31.0);
        playerOneUserNameLLValueTxt.setLayoutY(210.0);
        playerOneUserNameLLValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerOneUserNameLLValueTxt.setStrokeWidth(0.0);
        playerOneUserNameLLValueTxt.setText(playerOneNameValue + " (X) :");

        playerOneUserNameLLValueTxt.setFont(new Font("Bauhaus 93", 24.0));

        playerTwoUserNameLLValueTxt.setLayoutX(31.0);
        playerTwoUserNameLLValueTxt.setLayoutY(280.0);
        playerTwoUserNameLLValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerTwoUserNameLLValueTxt.setStrokeWidth(0.0);
        playerTwoUserNameLLValueTxt.setText(playerTwoNameValue + "(O) :");
        playerTwoUserNameLLValueTxt.setFont(new Font("Bauhaus 93", 24.0));

        ScoreTxt.setLayoutX(31.0);
        ScoreTxt.setLayoutY(149.0);
        ScoreTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ScoreTxt.setStrokeWidth(0.0);
        ScoreTxt.setText("Score");
        ScoreTxt.setFont(new Font("Bauhaus 93", 36.0));

        playerOneScore.setLayoutX(184.0);
        playerOneScore.setLayoutY(215.0);
        playerOneScore.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerOneScore.setStrokeWidth(0.0);
        playerOneScore.setText("0");
        playerOneScore.setFont(new Font("Bauhaus 93", 36.0));

        playerTwoScore.setLayoutX(184.0);
        playerTwoScore.setLayoutY(283.0);
        playerTwoScore.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerTwoScore.setStrokeWidth(0.0);
        playerTwoScore.setText("0");
        playerTwoScore.setFont(new Font("Bauhaus 93", 36.0));

        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        anchorPane0.setEffect(glow0);

        playerTwoUserNameRValueTxt.setLayoutX(351.0);
        playerTwoUserNameRValueTxt.setLayoutY(157.0);
        playerTwoUserNameRValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerTwoUserNameRValueTxt.setStrokeWidth(0.0);
        playerTwoUserNameRValueTxt.setText(playerTwoNameValue);

        playerTwoUserNameRValueTxt.setFont(new Font("Bauhaus 93", 24.0));

        toeRTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        toeRTxt.setLayoutX(312.0);
        toeRTxt.setLayoutY(82.0);
        toeRTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        toeRTxt.setStrokeWidth(0.0);
        toeRTxt.setText("T     O     E");
        toeRTxt.setFont(new Font("Bauhaus 93", 24.0));

        aRTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        aRTxt.setLayoutX(311.0);
        aRTxt.setLayoutY(122.0);
        aRTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        aRTxt.setStrokeWidth(0.0);
        aRTxt.setText("A");
        aRTxt.setFont(new Font("Bauhaus 93", 24.0));

        ticRTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        ticRTxt.setLayoutX(229.0);
        ticRTxt.setLayoutY(159.0);
        ticRTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticRTxt.setStrokeWidth(0.0);
        ticRTxt.setText("T     I     C");
        ticRTxt.setFont(new Font("Bauhaus 93", 24.0));

        soundToggleBtn.setLayoutX(519.0);
        soundToggleBtn.setLayoutY(656.0);
        soundToggleBtn.setMnemonicParsing(false);
        soundToggleBtn.setPrefHeight(42.0);
        soundToggleBtn.setPrefWidth(130.0);

        soundToggleBtn.setEffect(dropShadow3);
        soundToggleBtn.setFont(new Font("Bauhaus 93", 19.0));

        sountTxt.setLayoutX(410.0);
        sountTxt.setLayoutY(692.0);
        sountTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        sountTxt.setStrokeWidth(0.0);
        sountTxt.setText("Sound");
        sountTxt.setFont(new Font("Bauhaus 93", 30.0));

        playerOneUserNameRValueTxt.setLayoutX(225.0);
        playerOneUserNameRValueTxt.setLayoutY(81.0);
        playerOneUserNameRValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerOneUserNameRValueTxt.setStrokeWidth(0.0);
        playerOneUserNameRValueTxt.setText(playerOneNameValue);

        playerOneUserNameRValueTxt.setFont(new Font("Bauhaus 93", 24.0));

        xoGridBane.setHgap(10.0);
        xoGridBane.setLayoutX(143.0);
        xoGridBane.setLayoutY(219.0);
        xoGridBane.setPrefHeight(390.0);
        xoGridBane.setPrefWidth(390.0);
        xoGridBane.setVgap(10.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(117.9999755859375);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(91.33331909179688);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(106.4666809082031);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(106.4666809082031);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        xoGridBane.setPadding(new Insets(10.0));

        GridPane.setColumnSpan(xoRectangle, 3);
        GridPane.setRowSpan(xoRectangle, 3);
        xoRectangle.setArcHeight(20.0);
        xoRectangle.setArcWidth(20.0);
        xoRectangle.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        xoRectangle.setHeight(390.0);
        xoRectangle.setOpacity(0.55);
        xoRectangle.setStroke(javafx.scene.paint.Color.valueOf("#f2cdcd"));
        xoRectangle.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        xoRectangle.setStrokeLineJoin(javafx.scene.shape.StrokeLineJoin.ROUND);
        xoRectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        xoRectangle.setTranslateX(-10.0);
        xoRectangle.setWidth(390.0);

        blend.setMode(javafx.scene.effect.BlendMode.LIGHTEN);
        blend.setOpacity(0.0);

        blend.setTopInput(reflection);
        xoRectangle.setEffect(blend);

        GridPane.setColumnIndex(cellPos2_1, 1);
        GridPane.setRowIndex(cellPos2_1, 2);
        cellPos2_1.setMnemonicParsing(false);
        cellPos2_1.setPrefHeight(107.0);
        cellPos2_1.setPrefWidth(118.0);
        cellPos2_1.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust.setBrightness(-0.02);
        colorAdjust.setContrast(0.19);
        colorAdjust.setHue(-0.04);
        colorAdjust.setSaturation(0.25);
        cellPos2_1.setEffect(colorAdjust);
        cellPos2_1.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));

        GridPane.setColumnIndex(cellPos1_1, 1);
        GridPane.setRowIndex(cellPos1_1, 1);
        cellPos1_1.setMnemonicParsing(false);
        cellPos1_1.setPrefHeight(121.0);
        cellPos1_1.setPrefWidth(118.0);
        cellPos1_1.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust0.setBrightness(-0.02);
        colorAdjust0.setContrast(0.19);
        colorAdjust0.setHue(-0.04);
        colorAdjust0.setSaturation(0.25);
        cellPos1_1.setEffect(colorAdjust0);

        cellPos0_0.setMnemonicParsing(false);
        cellPos0_0.setPrefHeight(121.0);
        cellPos0_0.setPrefWidth(118.0);
        cellPos0_0.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust1.setBrightness(-0.02);
        colorAdjust1.setContrast(0.19);
        colorAdjust1.setHue(-0.04);
        colorAdjust1.setSaturation(0.25);
        cellPos0_0.setEffect(colorAdjust1);

        GridPane.setColumnIndex(cellPos1_2, 2);
        GridPane.setRowIndex(cellPos1_2, 1);
        cellPos1_2.setMnemonicParsing(false);
        cellPos1_2.setPrefHeight(121.0);
        cellPos1_2.setPrefWidth(118.0);
        cellPos1_2.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust2.setBrightness(-0.02);
        colorAdjust2.setContrast(0.19);
        colorAdjust2.setHue(-0.04);
        colorAdjust2.setSaturation(0.25);
        cellPos1_2.setEffect(colorAdjust2);

        GridPane.setColumnIndex(cellPos0_2, 2);
        cellPos0_2.setCache(true);
        cellPos0_2.setMnemonicParsing(false);
        cellPos0_2.setPrefHeight(121.0);
        cellPos0_2.setPrefWidth(118.0);
        cellPos0_2.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust3.setBrightness(-0.02);
        colorAdjust3.setContrast(0.19);
        colorAdjust3.setHue(-0.04);
        colorAdjust3.setSaturation(0.25);
        cellPos0_2.setEffect(colorAdjust3);
        cellPos0_2.setCursor(Cursor.HAND);

        GridPane.setRowIndex(cellPos1_0, 1);
        cellPos1_0.setMnemonicParsing(false);
        cellPos1_0.setPrefHeight(121.0);
        cellPos1_0.setPrefWidth(118.0);
        cellPos1_0.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust4.setBrightness(-0.02);
        colorAdjust4.setContrast(0.19);
        colorAdjust4.setHue(-0.04);
        colorAdjust4.setSaturation(0.25);
        cellPos1_0.setEffect(colorAdjust4);

        GridPane.setColumnIndex(cellPos2_2, 2);
        GridPane.setRowIndex(cellPos2_2, 2);
        cellPos2_2.setMnemonicParsing(false);
        cellPos2_2.setPrefHeight(107.0);
        cellPos2_2.setPrefWidth(118.0);
        cellPos2_2.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust5.setBrightness(-0.02);
        colorAdjust5.setContrast(0.19);
        colorAdjust5.setHue(-0.04);
        colorAdjust5.setSaturation(0.25);
        cellPos2_2.setEffect(colorAdjust5);
        cellPos2_2.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));

        GridPane.setColumnIndex(cellPos0_1, 1);
        cellPos0_1.setMnemonicParsing(false);
        cellPos0_1.setPrefHeight(121.0);
        cellPos0_1.setPrefWidth(118.0);
        cellPos0_1.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust6.setBrightness(-0.02);
        colorAdjust6.setContrast(0.19);
        colorAdjust6.setHue(-0.04);
        colorAdjust6.setSaturation(0.25);
        cellPos0_1.setEffect(colorAdjust6);

        GridPane.setRowIndex(cellPos2_0, 2);
        cellPos2_0.setMnemonicParsing(false);
        cellPos2_0.setPrefHeight(107.0);
        cellPos2_0.setPrefWidth(118.0);
        cellPos2_0.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust7.setBrightness(-0.02);
        colorAdjust7.setContrast(0.19);
        colorAdjust7.setHue(-0.04);
        colorAdjust7.setSaturation(0.25);
        cellPos2_0.setEffect(colorAdjust7);
        GridPane.setMargin(cellPos2_0, new Insets(0.0));
        cellPos2_0.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
        setCenter(anchorPane0);

        anchorPane.getChildren().add(backBtn);
        anchorPane.getChildren().add(rematchBtn);
        anchorPane.getChildren().add(homeBtn);
        anchorPane.getChildren().add(playerTwoUserNameLValueTxt);
        anchorPane.getChildren().add(toeLTxt);
        anchorPane.getChildren().add(aLTxt);
        anchorPane.getChildren().add(ticLTxt);
        anchorPane.getChildren().add(playerOneUserNameLValueTxt);
        anchorPane.getChildren().add(recordToggleBtn);
        anchorPane.getChildren().add(recordTxt);
        anchorPane.getChildren().add(playerOneUserNameLLValueTxt);
        anchorPane.getChildren().add(playerTwoUserNameLLValueTxt);

        anchorPane.getChildren().add(enterYourNameTxt);
        anchorPane.getChildren().add(playerOneUserNameLLValueTxtField);
        anchorPane.getChildren().add(playerTwoUserNameLLValueTxtField);

        anchorPane0.getChildren().add(playerTwoUserNameRValueTxt);
        anchorPane0.getChildren().add(toeRTxt);
        anchorPane0.getChildren().add(aRTxt);
        anchorPane0.getChildren().add(ticRTxt);
        anchorPane0.getChildren().add(soundToggleBtn);
        anchorPane0.getChildren().add(sountTxt);
        anchorPane0.getChildren().add(playerOneUserNameRValueTxt);
        xoGridBane.getColumnConstraints().add(columnConstraints);
        xoGridBane.getColumnConstraints().add(columnConstraints0);
        xoGridBane.getColumnConstraints().add(columnConstraints1);
        xoGridBane.getRowConstraints().add(rowConstraints);
        xoGridBane.getRowConstraints().add(rowConstraints0);
        xoGridBane.getRowConstraints().add(rowConstraints1);
        xoGridBane.getChildren().add(xoRectangle);
        xoGridBane.getChildren().add(cellPos2_1);
        xoGridBane.getChildren().add(cellPos1_1);
        xoGridBane.getChildren().add(cellPos0_0);
        xoGridBane.getChildren().add(cellPos1_2);
        xoGridBane.getChildren().add(cellPos0_2);
        xoGridBane.getChildren().add(cellPos1_0);
        xoGridBane.getChildren().add(cellPos2_2);
        xoGridBane.getChildren().add(cellPos0_1);
        xoGridBane.getChildren().add(cellPos2_0);
        anchorPane0.getChildren().add(xoGridBane);
        
         checkSoundToggleBtn();

        cellsBtn = new Button[][]{
            {cellPos0_0, cellPos0_1, cellPos0_2},
            {cellPos1_0, cellPos1_1, cellPos1_2},
            {cellPos2_0, cellPos2_1, cellPos2_2}
        };

        for (int i = 0; i < cellsBtn.length; i++) {
            for (int j = 0; j < cellsBtn[i].length; j++) {
                Button cell = cellsBtn[i][j];
                setupButton(cell, i, j);
                cell.setFocusTraversable(false);
            }
        }

        recordToggleBtn.selectedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                recordToggleBtn.setText("On");
                recordToggleBtn.setStyle("-fx-background-color: green;");
                isRecorded = true;
                //new obj           
            } else {
                recordToggleBtn.setText("Off");
                recordToggleBtn.setStyle("");
                isRecorded = false;
            }
        });


        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                OfflineMenuPage root = new OfflineMenuPage();
                Scene scene = new Scene(root);
                TicTacToeClient.stage.setScene(scene);
            }
        });

        rematchBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                resetAllCells();
                moveId = 0;
                // Rematch The Game
            }
        });

        homeBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                WelcomPage root = new WelcomPage();
                Scene scene = new Scene(root);
                TicTacToeClient.stage.setScene(scene);
            }
        });

    }


    private void setupButton(Button cellBtn, int row, int col) {
        cellBtn.setOnMouseClicked(mouseEvent -> {
            if (gameIsOver) {
                return;
            }

            setPlayerSymbol(cellBtn);
            cellBtn.setDisable(true);
            record.add(new OfflineMoveDTO(moveId++, playerTurn, row, col));
            int winningLineIndex = checkIfGameIsOver();

            if (winningLineIndex != -1) {
                highlightWinningLine(winningLineIndex);
                if (playerTurn % 2 == 0) {
                    playerTwoScore.setText(String.valueOf(++playerTwoScoreValue));
                } else {
                    playerOneScore.setText(String.valueOf(++playerOneScoreValue));
                }

                gameIsOver = true;

                fullRecord = RecordOperation.readRecordFromFile("fullRecorde.json");
                Date date = new Date();

                if (fullRecord == null || fullRecord.isEmpty()) {
                    fullRecord.add(new OfflineGameDTO(playerTurn % 2, playerOneNameValue, playerTwoNameValue, date, new ArrayList<>(record)));
                } else {
                    fullRecord.add(new OfflineGameDTO(playerTurn % 2, playerOneNameValue, playerTwoNameValue, date, new ArrayList<>(record)));
                }
                //fullRecord.add(new OfflineGameDTO(playerTurn % 2, playerOneNameValue, playerTwoNameValue, date, new ArrayList<>(record)));

                if (isRecorded) {
                    RecordOperation.writeRecordToFile(fullRecord, "fullRecorde.json");
                    System.out.println("Game record saved.");
                }
            } else if (record.size() == 9) { // game is a tie
                gameIsOver = true;

                if (isRecorded) {
                    RecordOperation.writeRecordToFile(fullRecord, "fullRecorde.json");
                    System.out.println("Game record saved.");
                }
            }
        });
    }

    private void highlightWinningLine(int index) {
        switch (index) {
            case 0:
                highlightCell(cellsBtn[0][0], cellsBtn[0][1], cellsBtn[0][2]);
                break;
            case 1:
                highlightCell(cellsBtn[1][0], cellsBtn[1][1], cellsBtn[1][2]);
                break;
            case 2:
                highlightCell(cellsBtn[2][0], cellsBtn[2][1], cellsBtn[2][2]);
                break;
            case 3:
                highlightCell(cellsBtn[0][0], cellsBtn[1][0], cellsBtn[2][0]);
                break;
            case 4:
                highlightCell(cellsBtn[0][1], cellsBtn[1][1], cellsBtn[2][1]);
                break;
            case 5:
                highlightCell(cellsBtn[0][2], cellsBtn[1][2], cellsBtn[2][2]);
                break;
            case 6:
                highlightCell(cellsBtn[0][0], cellsBtn[1][1], cellsBtn[2][2]);
                break;
            case 7:
                highlightCell(cellsBtn[2][0], cellsBtn[1][1], cellsBtn[0][2]);
                break;
            default:
                break;
        }
    }

    private void highlightCell(Button cellBtnOne, Button cellBtnTwo, Button cellBtnThree) {
        cellBtnOne.setStyle("-fx-background-color: gray");
        cellBtnTwo.setStyle("-fx-background-color: gray");
        cellBtnThree.setStyle("-fx-background-color: gray");
    }

    private void unhighlightCell(Button cellBtn) {
        cellBtn.setStyle("");
        cellBtn.setText("");
        cellBtn.setDisable(false);
    }

    private void resetAllCells() {
        for (Button[] row : cellsBtn) {
            for (Button cell : row) {
                unhighlightCell(cell);
            }
        }
        record = new ArrayList<>();
        gameIsOver = false;
        playerTurn = 0;
    }

    private void setPlayerSymbol(Button cellBtn) {

        if (playerTurn % 2 == 0) {
            cellBtn.setText("X");
            playerTurn = 1;
        } else {
            cellBtn.setText("O");
            playerTurn = 0;
        }

    }

    public int checkIfGameIsOver() {
        int indexValue = -1;
        indexValue = (record.size() == 9 ? -2 : -1);
        for (int index = 0; index < 8; index++) {

            String line = "";
            if (index == 0) {
                line = cellsBtn[0][0].getText() + cellsBtn[0][1].getText() + cellsBtn[0][2].getText();
            } else if (index == 1) {
                line = cellsBtn[1][0].getText() + cellsBtn[1][1].getText() + cellsBtn[1][2].getText();
            } else if (index == 2) {
                line = cellsBtn[2][0].getText() + cellsBtn[2][1].getText() + cellsBtn[2][2].getText();
            } else if (index == 3) {
                line = cellsBtn[0][0].getText() + cellsBtn[1][0].getText() + cellsBtn[2][0].getText();
            } else if (index == 4) {
                line = cellsBtn[0][1].getText() + cellsBtn[1][1].getText() + cellsBtn[2][1].getText();
            } else if (index == 5) {
                line = cellsBtn[0][2].getText() + cellsBtn[1][2].getText() + cellsBtn[2][2].getText();
            } else if (index == 6) {
                line = cellsBtn[0][0].getText() + cellsBtn[1][1].getText() + cellsBtn[2][2].getText();
            } else if (index == 7) {
                line = cellsBtn[2][0].getText() + cellsBtn[1][1].getText() + cellsBtn[0][2].getText();
            }

            if (line.equals("XXX")) {
                // X wins
                indexValue = index;
            } else if (line.equals("OOO")) {
                // O wins
                indexValue = index;
            }
        }

        return indexValue;
    }
    
    void checkSoundToggleBtn(){
        if (WelcomPage.mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            soundToggleBtn.setText("On");
            soundToggleBtn.setStyle("-fx-background-color: green;");
            soundToggleBtn.setSelected(true);
        } else {
            soundToggleBtn.setText("Off");
            soundToggleBtn.setStyle("-fx-background-color: red;");
            soundToggleBtn.setSelected(false);
        }

        soundToggleBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (soundToggleBtn.isSelected()) {
                    WelcomPage.mediaPlayer.pause();
                    soundToggleBtn.setText("Off");
                    soundToggleBtn.setStyle("-fx-background-color: red;");
                    soundToggleBtn.setSelected(true);
                } else {
                    WelcomPage.mediaPlayer.play();
                    soundToggleBtn.setText("On");
                    soundToggleBtn.setStyle("-fx-background-color: green;");
                    soundToggleBtn.setSelected(false);
                }
            }
        });
    }

}
