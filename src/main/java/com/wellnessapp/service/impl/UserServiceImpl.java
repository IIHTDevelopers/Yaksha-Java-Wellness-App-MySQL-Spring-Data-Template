package com.wellnessapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wellnessapp.dto.UserDTO;
import com.wellnessapp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public UserDTO createUser(UserDTO userDto) {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO getUserById(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public List<UserDTO> getAllUsers() {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO updateUser(Long id, UserDTO userDto) {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteUser(Long id) {
		// write your logic here
		return false;
	}
}