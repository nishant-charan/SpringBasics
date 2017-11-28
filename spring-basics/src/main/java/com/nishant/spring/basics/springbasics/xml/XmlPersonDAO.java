package com.nishant.spring.basics.springbasics.xml;

public class XmlPersonDAO {
	
	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
		this.xmlJdbcConnection = xmlJdbcConnection;
	}

	private XmlJdbcConnection xmlJdbcConnection;


}
