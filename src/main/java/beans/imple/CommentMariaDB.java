package beans.imple;

import org.springframework.stereotype.Repository;

import beans.CommentStorage;
import domain.Comment;
import util.UTF_8_Printer;

@Repository
public class CommentMariaDB implements CommentStorage {

	@Override
	public void storeComment(Comment comment) {
		UTF_8_Printer.printStream
				.println("마리아DB 저장된 코멘트 텍스트: " + comment.getText());
	}

}
