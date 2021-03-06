package org.bahmni.batch.form;

import org.bahmni.batch.form.domain.BahmniForm;
import org.bahmni.batch.form.domain.Concept;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FormFieldTransformer {

	public List<Integer> transformFormToFieldIds(BahmniForm form){
		List<Integer> fieldIds = new ArrayList<>();

		for(Concept field: form.getFields()){
			fieldIds.add(field.getId());
		}
		return fieldIds;
	}


}
