package vn.vdef.learn.spring.clothes.Repository;
import vn.vdef.learn.spring.clothes.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
