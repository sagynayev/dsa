package Users;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;

import Communication.Action;

public class Admin {
	private static Vector <Action> logFiles;
	public static void serilaizeLogFiles() throws IOException {
	    try {
	      FileOutputStream fos = new FileOutputStream("logFiles.out");
	      ObjectOutputStream log = new ObjectOutputStream(fos);
	      log.writeObject(logFiles); log.flush(); log.close(); fos.close();
	    } 
	    catch(Exception e) {e.getStackTrace();}

}
}
