package ramya.practice.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Group root = new Group();

        Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE);

        Text text = new Text();
        text.setText("HELLOOOO!!!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Arial", 50));

        Line line = new Line();
        line.setStartX(200.0);
        line.setStartY(200.0);
        line.setEndX(500.0);
        line.setEndY(200.0);
        line.setStrokeWidth(5.0);
        line.setRotate(45);
        line.setStroke(Color.DARKGREEN);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setHeight(100);
        rectangle.setWidth(100);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(5);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                300.0, 300.0,
                400.0, 400.0,
                400.0, 300.0
        );
        triangle.setFill(Color.DARKMAGENTA);

        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(400);
        circle.setRadius(50);
        circle.setFill(Color.BROWN);

        Image image = new Image("pizzaIcon.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(200);
        imageView.setY(400);



        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();


    }
}
