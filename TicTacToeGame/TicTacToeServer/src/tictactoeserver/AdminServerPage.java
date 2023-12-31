package tictactoeserver;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import tictactoeclient.GameDTO;
import tictactoeclient.UserDTO;

public class AdminServerPage extends BorderPane {

    Stage parentStage;
    ServerHandeller server;
    protected final AnchorPane anchorPane;
    protected final Glow glow;
    protected final Button logOutBtn;
    protected final DropShadow dropShadow;
    protected final TableView onlineUsersTable;
    protected final TableColumn userNameOnlineTableCol;
    protected final TableColumn statusOnlineTableCol;
    protected final DropShadow dropShadow0;
    protected final Text onlineUsersValueTxt;
    protected final TableView offlineUsersTable;
    protected final TableColumn userNameOfflineTableCol;
    protected final DropShadow dropShadow1;
    protected final Text offlineUsersValueTxt;
    protected final AnchorPane anchorPane0;
    protected final Glow glow0;
    protected final ToggleButton connectionToggleBtn;
    protected final DropShadow dropShadow2;
    protected final Text serverConnectionTxt;
    protected final Text ticTacToePlayersTxt;
    protected final TableView usersInfoTable;
    protected final TableColumn playeOneInfoTableCol;
    protected final TableColumn playeTwoInfoTableCol;
    protected final TableColumn gameStatusInfoTableCol;
    protected final DropShadow dropShadow3;
    protected final Text onlineUsersPlayingInfoTxt;
    protected final CategoryAxis usersCategoryAxis;
    protected final NumberAxis usersNumbersAxis;
    protected final BarChart usersBarChart;
    public ArrayList<String> topList;

