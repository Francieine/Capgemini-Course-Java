package Shapes;

import Shapes.enums.Color;

public abstract class Shape { //calsse base para outros que sao ramificações suas
	
	private Color color;
	
	
	public Shape() {
		
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area();{ //metodo abstrato
		
	}

}
