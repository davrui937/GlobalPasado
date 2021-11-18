package ficherosxml;

import java.io.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MainHandler {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		File file = new File("FichEmpleados.xml");
		
		SAXParserFactory pF = SAXParserFactory.newInstance();
		SAXParser saxP = pF.newSAXParser();
		
			
		InputStream inputS = new FileInputStream(file);
		Reader reader = new InputStreamReader(inputS);
		InputSource iS = new InputSource(reader);
		
		
		DefaultHandler handler = new MiDefaultHandler();
		
		saxP.parse(iS, handler);
				
		
		
	}

}
