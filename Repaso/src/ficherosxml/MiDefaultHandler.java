package ficherosxml;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public class MiDefaultHandler extends DefaultHandler {

	boolean booId = false;
	boolean booApellido1 = false;
	boolean booApellido2 = false;
	boolean booDep = false;

	public MiDefaultHandler() {
		super();
	}

	public void startElement(String url, String localName, String qname, Attributes attributes) throws SAXException {

		if (qname.equals("id"))
			booId = true;

		if (qname.equals("dep"))
			booDep = true;

		if (qname.equals("apellido1"))
			booApellido1 = true;
		if (qname.equals("apellido2"))
			booApellido2 = true;

	}

	public void endElement(String url, String localName, String qname) {

	}

	public void characters(char cars[], int inicio, int longitud) throws SAXException {

		if (booId == true) {
			System.out.println("Id: " + new String(cars, inicio, longitud));
			booId = false;
		}
		if (booDep == true) {
			System.out.println("dep: " + new String(cars, inicio, longitud));
			booDep = false;
		}
		if (booApellido1 == true) {
			System.out.println("apellido1: " + new String(cars, inicio, longitud));
			booApellido1 = false;
		}
		
		if (booApellido2 == true) {
			System.out.println("apellido2: " + new String(cars, inicio, longitud));
			booApellido2 = false;
		}
		
	}
}
