package Shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Shapes.Rectangle;
import Shapes.Circle;

import Shapes.enums.Color;

public class ProgramShapes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>(); // cria uma lista de figuras
		
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		//ler a quantidade de figuras que se deseja obter
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #"+ i + "data: ");
			
			System.out.println("Rectangle or Circle (c/r)? ");
			char ch = sc.next().charAt(0);
			
			System.out.println("Color (BLACK/BLUE/RED"); //ira ler  a cor que o usuario digitou
			Color color = Color.valueOf(sc.next());
			
			
			if(ch == 'r') {
				System.out.println("Width: ");
				double width = sc.nextDouble();		
				
				System.out.println("Heigth: ");
				double heigth = sc.nextDouble();	
				
				list.add(new Rectangle(color, width, heigth)); //adiciona a figura na lista com suas dimensoes
				
			}else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
				
			}
			
		}
		
		
		System.out.println("");
		System.out.println(" ----- SHAPE AREAS ----- ");
		for (Shape shape : list ) { //mostra area das figuras adicionadas na lista
			System.out.println(shape.area());
		}
		
		
		sc.close();
		
	}

}
