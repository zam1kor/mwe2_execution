package app;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import utils.ExecutionUtilities;

public class Application1 implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {

		ExecutionUtilities.executeWorkflow_launcher();
		
		return null;
	}

	@Override
	public void stop() {

	}

}
