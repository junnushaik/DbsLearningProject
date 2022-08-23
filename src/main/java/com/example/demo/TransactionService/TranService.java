package com.example.demo.TransactionService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.TransactionModel.EmployeeDetails;
import com.example.demo.TransactionRepo.EmployeeDtRepo;

@Service

public class TranService implements UserDetailsService{
    
    @Autowired
    EmployeeDtRepo dBUserRepo;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        EmployeeDetails dBUserEntity = dBUserRepo.findByUserName(username);
        
        EmployeeConfigService dBSUserDetails = new EmployeeConfigService(dBUserEntity);
        
        @SuppressWarnings({ "unchecked", "unused" })
		List<GrantedAuthority> authorityList = (List<GrantedAuthority>) dBSUserDetails.getAuthorities();
        
        return dBSUserDetails;
    }


}
