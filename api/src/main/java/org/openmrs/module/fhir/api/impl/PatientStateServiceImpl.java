package org.openmrs.module.fhir.api.impl;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.Condition;
import org.hl7.fhir.dstu3.model.Reference;
import org.openmrs.PatientState;
import org.openmrs.api.context.Context;
import org.openmrs.module.fhir.api.PatientStateService;


import org.openmrs.PatientState
import org.openmrs.module.fhir.api.util.FHIRConstants;

public class PatientStateServiceImpl implements PatientStateService {


    @Override
    public Condition getPatientState(String uuid) {
        PatientState omrsPatientState = Context.getProgramWorkflowService().getPatientStateByUuid(uuid);
        Condition condition = new Condition();

        ///////////
        String patientProgramUuid = omrsPatientState.getPatientProgram().getUuid();
        Reference reference = new Reference();
        reference.setReference(FHIRConstants.PATIENT_PROGRAM + "/" + patientProgramUuid);
        reference.setId(patientProgramUuid);
        condition.setContext(reference);

        omrsPatientState.getState().getUuid();
        CodeableConcept codeableConcept = new CodeableConcept();
        Coding coding = new Coding();
        coding.setSystem(FHIRConstants.OPENMRS_URI)
                .setCode()
        codeableConcept.setCoding()
        condition.setCode()

        return null;
    }
}
