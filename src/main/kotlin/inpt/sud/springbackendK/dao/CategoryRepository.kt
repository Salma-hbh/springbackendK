package inpt.sud.springbackendK.dao

import inpt.sud.springbackendK.data.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin("*")
@RepositoryRestResource
interface CategoryRepository : JpaRepository<Category?, Long?>{

}
