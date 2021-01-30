/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXButton;
import dbconnection.Player;
import dbconnection.PlayerConnection;
import singleMode.Game;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class SinglePlayerController implements Initializable {
    
    private Game game;
    
    @FXML
    private Label player1Name;
    @FXML
    private Label player1MainScore;
    @FXML
    private ImageView player1Icone;
    
    @FXML
    private Label score_player1;
    @FXML
    private Label score_player2;
    
    
    @FXML
    private JFXButton button1;
    @FXML
    private JFXButton button2;
    @FXML
    private JFXButton button3;
    @FXML
    private JFXButton button4;
    @FXML
    private JFXButton button5;
    @FXML
    private JFXButton button6;
    @FXML
    private JFXButton button7;
    @FXML
    private JFXButton button8;
    @FXML
    private JFXButton button9;
    
    

    
    @FXML
    private AnchorPane square_top_left_O;

    @FXML
    private Circle oo1;

    @FXML
    private Circle oi1;

    @FXML
    private AnchorPane square_top_left_X;

    @FXML
    private Rectangle rr1;

    @FXML
    private Rectangle rl1;

    @FXML
    private AnchorPane square_top_O;

    @FXML
    private Circle oo2;

    @FXML
    private Circle oi2;

    @FXML
    private AnchorPane square_top_X;

    @FXML
    private Rectangle rr2;

    @FXML
    private Rectangle rl2;

    @FXML
    private AnchorPane square_top_right_O;

    @FXML
    private Circle oo3;

    @FXML
    private Circle oi3;

    @FXML
    private AnchorPane square_top_right_X;

    @FXML
    private Rectangle rr3;

    @FXML
    private Rectangle rl3;

    @FXML
    private AnchorPane square_left_O;

    @FXML
    private Circle oo4;

    @FXML
    private Circle oi4;

    @FXML
    private AnchorPane square_left_X;

    @FXML
    private Rectangle rr4;

    @FXML
    private Rectangle rl4;

    @FXML
    private AnchorPane square_O;

    @FXML
    private Circle oo5;

    @FXML
    private Circle oi5;

    @FXML
    private AnchorPane square_X;

    @FXML
    private Rectangle rr5;

    @FXML
    private Rectangle rl5;

    @FXML
    private AnchorPane square_right_O;

    @FXML
    private Circle oo6;

    @FXML
    private Circle oi6;

    @FXML
    private AnchorPane square_right_X;

    @FXML
    private Rectangle rr6;

    @FXML
    private Rectangle rl6;

    @FXML
    private AnchorPane square_bottom_left_O;

    @FXML
    private Circle oo7;

    @FXML
    private Circle oi7;

    @FXML
    private AnchorPane square_bottom_left_X;

    @FXML
    private Rectangle rr7;

    @FXML
    private Rectangle rl7;

    @FXML
    private AnchorPane square_bottom_O;

    @FXML
    private Circle oo8;

    @FXML
    private Circle oi8;

    @FXML
    private AnchorPane square_bottom_X;

    @FXML
    private Rectangle rr8;

    @FXML
    private Rectangle rl8;

    @FXML
    private AnchorPane square_bottom_right_O;

    @FXML
    private Circle oo9;

    @FXML
    private Circle oi9;

    @FXML
    private AnchorPane square_bottom_right_X;

    @FXML
    private Rectangle rr9;

    @FXML
    private Rectangle rl9;    
    

    
    /**
     * Initializes the controller class.
     */
     private PlayerConnection connectPlayer;
    private Player player;
    
     public void init(Player player,PlayerConnection connectPlayer)
    {
        this.connectPlayer = connectPlayer;
        this.player = player;
        player1Name.setText(player.getName());                
        player1MainScore.setText(Integer.toString(player.getMain_score()));
        score_player1.setText("0");
        score_player2.setText("0");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        game = new Game();
        inisializeGame();
        detectedKey();
        game.loadGame(true);
    }    
  
    public void inisializeGame()
    {
        game.createScorePlayer1(score_player1);
        game.createScorePlayer2(score_player2);
        game.createSquare(square_top_left_X, square_top_left_O);
        game.createSquare(square_top_X, square_top_O);
        game.createSquare(square_top_right_X, square_top_right_O);
        game.createSquare(square_left_X, square_left_O);
        game.createSquare(square_X, square_O);
        game.createSquare(square_right_X, square_right_O);
        game.createSquare(square_bottom_left_X, square_bottom_left_O);
        game.createSquare(square_bottom_X, square_bottom_O);
        game.createSquare(square_bottom_right_X, square_bottom_right_O);
        game.createBoard();
    }    
    
    public void detectedKey()
    {
        button1.setOnMouseReleased(e->{game.play(0,0);});
        button2.setOnMouseReleased(e->{game.play(0,1);});
        button3.setOnMouseReleased(e->{game.play(0,2);});
        button4.setOnMouseReleased(e->{game.play(1,0);});
        button5.setOnMouseReleased(e->{game.play(1,1);});
        button6.setOnMouseReleased(e->{game.play(1,2);});
        button7.setOnMouseReleased(e->{game.play(2,0);});
        button8.setOnMouseReleased(e->{game.play(2,1);});
        button9.setOnMouseReleased(e->{game.play(2,2);});   
    }   
}