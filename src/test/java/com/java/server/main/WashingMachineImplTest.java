package com.java.server.main;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WashingMachineImplTest {
	
	WashingMachineImpl washingMachineObj;
 
    @Before
    public void init() {
    	washingMachineObj=new WashingMachineImpl();
    }
    @Test
    public void getWMDetailsTest()
    {
    	Optional<List<WashingMachineEntity>> wmDeatails=washingMachineObj.getWMDetails();
    	assertNotNull(wmDeatails);
    	
    }
    
    @Test
    public void addWMTest()
    {
    	WashingMachineEntity mockWashingMachineEntity=mock(WashingMachineEntity.class);
    	Optional<WashingMachineEntity> atualResult=washingMachineObj.addWM(mockWashingMachineEntity);
    	assertNotNull(atualResult);
    	
    }
    
    @Test
    public void updateWMTest()
    {
    	WashingMachineEntity mockWashingMachineEntity=mock(WashingMachineEntity.class);
    	Optional<String> atualResult=washingMachineObj.updateWM(mockWashingMachineEntity);
    	assertNotNull(atualResult);
    	
    }

}
