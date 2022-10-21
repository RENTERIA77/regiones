package itp.instituto.customer.repository;


import itp.instituto.customer.entity.Customer;
import itp.instituto.customer.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {
        public Region findByNumberID(String numberID);
        public List<Region> findByRegionName(String RegionName);
        //public List<Region> findByRegion(Region region);
}
