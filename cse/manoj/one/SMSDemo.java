package cse.manoj.one;

import java.io.IOException;
import java.util.Properties;

import org.marre.sms.SmsAddress;
import org.marre.sms.SmsException;
import org.marre.sms.SmsTextMessage;
import org.marre.sms.transport.SmsTransport;
import org.marre.sms.transport.SmsTransportManager;

public class SMSDemo {

	public static void main(String[] args) throws SmsException, IOException {
		// The username, password and apiid is sent to the clickatell transport
		// in a Properties				
		Properties props = new Properties();

		props.setProperty("smsj.clickatell.username", "ivsmonaj");
		props.setProperty("smsj.clickatell.password", "ALNUPfSEMVTGRX");
		props.setProperty("smsj.clickatell.apiid", "IMLW39");

		// Load the clickatell transport
		SmsTransport transport = SmsTransportManager.getTransport("org.marre.sms.transport.clickatell.ClickatellTransport", props);

		// Connect to clickatell
		transport.connect();

		// Create the sms message
		SmsTextMessage textMessage = new SmsTextMessage("A sample SMS.");

		// Send the sms to "461234" from "461235"
		transport.send(textMessage, new SmsAddress("7169072432"), new SmsAddress("461235"));
						
		// Disconnect from clickatell
		transport.disconnect();
		
		/*// TODO Auto-generated method stub
		// Send SMS with clickatell
		SmsSender smsSender = SmsSender.getClickatellSender("ivsmonaj", "ALNUPfSEMVTGRX", "IMLW39");
		// The message that you want to send.
		String msg = "A sample SMS.";
		// International number to reciever without leading "+"
		String reciever = "7169072432";
		// Number of sender (not supported on all transports)
		String sender = "7169072210";
		smsSender.connect();
		String msgids = (String) smsSender.sendTextSms(msg, reciever, sender);
		smsSender.disconnect();*/
	}

}
