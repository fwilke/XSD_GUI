package de.uos.se.xsd2gui.xsdparser;

import de.uos.se.xsd2gui.models.XSDModel;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 *
 * @author dziegenhagen
 */
public interface WidgetGenerator {

    /**
     * Analyses the xsdNode and created a corresponding widget if the node
     * matches.
     *
     * @param controller
     * @param parentWidget
     * @param xsdNode
     * @return
     */
    Node createWidget(WidgetFactory controller, Pane parentWidget, org.w3c.dom.Node xsdNode, XSDModel parentModel);

}
