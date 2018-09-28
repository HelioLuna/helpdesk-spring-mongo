package api.repository;

import api.entity.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {

    Page<Ticket> findByUserIdOOrderByDateDesc(Pageable pages, String userId);


    Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityOrderByDateDesc(
            Pageable pages, String title, String status, String priority);

    Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndUserIdOrderByDateDesc(
            Pageable pages, String title, String status, String priority);

    Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndAssignedUserOrderByDateDesc(
            Pageable pages, String title, String status, String priority);

    Page<Ticket> findByNumber(Integer number, Pageable pages);

}
