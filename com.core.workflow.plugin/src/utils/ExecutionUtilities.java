package utils;

import org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher;

public class ExecutionUtilities {

 
	public static void executeWorkflow_launcher() {
 
		
		Mwe2Launcher.main(new String[] { "file://D:/work/mwe2/Test.mwe2","-p","rootPath=file://D:/work/mwe2"});
	}
	
	
	public static void main(String[] args) {

		executeWorkflow_launcher();
	}
	 
}
