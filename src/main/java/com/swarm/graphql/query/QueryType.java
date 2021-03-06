package com.swarm.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.swarm.graphql.model.*;
import com.swarm.graphql.repository.TypeRepository;

public class QueryType  implements GraphQLQueryResolver{
	
	private TypeRepository typeRepository;

	public QueryType(TypeRepository typeRepository) {
		this.typeRepository = typeRepository;
	}

    public Iterable<Type> typesBySessionId(Long sessionId){
    	return typeRepository.findBySessionId(sessionId);
    }
    
}
