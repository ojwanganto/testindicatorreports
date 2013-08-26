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

package org.openmrs.module.amrsreports.reporting.common;

import org.openmrs.Encounter;

import java.util.Comparator;

public class EncounterDatetimeComparator implements Comparator<Encounter> {
	@Override
	public int compare(Encounter a, Encounter b) {
		if (a == null ^ b == null) {
			return (a == null) ? -1 : 1;
		}

		if (a == null && b == null) {
			return 0;
		}

		if (a.getEncounterDatetime() == null ^ b.getEncounterDatetime() == null) {
			return (a.getEncounterDatetime() == null) ? -1 : 1;
		}

		if (a.getEncounterDatetime() == null && b.getEncounterDatetime() == null) {
			return 0;
		}

		return a.getEncounterDatetime().compareTo(b.getEncounterDatetime());

	}
}
