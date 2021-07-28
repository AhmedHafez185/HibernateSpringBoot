/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TestWS.service;

import com.example.TestWS.dal.dto.GnrHrchDto;
import com.example.TestWS.dal.dto.GnrUsrDto;
import java.util.List;

/**
 *
 * @author HP
 */
public interface GnrHrchService {
     public GnrHrchDto addGnrHrchy(GnrHrchDto  hrchyDto)throws Exception;
    public List<GnrHrchDto> findAllGnrHrchy()throws Exception;
}
