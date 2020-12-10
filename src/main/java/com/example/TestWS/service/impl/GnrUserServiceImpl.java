/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TestWS.service.impl;

import com.example.TestWS.dal.dto.GnrUsrDto;
import com.example.TestWS.dal.model.GnrUsr;
import com.example.TestWS.dal.repository.impl.GnrUserRepo;
import com.example.TestWS.dal.repository.impl.MyRepoTest;
import com.example.TestWS.service.GnrUsrService;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author HP
 */
@Service
public class GnrUserServiceImpl implements GnrUsrService {

    @Autowired
    MyRepoTest testRepo;
    @Autowired
    ModelMapper modelMapper;
    private int BATCH_SIZE = 50;

    @Override
    public void addGnrUsers(List<GnrUsr> users) throws Exception {
        testRepo.add(users);
    }

    @Override
    public GnrUsr addOneUser(GnrUsr user) throws Exception {
        return testRepo.addOneUser(user);
    }

    private GnrUsr convertToEntity(GnrUsrDto userDto) {
        GnrUsr user = modelMapper.map(userDto, GnrUsr.class);
        return user;
    }

    private GnrUsrDto convertToDto(GnrUsr user) {
        GnrUsrDto userDto = modelMapper.map(user, GnrUsrDto.class);
        return userDto;
    }

    @Override
    public List<GnrUsrDto> findAllGnrUsers() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
