/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

/**
 *
 * @author dell
 */
public class ClientConnection {

    private static ClientConnection instance;
    InputStream inputstream;
    OutputStream outpuststream;
    ObjectInputStream objectinputstream;
    ObjectOutputStream objectoutputstream;
    Socket socket;
    UserDTO user = new UserDTO();
    int res = 0;
    Boolean loginCheck = new Boolean(false);

    public static ClientConnection getInstance() {
        if (instance == null) {
            instance = new ClientConnection();
        }
        return instance;
    }

    public boolean initConnection(String ip) {
        try {
            if (socket == null || !socket.isConnected() || socket.isClosed()) {
                socket = new Socket(ip, 5005);
                outpuststream = socket.getOutputStream();
                inputstream = socket.getInputStream();
                objectoutputstream = new ObjectOutputStream(outpuststream);
                objectinputstream = new ObjectInputStream(inputstream);
                return true;
            }
        } catch (IOException ex) {
            Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }

    public void readMessage(Stage parentStage) {

        new Thread() {

            @Override
            public void run() {
                try {
                    while (socket.isConnected() && !socket.isClosed()) {

                        System.out.println("now reciving >>>");
                        String msg = (String) objectinputstream.readObject();
                        Boolean responseBool = (Boolean) objectinputstream.readObject();

                        if (msg.equals(Messages.loginResponse)) {
                            checkLogin(parentStage, responseBool);
                        } else if (msg.equals(Messages.registrationResponse)) {
                            
                        }

                        System.out.println("msg is : " + msg);
                        System.out.println("boolean is : " + responseBool);
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }.start();
    }

    private void checkLogin(Stage parentStage, Boolean loginCheck) {

        if (loginCheck) {

            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    OnlineUsersPage root = new OnlineUsersPage(parentStage);
                    Scene scene = new Scene(root);
                    parentStage.setScene(scene);
                    System.out.println("yeas");
                }
            });

        } else {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("you shoud enter the correct name and password !");
                    ButtonType okButton = new ButtonType("OK");
                    alert.getButtonTypes().setAll(okButton);
                    alert.showAndWait();
                }
            });
        }

    }

    private void checkRegistration(Stage parentStage, Boolean registrationCheck) {

        new Thread() {

            @Override
            public void run() {
                try {

                    System.out.println("now reciving from Registration  >>>");
                    Boolean loginCheck = (Boolean) objectinputstream.readObject();
                    if (loginCheck) {

                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                OnlineUsersPage root = new OnlineUsersPage(parentStage);
                                Scene scene = new Scene(root);
                                parentStage.setScene(scene);
                                System.out.println("yeas");
                            }
                        });

                    } else {
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setContentText("Error! while trying to Register!");
                                ButtonType okButton = new ButtonType("OK");
                                alert.getButtonTypes().setAll(okButton);
                                alert.showAndWait();
                            }
                        });
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }.start();

    }

    public void writeMessage(String msg, Object object) {
        new Thread() {
            @Override
            public void run() {
                try {
                    objectoutputstream.writeObject(msg);
                    objectoutputstream.writeObject(object);
                } catch (IOException ex) {
                    Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.start();
    }

}
