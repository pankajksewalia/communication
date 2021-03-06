package com.tricounsel.communication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.tricounsel.communication.core.enums.ErrorCodes;
import com.tricounsel.communication.core.exception.TCComException;
import com.tricounsel.communication.dao.document.Sequence;
import com.tricounsel.communication.service.service.ServiceHelper;

@Service
public class ServiceHelperImpl implements ServiceHelper{
	
	@Autowired
	private MongoOperations mongoOperations;

	@Override
	public long getNextSequenceId(String key) {
		Query query = new Query(Criteria.where("_id").is(key));

		Update update = new Update();
		update.inc("seq", 1);

		FindAndModifyOptions options = new FindAndModifyOptions();
		options.returnNew(true);

		Sequence seq = mongoOperations.findAndModify(query, update, options, Sequence.class);

		if (seq == null) {
			throw new TCComException(ErrorCodes.UNABLE_SEQ_ID);
		}

		return seq.getSeq();
	}
}
