package com.java;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MyRequestHandler implements RequestHandler<Map<String, Object>, Object> {

	public Object handleRequest(Map<String, Object> input, Context context) {
		LexRequest request = LexRequestFactory.readFromMap(input);
		Message message = new Message("PlainText");
		if (request.getError() != null) {
			message.setContent(request.getError());
			return new LexResponse(new DialogAction("Close", "Failed", message));
		} else {
			String content = String.format("Message came from %s for %s. Order successfully placed for %s units",
					request.getBotName(), request.getProductName(), request.getQuantity());
			message.setContent(content);

			return new LexResponse(new DialogAction("Close", "Fulfilled", message));
		}
	}

}
