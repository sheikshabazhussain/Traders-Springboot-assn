package com.Traders.Controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Traders.Repository.TradeService;

import com.Traders.model.Trade_Dtls;



@RestController
public class Trade_DtlsController
{
	@Autowired
TradeService service;
	
	
    //get traders by id
	@GetMapping("/getTradersbyid/{id}")  
	private Trade_Dtls gettraders(@PathVariable ("id") int tradeid)   
	{  
	return service.gettradeById(tradeid); 
	}  
    
    //save traders
    @PostMapping("/saveTraders")  
    private int savetraders(@RequestBody Trade_Dtls traders)   
    {  
    service.saveOrUpdate(traders);  
    return traders.getTradeid();  
    } 
    
    

     //delete trader by id 
    @DeleteMapping("/deletetrade/{id}")  
    private void deletetrade(@PathVariable ("id") int tradeid)   
    {  
    service.delete(tradeid);  
    } 
    
     //get all traders
    @GetMapping("/getallTraders")  
    private List<Trade_Dtls> getAllTraders()   
    {  
    return service.getAlltraders();  
    }
    
    
    //update trader
    @PutMapping("/updateTrader")  
    private Trade_Dtls update(@RequestBody Trade_Dtls Traders)   
    {  
    service.saveOrUpdate(Traders);  
    return Traders;  
    }  
    
    
    }
 

     
 
  
    

   	
    
    
    
    
