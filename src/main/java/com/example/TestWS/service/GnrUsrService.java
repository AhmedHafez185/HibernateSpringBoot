/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TestWS.service;

import com.example.TestWS.dal.dto.GnrUsrDto;
import com.example.TestWS.dal.model.GnrUsr;
import java.util.List;

/**
 *
 * @author HP
 */
public interface GnrUsrService {
     public void addGnrUsers(List<GnrUsr>  user)throws Exception;
    public List<GnrUsrDto> findAllGnrUsers()throws Exception;
     public GnrUsr addOneUser(GnrUsr user) throws Exception ;
}
