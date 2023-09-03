package beans;

import domain.Comment;

public interface CommentStorage {
	void storeComment(Comment comment);
}
