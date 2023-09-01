  package com.thinkconstructive.restdemo.controller;
//import com.thinkconstructive.restdemo.model.CloudVendor;
import com.thinkconstructive.restdemo.model.CloudVendor;
import com.thinkconstructive.restdemo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorController
{

    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    //    CloudVendor CloudVendor;

    //read specific cloud vendor details fromDB
    @ GetMapping("{vendorId}")
    public CloudVendor getCloudvendorDetails(@PathVariable("vendorId") String vendorId)
    {
        return cloudVendorService.getCloudendor(vendorId);
    }

    //read all the cloud vendor details in DB
    @ GetMapping()
    public List<CloudVendor> getAllCloudvendorDetails()
    {
        return cloudVendorService.getAllCloudVendors();
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
//        this.CloudVendor =cloudVendor;
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor created Sucessfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
//        this.CloudVendor =cloudVendor;
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor updated Sucessfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
//        this.CloudVendor =cloudVendor;
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor deleted Sucessfully";
    }
}

