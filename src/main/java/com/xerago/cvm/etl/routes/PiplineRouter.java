package com.xerago.cvm.etl.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class PiplineRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		from("timer://kickoff?period=10000")
			.to("cql:10.50.255.247:9042/cvm?username=root&password=xerago@999&cql=select * from campaign_tracknew")
			.split(body())
				.process("cassandraResultSetProcessor")
				.log(LoggingLevel.INFO, "${body}")
				.setBody(simple("insert into campaign_tracknew values('${body[campaign_ref_code]}','${body[wave_id]}','${body[customer_id]}','${body[channel]}','${body[metric]}','${body[call_tracking]}','${body[campaign_id]}','${body[last_updated_time]}','${body[trigger_date]}', '${body[updated_time]}', '${body[value]}', '${body[wave_position]}')"))
				.log(LoggingLevel.INFO, "${body}")
				.to("jdbc:report");
		
		
	}

}
