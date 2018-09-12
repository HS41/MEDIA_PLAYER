package application;


import java.io.File;
import java.net.URL;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Player extends BorderPane {
	
	Media media;
	MediaPlayer player;
	MediaView view;
	Pane mpane;
	MediaBar bar;
	public Player(String file)
	{
		//URL mediaurl=getClass().getResource(file);
		//String mediaStringUrl=mediaurl.toExternalForm();
		
		media =new Media(file);
		player= new MediaPlayer(media);
		view=new MediaView(player);
		mpane = new Pane();
		
		mpane.getChildren().add(view);
		setCenter(mpane);
		bar=new MediaBar(player);
		setBottom(bar);
		bar.setStyle("-fx-background-color: #9ACD32");
		
		//BorderPane border = new BorderPane();
		//border.setCenter(view);
		player.play();
	}

}
