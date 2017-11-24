package org.openmrs.module.fhir.api;

import org.hl7.fhir.dstu3.model.Condition;

public interface PatientStateService {

    Condition getPatientState(String uuid);
}
