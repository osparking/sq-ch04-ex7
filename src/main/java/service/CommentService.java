package service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import beans.CommNotiProxy;
import beans.CommentStorage;
import domain.Comment;

@Service
public class CommentService {
	private CommNotiProxy notiProxy;
	private CommentStorage cmtStorage;

	public CommentService(@Qualifier("push") CommNotiProxy notiProxy,
			CommentStorage cmtStorage) {
		this.notiProxy = notiProxy;
		this.cmtStorage = cmtStorage;
	}

	public void publishComment(Comment comment) {
		notiProxy.notifyComment(comment);
		cmtStorage.storeComment(comment);
	}
}
