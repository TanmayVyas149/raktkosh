package com.raktkosh.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.raktkosh.core.Antigens;
import com.raktkosh.core.BloodTypes;
import com.raktkosh.core.PostCategory;
import com.raktkosh.exceptions.CustomException;
import com.raktkosh.pojos.Post;
import com.raktkosh.pojos.User;
import com.raktkosh.repositories.UserPostRepository;
import com.raktkosh.repositories.UserRepository;


@Service
@Transactional
public class PostServiceImpl implements IPostService {
	
	@Autowired
	private UserPostRepository userPostRepo;
	
	@Autowired
  private UserRepository userRepo;

	@Override
	public Post addPost(Post post, Long userId) {
    User user =  userRepo.findById(userId).orElseThrow(() -> new CustomException("User not found"));
    post.setUserId(user);
		return userPostRepo.save(post);
	}

	@Override
	public boolean deletePostById(Long id) {
		
		userPostRepo.deleteById(id);
		return true;
	}

	@Override
	public List<Post> findByTypeAndAntigen(BloodTypes type, Antigens antigen) {
		System.out.println(type +" and ,"+ antigen);
		
		return userPostRepo.findByTypeAndAntigen(type, antigen);
	}

	@Override
	public List<Post> findByPostCategory(PostCategory postcategory) {

		return userPostRepo.findByPostCategory(postcategory);
	}

	@Override
	public List<Post> findByTypeAndSort(BloodTypes type, Antigens antigen,Sort sort) {
		return userPostRepo.findByTypeAndSort(type, antigen, Sort.by("createdOn"));
	}
	@Override
	public Post findById(Long id) {
		return userPostRepo.findById(id).orElseThrow();
		
	}

  @Override
  public List<Post> getAllPostByUser(Long userID) {
    User user = new User();
    user.setId(userID);
    return userPostRepo.findByUserId(user);
  }

  @Override
  public List<Post> getAllPosts() {
    return userPostRepo.findAll();
  }

}