    public AdminServerPage(Stage stage) {

        topList = new ArrayList<String>();

        parentStage = stage;
        anchorPane = new AnchorPane();
        glow = new Glow();
        logOutBtn = new Button();
        dropShadow = new DropShadow();
        onlineUsersTable = new TableView();
        userNameOnlineTableCol = new TableColumn();
        statusOnlineTableCol = new TableColumn();
        dropShadow0 = new DropShadow();
        onlineUsersValueTxt = new Text();
        offlineUsersTable = new TableView();
        userNameOfflineTableCol = new TableColumn();
        dropShadow1 = new DropShadow();
        offlineUsersValueTxt = new Text();
        anchorPane0 = new AnchorPane();
        glow0 = new Glow();
        connectionToggleBtn = new ToggleButton();
        dropShadow2 = new DropShadow();
        serverConnectionTxt = new Text();
        ticTacToePlayersTxt = new Text();
        usersInfoTable = new TableView();
        playeOneInfoTableCol = new TableColumn();
        playeTwoInfoTableCol = new TableColumn();
        gameStatusInfoTableCol = new TableColumn();
        dropShadow3 = new DropShadow();
        onlineUsersPlayingInfoTxt = new Text();
        usersCategoryAxis = new CategoryAxis();
        usersNumbersAxis = new NumberAxis();
        usersBarChart = new BarChart(usersCategoryAxis, usersNumbersAxis);

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

        logOutBtn.setLayoutX(30.0);
        logOutBtn.setLayoutY(646.0);
        logOutBtn.setMnemonicParsing(false);
        logOutBtn.setPrefHeight(38.0);
        logOutBtn.setPrefWidth(99.0);
        logOutBtn.setStyle("-fx-background-color: #ffffff;");
        logOutBtn.setText("Log Out");
        logOutBtn.setFont(new Font("Bauhaus 93", 19.0));

        logOutBtn.setEffect(dropShadow);

        onlineUsersTable.setLayoutX(40.0);
        onlineUsersTable.setLayoutY(70.0);
        onlineUsersTable.setPrefHeight(230.0);
        onlineUsersTable.setPrefWidth(272.0);
        onlineUsersTable.setStyle("-fx-background-color: #ffffff;");

        userNameOnlineTableCol.setEditable(false);
        userNameOnlineTableCol.setPrefWidth(75.0);
        userNameOnlineTableCol.setStyle("-fx-font-size: 18; -fx-font-family: Bauhaus 93;");
        userNameOnlineTableCol.setText("User Name");

        statusOnlineTableCol.setEditable(false);
        statusOnlineTableCol.setPrefWidth(75.0);
        statusOnlineTableCol.setStyle("-fx-font-size: 18; -fx-font-family: Bauhaus 93;");
        statusOnlineTableCol.setText("Playing ");

        onlineUsersTable.setEffect(dropShadow0);
        onlineUsersTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        onlineUsersValueTxt.setLayoutX(64.0);
        onlineUsersValueTxt.setLayoutY(57.0);
        onlineUsersValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        onlineUsersValueTxt.setStrokeWidth(0.0);
        onlineUsersValueTxt.setText("Online USreS (10)");
        onlineUsersValueTxt.setFont(new Font("Bauhaus 93", 30.0));

        offlineUsersTable.setLayoutX(41.0);
        offlineUsersTable.setLayoutY(372.0);
        offlineUsersTable.setPrefHeight(230.0);
        offlineUsersTable.setPrefWidth(272.0);
        offlineUsersTable.setStyle("-fx-background-color: #ffffff;");
        offlineUsersTable.edit(0, userNameOfflineTableCol);

        ObservableList<String> userList = offlineUsersTable.getItems();

        topList.add("ahmed");
        topList.add("morad");

        offlineUsersTable.setItems(userList);

        userNameOfflineTableCol.setEditable(false);
        userNameOfflineTableCol.setPrefWidth(75.0);
        userNameOfflineTableCol.setStyle("-fx-font-size: 18; -fx-font-family: Bauhaus 93;");
        userNameOfflineTableCol.setText("User Name");

        offlineUsersTable.setEffect(dropShadow1);
        offlineUsersTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        offlineUsersValueTxt.setLayoutX(60.0);
        offlineUsersValueTxt.setLayoutY(359.0);
        offlineUsersValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        offlineUsersValueTxt.setStrokeWidth(0.0);
        offlineUsersValueTxt.setText("Offline USreS (11)");
        offlineUsersValueTxt.setFont(new Font("Bauhaus 93", 30.0));
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        anchorPane0.setEffect(glow0);

        connectionToggleBtn.setLayoutX(519.0);
        connectionToggleBtn.setLayoutY(656.0);
        connectionToggleBtn.setMnemonicParsing(false);
        connectionToggleBtn.setPrefHeight(42.0);
        connectionToggleBtn.setPrefWidth(130.0);
        connectionToggleBtn.setText("On / Off");

        connectionToggleBtn.setEffect(dropShadow2);
        connectionToggleBtn.setFont(new Font("Bauhaus 93", 19.0));

        serverConnectionTxt.setLayoutX(259.0);
        serverConnectionTxt.setLayoutY(687.0);
        serverConnectionTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        serverConnectionTxt.setStrokeWidth(0.0);
        serverConnectionTxt.setText("Server Connection");
        serverConnectionTxt.setFont(new Font("Bauhaus 93", 30.0));

        ticTacToePlayersTxt.setLayoutX(162.0);
        ticTacToePlayersTxt.setLayoutY(59.0);
        ticTacToePlayersTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticTacToePlayersTxt.setStrokeWidth(0.0);
        ticTacToePlayersTxt.setText("Tic-Tac-Toe Dash Board ");
        ticTacToePlayersTxt.setFont(new Font("Bauhaus 93", 35.0));

        usersInfoTable.setLayoutX(97.0);
        usersInfoTable.setLayoutY(118.0);
        usersInfoTable.setPrefHeight(205.0);
        usersInfoTable.setPrefWidth(498.0);
        usersInfoTable.setStyle("-fx-background-color: #ffffff; -fx-border-color: #F27B7A; -fx-border-width: 3;");

        playeOneInfoTableCol.setEditable(false);
        playeOneInfoTableCol.setPrefWidth(75.0);
        playeOneInfoTableCol.setStyle("-fx-font-size: 18; -fx-font-family: Bauhaus 93;");
        playeOneInfoTableCol.setText("Player One");

        playeTwoInfoTableCol.setEditable(false);
        playeTwoInfoTableCol.setPrefWidth(75.0);
        playeTwoInfoTableCol.setStyle("-fx-font-size: 18; -fx-font-family: Bauhaus 93;");
        playeTwoInfoTableCol.setText("Player Two");

        gameStatusInfoTableCol.setEditable(false);
        gameStatusInfoTableCol.setPrefWidth(75.0);
        gameStatusInfoTableCol.setStyle("-fx-font-size: 18; -fx-font-family: Bauhaus 93;");
        gameStatusInfoTableCol.setText("Results");

        usersInfoTable.setEffect(dropShadow3);
        usersInfoTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        onlineUsersPlayingInfoTxt.setLayoutX(155.0);
        onlineUsersPlayingInfoTxt.setLayoutY(97.0);
        onlineUsersPlayingInfoTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        onlineUsersPlayingInfoTxt.setStrokeWidth(0.0);
        onlineUsersPlayingInfoTxt.setText("Online Users Playing Info");
        onlineUsersPlayingInfoTxt.setFont(new Font("Bauhaus 93", 35.0));

        usersCategoryAxis.setTickLabelGap(5.0);
        usersCategoryAxis.setTickLength(10.0);

        usersNumbersAxis.setAutoRanging(false);
        usersNumbersAxis.setLabel("No. of Users");
        usersNumbersAxis.setSide(javafx.geometry.Side.LEFT);
        usersNumbersAxis.setTickLength(10.0);
        usersNumbersAxis.setUpperBound(50.0);
        usersBarChart.setLayoutX(48.0);
        usersBarChart.setLayoutY(335.0);
        usersBarChart.setPrefHeight(301.0);
        usersBarChart.setPrefWidth(590.0);
        usersBarChart.setStyle("-fx-border-color: #F27B7A; -fx-border-width: 3;");
        usersBarChart.setTitle("Live");
        setCenter(anchorPane0);

        anchorPane.getChildren().add(logOutBtn);
        onlineUsersTable.getColumns().add(userNameOnlineTableCol);
        onlineUsersTable.getColumns().add(statusOnlineTableCol);
        anchorPane.getChildren().add(onlineUsersTable);
        anchorPane.getChildren().add(onlineUsersValueTxt);
        offlineUsersTable.getColumns().add(userNameOfflineTableCol);
        anchorPane.getChildren().add(offlineUsersTable);
        anchorPane.getChildren().add(offlineUsersValueTxt);
        anchorPane0.getChildren().add(connectionToggleBtn);
        anchorPane0.getChildren().add(serverConnectionTxt);
        anchorPane0.getChildren().add(ticTacToePlayersTxt);
        usersInfoTable.getColumns().add(playeOneInfoTableCol);
        usersInfoTable.getColumns().add(playeTwoInfoTableCol);
        usersInfoTable.getColumns().add(gameStatusInfoTableCol);
        anchorPane0.getChildren().add(usersInfoTable);
        anchorPane0.getChildren().add(onlineUsersPlayingInfoTxt);
        anchorPane0.getChildren().add(usersBarChart);

        connectionToggleBtn.selectedProperty().addListener((observable, oldValue, newValue)
                -> {
            if (newValue) 
            {
                connectionToggleBtn.setText("On");
                connectionToggleBtn.setStyle("-fx-background-color: green;");
                server = new ServerHandeller();

             } else {
                server.closeConnection();
                connectionToggleBtn.setText("Off");
                connectionToggleBtn.setStyle("");
            }
        });

        logOutBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                AdminLoginPage root = new AdminLoginPage(parentStage);
                Scene scene = new Scene(root);
                parentStage.setScene(scene);
            }
        });

        // Create the ObservableLists for the online and offline user tables
        ObservableList<UserDTO> onlineUsers = FXCollections.observableArrayList();
        ObservableList<UserDTO> offlineUsers = FXCollections.observableArrayList();
        ObservableList<GameDTO> dashBoard = FXCollections.observableArrayList();

        // Set the CellValueFactory for the username columns
        userNameOnlineTableCol.setCellValueFactory(new PropertyValueFactory<>("userName"));
        statusOnlineTableCol.setCellValueFactory(new PropertyValueFactory<>("isPlaying"));
        userNameOfflineTableCol.setCellValueFactory(new PropertyValueFactory<>("userName"));
        playeOneInfoTableCol.setCellValueFactory(new PropertyValueFactory<>("playe1"));
        playeTwoInfoTableCol.setCellValueFactory(new PropertyValueFactory<>("playe2"));
        gameStatusInfoTableCol.setCellValueFactory(new PropertyValueFactory<>("results"));

        // Start a new thread to update the user tables periodically
        new Thread() {
            @Override
            public void run() {
                DataAccessLayer.connect();
                try {
                    while (true) {
                        // Get the online and offline user counts
                        int onlinePlayersNum = DataAccessLayer.getOnlinePlayersNum();
                        int offlinePlayersNum = DataAccessLayer.getOfflinePlayersNum();

                        // Update the user count labels
                        onlineUsersValueTxt.setText("Online Users (" + onlinePlayersNum + ")");
                        offlineUsersValueTxt.setText("Offline Users (" + offlinePlayersNum + ")");

                        // Clear the online and offline user lists
                        onlineUsers.clear();
                        offlineUsers.clear();
                        dashBoard.clear();
                        // Add the online and offline users to the user lists
                        for (UserDTO user : DataAccessLayer.getOnlinePlayers()) {
                            onlineUsers.add(user);
                        }
                        for (UserDTO user : DataAccessLayer.getOfflinePlayers()) {
                            offlineUsers.add(user);
                        }
                        for (GameDTO game : DataAccessLayer.getAllGames()) {
                            dashBoard.add(game);
                        }
                        // Set the items property of the TableView to the user lists
                        onlineUsersTable.setItems(onlineUsers);
                        offlineUsersTable.setItems(offlineUsers);
                        usersInfoTable.setItems(dashBoard);
                        Thread.sleep(5000); // Wait for 5 seconds before updating again
                    }
                } catch (SQLException | InterruptedException ex) {
                    Logger.getLogger(AdminServerPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();

    }
}
