package ficherosxml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.w3c.dom.*;

public class FicherosIV {
	public static void main(String[] args) throws ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {

		File file = new File ("FichEmpleados.xml"); 
		
		Element raiz, elem, elemSub;

		Text text;

		Attr attr;

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder = factory.newDocumentBuilder();

		DOMImplementation implement = builder.getDOMImplementation();
		Document document = implement.createDocument(null, "Empleado", null); // creo el padre
		document.setXmlVersion("1.0");

		raiz = document.createElement("empleado"); // creo un nodo
		document.getDocumentElement().appendChild(raiz);

		elem = document.createElement("id");
		text = document.createTextNode("1");
		raiz.appendChild(elem);
		elem.appendChild(text);
		
		elem = document.createElement("apellidos");
		raiz.appendChild(elem);
		attr = document.createAttribute("orden");
		attr.setValue("primero");
		elem.setAttributeNode(attr);
		
		elemSub = document.createElement("apellido1");
		text = document.createTextNode("Pez");
		elem.appendChild(elemSub);
		elemSub.appendChild(text);
		
		elemSub = document.createElement("apellido2");
		text = document.createTextNode("Orca");
		elem.appendChild(elemSub);
		elemSub.appendChild(text);
		
		elem = document.createElement("dep");
		text = document.createTextNode("130");
		raiz.appendChild(elem);
		elem.appendChild(text);
		
		
		Source source = new DOMSource(document);
		Result result = new StreamResult(file);
		Transformer transf = TransformerFactory.newInstance().newTransformer();
		transf.transform(source,result);
		
		/*CREO ESTE FICHERO
		<?xml version="1.0" encoding="UTF-8"?>
		<Empleados>
		    <empleado>
		        <id>1</id>
		        <apellidos orden="primero">
		            <apellido1>Pez</apellido1>
		            <apellido2>Orca</apellido2>
		        </apellidos>
		        <dep>130</dep>
		    </empleado>
		</Empleados>*/

		
		
		
		
		
		System.out.println("Fin de Programa");
	}

}
