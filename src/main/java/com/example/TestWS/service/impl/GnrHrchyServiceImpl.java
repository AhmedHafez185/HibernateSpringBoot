/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TestWS.service.impl;

import com.example.TestWS.dal.dto.GnrHrchDto;
import com.example.TestWS.dal.dto.GnrUsrDto;
import com.example.TestWS.dal.model.GnrHrchy;
import com.example.TestWS.dal.model.GnrUsr;
import com.example.TestWS.dal.repository.impl.GnrHrchRepo;
import com.example.TestWS.service.GnrHrchService;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author HP
 */
public class GnrHrchyServiceImpl implements GnrHrchService{

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    GnrHrchRepo hrchyRepo;
    @Transactional
    @Override
    public GnrHrchDto addGnrHrchy(GnrHrchDto hrchyDto) throws Exception {
        GnrHrchy hrchy = convertToEntity(hrchyDto);
        hrchyRepo.add(hrchy);
        return hrchyDto;
    }

    @Transactional
    @Override
    public List<GnrHrchDto> findAllGnrHrchy() throws Exception {
         List<GnrHrchy> users = hrchyRepo.findList();
        List<GnrHrchDto> usersDto = new ArrayList<>();
        users.forEach(user -> {
            usersDto.add(convertToDto(user));
        });
        return usersDto;
    }
    private GnrHrchy convertToEntity(GnrHrchDto hrchyDto) {
        GnrHrchy hrchy = modelMapper.map(hrchyDto, GnrHrchy.class);
        return hrchy;
    }

    private GnrHrchDto convertToDto(GnrHrchy hrchy) {
        GnrHrchDto hrchyDto = modelMapper.map(hrchy, GnrHrchDto.class);
        return hrchyDto;
    }
}
