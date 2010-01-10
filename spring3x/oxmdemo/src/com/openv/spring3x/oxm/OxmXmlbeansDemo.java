package com.openv.spring3x.oxm;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Result;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;
import org.springframework.util.xml.StaxUtils;

import com.openV.spring3X.xmlbeans.StockInfoDocument;

/**
 * 
 * <pre>
 * �������������
 * </pre>
 * @author luoshifei  luoshifei@yahoo.cn
 * @version 1.00.00
 * <pre>
 * �޸ļ�¼
 *    �޸ĺ�汾:     �޸��ˣ�  �޸�����:     �޸�����: 
 * </pre>
 */
public class OxmXmlbeansDemo {
	
	public static void main(String[] args) throws IOException, XMLStreamException{		

		ApplicationContext applicationContext = 
			new ClassPathXmlApplicationContext("xmlbeans.xml");

		Marshaller marshaller = applicationContext.getBean(Marshaller.class);
		
		StockInfoDocument stockInfoDocument = 
			StockInfoDocument.Factory.newInstance();
		StockInfoDocument.StockInfo stockInfo = 
			stockInfoDocument.addNewStockInfo();
		stockInfo.setName("OWCY");
		stockInfo.setDesc("OWCY Inc.");
		stockInfo.setCode(168000);
		stockInfo.setPrice(100.0);
		
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		FileWriter writer = new FileWriter("stock.xml");
		XMLStreamWriter streamWriter = outputFactory.createXMLStreamWriter(writer);
		Result result = StaxUtils.createStaxResult(streamWriter);
				
		marshaller.marshal(stockInfoDocument, result);
		
		writer.flush();
	}

}
