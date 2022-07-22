package life.genny.datagenerator.service;

import life.genny.datagenerator.data.entity.BaseEntityAttribute;
import life.genny.datagenerator.data.repository.BaseEntityAttributeRepository;
import life.genny.datagenerator.data.repository.BaseEntityRepository;
import life.genny.datagenerator.model.BaseEntityAttributeModel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class BaseEntityAttributeService {
    @Inject
    BaseEntityAttributeRepository baseEntityAttributeRepository;
    @Inject
    BaseEntityRepository baseEntityRepository;

    public void save(List<BaseEntityAttribute> attributes) {
        baseEntityAttributeRepository.persist(attributes);
    }

    public List<BaseEntityAttributeModel> getAttributeByEntityId(Long baseEntityId) {
        return baseEntityAttributeRepository.find("BASEENTITY_ID = ?1", baseEntityId).list()
                .stream().map(BaseEntityAttributeModel::new).collect(Collectors.toList());
    }
}
