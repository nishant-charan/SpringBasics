package com.nishant.spring.basics.springbasics.xml;

public class XmlPersonService {

	XmlPersonDAO xmlPersonDAO;
	XmlClassDAO xmlClassDAO;

	public XmlPersonDAO getXmlPersonDAO() {
		return xmlPersonDAO;
	}

	public void setXmlPersonDAO(XmlPersonDAO xmlPersonDAO) {
		this.xmlPersonDAO = xmlPersonDAO;
	}

	public XmlClassDAO getXmlClassDAO() {
		return xmlClassDAO;
	}

	public void setXmlClassDAO(XmlClassDAO xmlClassDAO) {
		this.xmlClassDAO = xmlClassDAO;
	}

}
