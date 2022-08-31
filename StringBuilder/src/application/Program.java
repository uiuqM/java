package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("Que coisa feia!");
		Comment c2 = new Comment("gatinhooo");
		
		Post p1 = new Post(sdf.parse("10/08/2022 18:09:07"),
				"Postando selfie",
				"Primeira vez postando uma selfie aqui!",
				9);
		p1.addComments(c1);
		p1.addComments(c2);
		System.out.println(p1);
	}

}
