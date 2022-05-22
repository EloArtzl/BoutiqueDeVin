package servelet_files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import model.Admin;
import model.ErrorAdd;
import model.Vins;
@WebListener
public class MyServeletContext implements ServletContextListener {

	private static final Logger LOG=Logger.getLogger(MyServeletContext.class.getName());
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		// TODO Auto-generated method stub
		LOG.log(Level.INFO,"**********Boutique de VIN APP stoped***********");
		
		ServletContextListener.super.contextDestroyed(sce);
		main();
		
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContextListener.super.contextInitialized(sce);
		LOG.log(Level.INFO,"**********Boutique de VIN APP started***********");
//		try {
//			Admin.getInstance();
//		} catch (ErrorAdd e) {
//			e.printStackTrace();
//		}
		
	}
	public static void main() {
		try {
			Vins v= Vins.getInstance();
			FileOutputStream fos= new FileOutputStream("leFichierDesVins");
			
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			
			oos.writeObject(v.findById(1));
			LOG.log(Level.INFO,"*******************Le Contenu du Catalogue est déversé dans le fichier:************************");
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
