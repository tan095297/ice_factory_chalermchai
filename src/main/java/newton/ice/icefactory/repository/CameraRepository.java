package newton.ice.icefactory.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import newton.ice.icefactory.model.Camera;

public interface CameraRepository extends MongoRepository<Camera, String> {
    public List<Camera> findByNameContaining(String name);
}
