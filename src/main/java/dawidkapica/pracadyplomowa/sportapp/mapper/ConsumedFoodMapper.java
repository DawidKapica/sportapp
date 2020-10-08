package dawidkapica.pracadyplomowa.sportapp.mapper;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseMapper;
import dawidkapica.pracadyplomowa.sportapp.dto.ConsumedFoodDto;
import dawidkapica.pracadyplomowa.sportapp.entities.ConsumedFoodEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.NutritionalProductEntity;
import dawidkapica.pracadyplomowa.sportapp.entities.UserEntity;
import dawidkapica.pracadyplomowa.sportapp.repositories.NutritionalProductRepository;
import dawidkapica.pracadyplomowa.sportapp.repositories.UserRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;

@Mapper(uses = {PersonMapper.class, UserMapper.class, NutritionalProductMapper.class, LoginMapper.class})
public abstract class ConsumedFoodMapper implements BaseMapper<ConsumedFoodDto, ConsumedFoodEntity> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NutritionalProductRepository nutritionalProductRepository;

    @Override
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "nutritionalProduct.id", target = "nutritionalProductId")
    public abstract ConsumedFoodDto mapToDto(ConsumedFoodEntity entity);

    @Override
    @Mapping(source = "userId", target = "user")
    @Mapping(source = "nutritionalProductId", target = "nutritionalProduct")
    public abstract ConsumedFoodEntity mapToEntity(ConsumedFoodDto dto);

    protected UserEntity userEntityFromId(Integer id) {
        return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    protected NutritionalProductEntity nutritionalProductEntityFromId(Integer id) {
        return nutritionalProductRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
