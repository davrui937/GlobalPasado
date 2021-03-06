package ficherosxml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
import org.w3c.dom.*;

public class leerFichero {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File file = new File("FichEmpleados.xml");

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder = factory.newDocumentBuilder();
		Document documentL = builder.parse(file);
		Element raiz, elem, elemSub, elemAttr;

		NodeList empleados = documentL.getElementsByTagName("empleado");

		for (int i = 0; i < empleados.getLength(); i++) {

			Node emple = empleados.item(i);

			elem = (Element) emple;

			//System.out.println(elem.getElementsByTagName("id").item(0).getTextContent());
			System.out.println(elem.getElementsByTagName("dep").item(0).getTextContent());
			System.out.println(elem.getElementsByTagName("apellido1").item(0).getTextContent());
			System.out.println(elem.getElementsByTagName("apellido2").item(0).getTextContent());
			
			//Imprimir atributos
			elemAttr = (Element) elem.getElementsByTagName("apellidos").item(0);	
			System.out.println("Atributo orden: "+elemAttr.getAttribute("orden"));

		}

	}
}
