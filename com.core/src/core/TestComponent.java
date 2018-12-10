package core;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class TestComponent extends WorkflowComponentWithModelSlot {

	public TestComponent() {
		setModelSlot("Model");
	}
	@Override
	protected void invokeInternal(WorkflowContext arg0, ProgressMonitor arg1, Issues arg2) {

		System.out.println("printing from TestComponent : part of com.core plugin");
	}

}
