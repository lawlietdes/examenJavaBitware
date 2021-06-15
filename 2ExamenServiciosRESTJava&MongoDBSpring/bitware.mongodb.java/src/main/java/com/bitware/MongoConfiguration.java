package com.bitware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClientOptions;

public class MongoConfiguration { 

	@Configuration 
	public class WechatMpConfiguration {

	    @Bean 
	    public MongoClientOptions mongoOptions() {
	    	return MongoClientOptions.builder().maxConnectionIdleTime(6000).build();
	    }
	}

}
