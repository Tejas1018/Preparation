package com.prep.DesignParkingLot.repositories;

import com.prep.DesignParkingLot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

//In-Memory repository for Gate

public class GateRepository {
    // This class will handle the database operations related to gates
    // For now, it can be a placeholder or can contain methods to interact with the database

    private Map<Long, Gate> gateMap = new HashMap<>();
    private Long gateId = 0l;

    public Gate save(Gate gate){
        //Insert + Update
        //If gateId is null, assign a new ID(Insert Operation)
        // If gateId is not null, update the existing gate (Update Operation)
        if(gate.getId() == null){
            gateId++;
            gate.setId(gateId);
            gateMap.put(gateId,gate);
        }
        else{
            gateMap.put(gateId,gate);
        }
        return gate;
    }

    //Find gate by GateID
    public Optional<Gate> findByGateId(Long gateId){
        //If gateId is null, return null
        if(gateMap.containsKey(gateId)){
            return Optional.of(gateMap.get(gateId));
        }
        else{
            return Optional.empty();
        }
    }


    public Map<Long, Gate> getGateMap() {
        return gateMap;
    }

    public void setGateMap(Map<Long, Gate> gateMap) {
        this.gateMap = gateMap;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }
}
