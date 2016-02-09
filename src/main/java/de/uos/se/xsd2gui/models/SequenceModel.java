package de.uos.se.xsd2gui.models;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * created: 09.02.2016
 *
 * @author Falk Wilke
 */
public class SequenceModel extends XSDModel {
   public SequenceModel(Element xsdNode) {
      super(xsdNode);
   }

   @Override
   public void parseToXML(Document doc, Element parent) {
      for (XSDModel xsdModel : this.getSubModels()) {
         xsdModel.parseToXML(doc, parent);
      }
   }
}