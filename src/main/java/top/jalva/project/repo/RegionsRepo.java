package top.jalva.project.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import top.jalva.project.domain.Regions;

public interface RegionsRepo extends MongoRepository<Regions, String> {
}
