package beans.imple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import beans.CommNotiProxy;
import domain.Comment;
import util.Util;

@Component
@Qualifier("email")
public class CommEmailNotiProxy implements CommNotiProxy {

	@Override
	public void notifyComment(Comment comment) {
		Util.System_out.println("이메일된 코멘트 텍스트: " + comment.getText());
	}

}
