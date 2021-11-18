package ficheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PropioOutputStream extends ObjectOutputStream{
	
	public PropioOutputStream (FileOutputStream os) throws IOException {
		super(os);
	}

	public void writeStringHeader() {
		 
	 }
	
	
	
}
