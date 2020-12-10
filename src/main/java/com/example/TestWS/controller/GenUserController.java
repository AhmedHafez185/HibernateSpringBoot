/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TestWS.controller;

import com.example.TestWS.dal.dto.GnrUsrDto;
import com.example.TestWS.dal.model.GnrUsr;
import com.example.TestWS.service.GnrUsrService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("general/user")
public class GenUserController {

    @Autowired
    GnrUsrService userService;
    //  @CrossOrigin(origins = "*", allowedHeaders = "*")

    @GetMapping()
    public List<GnrUsrDto> getAllUser() throws Exception {
        List<GnrUsrDto> usersDto = userService.findAllGnrUsers();
        System.out.println("No Of Records : " + usersDto.size());
        return usersDto;

    }

    @PostMapping("/addOne")
    public ResponseEntity<GnrUsr> addOneUser(@RequestBody GnrUsr userDto) throws Exception {
        userService.addOneUser(userDto);
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);

    }

    @PostMapping("/addUser")
    public ResponseEntity<GnrUsr> addUser(@RequestBody GnrUsr userDto) throws Exception {
        List<GnrUsr> users = new ArrayList<>();

        for (int i = 2; i <= 1000000; i++) {
            GnrUsr user = generateUser(i);
            users.add(user);
        }
        System.out.println("Start Time : " + new Date() + ", In MillSeconds : " + System.currentTimeMillis());
        Long startTime = System.currentTimeMillis();
        userService.addGnrUsers(users);
        System.out.println("End Time : " + new Date() + ", In MillSeconds : " + System.currentTimeMillis());
        Long finishedTime = System.currentTimeMillis();
        Long total = finishedTime - startTime;
        System.out.println("Total Time in Milliseconds : " + total);
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }

    private GnrUsr generateUser(int id) {
        GnrUsr user = new GnrUsr();
        user.setUsrNo(id);
        user.setUsrNoMngr(BigDecimal.ONE);
        user.setEMail("ahmed@gmail");
        user.setFDateEffct(new Date());
        user.setTDateEffct(new Date());
        user.setUsrCode("user" + id);
        user.setFTimeEffct(new Date());
        user.setUsrFNm("Omar");
        user.setUsrLNm("Ahmed");
        user.setUsrPswrd("13244567");
        user.setInactvDsc("Any Habl");
        user.setMobileNo("1011111203");
        user.setHrchyCode("Hr100");
        user.setInactvFlg(1);
        user.setInactvUsrNo(BigDecimal.ZERO);
        user.setInactvDate(new Date());
        return user;
    }

}
