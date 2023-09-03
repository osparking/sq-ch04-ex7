package service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import beans.CommNotiProxy;
import domain.Comment;

@Component

public class CommentService {
	private CommNotiProxy notiProxy;

	public CommentService(@Qualifier("push") CommNotiProxy notiProxy) {
		this.notiProxy = notiProxy;
	}

	public void publishComment(Comment comment) {
		notiProxy.notifyComment(comment);
	}
}
