package ficherosxml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class FicheroV {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {

		File file = new File("FichEmpleados.xml");

		DocumentBuilderFactory dBF = DocumentBuilderFactory.newInstance();

		DocumentBuilder bd = dBF.newDocumentBuilder();
		Document dc = bd.parse(file);
		
		XPathFactory xPF = XPathFactory.newInstance();
		
		XPath xP = xPF.newXPath();
		
		
		XPathExpression exp =  xP.compile("//empleado/id[@num>3]/apellidos/apellido1/text()");
		Object obj = exp.evaluate(dc, XPathConstants.NODESET);
		NodeList nodos = (NodeList) obj;
		
		for (int i = 0; i < nodos.getLength(); i++) {
			System.out.println(nodos.item(i).getNodeValue());
		}
		
		
		 exp =  xP.compile("//empleado[2]/apellidos/apellido1/text()");
		 obj = exp.evaluate(dc, XPathConstants.NODESET);
		 nodos = (NodeList) obj;
		
		for (int i = 0; i < nodos.getLength(); i++) {
			System.out.println(nodos.item(i).getNodeValue());
		}
		
		
	}

}
