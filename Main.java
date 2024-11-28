import java.util.Scanner;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;	
import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.nio.file.Files; 
import java.net.*;

public class Main {
	public static void runCommand() throws IOException, InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(">>>");
		String command=sc.nextLine();
		
		//Help
		if (command.equals("help"))
		{
			System.out.println("------------------------All the commands and their uses are listed below which can be used as needed---------------------");
			System.out.println("   ");
					System.out.println("Help--> This command lists all the commands with thier uses.");
			System.out.println("   ");
					System.out.println("cls--> This command clears the console window.");
			System.out.println("   ");
					System.out.println("list-dir--> This command lists all the directory in the current folder.");
			System.out.println("   ");
					System.out.println("echo--> This command prints the input given in the console window.");
			System.out.println("   ");
					System.out.println("open-file filename--> This command will open the file that is provided as filename.");
			System.out.println("   ");
					System.out.println("create-file filename.txt--> This command creates file by the filename given to it.");
			System.out.println("   ");
					System.out.println("open-folder foldername--> This command will open the folder that is provided as the folder name.");
			System.out.println("   ");
					System.out.println("write-file filename--> This command helps to write into the textfile.");
			System.out.println("   ");
					System.out.println("read-file filename--> This command displays the content of file in console window.");
			System.out.println("   ");
					System.out.println("file-info filename--> This command displays all the details regarding the file such as file size, location.");
			System.out.println("   ");
					System.out.println("delete-file filename--> This command will delete the given file.");
			System.out.println("   ");
					System.out.println("copy-file filename--> This command will create a duplicate file of the given file.");
			System.out.println("   ");
					System.out.println("rename-file old_filename new_filename--> This command will rename the given file.");
			System.out.println("   ");
					System.out.println("file-size filename--> This command will display the size of the given file.");
			System.out.println("   ");
					System.out.println("file-help--> This command provides the all the list of commands related to files and their uses.");
			System.out.println("   ");
					System.out.println("date--> This command displays the current date.");
			System.out.println("   ");
					System.out.println("time--> This command displays the current time.");
			System.out.println("   ");
					System.out.println("date-time--> This command will give the current date and time both.");
			System.out.println("   ");
					System.out.println("show-ip--> This command will show the ip-address of the computer or the device.");
			System.out.println("   ");
					System.out.println("show-mac--> This command will show the mac-address of the device.");
			System.out.println("   ");
					System.out.println("whoami--> this command displays the admin user name of the device.");
			System.out.println("   ");
					System.out.println("display-location--> This command will show the location of computer(Computer must be connected to the internet for result to be displayed).");
			System.out.println("   ");
					System.out.println("restart--> This command will restart the system.");
			System.out.println("   ");
					System.out.println("sleep--> This command make the system in the sleep mode.");
			System.out.println("   ");
					System.out.println("shutdown--> This command shuts down the system.");
			System.out.println("   ");
					System.out.println("hybernate--> this command sends your device to hibernation state.");
			System.out.println("   ");
					System.out.println("shutdown -interval--> This command provides a certain period of time for device to shutdown.");
			System.out.println("   ");
					System.out.println("restart -interval--> This command provides a cretain period of time for device to restart.");
			System.out.println("   ");
					System.out.println("hybernate -interval--> This command provides a certain period of time for device to hybernate.");
			System.out.println("   ");
					System.out.println("abort-shutdown--> This command aborts the shutdown command given to the device.");
			System.out.println("   ");
					System.out.println("abort-restart--> This command aborts the restart command given to the device.");
			System.out.println("   ");
					System.out.println("abort-hybernate--> This command aborts the hybernate command given to the device.");
			System.out.println("   ");
					System.out.println("computer-info--> This command shows the detailed information about the system's configuration.");
			System.out.println("   ");
					System.out.println("show-disk--> This command will list the disk available in the computer.");
			System.out.println("   ");
					System.out.println("open-app--> This command opens the application given with the command.");
			System.out.println("   ");
					System.out.println("open-appname--> This command first opens chrome(if not available in system ,throws error), then opens specific site given in chrome tab.");
			System.out.println("   ");
					System.out.println("open-websitename--> This command opens the particular website in the browser present in your device.");
			System.out.println("   ");
					System.out.println("open-chrome--> This command opens chrome app in your device.");
			System.out.println("   ");
					System.out.println("open-wikipedia--> This command opens wikipedia in chrome tab.");
			System.out.println("   ");
					System.out.println("open-youtube--> This command redirects to chrome app to open youtube in chrome tab.");
			System.out.println("   ");
					System.out.println("open-google--> This command opens google in chrome app.");
			System.out.println("   ");
					System.out.println("software-info--> This command gives details about the makers of the terminal.");
			System.out.println("   ");
					System.out.println("exit--> The terminal exits after the use of this commands.");
			System.out.println("   ");
					System.out.println("If someone gives a wrong input--> the terminal will throw 'wrong command input'.");
			System.out.println("   ");
					System.out.println("compile-c filename.c--> This commands compiles the c program given by the user.");
			System.out.println("   ");
					System.out.println("compile-cpp filename.cpp--> This command compiles the c++ program given by the user.");
			System.out.println("   ");
			runCommand();
		}
		//clear console
		else if(command.equals("cls"))
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			runCommand();
		}
		//echo
		else if(command.startsWith("echo "))
		{
			System.out.println(command.substring(5));
			runCommand();
		}
		//list directory 
		else if (command.equals("list-dir"))
		{
			try {
				String currentPath = new java.io.File( "." ).getCanonicalPath();
				File file = new File(currentPath);
	
			    // returns an array of all files
			    String[] fileList = file.list();
	
			    for(String str : fileList) {
			      System.out.println(str);
			    }
			    runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
			}
		}
		//open file
		else if(command.startsWith("open-file ") && command.length()>10)
		{
			
			try {
				String fileName=command.substring(10);
				String currentPath = new java.io.File( "." ).getCanonicalPath();
				String path=currentPath+"\\"+fileName;
				File file =new File(path);
				
				if (file.exists())
				{
					Process pro=Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+path);
					pro.waitFor();
					runCommand();
				}
				else
				{
					System.out.println("File doesn't exists.");
					runCommand();
				}
				
			}catch (Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//open folder
		else if (command.equals("open-folder"))
		{
			try {
				
				String path = new java.io.File( "." ).getCanonicalPath();
				File file =new File(path);
				
				if (file.exists())
				{
					Process pro=Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+path);
					pro.waitFor();
					runCommand();
				}
				else
				{
					System.out.println("File doesn't exists.");
					runCommand();
				}
				
			}catch (Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//create-file
		else if(command.startsWith("create-file "))
		{
			try {
				String fileName=command.substring(12);
				File myObj=new File(fileName);
				if(myObj.createNewFile())
				{
					System.out.println(fileName+" created successfylly.");
					runCommand();
				}
				else
				{
					System.out.println("File already exists.");
					runCommand();
				}
			}catch (Exception e)
			{
				System.out.println("An error occured.");
			}
		}
		//write-file If file is not present then it creates the file.
		else if(command.startsWith("write-file " ))
		{
			
			try {
				String fileName=command.substring(11);
				FileWriter myWriter=new FileWriter(fileName);
				String content=sc.nextLine();
				myWriter.write(content);
				myWriter.close();
				System.out.println("Successfully wrote to the file.");
				runCommand();
			}catch (Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//read-file
		else if(command.startsWith("read-file "))
		{
			try {
				String fileName=command.substring(10);
				File myObj=new File(fileName);
				if(myObj.exists())
				{
					Scanner myReader=new Scanner(myObj);
					while(myReader.hasNextLine())
					{
						String data=myReader.nextLine();
						System.out.println(data);
					}
					myReader.close();
					runCommand();
				}else {
					System.out.println("No such file exists.");
					runCommand();
				}
				
			}catch(Exception e)
			{
				System.out.println("No such file exists.");
				runCommand();
			}
		}
		//File-info	
		else if(command.startsWith("file-info ")) 
		{
			try {
				String fileName=command.substring(10);
				File myObj=new File(fileName);
				if(myObj.exists()) {
					System.out.println("File name: "+myObj.getName());
					System.out.println("Absolute path: "+myObj.getAbsolutePath());
					System.out.println("Writable: "+myObj.canWrite());
					System.out.println("Readable: "+myObj.canRead());
					System.out.println("File size in bytes: "+myObj.length());
					runCommand();
				}else
				{
					System.out.println("No such file exists.");
					runCommand();
				}
				
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//delete file
		else if(command.startsWith("delete-file "))
		{
			
			try{
				String fileName=command.substring(12);
				File myObj=new File(fileName);
				if(myObj.delete())
				{
					System.out.println("File deleted successfully.");
					runCommand();
				}else {
					System.out.println("No such file exists.");
					runCommand();
				}
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
			
		}
		//copy-file
		else if(command.startsWith("copy-file "))
		{
			try {
				String fileName=command.substring(10);
				File originalFile=new File(fileName);
				if(originalFile.exists()) {
					File copiedFile=new File("Copied_"+fileName);
					Files.copy(originalFile.toPath(), copiedFile.toPath());
					System.out.println("File copied successfully.");
					runCommand();
				}else {
					System.out.println("No such file exists.");
					runCommand();
				}
			}catch(Exception e)
			{
				System.out.println("An error occured.");
			}
		}
		//rename-file
		else if(command.startsWith("rename-file "))
		{
			try{
				String fileName=command.substring(12);
				File originalFile=new File(fileName);
				if(originalFile.exists())
				{
					System.out.println("Enter new name: ");
					String newName=sc.nextLine();
					File renamedFile=new File(newName);
					if(originalFile.renameTo(renamedFile))
					{
						System.out.println(originalFile.getName()+" renamed to "+renamedFile.getName());
						runCommand();
					}else {
						System.out.println("Such file already exists.");
						runCommand();
					}
				}else {
					System.out.println("No such file exists.");
					runCommand();
				}
				
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}			
		}
		//File-size
		else if(command.startsWith("file-size "))
		{
			try {
				String fileName=command.substring(10);
				File myObj=new File(fileName);
				if(myObj.exists()) {
					System.out.println(myObj.length()+" bytes");
					runCommand();
				}else {
					System.out.println("No such file exists.");
					runCommand();
				}
			}catch(Exception e) {
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//file-help
		else if(command.equals("file-help"))
		{
			try {
				System.out.println("-----------The following commands are the file related commands which you can run in the terminal.----------");
				System.out.println("   ");
						System.out.println("list-dir--> This command lists all the directory in the current folder.");
				System.out.println("   ");
						System.out.println("open-file filename--> This command will open the file that is provided as filename.");
				System.out.println("   ");
						System.out.println("create-file filename.txt--> This command creates file by the filename given to it.");
				System.out.println("   ");
						System.out.println("open-folder foldername--> This command will open the folder that is provided as the folder name.");
				System.out.println("   ");
						System.out.println("write-file filename--> This command helps to write into the textfile.");
				System.out.println("   ");
						System.out.println("read-file filename--> This command displays the content of file in console window.");
				System.out.println("   ");
						System.out.println("file-info filename--> This command displays all the details regarding the file such as file size, location.");
				System.out.println("   ");
						System.out.println("delete-file filename--> This command will delete the given file.");
				System.out.println("   ");
						System.out.println("copy-file filename--> This command will create a duplicate file of the given file.");
				System.out.println("   ");
						System.out.println("rename-file old_filename new_filename--> This command will rename the given file.");
				System.out.println("   ");
						System.out.println("file-size filename--> This command will display the size of the given file.");
				System.out.println("   ");
						System.out.println("file-help--> This command provides the all the list of commands related to files and their uses.");
				System.out.println("   ");
						System.out.println("-----------------------You can use help command to know commands apart from file handling.-----------------");
				runCommand();
			}catch(Exception e) 
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//date
		else if(command.equals("date"))
		{
			try {
				System.out.println(java.time.LocalDate.now());
				runCommand();
			}catch(Exception e)
			{
				System.out.println();
				runCommand();
			}
		}
		//time
		else if(command.equals("time"))
		{
			try {
				System.out.println(java.time.LocalTime.now());
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//date-time
		else if(command.equals("date-time") || command.equals("date-time ")) {
			try {
				System.out.print(java.time.LocalDate.now());
				System.out.println(" "+java.time.LocalTime.now());
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//ip-address
		else if(command.equals("show-ip") || command.equals("show-ip ")) {
			try{
				InetAddress IP = InetAddress.getLocalHost();
				System.out.println("IP of my system is := "+IP.getHostAddress());
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
	        
		}
		//mac-address
		else if(command.equals("show-mac") || command.equals("show-mac "))
		{
			InetAddress ip;
			try {
				ip = InetAddress.getLocalHost();
				NetworkInterface network = NetworkInterface.getByInetAddress(ip);
				byte[] mac = network.getHardwareAddress();
	            
		        System.out.print("MAC adress of my system is : ");
		            
		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < mac.length; i++) {
		            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
		        }
		        System.out.println(sb.toString());
		        runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//whoami
		else if(command.equals("whoami"))
		{
			try {
				String username = System.getProperty("user.name");
			    System.out.println(username);
			    runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//get-current-location
		else if(command.equals("display-location"))
		{
			try {
				System.out.println("Nepal");
				System.out.println("Province-01");
				System.out.println("Sunsari");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//shutdown
		else if(command.equals("shutdown"))
		{
			try {
				Runtime r=Runtime.getRuntime();
				System.out.println("System is going to shutdown.");
				r.exec("shutdown -s");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//reboot
		else if(command.equals("reboot"))
		{
			try {
				Runtime r=Runtime.getRuntime();
				System.out.println("System is going to restart.");
				r.exec("shutdown -r");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//hybernate
		else if(command.equals("hybernate")) {
			try {
				Runtime r=Runtime.getRuntime();
				System.out.println("System is going to hybernate.");
				r.exec("shutdown -h");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//shutdown-interval
		else if(command.startsWith("shutdown -")) {
			try {
				String time=command.substring(10);
				int intTime=Integer.parseInt(time);
				Runtime r=Runtime.getRuntime();
				System.out.println("System will shutdown in "+time+" secs.");
				r.exec("shutdown -s -t "+intTime);
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}			
		}
		//restart-interval
		else if(command.startsWith("restart -"))
		{
			try {
				String time=command.substring(9);
				int intTime=Integer.parseInt(time);
				Runtime r=Runtime.getRuntime();
				System.out.println("System will restart in "+time+" secs.");
				r.exec("shutdown -r -t "+intTime);
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//hybernate-interval
		else if(command.startsWith("hybernate -")) {
			try {
				String time=command.substring(11);
				int intTime=Integer.parseInt(time);
				Runtime r=Runtime.getRuntime();
				System.out.println("System will hybernate in "+intTime+" secs.");
				r.exec("shutdown -h -t "+intTime);
				
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//sleep
		else if(command.equals("sleep"))
		{
			try {
				Runtime.getRuntime().exec("Rundll32.exe powrprof.dll,SetSuspendState Sleep");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//abort timer restart or shutdown
		else if(command.equals("abort-shutdown") || command.equals("abort-restart") || command.equals("abort-hybernate"))
		{
			try {
				Runtime r=Runtime.getRuntime();
				r.exec("shutdown -a");
				System.out.println("Command Aborted.");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
			
		}
		//computer info
		else if(command.equals("computer-info"))
		{
			try {
				System.out.println("Name of OS: "+ System.getProperty("os.name"));
				System.out.println("Version of OS: "+System.getProperty("os.version"));
				System.out.println("Architecture of OS: "+System.getProperty("os.arch"));
				System.out.println("User Name: "+System.getProperty("user.name"));
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//show disk
		else if(command.equals("show-disk"))
		{
			try {
				FileSystemView fsv = FileSystemView.getFileSystemView();
		         
		        File[] drives = File.listRoots();
		        if (drives != null && drives.length > 0) {
		            for (File aDrive : drives) {
		                System.out.println("Drive Letter: " + aDrive);
		                System.out.println("\tType: " + fsv.getSystemTypeDescription(aDrive));
		                System.out.println("\tTotal space: " + aDrive.getTotalSpace());
		                System.out.println("\tFree space: " + aDrive.getFreeSpace());
		                System.out.println();
		            }
		        }
		        runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//info
		else if(command.equals("software-info"))
		{
			try {
				System.out.println("This terminal was made as OS Project made by: ");
				System.out.println("Deepak Raj Gupta");
				System.out.println("Aditya Yadav");
				System.out.println("Aadarshbhushan Singh");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//compile cpp program
		else if(command.startsWith("compile-cpp "))
		{
			String fileName=command.substring(12);
			File originalFile=new File(fileName);
			if(originalFile.exists())
			{
				String outputFile=fileName.substring(0, fileName.length() -4);
				String commandFire="g++ "+fileName+" -o "+outputFile+".exe";
	//			System.out.println(fileName+" "+outputFile+" "+commandFire);
				Process p=Runtime.getRuntime().exec(commandFire);
				System.out.println("File compiled successfully.");
				runCommand();
				try {
					
				}catch(Exception e)
				{
					System.out.println("An error occured.");
					System.out.println(e.getMessage());
					runCommand();
				}
			}else {
				System.out.println("File doesn't exist.");
				runCommand();
			}
		}
		//compile c program
		else if(command.startsWith("compile-c "))
		{
			String fileName=command.substring(10);
			File originalFile=new File(fileName);
			if(originalFile.exists())
			{
				try {
					String outputFile=fileName.substring(0, fileName.length() -2);
					String commandFire="g++ "+fileName+" -o "+outputFile+".exe";
					Process p=Runtime.getRuntime().exec(commandFire);
					runCommand();
				}catch(Exception e)
				{
					System.out.println("An error occured.");
					runCommand();
				}
			}else {
				System.out.println("File doesn't exist.");
				runCommand();
			}
		}
		//open notepad
		else if(command.equals("open-notepad"))
		{
			try {
				Runtime rt=Runtime.getRuntime();
				rt.exec("notepad.exe");
				runCommand();
			}catch(Exception e)
			{
				System.out.println("An error occured.");
				runCommand();
			}
		}
		
		//open Chrome
		else if(command.equals("open-chrome"))
		{
			try {
			    Process p = Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			    p.waitFor();
			    System.out.println("Google Chrome launched!");
			    runCommand();
			} catch (Exception e) {
			    e.printStackTrace();
			    runCommand();
			}
		}
		//open-youtube
		else if(command.equals("open-youtube"))
		{	
			Desktop desktop = java.awt.Desktop.getDesktop();
			try {
				//specify the protocol along with the URL
				URI oURL = new URI("https://www.youtube.com/");
				desktop.browse(oURL);
				runCommand();
			} catch (URISyntaxException e) {
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//open-wikipedia
		else if(command.equals("open-wikipedia"))
		{
			Desktop desktop = java.awt.Desktop.getDesktop();
			try {
				//specify the protocol along with the URL
				URI oURL = new URI("https://www.wikipedia.org/");
				desktop.browse(oURL);
				runCommand();
			} catch (URISyntaxException e) {
				System.out.println("An error occured.");
				runCommand();
			}
		}
		//open-google
		else if(command.equals("open-google"))
		{
			Desktop desktop = java.awt.Desktop.getDesktop();
			try {
				//specify the protocol along with the URL
				URI oURL = new URI("https://www.google.com/");
				desktop.browse(oURL);
				runCommand();
			} catch (URISyntaxException e) {
				System.out.println("An error occured.");
				runCommand();
			}
		}
		
		
		//exit
		else if(command.equals("exit"))
		{
			System.out.println("Terminal Closed");
			System.exit(0);	
		}
		//default
		else {
			System.out.println("Wrong Command Input.");
			runCommand();
		}
		sc.close();
	}
	
	public static void main(String[] args)
	{
		try {
			runCommand();	
		}catch (Exception e)
		{
			System.out.println("An error occured.");
		}		
	}
}