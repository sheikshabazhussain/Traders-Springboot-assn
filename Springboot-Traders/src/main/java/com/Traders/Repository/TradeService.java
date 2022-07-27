package com.Traders.Repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Traders.model.Trade_Dtls;

@Service
public class TradeService {

	@Autowired
	Trade_DtlsRepo traderepo;
	
	
	
    public List<Trade_Dtls> getAlltraders()
    {
    	List<Trade_Dtls> traders = new ArrayList<Trade_Dtls>();  
    	traderepo.findAll().forEach(trade1 -> traders.add(trade1));  
    	return traders;  
    }  
    
    
    
    public Trade_Dtls gettradeById(int id)   
    {  
    return traderepo.findById(id).get();  
    }  
    
    
    public void delete(int id)   
    {  
    traderepo.deleteById(id);  
    } 
    
    
    public void saveOrUpdate(Trade_Dtls traders)   
    {  
    traderepo.save(traders);  
    } 
    
    
    public void update(Trade_Dtls traders, int tradeid)   
    {  
    traderepo.save(traders);  
    }   
    
    
    }  

