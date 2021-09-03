package top.jalva.project.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import top.jalva.project.domain.Region;

public interface RegionsRepo extends MongoRepository<Region, String> {
}
