package com.Liveasy.internship.services;

import com.Liveasy.internship.entities.Load;
import com.Liveasy.internship.exception.ResourceNotFoundException;
import com.Liveasy.internship.repositories.FacilityRepo;
import com.Liveasy.internship.repositories.LoadRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LoadService {

    private final LoadRepo loadRepo;
    private final FacilityRepo facilityRepo;

    public Load createLoad(Load load) {
        return loadRepo.save(load);
    }

    public List<Load> getLoads(Map<String, String> filters) {
        List<Load> allLoads = loadRepo.findAll();

        return allLoads.stream()
                .filter(load -> filters.get("shipperId") == null || load.getShipperId().equals(filters.get("shipperId")))
                .filter(load -> filters.get("truckType") == null || load.getTruckType().equals(filters.get("truckType")))
                .filter(load -> filters.get("productType") == null || load.getProductType().equals(filters.get("productType")))
                .filter(load -> filters.get("loadingPoint") == null ||
                        (load.getFacility() != null && load.getFacility().getLoadingPoint().equals(filters.get("loadingPoint"))))
                .filter(load -> filters.get("unloadingPoint") == null ||
                        (load.getFacility() != null && load.getFacility().getUnloadingPoint().equals(filters.get("unloadingPoint"))))
                .collect(Collectors.toList());
    }

    public Load getLoadById(Long loadId) {
        return loadRepo.findById(loadId).orElseThrow(() ->
                new ResourceNotFoundException("Load not found with ID: " + loadId));
    }

    public Load updateLoad(Long loadId, Load loadDetails) {
        Load existingLoad = loadRepo.findById(loadId).orElseThrow(() ->
                new ResourceNotFoundException("Load not found with ID: " + loadId));

        existingLoad.setFacility(loadDetails.getFacility());
        existingLoad.setProductType(loadDetails.getProductType());
        existingLoad.setTruckType(loadDetails.getTruckType());
        existingLoad.setNoOfTrucks(loadDetails.getNoOfTrucks());
        existingLoad.setWeight(loadDetails.getWeight());
        existingLoad.setComment(loadDetails.getComment());
        existingLoad.setShipperId(loadDetails.getShipperId());
        existingLoad.setDate(loadDetails.getDate());

        return loadRepo.save(existingLoad);
    }

    public void deleteLoad(Long loadId) {
        Load load = loadRepo.findById(loadId).orElseThrow(() ->
                new ResourceNotFoundException("Load not found with ID: " + loadId));
        loadRepo.delete(load);
    }
}
