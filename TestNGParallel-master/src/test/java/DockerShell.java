

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class DockerShell {
	
	@BeforeTest
	public void start_Docker() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start start_DockerGrid.bat");
		Thread.sleep(30000);
	}
	
	@AfterTest
	public void stop_Docker() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c close_DockerGrid.bat");
		Thread.sleep(15000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe"); //close cmd
	}



}
