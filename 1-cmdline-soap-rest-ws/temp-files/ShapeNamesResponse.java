package com.eli.calc.shape.service.ws.resp;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;

import com.eli.calc.shape.model.ShapeName;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)//required to get map
public class ShapeNamesResponse extends StatusResponse {

	private Map<Integer,ShapeName> shapeNames;

	public ShapeNamesResponse() {

		super(StatusCode.SUCCESS,"Shape Names");

		shapeNames = new HashMap<Integer,ShapeName>();

		for (ShapeName shape : ShapeName.values()) {
			this.shapeNames.put(shape.ordinal(), shape);
		}
	}
	
	public Map<Integer,ShapeName> getShapeNames() {
		return shapeNames;
	}
}
