/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.registrationcore;

public final class RegistrationCoreConstants {
	
	/**
	 * Specifies the identifier source to use when generating patient identifiers
	 */
	public static final String GP_IDENTIFIER_SOURCE_ID = "registrationcore.identifierSourceId";
	
	public static final String DATE_FORMAT_STRING = "yyyy-MM-dd HH:mm:ss";
	
	public static final String TOPIC_NAME = "org.openmrs.module.registrationcore.RegistrationEvent";
	
	public static final String KEY_PATIENT_UUID = "patientUuid";
	
	public static final String KEY_RELATIONSHIP_UUIDS = "relationshipUuids";
	
	public static final String KEY_REGISTERER_UUID = "registererUuid";
	
	public static final String KEY_DATE_REGISTERED = "dateRegistered";
	
	public static final String KEY_WAS_A_PERSON = "wasAPerson";

    public static final String GP_PATIENT_NAME_SEARCH = "registrationcore.patientNameSearch";
    
    public static final String GP_FAST_SIMILAR_PATIENT_SEARCH_ALGORITHM = "registrationcore.fastSimilarPatientSearchAlgorithm";
    
    public static final String GP_PRECISE_SIMILAR_PATIENT_SEARCH_ALGORITHM = "registrationcore.preciseSimilarPatientSearchAlgorithm";

    public static final String LOCATION_TAG_IDENTIFIER_ASSIGNMENT_LOCATION = "Identifier Assignment Location";
}
