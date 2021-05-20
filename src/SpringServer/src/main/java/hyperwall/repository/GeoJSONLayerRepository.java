package hyperwall.repository;

import hyperwall.entity.MinimalGeoJSONLayer;
import hyperwall.entity.GeoJSONLayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface GeoJSONLayerRepository extends JpaRepository<GeoJSONLayer,Integer> {
    List<MinimalGeoJSONLayer> findAllBy();
}
