import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class JavaFXTemplate extends Application {
	private Button b1, b2;
	private TextField t1, t2;
	private BorderPane p1 = new BorderPane();
	private VBox root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Miran Member Homework 3");

		b1 = new Button("button 1");
		b2 = new Button("button 2");

		t1 = new TextField();
		t1.setPromptText("enter text here then press button 1");
		t1.setMaxWidth(400);
		p1.setCenter(t1);
		t2 = new TextField("final string goes here");
		t2.setMaxWidth(400);
		t2.setEditable(false);
		p1.setRight(t2);

		root = new VBox(20, b1, b2);
		p1.setLeft(root);

		Scene scene = new Scene(p1, 1000,1000);

		EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				String s = t1.getText();
				s += " : from the center text field!";
				t2.setText(s);
				b1.setDisable(true);
				b1.setText("pressed");
			}
		};

		b1.setOnAction(handler);

		b2.setOnAction(e->{t1.clear(); t2.clear(); t2.setText("final string goes here"); b1.setDisable(false); b1.setText("button 1");});


		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
