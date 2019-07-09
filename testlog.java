import java.io.IOException;
import java.util.logging.*;

public class testlog{
	public static int var=5;
	private static final Logger LOGGER = Logger.getLogger(testlog.class.getName());
	public static void main(String[] args){
		Handler fileHandler = null;
		try{
		fileHandler = new FileHandler("./fichierinfo.log");
		System.out.println("Salut!");
		LOGGER.addHandler(fileHandler);
		LOGGER.info("Logger Name: "+LOGGER.getName()+"\nRésultat à extraire : " + var);
	}catch(IOException exception){
		LOGGER.info("neux");
}
}
}
