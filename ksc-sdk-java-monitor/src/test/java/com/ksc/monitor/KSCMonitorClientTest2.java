package com.ksc.monitor;

import static org.junit.Assert.*;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.monitor.model.GetMetricStatisticsRequest;
import com.ksc.monitor.model.ListMetricsRequest;

public class KSCMonitorClientTest2 {
	private static final Logger log = Logger.getLogger(KSCMonitorClientTest.class);
	private AWSCredentials credentials = new BasicAWSCredentials("AKLTaUFyVAk1RkWENHzzVUDHZw",
			"OOgOslptTgnQqr93QjyVwhuJL6ec2LYIuSzRb1jyc7McLs/1wr93gFGjcHTjYXhfcw==");
	@Test
	public void listMetrics(){
		ListMetricsRequest request=new ListMetricsRequest();
		request.setVersion("2017-07-01");
		String data=body();
		request.setData(data);
		KSCMonitorClient client=new KSCMonitorClient(credentials);
		client.setEndpoint("http://monitor.cn-shanghai-3.api.ksyun.com");
		Object result=(Object)client.listMetrics(request);
		System.out.println(result);
		log.debug(result);
	}
	private String body() throws JSONException{
		JSONObject data = new JSONObject();
		JSONArray dimensions = new JSONArray();
		data.put("nameSpace", "keip");
		data.put("metricName", "openapi.lantcy.0");
		data.put("period", new Integer(60));
		data.put("method", "avg");
		data.put("startTime", "2017-06-19T07:00:00Z");
		data.put("endTime", "2017-06-19T07:47:00Z");
		dimensions.put("k1=v1");
		dimensions.put("k2=v2");
		dimensions.put("k3=v3");
		data.put("dimensions", dimensions);
		data.put("nameSpace", "keip");
		
		return data.toString();
	}
	
}
