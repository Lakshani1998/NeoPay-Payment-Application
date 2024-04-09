package com.example.NeoPay.Service;

import com.example.NeoPay.DTO.UserDTO;
import com.example.NeoPay.Entity.User;
import com.example.NeoPay.Repo.UserRepo;
import com.example.NeoPay.Util.VarList;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public String registerUser(UserDTO userDTO){
        if (userRepo.existsById(userDTO.getUserId())){
            return VarList.RSP_DUPLICATED;
        }else{
            userRepo.save(modelMapper.map(userDTO, User.class));
            return VarList.RSP_SUCCESS;
        }

    }
}
