package api.repository;

import api.entity.ChangeStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String>{

    Iterable<ChangeStatus> findByTicketIdOOrderByDateChangeStatusDesc(String ticketId);
}
