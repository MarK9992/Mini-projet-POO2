package config;

public class ConfigXML {
	
	// TODO en cours
	 XStream xstream = new XStream();
	 String xml = xstream.toXML(myObject); // serialize to XML
	 Object myObject2 = xstream.fromXML(xml); // deserialize from XML
}
