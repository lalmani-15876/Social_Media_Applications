package com.lalmani.request;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.lalmani.model.Like;
import com.lalmani.model.Twit;
import com.lalmani.model.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TwitReplyRequest {

	  
	    private String content;
	    
	    private Long twitId;

	    private LocalDateTime createdAt;

	    private String image; 


}
