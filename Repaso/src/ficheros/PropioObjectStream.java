package ficheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PropioObjectStream extends ObjectOutputStream {

	public PropioObjectStream(FileOutputStream os) throws IOException {
		super(os);
	}
	
	public void writeStringHeader() {
		
	}

}
