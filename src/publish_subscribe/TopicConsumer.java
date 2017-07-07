package publish_subscribe;

import javax.jms.Message;

// Java. packages are for the standard java, 
// while the Javax package are for the Java Extensions

import javax.jms.MessageListener; // We need to add any application server in order to use the jms library

public class TopicConsumer implements MessageListener{

	public static void main(String[] args) {
//		System.out.println("I am consumer");
	}

	@Override
	public void onMessage(Message arg0) {
		// TODO Auto-generated method stub
		
	}

}
