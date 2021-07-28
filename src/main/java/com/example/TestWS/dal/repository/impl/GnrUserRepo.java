/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TestWS.dal.repository.impl;

import com.example.TestWS.dal.model.GnrUsr;
import com.example.TestWS.dal.repository.AbstractRepo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author HP
 */
@Repository
public class GnrUserRepo extends AbstractRepo<GnrUsr>{
    public GnrUserRepo() {
        super(GnrUsr.class);
    } 
}
