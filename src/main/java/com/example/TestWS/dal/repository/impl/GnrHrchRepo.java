/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TestWS.dal.repository.impl;

import com.example.TestWS.dal.model.GnrHrchy;
import com.example.TestWS.dal.model.GnrUsr;
import com.example.TestWS.dal.repository.AbstractRepo;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public class GnrHrchRepo extends AbstractRepo<GnrHrchy>{
    public GnrHrchRepo() {
        super(GnrHrchy.class);
    } 
}
