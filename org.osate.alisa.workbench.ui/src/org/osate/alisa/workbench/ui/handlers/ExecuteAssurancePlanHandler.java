package org.osate.alisa.workbench.ui.handlers;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instantiation.InstantiateModel;
import org.osate.alisa.workbench.alisa.AssuranceEvidenceConfiguration;
import org.osate.ui.dialogs.Dialog;

public class ExecuteAssurancePlanHandler extends EditorObjectHandler {

	@Override
	protected IStatus runJob(EObject sel, IProgressMonitor monitor) {
		if (sel instanceof AssuranceEvidenceConfiguration) {
			AssuranceEvidenceConfiguration plan = (AssuranceEvidenceConfiguration) sel;
			ComponentImplementation compImpl = plan.getSystem();
			try {
				ComponentInstance si = InstantiateModel.buildInstanceModelFile(compImpl);

			} catch (Exception e) {
				Dialog.showError("Assurance case Generate",
						"Error while generating teh assurance case: " + e.getMessage());
				return Status.CANCEL_STATUS;
			}
		} else {
			Dialog.showError("Assurance case Generate", "You must select an Assurance Case Plan to generate");
			return Status.CANCEL_STATUS;
		}
		return Status.OK_STATUS;
	}

	@Override
	protected String getJobName() {
		return "Execute Assurance Plan";
	}

}
