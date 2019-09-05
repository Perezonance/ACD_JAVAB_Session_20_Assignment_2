package hibernate;

import javax.persistence.*;

@Entity
@Table(name="message")
public class MessageNew {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true,nullable=false)
	private int id;
	
	@Column(name="message_text", unique=false, nullable=false)
	private String messageText;
	
	public MessageNew() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
