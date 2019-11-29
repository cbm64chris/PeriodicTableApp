package com.fluffy.luffs.periodic.table.app;

import com.fluffy.luffs.periodic.table.app.elements.Elements;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class HomeController implements Initializable {

    @FXML
    private GridPane table;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Arrays.stream(IntStream.iterate(1, r -> r + 1).limit(9).toArray()).forEach(row -> {
            Arrays.stream(IntStream.iterate(1, c -> c + 1).limit(18).toArray())
                    .forEach(column -> {
                        Predicate<Elements> period = p -> p.getPeriod() == row;
                        Predicate<Elements> group = g -> g.getGroup() == column;

                        Arrays.stream(Elements.values())
                            .filter(period.and(group))
                            .findFirst()
                            .ifPresentOrElse(
                                    (element) -> {
                                        Button elementButton = constructElement(element);
                                        elementButton.alignmentProperty().set(Pos.CENTER);
                                        GridPane.setConstraints(elementButton, column, row);
                                        table.getChildren().add(elementButton);
                                        System.out.println("Adding " + element.getElementName() + " at " + row + "," + column);
                                    },
                                    () -> {
                                        var vbox = new VBox();
                                        GridPane.setConstraints(vbox, column, row);
                                        table.getChildren().add(vbox);
                                        System.out.println("Adding empty element at " + row + "," + column);
                                    });
                    });
        });

    }

    private Button constructElement(Elements element) {
        Label atomicMass = new Label(String.format("%.2f", element.getAtomicMass()));
        Label atomicNumber = new Label(String.valueOf(element.getAtomicNumber()));
        Label elementName = new Label(element.getElementName());
        return new Button("", new VBox(elementName, atomicNumber, atomicMass));
    }

//    private Node getTableNode(GridPane gridPane, int column, int row) {
//        Predicate<Node> filterColumn = n -> GridPane.getColumnIndex(n).equals(column);
//        Predicate<Node> filterRow = n -> GridPane.getRowIndex(n).equals(column);
//        
//        return table.getChildren().stream().filter(filterColumn.and(filterRow)).findFirst().get();
//    }
}
