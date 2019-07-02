package chatbot.api.mappers;

import chatbot.api.buildcode.domain.DerivationDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface DerivationMapper {

    ArrayList<DerivationDTO> getDerivationByUpperBoxId(@Param("upperBoxId") Long upperBoxId);

    Long getLowerBoxIdFromUpperTimeBoxId(@Param("upperTimeBoxId") Long upperTimeBoxId);
}
