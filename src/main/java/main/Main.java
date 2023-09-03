package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import domain.Comment;
import service.CommentService;

public class Main {

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var service = ctx.getBean(CommentService.class);
		var comment = new Comment();
		comment.setAuthor("박아무개");
		comment.setText("한국의 경제상황을 분석하라");
		service.publishComment(comment);
	}

}
