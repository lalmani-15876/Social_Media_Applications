package com.lalmani.service;

import java.util.List;

import com.lalmani.exception.LikeException;
import com.lalmani.exception.TwitException;
import com.lalmani.exception.UserException;
import com.lalmani.model.Like;
import com.lalmani.model.Twit;
import com.lalmani.model.User;

public interface LikesService {
	
	public Like likeTwit(Long twitId, User user) throws UserException, TwitException;
	
	public Like unlikeTwit(Long twitId, User user) throws UserException, TwitException, LikeException;
	
	public List<Like> getAllLikes(Long twitId) throws TwitException;

}
