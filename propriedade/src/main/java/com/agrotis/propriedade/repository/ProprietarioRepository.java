package com.agrotis.propriedade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;
import com.agrotis.propriedade.model.*;
@Repository
public interface ProprietarioRepository extends JpaRepository <Proprietario , String>{

}
